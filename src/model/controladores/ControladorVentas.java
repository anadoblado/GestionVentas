package model.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import model.Venta;


public class ControladorVentas extends ControladorBBDD {
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	public static List<Venta> getAll() throws ErrorBBDDException, ParseException, ImposibleConectarException{
		List<Venta> ventas = new ArrayList<Venta>();
/*		Connection conn = null;
		
		try {
			//conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from venta");
			
			while(rs.next()) {
				Venta ven = new Venta();
				ven.setId(rs.getInt("id"));
				ven.setIdCliente(rs.getInt("idCliente"));
				ven.setIdConcesionario(rs.getInt("idConcesionario"));
				ven.setIdCoche(rs.getInt("idCoche"));
				ven.setFecha(rs.getDate("fecha"));
				ven.setPrecioVenta(rs.getFloat("precioVenta"));
				ventas.add(ven);
			}
			rs.close();
			s.close();
			
		} catch (SQLException e) {
			throw new ErrorBBDDException();
		}*/
		
		return ventas;
		
	}

	
	public static void almacenar(Venta ven) throws ErrorBBDDException, ParseException{
//		if(get(ven.getId()) != null) {
//			almacenarModificado(ven);
//		}
//		else {
//			almacenarNuevo(ven);
		//}
	}
	
	/**
	 * 
	 * @param ven
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	private static void almacenarModificado(Venta ven)  throws ErrorBBDDException, ParseException, ImposibleConectarException {
/*		Connection conn = null;
		
		try {
			//conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement("update venta set idCliente=?, idConcesionario=?, idCoche=?, fecha=?, precioVenta=?, where id=?");
			int registrosModificados;
			
			ps.setInt(1, ven.getIdCliente());
			ps.setInt(2, ven.getIdConcesionario());
			ps.setInt(3, ven.getIdCoche());
			ps.setString(4, ven.getFecha());
			ps.setFloat(5, ven.getPrecioVenta());
			ps.setInt(6, ven.getId());
			
			registrosModificados = ps.executeUpdate();
			if(registrosModificados != 1) {
				throw new ErrorBBDDException("No se ha podido hacer la modificación");
			}
			
		} catch (SQLException e) {
			throw new ErrorBBDDException();
		}
		*/
	}


	/**
	 * 
	 * @param ven
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo(Venta ven) throws ErrorBBDDException, ImposibleConectarException {
/*		Connection conn = null;
		
		try {
			//conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO venta (id, idCliente, idConcesionario, idCoche, fecha, precioVenta) VALUES (?, ?, ?, ?, ?, ?)");
			int registrosInsertados;
			
			ps.setInt(1, nextIdEnTabla(conn, "venta"));
			ps.setInt(2, ven.getIdCliente());
			ps.setInt(3, ven.getIdConcesionario());
			ps.setInt(4, ven.getIdCoche());
			ps.setString(5, ven.getFecha());
			//System.out.println("aaaa");
			ps.setFloat(6, ven.getPrecioVenta());
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("Error al insertar el nuevo registro");
			}
			ps.close();
			
		} catch (SQLException e) {
			throw new ErrorBBDDException();
		}
		*/
	}


	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	public static Venta get(int id)  throws ErrorBBDDException, ParseException, ImposibleConectarException{
		Connection conn = null;
		Venta ven = null;
/*		
		try {
			//conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from venta where id= " + id);
			
			if (rs.next()) {
				ven = new Venta();
				ven.setId(id);
				ven.setIdCliente(rs.getInt("idCliente"));
				ven.setIdConcesionario(rs.getInt("idConcesionario"));
				ven.setIdCoche(rs.getInt("idCoche"));
				ven.setFecha(rs.getDate("fecha"));
				ven.setPrecioVenta(rs.getFloat("precioVenta"));
			}
			rs.close();
			s.close();
		} catch (SQLException e) {
			throw new ErrorBBDDException();
		}
		*/
		return ven;
		
	}
	
	/**
	 * 
	 * @param ven
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Venta ven) throws ErrorBBDDException, ImposibleConectarException{
/*		Connection conn = null;
		try {
			//conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement("delete from venta where id=?");
			int registrosBorrados;
			
			ps.setInt(1, ven.getId());
			
			registrosBorrados = ps.executeUpdate();
			if(registrosBorrados != 1) {
				throw new ErrorBBDDException("No se pudo borrar el registro");
			}
		} catch (SQLException e) {
			throw new ErrorBBDDException();
		}*/	}
	
	
	public ControladorVentas() {
		// TODO Auto-generated constructor stub
	}

}
