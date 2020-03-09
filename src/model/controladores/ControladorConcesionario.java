package model.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Concesionario;



public class ControladorConcesionario extends ControladorBBDD {

	/**
	 * Método getAll para tener los concesionarios en un ArrayList
	 * @return
	 * @throws ErrorBBDDException
	 */
//	public static List<Concesionario> getAll () throws ErrorBBDDException{
//		List<Concesionario> concesionarios = new ArrayList<Concesionario>();
//		
//		Connection conn = null;
//		
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("select * from concesionario");
//			
//			while (rs.next()) {
//				Concesionario concs = new Concesionario();
//				concs.setId(rs.getInt("id"));
//				concs.setCif(rs.getString("cif"));
//				concs.setNombre(rs.getString("nombre"));
//				concs.setLocalidad(rs.getString("localidad"));
//				concesionarios.add(concs);		
//			}
//			rs.close();
//			s.close();
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException(e);
//		}
//		return concesionarios;
//	}
	
	/**
	 * 
	 * @param concesionario
	 * @throws ErrorBBDDException
	 */
	public static void almacenar (Concesionario concesionario) throws ErrorBBDDException{
//		if (get(concesionario.getId())!=null) {
//			almacenarModificado(concesionario);
//		}
//		else {
//			almacenarNuevo(concesionario);
//		}
	}
	
	
	/**
	 * Método para poder hacer modificaciones en la tabla concesionario
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 */
//	public static Concesionario get (int id) throws ErrorBBDDException{
//		Connection conn = null;
//		Concesionario concs = null;
//		
////		try {
////			conn = ConnectionManagerV2.getConexion();
////			
////			Statement s = conn.createStatement();
////			ResultSet rs = s.executeQuery("select * from concesionario where id = " + id);
////			
////			if(rs.next()) {
////				concs = new Concesionario();
////				concs.setId(id);
////				concs.setCif(rs.getString("cif"));
////				concs.setNombre(rs.getString("nombre"));
////				concs.setLocalidad(rs.getString("localidad"));
////			}
////			rs.close();
////			s.close();
////			
////		} catch (SQLException | ImposibleConectarException e) {
////			throw new ErrorBBDDException(e);
////		}
////		return concs;
//	}
	
	
	/**
	 * Método para almacenar nuevos registros
	 * @param concs
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo (Concesionario concs) throws ErrorBBDDException{
		Connection conn = null;
//		try {
//			// hacemos una conexion
//			conn = ConnectionManagerV2.getConexion();
//			// con el ps hacemos la inserción de datos en la conexión
//			PreparedStatement ps = conn.prepareStatement("INSERT INTO concesionario (id, cif, nombre, localidad) VALUES (?, ?, ?, ?)");
//			int registrosInsertados;
//			
//			// como el id es un campo que al usuario no le interesa ni tiene porqué
//			// saber cuantos hay, autamáticamente lo hacemos en el id siguiente al último
//			ps.setInt(1, nextIdEnTabla(conn, "concesionario"));
//			ps.setString(2, concs.getCif());
//			ps.setString(3, concs.getNombre());
//			ps.setString(4, concs.getLocalidad());
//			
//			registrosInsertados = ps.executeUpdate();
//			if (registrosInsertados != 1) {
//				throw new ErrorBBDDException("Error al insertar nuevo registro");
//			}
//			ps.close();
//			
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException(e);
//		}
	}
	
	/**
	 * Método para hacer modificiones en un registro
	 * @param concs
	 * @throws ErrorBBDDException
	 */
	private static void almacenarModificado(Concesionario concs) throws ErrorBBDDException{
		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("update concesionario set cif = ?, nombre = ?, localidad = ? where id = ?");
//			int registrosInsertados;
//			
//			ps.setString(1, concs.getCif());
//			ps.setString(2, concs.getNombre());
//			ps.setString(3, concs.getLocalidad());
//			ps.setInt(4, concs.getId());
//			
//			registrosInsertados = ps.executeUpdate();
//			if (registrosInsertados != 1) {
//				throw new ErrorBBDDException("No se ha podido hacer la modificación");
//				
//			}
//			ps.close();
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException(e);
//		}
	}
	
	
	/**
	 * Método para eliminar registros
	 * @param concs
	 * @throws ErrorBBDDException
	 * @throws ImposibleConectarException
	 * @throws SQLException
	 */
//	public static void eliminar (Concesionario concs) throws ErrorBBDDException {
//		Connection conn = null;
//		
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("delete from concesionario where id = ?");
//			int registroBorrados;
//			
//			ps.setInt(1, concs.getId());
//			
//			registroBorrados = ps.executeUpdate();
//			if (registroBorrados != 1) {
//				throw new ErrorBBDDException("No se pudo borrar el registros");
//				
//			}
//			
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			// TODO: handle exception
//			throw new ErrorBBDDException(e);
//		}
//	}
	
	public ControladorConcesionario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
