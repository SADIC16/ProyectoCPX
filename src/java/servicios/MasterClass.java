/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import servicios.Item;
/**
 *
 * @author alan2
 */
public class MasterClass {
        private int Categoria;
        private double PorcentajeArancelario;
        private ArrayList<Item> DetalleItem;
        private int NumeroFormulario;
        private double Monto;
        private int NumeroCuentaAcreditar;
        private int NumeroCuentaDebitar;
        private int Estado;
        private String Descripcion;
        private String Nit;
        private String Nombre;
        private String Direccion;
        private int NumeroTarjetaDebitar;
        private int TipoPago;
        private String HTMLPDF;

    /**
     * @return the Categoria
     */
    public int getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the PorcentajeArancelario
     */
    public double getPorcentajeArancelario() {
        return PorcentajeArancelario;
    }

    /**
     * @param PorcentajeArancelario the PorcentajeArancelario to set
     */
    public void setPorcentajeArancelario(double PorcentajeArancelario) {
        this.PorcentajeArancelario = PorcentajeArancelario;
    }

    /**
     * @return the DetalleItem
     */
    public ArrayList<Item> getDetalleItem() {
        return DetalleItem;
    }

    /**
     * @param DetalleItem the DetalleItem to set
     */
    public void setDetalleItem(ArrayList<Item> DetalleItem) {
        this.DetalleItem = DetalleItem;
    }

    /**
     * @return the NumeroFormulario
     */
    public int getNumeroFormulario() {
        return NumeroFormulario;
    }

    /**
     * @param NumeroFormulario the NumeroFormulario to set
     */
    public void setNumeroFormulario(int NumeroFormulario) {
        this.NumeroFormulario = NumeroFormulario;
    }

    /**
     * @return the Monto
     */
    public double getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    /**
     * @return the NumeroCuentaAcreditar
     */
    public int getNumeroCuentaAcreditar() {
        return NumeroCuentaAcreditar;
    }

    /**
     * @param NumeroCuentaAcreditar the NumeroCuentaAcreditar to set
     */
    public void setNumeroCuentaAcreditar(int NumeroCuentaAcreditar) {
        this.NumeroCuentaAcreditar = NumeroCuentaAcreditar;
    }

    /**
     * @return the NumeroCuentaDebitar
     */
    public int getNumeroCuentaDebitar() {
        return NumeroCuentaDebitar;
    }

    /**
     * @param NumeroCuentaDebitar the NumeroCuentaDebitar to set
     */
    public void setNumeroCuentaDebitar(int NumeroCuentaDebitar) {
        this.NumeroCuentaDebitar = NumeroCuentaDebitar;
    }

    /**
     * @return the Estado
     */
    public int getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Nit
     */
    public String getNit() {
        return Nit;
    }

    /**
     * @param Nit the Nit to set
     */
    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the NumeroTarjetaDebitar
     */
    public int getNumeroTarjetaDebitar() {
        return NumeroTarjetaDebitar;
    }

    /**
     * @param NumeroTarjetaDebitar the NumeroTarjetaDebitar to set
     */
    public void setNumeroTarjetaDebitar(int NumeroTarjetaDebitar) {
        this.NumeroTarjetaDebitar = NumeroTarjetaDebitar;
    }

    /**
     * @return the TipoPago
     */
    public int getTipoPago() {
        return TipoPago;
    }

    /**
     * @param TipoPago the TipoPago to set
     */
    public void setTipoPago(int TipoPago) {
        this.TipoPago = TipoPago;
    }

    /**
     * @return the HTMLPDF
     */
    public String getHTMLPDF() {
        return HTMLPDF;
    }

    /**
     * @param HTMLPDF the HTMLPDF to set
     */
    public void setHTMLPDF(String HTMLPDF) {
        this.HTMLPDF = HTMLPDF;
    }
}

