package co.com.financiamiento.prestamo.daos;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.com.financiamiento.prestamo.entities.Socio;


/**
 * Socio de tipo EJB que implementa los metodos cargados de la interface de un Socio
 * @author Ing. Luis Fernando Pedroza Taborda
 * @version 1.0 12-may-2018
 */
@Stateless
public class SocioDaoImpl implements SocioDao {
	
	/**
	 * Atributo que define la unidad de persistencia para conectar la aplicacion a la BD
	 */
	@PersistenceContext(unitName = "prestamoPU")     
	EntityManager em; 
	
	/**
	 * Metodo para obtener todos los Socioes de la base de datos
	 * @return una lista de Socioes
	 */
	@SuppressWarnings("unchecked") 
	@Override
	public List<Socio> findAllSocios() {
		return em.createNamedQuery("Socio.findAll").getResultList();
	}

	/**
	 * Metodo para traer una Socio a partir de un identificador
	 * @param Socio a encontrar
	 * @return la Socio encontrado
	 */
	@Override
	public Socio findSocioByIdentifica(Socio socio) {
		return em.find(Socio.class, socio.getIdentifica());
	}

	/**
     * Metodo para insertar una Socio a la base de datos
     * @param Socio a insertar
     */
	@Override
	public void insertSocio(Socio socio) {
		em.persist(socio);

	}

	 /**
     * Metodo para actualizar un Socio a la base de datos
     * @param Socio a actualizar
     */
	@Override
	public void updateSocio(Socio socio) {
		em.merge(socio);

	}

	 /**
     * Metodo para eliminar un Socio a la base de datos
     * @param Socio a eliminar
     */
	@Override
	public void deleteSocio(Socio socio) {
		socio = em.find(Socio.class, socio.getIdentifica());
		em.remove(socio);

	}
	
	/**
     * Metodo para encontrar el socio que ofresca la tasa de interes mas baja y que cuente con el capital suficiente para realizar el prestamo
     * @param monto corresponde al monto del prestamo
     * @return el socio que cumple con las condiciones
     */
	@Override
	public Socio encontrarSocioPorMonto(BigDecimal monto){
		Socio socio = null;
		try{
			Query query = em.createQuery("from Socio s where s.tasa in (select min(so.tasa) from Socio so where so.montoMaxDisponible >=:monto)");
			query.setParameter("monto", monto);
			socio = (Socio)query.getSingleResult();
		}catch(NoResultException e) {
	        return null;
	    }
		return socio;
	}

	

}
