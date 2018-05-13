package co.com.financiamiento.prestamo.daos;

import java.math.BigDecimal;
import java.util.List;

import co.com.financiamiento.prestamo.entities.Socio;


/**
 * Interface para el patron DAO que define los metodos abstractos CRUD de un Socio
 * @author Ing. Luis Fernando Pedroza Taborda
 * @version 1.0 12-may-2018
 */
public interface SocioDao {
	
	//Metodo abstractos
	public List<Socio> findAllSocios(); 
	 
    public Socio findSocioByIdentifica(Socio socio); 
 
    public void insertSocio(Socio socio); 
 
    public void updateSocio(Socio socio); 
 
    public void deleteSocio(Socio socio);
    
    public Socio encontrarSocioPorMonto(BigDecimal monto);
}
