package co.com.financiamiento.clienteprestamo.clases;
import java.math.BigDecimal;

public class RespuestaPrestamo {
	
	private String nombreSocio;
	private BigDecimal cuotaMensual;
	private BigDecimal pagoTotalCredito;
	private BigDecimal tasaInteres;
	
	public RespuestaPrestamo(String nombreSocio, BigDecimal cuotaMensual, BigDecimal pagoTotalCredito,
			BigDecimal tasaInteres) {
		this.nombreSocio = nombreSocio;
		this.cuotaMensual = cuotaMensual;
		this.pagoTotalCredito = pagoTotalCredito;
		this.tasaInteres = tasaInteres;
	}
	
	public String getNombreSocio() {
		return nombreSocio;
	}
	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}
	public BigDecimal getCuotaMensual() {
		return cuotaMensual;
	}
	public void setCuotaMensual(BigDecimal cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	public BigDecimal getPagoTotalCredito() {
		return pagoTotalCredito;
	}
	public void setPagoTotalCredito(BigDecimal pagoTotalCredito) {
		this.pagoTotalCredito = pagoTotalCredito;
	}
	public BigDecimal getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(BigDecimal tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
}
