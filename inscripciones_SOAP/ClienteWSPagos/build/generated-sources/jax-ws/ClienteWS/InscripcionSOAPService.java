
package ClienteWS;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "inscripcionSOAPService", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InscripcionSOAPService {


    /**
     * 
     * @param validado
     * @return
     *     returns ClienteWS.Pago
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPago", targetNamespace = "http://servicios/", className = "ClienteWS.ConsultarPago")
    @ResponseWrapper(localName = "consultarPagoResponse", targetNamespace = "http://servicios/", className = "ClienteWS.ConsultarPagoResponse")
    @Action(input = "http://servicios/inscripcionSOAPService/consultarPagoRequest", output = "http://servicios/inscripcionSOAPService/consultarPagoResponse")
    public Pago consultarPago(
        @WebParam(name = "validado", targetNamespace = "")
        String validado);

    /**
     * 
     * @return
     *     returns java.util.List<ClienteWS.Pago>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPagos", targetNamespace = "http://servicios/", className = "ClienteWS.ConsultarPagos")
    @ResponseWrapper(localName = "consultarPagosResponse", targetNamespace = "http://servicios/", className = "ClienteWS.ConsultarPagosResponse")
    @Action(input = "http://servicios/inscripcionSOAPService/consultarPagosRequest", output = "http://servicios/inscripcionSOAPService/consultarPagosResponse")
    public List<Pago> consultarPagos();

    /**
     * 
     * @param validado
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarEstatus", targetNamespace = "http://servicios/", className = "ClienteWS.ActualizarEstatus")
    @ResponseWrapper(localName = "actualizarEstatusResponse", targetNamespace = "http://servicios/", className = "ClienteWS.ActualizarEstatusResponse")
    @Action(input = "http://servicios/inscripcionSOAPService/actualizarEstatusRequest", output = "http://servicios/inscripcionSOAPService/actualizarEstatusResponse")
    public boolean actualizarEstatus(
        @WebParam(name = "validado", targetNamespace = "")
        String validado);

}
