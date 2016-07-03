
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularManifestoResponse_QNAME = new QName("http://servicios/", "CalcularManifestoResponse");
    private final static QName _CambiarEstadoFormulario_QNAME = new QName("http://servicios/", "CambiarEstadoFormulario");
    private final static QName _CalcularManifesto_QNAME = new QName("http://servicios/", "CalcularManifesto");
    private final static QName _ObtenerEstadoFormularioResponse_QNAME = new QName("http://servicios/", "ObtenerEstadoFormularioResponse");
    private final static QName _ObtenerArancelIndividualResponse_QNAME = new QName("http://servicios/", "ObtenerArancelIndividualResponse");
    private final static QName _CambiarEstadoFormularioResponse_QNAME = new QName("http://servicios/", "CambiarEstadoFormularioResponse");
    private final static QName _ObtenerArancelIndividual_QNAME = new QName("http://servicios/", "ObtenerArancelIndividual");
    private final static QName _ObtenerPaquetesRecibidos_QNAME = new QName("http://servicios/", "obtenerPaquetesRecibidos");
    private final static QName _ObtenerPaquetesRecibidosResponse_QNAME = new QName("http://servicios/", "obtenerPaquetesRecibidosResponse");
    private final static QName _ObtenerEstadoFormulario_QNAME = new QName("http://servicios/", "ObtenerEstadoFormulario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerArancelIndividualResponse }
     * 
     */
    public ObtenerArancelIndividualResponse createObtenerArancelIndividualResponse() {
        return new ObtenerArancelIndividualResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstadoFormularioResponse }
     * 
     */
    public ObtenerEstadoFormularioResponse createObtenerEstadoFormularioResponse() {
        return new ObtenerEstadoFormularioResponse();
    }

    /**
     * Create an instance of {@link CalcularManifesto }
     * 
     */
    public CalcularManifesto createCalcularManifesto() {
        return new CalcularManifesto();
    }

    /**
     * Create an instance of {@link CambiarEstadoFormulario }
     * 
     */
    public CambiarEstadoFormulario createCambiarEstadoFormulario() {
        return new CambiarEstadoFormulario();
    }

    /**
     * Create an instance of {@link CalcularManifestoResponse }
     * 
     */
    public CalcularManifestoResponse createCalcularManifestoResponse() {
        return new CalcularManifestoResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstadoFormulario }
     * 
     */
    public ObtenerEstadoFormulario createObtenerEstadoFormulario() {
        return new ObtenerEstadoFormulario();
    }

    /**
     * Create an instance of {@link CambiarEstadoFormularioResponse }
     * 
     */
    public CambiarEstadoFormularioResponse createCambiarEstadoFormularioResponse() {
        return new CambiarEstadoFormularioResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaquetesRecibidosResponse }
     * 
     */
    public ObtenerPaquetesRecibidosResponse createObtenerPaquetesRecibidosResponse() {
        return new ObtenerPaquetesRecibidosResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaquetesRecibidos }
     * 
     */
    public ObtenerPaquetesRecibidos createObtenerPaquetesRecibidos() {
        return new ObtenerPaquetesRecibidos();
    }

    /**
     * Create an instance of {@link ObtenerArancelIndividual }
     * 
     */
    public ObtenerArancelIndividual createObtenerArancelIndividual() {
        return new ObtenerArancelIndividual();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link MasterClass }
     * 
     */
    public MasterClass createMasterClass() {
        return new MasterClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularManifestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "CalcularManifestoResponse")
    public JAXBElement<CalcularManifestoResponse> createCalcularManifestoResponse(CalcularManifestoResponse value) {
        return new JAXBElement<CalcularManifestoResponse>(_CalcularManifestoResponse_QNAME, CalcularManifestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "CambiarEstadoFormulario")
    public JAXBElement<CambiarEstadoFormulario> createCambiarEstadoFormulario(CambiarEstadoFormulario value) {
        return new JAXBElement<CambiarEstadoFormulario>(_CambiarEstadoFormulario_QNAME, CambiarEstadoFormulario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularManifesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "CalcularManifesto")
    public JAXBElement<CalcularManifesto> createCalcularManifesto(CalcularManifesto value) {
        return new JAXBElement<CalcularManifesto>(_CalcularManifesto_QNAME, CalcularManifesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEstadoFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "ObtenerEstadoFormularioResponse")
    public JAXBElement<ObtenerEstadoFormularioResponse> createObtenerEstadoFormularioResponse(ObtenerEstadoFormularioResponse value) {
        return new JAXBElement<ObtenerEstadoFormularioResponse>(_ObtenerEstadoFormularioResponse_QNAME, ObtenerEstadoFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArancelIndividualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "ObtenerArancelIndividualResponse")
    public JAXBElement<ObtenerArancelIndividualResponse> createObtenerArancelIndividualResponse(ObtenerArancelIndividualResponse value) {
        return new JAXBElement<ObtenerArancelIndividualResponse>(_ObtenerArancelIndividualResponse_QNAME, ObtenerArancelIndividualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoFormularioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "CambiarEstadoFormularioResponse")
    public JAXBElement<CambiarEstadoFormularioResponse> createCambiarEstadoFormularioResponse(CambiarEstadoFormularioResponse value) {
        return new JAXBElement<CambiarEstadoFormularioResponse>(_CambiarEstadoFormularioResponse_QNAME, CambiarEstadoFormularioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArancelIndividual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "ObtenerArancelIndividual")
    public JAXBElement<ObtenerArancelIndividual> createObtenerArancelIndividual(ObtenerArancelIndividual value) {
        return new JAXBElement<ObtenerArancelIndividual>(_ObtenerArancelIndividual_QNAME, ObtenerArancelIndividual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPaquetesRecibidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerPaquetesRecibidos")
    public JAXBElement<ObtenerPaquetesRecibidos> createObtenerPaquetesRecibidos(ObtenerPaquetesRecibidos value) {
        return new JAXBElement<ObtenerPaquetesRecibidos>(_ObtenerPaquetesRecibidos_QNAME, ObtenerPaquetesRecibidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPaquetesRecibidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "obtenerPaquetesRecibidosResponse")
    public JAXBElement<ObtenerPaquetesRecibidosResponse> createObtenerPaquetesRecibidosResponse(ObtenerPaquetesRecibidosResponse value) {
        return new JAXBElement<ObtenerPaquetesRecibidosResponse>(_ObtenerPaquetesRecibidosResponse_QNAME, ObtenerPaquetesRecibidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEstadoFormulario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "ObtenerEstadoFormulario")
    public JAXBElement<ObtenerEstadoFormulario> createObtenerEstadoFormulario(ObtenerEstadoFormulario value) {
        return new JAXBElement<ObtenerEstadoFormulario>(_ObtenerEstadoFormulario_QNAME, ObtenerEstadoFormulario.class, null, value);
    }

}
