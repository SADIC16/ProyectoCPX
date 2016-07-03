
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerPaquetesRecibidos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerPaquetesRecibidos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuantas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPaquetesRecibidos", propOrder = {
    "cuantas"
})
public class ObtenerPaquetesRecibidos {

    protected int cuantas;

    /**
     * Gets the value of the cuantas property.
     * 
     */
    public int getCuantas() {
        return cuantas;
    }

    /**
     * Sets the value of the cuantas property.
     * 
     */
    public void setCuantas(int value) {
        this.cuantas = value;
    }

}
