package co.com.financiamiento.clienteprestamo.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.com.financiamiento.clienteprestamo.clases.RespuestaPrestamo;
import co.com.financiamiento.prestamocliente.cliente.Socio;
import co.com.financiamiento.prestamocliente.cliente.SocioWs;
import co.com.financiamiento.prestamocliente.cliente.SocioWsImplService;

@Named
@ViewScoped
public class SocioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private BigDecimal montoPrestamo;
	SocioWs socioWs = new SocioWsImplService().getSocioWsImplPort();
	Object [] respuesta;
	RespuestaPrestamo respuestaPrestamo;
	List<RespuestaPrestamo> listaRespuestaPrestamo = new ArrayList<>();
	
	@PostConstruct
	public void inicializar() {
		
	}

	public BigDecimal getMontoPrestamo() {
		return montoPrestamo;
	}

	public void setMontoPrestamo(BigDecimal montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}
	
	public RespuestaPrestamo getRespuestaPrestamo() {
		return respuestaPrestamo;
	}

	public void setRespuestaPrestamo(RespuestaPrestamo respuestaPrestamo) {
		this.respuestaPrestamo = respuestaPrestamo;
	}

	
	public List<RespuestaPrestamo> getListaRespuestaPrestamo() {
		return listaRespuestaPrestamo;
	}

	public void setListaRespuestaPrestamo(List<RespuestaPrestamo> listaRespuestaPrestamo) {
		this.listaRespuestaPrestamo = listaRespuestaPrestamo;
	}

	public void realizarCotizacionACliente(){
		respuesta = socioWs.realizarCotizacion(montoPrestamo).toArray();
		Socio socioElegido = (Socio)respuesta[0];
		if(socioElegido!=null){
			listaRespuestaPrestamo.add(new RespuestaPrestamo(socioElegido.getNombre(), ((BigDecimal)respuesta[2]), ((BigDecimal)respuesta[1]), socioElegido.getTasa()));
		}
	}
	
}
