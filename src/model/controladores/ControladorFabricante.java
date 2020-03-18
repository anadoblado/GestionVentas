package model.controladores;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Fabricante;



public class ControladorFabricante {
	
	public static void obtencionUnaEntidad() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GestionVentas");
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Fabricante> getAll() {
		EntityManagerFactory entityManagerFactoty = Persistence.createEntityManagerFactory("GestionVentas");
		
		EntityManager em = entityManagerFactoty.createEntityManager();
		
		Query q = em.createNativeQuery("SELECT * FROM fabricante;", Fabricante.class);
				//("Fabricante.findAll");
				//("SELECT * FROM fabricante;", Fabricante.class);
		
		
		List<Fabricante> fabricantes = (List<Fabricante>)q.getResultList();
		
		for (Fabricante fabricante : fabricantes) {
			System.out.println("Fabricante: " + fabricante.getId() + " Cif: " + fabricante.getCif() + " Nombre: " + fabricante.getNombre());
		}
		
		em.close();
		
		//Connection conn = null;
		
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("select * from fabricante");
//			
//			while (rs.next()) {
//				Fabricante fab = new Fabricante();
//				fab.setId(rs.getInt("id"));
//				fab.setCif(rs.getString("cif"));
//				fab.setNombre(rs.getString("nombre"));
//				fabricantes.add(fab);
//			}
//			rs.close();
//			s.close();
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
		return fabricantes;
		
	}
	
	
	public static void almacenar (Fabricante fabricante) {
		/*if (get(fabricante.getId())!= null) {
			almacenarModificado(fabricante);
		}
		*/
		//else {
			almacenarNuevo(fabricante);
		//}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 */
	public static Fabricante get (int id) {
		Connection conn = null;
		Fabricante fab = null;
		
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("select * from fabricante where id = " + id);
//			
//			if (rs.next()) {
//				fab = new Fabricante();
//				fab.setId(id);
//				fab.setCif(rs.getNString("cif"));
//				fab.setNombre(rs.getNString("nombre"));
//			}
//			
//			rs.close();
//			s.close();
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
		return fab;
	}
	
	/**
	 * 
	 * @param fab
	 * @throws ErrorBBDDException
	 */
	public static void almacenarNuevo( Fabricante fab) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GestionVentas");
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Fabricante fab1 = new Fabricante();
		fab1.setCif(fab.getCif());
		fab1.setNombre(fab.getNombre());
		
		em.getTransaction().begin();
		em.persist(fab);
		em.getTransaction().commit();
		
		TypedQuery<Fabricante> q = em.createQuery("SELECT f FROM Fabricante as f", Fabricante.class);
		
		List<Fabricante> fabricantes = q.getResultList();
		
		for (Fabricante fabricante : fabricantes) {
			System.out.println("Fabricante: " + fabricante.getId() + " CIF: " + fabricante.getCif() + " Nombre: " + fabricante.getNombre() );
			
		}
		em.close();
		
		//Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("INSERT INTO fabricante (id, cif, nombre) VALUES (?, ?, ?)");
//			int registrosInsertados;
//			
//			ps.setInt(1, nextIdEnTabla(conn, "fabricante"));
//			ps.setString(2, fab.getCif());
//			ps.setString(3, fab.getNombre());
//			
//			registrosInsertados = ps.executeUpdate();
//			if(registrosInsertados != 1) {
//				throw new ErrorBBDDException("Error al insertar nuevo registro");
//			}
//			ps.close();
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
	}
	
	/**
	 * 
	 * @param fab
	 * @throws ErrorBBDDException
	 */
	public static void almacenarModificado(Fabricante fab) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GestionVentas");
		EntityManager em = entityManagerFactory.createEntityManager();
		TypedQuery<Fabricante> q = em.createQuery("SELECT f FROM Fabricante as f where f.cif = '12345678A'", Fabricante.class);
		
		List<Fabricante> fabricantes = q.getResultList();
		
		em.getTransaction().begin();
		for (Fabricante fabricante : fabricantes) {
			fabricante.setNombre("ModificadoPorMi");
			em.persist(fabricante);
		}
		em.getTransaction().commit();
		em.close();
		
		
		//Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("update fabricante set cif=?, nombre=?, where id=?");
//			int registrosInsertados;
//			
//			ps.setString(1, fab.getCif());
//			ps.setString(2, fab.getNombre());
//			ps.setInt(3, fab.getId());
//			
//			registrosInsertados = ps.executeUpdate();
//			if(registrosInsertados!=1) {
//				throw new ErrorBBDDException("No se ha podido hacer la modificación");
//			}
//			ps.close();
//		} catch (SQLException | ImposibleConectarException e) {
//			e.printStackTrace();
//			throw new ErrorBBDDException();
//			
//		}
	}
	

	/**
	 * 
	 * @param fab
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Fabricante fab) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GestionVentas");
		EntityManager em = entityManagerFactory.createEntityManager();
		TypedQuery<Fabricante> q = em.createQuery("SELECT f FROM Fabricante as where f.nombre = 'roro'", Fabricante.class);
		
		List<Fabricante> fabricantes = q.getResultList();
		
		em.getTransaction().begin();
		for (Fabricante fabricante : fabricantes) {
			em.remove(fabricante);
		}
		em.getTransaction().commit();
		em.close();
		
/*		Connection conn = null;
		
		try {
			//conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement("delete from fabricante where id=?");
			int registrosBorrados;
			
			ps.setInt(1, fab.getId());
			
			registrosBorrados = ps.executeUpdate();
			if(registrosBorrados != 1) {
				throw new ErrorBBDDException("No se pudo borrar el registro");
			}
			
		} catch (SQLException e) {
			throw new ErrorBBDDException();
		}*/
	}
	
	public ControladorFabricante() {
		
	}

}
