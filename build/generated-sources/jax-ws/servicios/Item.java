
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroTracking" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PorcentajeArancel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CodigoUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "numeroTracking",
    "cantidad",
    "categoria",
    "peso",
    "precio",
    "descripcion",
    "porcentajeArancel",
    "codigoUsuario"
})
public class Item {

    @XmlElement(name = "NumeroTracking")
    protected int numeroTracking;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "Categoria")
    protected int categoria;
    @XmlElement(name = "Peso")
    protected double peso;
    protected double precio;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "PorcentajeArancel")
    protected double porcentajeArancel;
    @XmlElement(name = "CodigoUsuario")
    protected int codigoUsuario;

    /**
     * Gets the value of the numeroTracking property.
     * 
     */
    public int getNumeroTracking() {
        return numeroTracking;
    }

    /**
     * Sets the value of the numeroTracking property.
     * 
     */
    public void setNumeroTracking(int value) {
        this.numeroTracking = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

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
     * Gets the value of the peso property.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
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
     * Gets the value of the porcentajeArancel property.
     * 
     */
    public double getPorcentajeArancel() {
        return porcentajeArancel;
    }

    /**
     * Sets the value of the porcentajeArancel property.
     * 
     */
    public void setPorcentajeArancel(double value) {
        this.porcentajeArancel = value;
    }

    /**
     * Gets the value of the codigoUsuario property.
     * 
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Sets the value of the codigoUsuario property.
     * 
     */
    public void setCodigoUsuario(int value) {
        this.codigoUsuario = value;
    }

}
