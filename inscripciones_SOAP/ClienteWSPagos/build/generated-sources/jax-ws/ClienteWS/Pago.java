
package ClienteWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conceptoPagoID" type="{http://servicios/}conceptoPago" minOccurs="0"/>
 *         &lt;element name="fechaRealizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaValidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pagoID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "pago", propOrder = {
    "conceptoPagoID",
    "fechaRealizacion",
    "fechaValidacion",
    "monto",
    "pagoID",
    "validado"
})
public class Pago {

    protected ConceptoPago conceptoPagoID;
    protected String fechaRealizacion;
    protected String fechaValidacion;
    protected int monto;
    protected int pagoID;
    protected String validado;

    /**
     * Obtiene el valor de la propiedad conceptoPagoID.
     * 
     * @return
     *     possible object is
     *     {@link ConceptoPago }
     *     
     */
    public ConceptoPago getConceptoPagoID() {
        return conceptoPagoID;
    }

    /**
     * Define el valor de la propiedad conceptoPagoID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptoPago }
     *     
     */
    public void setConceptoPagoID(ConceptoPago value) {
        this.conceptoPagoID = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRealizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     * Define el valor de la propiedad fechaRealizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRealizacion(String value) {
        this.fechaRealizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaValidacion() {
        return fechaValidacion;
    }

    /**
     * Define el valor de la propiedad fechaValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaValidacion(String value) {
        this.fechaValidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(int value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoID.
     * 
     */
    public int getPagoID() {
        return pagoID;
    }

    /**
     * Define el valor de la propiedad pagoID.
     * 
     */
    public void setPagoID(int value) {
        this.pagoID = value;
    }

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
