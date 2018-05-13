package co.com.financiamiento.prestamo.ws;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import co.com.financiamiento.prestamo.daos.SocioDao;
import co.com.financiamiento.prestamo.entities.Socio;


/**
 * Socio de tipo EJB que implementa los metodos cargados de la interface necesarios para crear el servicio Socio
 * @author Ing. Luis Fernando Pedroza Taborda
 * @version 1.0 12-may-2018
 */
@Stateless
@WebService(endpointInterface="co.com.financiamiento.prestamo.ws.SocioWs")
public class SocioWsImpl implements SocioWs{

	/**
	 * Atributo que define la interface Dao Socio
	 */
	@EJB
	private SocioDao socioDao;
	
	/**
     * Metodo para encontrar el socio que ofresca la tasa de interes mas baja y que cuente con el capital suficiente para realizar el prestamo
     * @param monto corresponde al monto del prestamo
     * @return el socio que cumple con las condiciones
     */
	@Override
	public Object[] realizarCotizacion(BigDecimal monto,Socio socioE){
		Socio socio = socioDao.encontrarSocioPorMonto(monto);
		BigDecimal plazo = new BigDecimal(36);
		BigDecimal tasa;
		Object[] lista = new Object[4];
		BigDecimal cuotaMensual;
		BigDecimal pagoTotalCredito;
		
		if(socio!=null){
			tasa = socio.getTasa().divide(new BigDecimal(100));
			pagoTotalCredito = monto.multiply(new BigDecimal(1).add(plazo.multiply(tasa)));
			cuotaMensual = pagoTotalCredito.divide(plazo,2,RoundingMode.HALF_UP);
			
			lista[0] = socio;
			lista[1] = pagoTotalCredito; 
			lista[2] = cuotaMensual;
			lista[3]= "";
			
		}else{
			lista[3]= "No hay socio disponible";
		}
		
		return lista;
	}
}
