/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.apache.log4j.Logger;
/**
 *
 * @author alan2
 */
@WebService(serviceName = "ServiciosSATG6")
public class ServiciosSATG6 {

    private static Logger log = Logger.getLogger(ServiciosSATG6.class);

    public ServiciosSATG6() {
       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerArancelIndividual")
    public MasterClass ObtenerArancelIndividual(@WebParam(name = "entrada") MasterClass entrada) {
        //TODO write your implementation code here:

        //TODO write your implementation code here:
        DBConexion db = new DBConexion();
        Connection con = db.conectar();
        log.info("Se consulto arancel de la categoria "+entrada.getCategoria());
        Consultas consultas = new Consultas(con);
        ResultSet rs = consultas.ExecuteQuery("Select valor from arancel where id_arancel=" + entrada.getCategoria() + ";");
        MasterClass salida = new MasterClass();
        try {
            while (rs.next()) {
                salida.setPorcentajeArancelario(rs.getDouble("valor"));
            }
            rs.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        log.info("Se retorna el arancel "+salida.getPorcentajeArancelario()+" para la categoria "+entrada.getCategoria());
        return salida;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalcularManifesto")
    public MasterClass CalcularManifesto(@WebParam(name = "entrada") MasterClass entrada) {
        double total = 0.0;
        java.util.Date dt = new java.util.Date();
        DBConexion db = new DBConexion();
        Connection con = db.conectar();
        MasterClass salida = null;
        Consultas consultas = new Consultas(con);
        try {
            log.info("CALCULAR MANIFESTO - Se ordeno el calculo del manifesto");
            ResultSet rs = consultas.ExecuteQuery("select id_formulario from formulario order by id_formulario desc;");
            int n_f = 0;
            while (rs.next()) {
                n_f = rs.getInt("id_formulario");
                break;
            }
            for (int i = 0; i < entrada.getDetalleItem().size(); i++) {                
                Item item = entrada.getDetalleItem().get(i);                
                rs = consultas.ExecuteQuery("select valor from arancel where tipo='" + item.Descripcion + "';");
                Double valor = 1.0;
                while (rs.next()) {
                    valor = rs.getDouble("valor");
                    break;
                }
                double prev;
                if (item.Cantidad > 0) {
                    prev = ((item.precio * valor) / 100) * item.Cantidad;
                } else {
                    prev = ((item.precio * valor) / 100);
                }
                total += prev;
                rs.close();
                   
                
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentTime = sdf.format(dt);
                consultas.Execute("insert into paquete (id_formulario,fecha,monto,categoria) values ("+n_f+",'"+currentTime+"',"+item.precio+",'"+item.Descripcion+"');");                
                log.info("CALCULAR MANIFESTO - De item "+item.Descripcion+" valor "+valor+" impuesto sin iva "+prev+", insertado con exito");
            }
            

            salida = new MasterClass();

            salida.setNumeroFormulario(n_f + 1);
            log.info("CALCULAR MANIFESTO - Se retorno total sin IVA "+total);
            total=total+total*(0.12);            
            log.info("CALCULAR MANIFESTO - Se retorno total con IVA"+total);
            salida.setMonto((double) total);
            salida.setDetalleItem(entrada.getDetalleItem());
            log.info("CALCULAR MANIFESTO - Se retorno el formulario "+n_f);
            
            //insertar el siguiente formulario
            if (consultas.Execute("insert into formulario(tipo,monto,estado)values('arancel'," + total + ",0);")) {
                System.out.println("exitoso introduccion de formulario");
                log.info("CALCULAR MANIFESTO - Formulario creado con exito "+n_f);
            }
            con.close();
        } catch (Exception ex) {
        }
        return salida;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerEstadoFormulario")
    public MasterClass ObtenerEstadoFormulario(@WebParam(name = "entrada") MasterClass entrada) {
        DBConexion db = new DBConexion();
        Connection con = db.conectar();
        MasterClass salida = new MasterClass();
        Consultas consultas = new Consultas(con);
        int estado = -1, monto = 0;
        try {
            log.info("Se solicito el estado del formulario "+entrada.getNumeroFormulario());
            ResultSet rs = consultas.ExecuteQuery("select estado from formulario where id_formulario=" + entrada.getNumeroFormulario() + ";");
            while (rs.next()) {
                estado = rs.getInt("estado");
                break;
            }
            rs = consultas.ExecuteQuery("select monto from formulario where id_formulario=" + entrada.getNumeroFormulario() + ";");

            while (rs.next()) {
                monto = rs.getInt("monto");
                break;
            }
            rs.close();
            con.close();
        } catch (Exception ex) {

        }
        salida.setEstado(estado);
        salida.setMonto(monto);
        salida.setNumeroFormulario(entrada.getNumeroFormulario());
        log.info("Estado del formulario "+entrada.getNumeroFormulario()+", Monto "+monto+", estado "+estado);
        return salida;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CambiarEstadoFormulario")
    public boolean CambiarEstadoFormulario(@WebParam(name = "entrada") MasterClass entrada) {
        //TODO write your implementation code here:
        DBConexion db = new DBConexion();
        Connection con = db.conectar();
        Consultas consultas = new Consultas(con);
        try {
            log.info("Se solicito el cambio de estado de un formulario "+entrada.getNumeroFormulario());
            boolean result = consultas.Execute("UPDATE formulario SET estado=1 where id_formulario=" + entrada.getNumeroFormulario() + ";");
            log.info("Cambio de estado "+result);
            System.out.println(result);
            con.close();
            return result;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }        
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerPaquetesRecibidos")
    public String obtenerPaquetesRecibidos(@WebParam(name = "cuantas") int cuantas) {
        //TODO write your implementation code here:
        DBConexion db = new DBConexion();
        Connection con = db.conectar();
        Consultas consultas = new Consultas(con);
        String salida="";
        try {
            log.info("OBTENERPAQUETESRECIBIDOS - Se solicito la lista de paquetes consultados");
            ResultSet rs = consultas.ExecuteQuery("select * from paquete;");
            int i=0,j=1;
            while (rs.next()) {
                if(i==0){
                    salida+="<tr class=\"info hidden\" id=\"tr_"+j+"\" ><td>"+rs.getInt("id_paquete")+"</td><td>"+rs.getDate("fecha")+"</td><td>"+rs.getDouble("monto")+"</td><td>"+rs.getString("categoria")+"</td></tr>\n";
                    i=1;
                }else{
                    salida+="<tr class=\"warning hidden\" id=\"tr_"+j+"\" ><td>"+rs.getInt("id_paquete")+"</td><td>"+rs.getDate("fecha")+"</td><td>"+rs.getDouble("monto")+"</td><td>"+rs.getString("categoria")+"</td></tr>\n";
                    i=0;
                }                                
                j++;
            }
            rs.close();            
            con.close();            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return salida;
    }
}
