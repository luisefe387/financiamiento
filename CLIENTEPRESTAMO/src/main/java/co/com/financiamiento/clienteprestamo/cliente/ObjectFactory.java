
package co.com.financiamiento.clienteprestamo.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.financiamiento.clienteprestamo.cliente package. 
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

    private final static QName _RealizarCotizacionResponse_QNAME = new QName("http://ws.prestamo.financiamiento.com.co/", "realizarCotizacionResponse");
    private final static QName _RealizarCotizacion_QNAME = new QName("http://ws.prestamo.financiamiento.com.co/", "realizarCotizacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.financiamiento.clienteprestamo.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RealizarCotizacionResponse }
     * 
     */
    public RealizarCotizacionResponse createRealizarCotizacionResponse() {
        return new RealizarCotizacionResponse();
    }

    /**
     * Create an instance of {@link RealizarCotizacion }
     * 
     */
    public RealizarCotizacion createRealizarCotizacion() {
        return new RealizarCotizacion();
    }

    /**
     * Create an instance of {@link Socio }
     * 
     */
    public Socio createSocio() {
        return new Socio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarCotizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.prestamo.financiamiento.com.co/", name = "realizarCotizacionResponse")
    public JAXBElement<RealizarCotizacionResponse> createRealizarCotizacionResponse(RealizarCotizacionResponse value) {
        return new JAXBElement<RealizarCotizacionResponse>(_RealizarCotizacionResponse_QNAME, RealizarCotizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.prestamo.financiamiento.com.co/", name = "realizarCotizacion")
    public JAXBElement<RealizarCotizacion> createRealizarCotizacion(RealizarCotizacion value) {
        return new JAXBElement<RealizarCotizacion>(_RealizarCotizacion_QNAME, RealizarCotizacion.class, null, value);
    }

}
