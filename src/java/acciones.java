/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import servicios.Item;
import servicios.MasterClass;
import servicios.ServiciosSATG6_Service;

/**
 *
 * @author alan2
 */
@WebServlet(urlPatterns = {"/acciones"})
public class acciones extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SATv2/ServiciosSATG6.wsdl")
    private ServiciosSATG6_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet acciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet acciones at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String salida = "";
        if (request.getParameter("con_arancel") != null) {
            try {
                // TODO initialize WS operation arguments here
                servicios.MasterClass entrada = new servicios.MasterClass();
                String cod = request.getParameter("cod_arancel");
                entrada.setCategoria(Integer.parseInt(cod));
                // TODO process result here
                servicios.MasterClass result = obtenerArancelIndividual(entrada);
                salida = "Porcentaje_de_arancle_" + result.getPorcentajeArancelario();
            } catch (Exception ex) {
                // TODO handle custom exceptions here
                //out.println("errorazo " + ex.toString());
            }
        } else if (request.getParameter("manifest") != null) {
            MasterClass entrada = new MasterClass();
            Item item = new Item();
            item.setPrecio(156.5);
            item.setDescripcion("Videojuegos Cassette");

            List<Item> lista = entrada.getDetalleItem();
            lista.add(item);
            item = new Item();
            item.setPrecio(355);
            item.setDescripcion("Repuestos de Carro");

            lista.add(item);

            entrada.setDetalleItem((ArrayList<Item>) lista);
            MasterClass respuesta = calcularManifesto(entrada);
            salida = "monto_" + respuesta.getMonto() + ",_no_formulario_" + respuesta.getNumeroFormulario();

        } else if (request.getParameter("estado") != null) {
            servicios.MasterClass entrada = new servicios.MasterClass();
            String cod = request.getParameter("id_formulario");
            entrada.setNumeroFormulario(Integer.parseInt(cod));
            // TODO process result here
            servicios.MasterClass result = obtenerEstadoFormulario(entrada);
            if(result.getEstado()==0)
                salida = "Formulario_no_pagado";
            else
                salida = "Formulario_pagado";
        } else {
            // ???
        }

        response.sendRedirect("/Consumir_sat/default.jsp?salida=" + salida);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private MasterClass calcularManifesto(servicios.MasterClass entrada) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ServiciosSATG6 port = service.getServiciosSATG6Port();
        return port.calcularManifesto(entrada);
    }

    private MasterClass obtenerArancelIndividual(servicios.MasterClass entrada) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ServiciosSATG6 port = service.getServiciosSATG6Port();
        return port.obtenerArancelIndividual(entrada);
    }

    private MasterClass obtenerEstadoFormulario(servicios.MasterClass entrada) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ServiciosSATG6 port = service.getServiciosSATG6Port();
        return port.obtenerEstadoFormulario(entrada);
    }
}
