package model.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Coche;


public class ControladorCoche extends ControladorBBDD {

	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
//	public static List<Coche> getAll() throws ErrorBBDDException{
//		List<Coche> coches = new ArrayList<Coche>();
//		Connection conn = null;
//		
////		try {
////			conn = ConnectionManagerV2.getConexion();
////			Statement s = conn.createStatement();
////			ResultSet rs = s.executeQuery("select * from coche");
////			
////			while(rs.next()) {
////				Coche car = new Coche();
////				car.setId(rs.getInt("id"));
////				car.setIdfabricante(rs.getInt("idfabricante"));
////				car.setBastidor(rs.getString("bastidor"));
////				car.setModelo(rs.getString("modelo"));
////				car.setColor(rs.getString("color"));
////				coches.add(car);
////			}
////			rs.close();
////			s.close();
////			
////		} catch (SQLException | ImposibleConectarException e) {
////			throw new ErrorBBDDException();
////		}
////		return coches;
//		
//	}
	
	/**
	 * 
	 * @param car
	 * @throws ErrorBBDDException
	 */
	public static void almacenar (Coche car) throws ErrorBBDDException{
//		if (get(car.getId()) != null) {
//			almacenarModificado(car);
//		}
//		else {
//			almacenarNuevo(car);
//		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 */
//	public static Coche get (int id) throws ErrorBBDDException{
//		Connection conn = null;
//		Coche car = null;
//		
////		try {
////			conn = ConnectionManagerV2.getConexion();
////			Statement s = conn.createStatement();
////			ResultSet rs = s.executeQuery("select * from coche where id= " + id);
////			
////			if(rs.next()) {
////				car = new Coche();
////				car.setId(id);
////				car.setIdfabricante(rs.getInt("idfabricante"));
////				car.setBastidor(rs.getString("bastidor"));
////				car.setModelo(rs.getString("modelo"));
////				car.setColor(rs.getString("color"));
////			}
////			rs.close();
////			s.close();
////			
////		} catch (SQLException | ImposibleConectarException e) {
////			throw new ErrorBBDDException();
////		}
////		return car;
//	}
	
	/**
	 * 
	 */
	public static void almacenarNuevo(Coche car) throws ErrorBBDDException{
		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement(
//					"INSERT INTO coche (id, idfabricante, bastidor, modelo, color) VALUES (?, ?, ?, ?, ?)");
//			int registrosInsertados;
//			
//			ps.setInt(1, nextIdEnTabla(conn, "coche"));
//			ps.setInt(2, car.getIdfabricante());
//			ps.setString(3, car.getBastidor());
//			ps.setString(4, car.getModelo());
//			ps.setString(5, car.getColor());
//			
//			registrosInsertados = ps.executeUpdate();
//			if(registrosInsertados != 1) {
//				throw new ErrorBBDDException("Error al insertar el nuevo registro");
//			}
//			ps.close();
//			
//			
//		} catch (SQLException | ImposibleConectarException  e) {
//			throw new ErrorBBDDException();
//		}
	}
	
	/**
	 * 
	 * @param car
	 * @throws ErrorBBDDException
	 */
	public static void almacenarModificado(Coche car) throws ErrorBBDDException{
		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("update coche set idfabricante=?, bastidor=?, modelo=?, color=? where id=?");
//			int registrosInsertados;
//			
//			ps.setInt(1, car.getIdfabricante());
//			ps.setString(2, car.getBastidor());
//			ps.setString(3, car.getModelo());
//			ps.setString(4, car.getColor());
//			ps.setInt(5, car.getId());
//			
//			registrosInsertados = ps.executeUpdate();
//			if(registrosInsertados != 1) {
//				throw new ErrorBBDDException("No se ha podido hacer la modificación");
//			}
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
	}
	
	/**
	 * 
	 * @param car
	 * @throws ErrorBBDDException
	 */
//	public static void eliminar (Coche car) throws ErrorBBDDException{
//		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("delete from coche where id=?");
//			int registrosBorrados;
//			
//			ps.setInt(1, car.getId());
//			
//			registrosBorrados = ps.executeUpdate();
//			if(registrosBorrados != 1) {
//				throw new ErrorBBDDException("No se pudo borrar el registro");
//			}
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
//	}
//	
//	public ControladorCoche() {
//		// TODO Auto-generated constructor stub
//	}

}
