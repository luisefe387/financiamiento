
package co.com.financiamiento.clienteprestamo.cliente;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para socio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="socio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoMaxDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "socio", propOrder = {
    "identifica",
    "nombre",
    "tasa",
    "montoMaxDisponible"
})
public class Socio {

    protected String identifica;
    protected String nombre;
    protected BigDecimal tasa;
    protected BigDecimal montoMaxDisponible;

    /**
     * Obtiene el valor de la propiedad identifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifica() {
        return identifica;
    }

    /**
     * Define el valor de la propiedad identifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifica(String value) {
        this.identifica = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
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
     * Define el valor de la propiedad nombre.
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
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMaxDisponible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMaxDisponible() {
        return montoMaxDisponible;
    }

    /**
     * Define el valor de la propiedad montoMaxDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMaxDisponible(BigDecimal value) {
        this.montoMaxDisponible = value;
    }

}
