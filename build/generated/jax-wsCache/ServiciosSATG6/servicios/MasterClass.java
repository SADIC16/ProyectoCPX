
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for masterClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="masterClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleItem" type="{http://servicios/}item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HTMLPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuentaAcreditar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroCuentaDebitar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroFormulario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroTarjetaDebitar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="porcentajeArancelario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masterClass", propOrder = {
    "categoria",
    "descripcion",
    "detalleItem",
    "direccion",
    "estado",
    "htmlpdf",
    "monto",
    "nit",
    "nombre",
    "numeroCuentaAcreditar",
    "numeroCuentaDebitar",
    "numeroFormulario",
    "numeroTarjetaDebitar",
    "porcentajeArancelario",
    "tipoPago"
})
public class MasterClass {

    protected int categoria;
    protected String descripcion;
    @XmlElement(nillable = true)
    protected List<Item> detalleItem;
    protected String direccion;
    protected int estado;
    @XmlElement(name = "HTMLPDF")
    protected String htmlpdf;
    protected double monto;
    protected String nit;
    protected String nombre;
    protected int numeroCuentaAcreditar;
    protected int numeroCuentaDebitar;
    protected int numeroFormulario;
    protected int numeroTarjetaDebitar;
    protected double porcentajeArancelario;
    protected int tipoPago;

    /**
     * Gets the value of the categoria property.
     * 
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     */
    public void setCategoria(int value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the detalleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getDetalleItem() {
        if (detalleItem == null) {
            detalleItem = new ArrayList<Item>();
        }
        return this.detalleItem;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Gets the value of the htmlpdf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTMLPDF() {
        return htmlpdf;
    }

    /**
     * Sets the value of the htmlpdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTMLPDF(String value) {
        this.htmlpdf = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNit(String value) {
        this.nit = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the numeroCuentaAcreditar property.
     * 
     */
    public int getNumeroCuentaAcreditar() {
        return numeroCuentaAcreditar;
    }

    /**
     * Sets the value of the numeroCuentaAcreditar property.
     * 
     */
    public void setNumeroCuentaAcreditar(int value) {
        this.numeroCuentaAcreditar = value;
    }

    /**
     * Gets the value of the numeroCuentaDebitar property.
     * 
     */
    public int getNumeroCuentaDebitar() {
        return numeroCuentaDebitar;
    }

    /**
     * Sets the value of the numeroCuentaDebitar property.
     * 
     */
    public void setNumeroCuentaDebitar(int value) {
        this.numeroCuentaDebitar = value;
    }

    /**
     * Gets the value of the numeroFormulario property.
     * 
     */
    public int getNumeroFormulario() {
        return numeroFormulario;
    }

    /**
     * Sets the value of the numeroFormulario property.
     * 
     */
    public void setNumeroFormulario(int value) {
        this.numeroFormulario = value;
    }

    /**
     * Gets the value of the numeroTarjetaDebitar property.
     * 
     */
    public int getNumeroTarjetaDebitar() {
        return numeroTarjetaDebitar;
    }

    /**
     * Sets the value of the numeroTarjetaDebitar property.
     * 
     */
    public void setNumeroTarjetaDebitar(int value) {
        this.numeroTarjetaDebitar = value;
    }

    /**
     * Gets the value of the porcentajeArancelario property.
     * 
     */
    public double getPorcentajeArancelario() {
        return porcentajeArancelario;
    }

    /**
     * Sets the value of the porcentajeArancelario property.
     * 
     */
    public void setPorcentajeArancelario(double value) {
        this.porcentajeArancelario = value;
    }

    /**
     * Gets the value of the tipoPago property.
     * 
     */
    public int getTipoPago() {
        return tipoPago;
    }

    /**
     * Sets the value of the tipoPago property.
     * 
     */
    public void setTipoPago(int value) {
        this.tipoPago = value;
    }

}
