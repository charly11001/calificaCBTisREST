/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewspagos;

import ClienteWS.Pago;
import java.util.List;

/**
 *
 * @author Juan_Carlos
 */
public class ClienteWSPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Pago> lista=consultarPagos();
        for(Pago pago:lista){
            System.out.println(pago.getFechaValidacion());
        }
         System.out.println(consultarPago("V").getFechaRealizacion());     
        
    }

    private static java.util.List<ClienteWS.Pago> consultarPagos() {
        ClienteWS.InscripcionSOAPService_Service service = new ClienteWS.InscripcionSOAPService_Service();
        ClienteWS.InscripcionSOAPService port = service.getInscripcionSOAPServicePort();
        return port.consultarPagos();
    }

    private static Pago consultarPago(java.lang.String validado) {
        ClienteWS.InscripcionSOAPService_Service service = new ClienteWS.InscripcionSOAPService_Service();
        ClienteWS.InscripcionSOAPService port = service.getInscripcionSOAPServicePort();
        return port.consultarPago(validado);
    }

   

   

        
}
