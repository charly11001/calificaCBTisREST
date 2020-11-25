
package ClienteWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ClienteWS package. 
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

    private final static QName _ConsultarPago_QNAME = new QName("http://servicios/", "consultarPago");
    private final static QName _ConsultarPagos_QNAME = new QName("http://servicios/", "consultarPagos");
    private final static QName _ConsultarPagosResponse_QNAME = new QName("http://servicios/", "consultarPagosResponse");
    private final static QName _ActualizarEstatusResponse_QNAME = new QName("http://servicios/", "actualizarEstatusResponse");
    private final static QName _ActualizarEstatus_QNAME = new QName("http://servicios/", "actualizarEstatus");
    private final static QName _ConsultarPagoResponse_QNAME = new QName("http://servicios/", "consultarPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ClienteWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarEstatusResponse }
     * 
     */
    public ActualizarEstatusResponse createActualizarEstatusResponse() {
        return new ActualizarEstatusResponse();
    }

    /**
     * Create an instance of {@link ActualizarEstatus }
     * 
     */
    public ActualizarEstatus createActualizarEstatus() {
        return new ActualizarEstatus();
    }

    /**
     * Create an instance of {@link ConsultarPagoResponse }
     * 
     */
    public ConsultarPagoResponse createConsultarPagoResponse() {
        return new ConsultarPagoResponse();
    }

    /**
     * Create an instance of {@link ConsultarPago }
     * 
     */
    public ConsultarPago createConsultarPago() {
        return new ConsultarPago();
    }

    /**
     * Create an instance of {@link ConsultarPagos }
     * 
     */
    public ConsultarPagos createConsultarPagos() {
        return new ConsultarPagos();
    }

    /**
     * Create an instance of {@link ConsultarPagosResponse }
     * 
     */
    public ConsultarPagosResponse createConsultarPagosResponse() {
        return new ConsultarPagosResponse();
    }

    /**
     * Create an instance of {@link ConceptoPago }
     * 
     */
    public ConceptoPago createConceptoPago() {
        return new ConceptoPago();
    }

    /**
     * Create an instance of {@link Pago }
     * 
     */
    public Pago createPago() {
        return new Pago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "consultarPago")
    public JAXBElement<ConsultarPago> createConsultarPago(ConsultarPago value) {
        return new JAXBElement<ConsultarPago>(_ConsultarPago_QNAME, ConsultarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPagos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "consultarPagos")
    public JAXBElement<ConsultarPagos> createConsultarPagos(ConsultarPagos value) {
        return new JAXBElement<ConsultarPagos>(_ConsultarPagos_QNAME, ConsultarPagos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPagosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "consultarPagosResponse")
    public JAXBElement<ConsultarPagosResponse> createConsultarPagosResponse(ConsultarPagosResponse value) {
        return new JAXBElement<ConsultarPagosResponse>(_ConsultarPagosResponse_QNAME, ConsultarPagosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "actualizarEstatusResponse")
    public JAXBElement<ActualizarEstatusResponse> createActualizarEstatusResponse(ActualizarEstatusResponse value) {
        return new JAXBElement<ActualizarEstatusResponse>(_ActualizarEstatusResponse_QNAME, ActualizarEstatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "actualizarEstatus")
    public JAXBElement<ActualizarEstatus> createActualizarEstatus(ActualizarEstatus value) {
        return new JAXBElement<ActualizarEstatus>(_ActualizarEstatus_QNAME, ActualizarEstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "consultarPagoResponse")
    public JAXBElement<ConsultarPagoResponse> createConsultarPagoResponse(ConsultarPagoResponse value) {
        return new JAXBElement<ConsultarPagoResponse>(_ConsultarPagoResponse_QNAME, ConsultarPagoResponse.class, null, value);
    }

}
