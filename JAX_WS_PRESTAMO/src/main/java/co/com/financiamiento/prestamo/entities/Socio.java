package co.com.financiamiento.prestamo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Socio que define los atributos y metodos de Socio
 * @author Ing. Luis Fernando Pedroza Taborda
 * @version 1.0 19-oct-2017
 */
@Entity
@NamedQueries({ 
	@NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s ORDER BY s.nombre") })
@Table(name="SOC_SOCIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class Socio implements Serializable{

	//Atributos
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)     
	@Column(name = "SOC_IDENTIFICA",nullable = false,length=3) 
	private String identifica;
	
	@Column(name = "SOC_NOMBRE",length=250) 
	private String nombre;
	
	@Column(name = "SOC_TASA",nullable = false,length=250) 
	private BigDecimal tasa;
	
	@Column(name = "SOC_MONTOMAXDISPONIBLE",nullable = false,length=250) 
	private BigDecimal montoMaxDisponible;
	/**
	 * Constructor vacio que debe tener la entidad por defecto
	 */
	public Socio(){
		
	}
		//
	//Metodos getters y setters
	public String getIdentifica() {
		return identifica;
	}

	public void setIdentifica(String identifica) {
		this.identifica = identifica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getTasa() {
		return tasa;
	}

	public void setTasa(BigDecimal tasa) {
		this.tasa = tasa;
	}

	public BigDecimal getMontoMaxDisponible() {
		return montoMaxDisponible;
	}

	public void setMontoMaxDisponible(BigDecimal montoMaxDisponible) {
		this.montoMaxDisponible = montoMaxDisponible;
	}
	
}
