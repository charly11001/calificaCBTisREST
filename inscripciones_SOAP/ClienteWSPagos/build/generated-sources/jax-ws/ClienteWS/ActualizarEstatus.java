
package ClienteWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarEstatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarEstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarEstatus", propOrder = {
    "validado"
})
public class ActualizarEstatus {

    protected String validado;

    /**
     * Obtiene el valor de la propiedad validado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidado() {
        return validado;
    }

    /**
     * Define el valor de la propiedad validado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidado(String value) {
        this.validado = value;
    }

}
