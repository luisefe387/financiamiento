package co.com.financiamiento.prestamo.ws;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebService;

import co.com.financiamiento.prestamo.entities.Socio;

/**
 * Interface de tipo local que define los metodos abstractos que utilizara como servicio
 * @author Ing. Luis Fernando Pedroza Taborda
 * @version 1.0 12-may-2018
 */
@WebService
public interface SocioWs {

	@WebMethod
    public Object[] realizarCotizacion(BigDecimal monto,Socio socio);
    
}
