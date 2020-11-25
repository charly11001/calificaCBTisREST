
package ClienteWS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "inscripcionSOAPService", targetNamespace = "http://servicios/", wsdlLocation = "http://localhost:8080/INSCRIPCIONWS/inscripcionSOAPService?wsdl")
public class InscripcionSOAPService_Service
    extends Service
{

    private final static URL INSCRIPCIONSOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException INSCRIPCIONSOAPSERVICE_EXCEPTION;
    private final static QName INSCRIPCIONSOAPSERVICE_QNAME = new QName("http://servicios/", "inscripcionSOAPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/INSCRIPCIONWS/inscripcionSOAPService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSCRIPCIONSOAPSERVICE_WSDL_LOCATION = url;
        INSCRIPCIONSOAPSERVICE_EXCEPTION = e;
    }

    public InscripcionSOAPService_Service() {
        super(__getWsdlLocation(), INSCRIPCIONSOAPSERVICE_QNAME);
    }

    public InscripcionSOAPService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSCRIPCIONSOAPSERVICE_QNAME, features);
    }

    public InscripcionSOAPService_Service(URL wsdlLocation) {
        super(wsdlLocation, INSCRIPCIONSOAPSERVICE_QNAME);
    }

    public InscripcionSOAPService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSCRIPCIONSOAPSERVICE_QNAME, features);
    }

    public InscripcionSOAPService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InscripcionSOAPService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InscripcionSOAPService
     */
    @WebEndpoint(name = "inscripcionSOAPServicePort")
    public InscripcionSOAPService getInscripcionSOAPServicePort() {
        return super.getPort(new QName("http://servicios/", "inscripcionSOAPServicePort"), InscripcionSOAPService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InscripcionSOAPService
     */
    @WebEndpoint(name = "inscripcionSOAPServicePort")
    public InscripcionSOAPService getInscripcionSOAPServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "inscripcionSOAPServicePort"), InscripcionSOAPService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSCRIPCIONSOAPSERVICE_EXCEPTION!= null) {
            throw INSCRIPCIONSOAPSERVICE_EXCEPTION;
        }
        return INSCRIPCIONSOAPSERVICE_WSDL_LOCATION;
    }

}