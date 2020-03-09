package model.controladores;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class ControladorCliente extends ControladorBBDD {

	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
//	public static List<Cliente> getAll() throws ErrorBBDDException, ParseException{
//		List<Cliente> clientes = new ArrayList<Cliente>();
//		Connection conn = null;
//		
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("select * from cliente");
//			
//			while(rs.next()) {
//				Cliente cli = new Cliente();
//				cli.setId(rs.getInt("id"));
//				cli.setNombre(rs.getString("nombre"));
//				cli.setApellidos(rs.getString("apellidos"));
//				cli.setLocalidad(rs.getString("localidad"));
//				cli.setDni(rs.getString("dniNie"));
//				cli.setFechaNac(rs.getDate("fechaNac"));
//				cli.setActivo(rs.getBoolean("activo"));
//				clientes.add(cli);
//			}
//			rs.close();
//			s.close();
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
//		return clientes;
		
//	}
	
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	public static void almacenar(Cliente cli) throws ErrorBBDDException, ParseException{
//		if(get(cli.getId()) != null) {
//			almacenarModificado(cli);
//		}
//		else {
//			almacenarNuevo(cli);
//		}
	}
	
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo(Cliente cli) throws ErrorBBDDException, ParseException{
		
//		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement(
//					"INSERT INTO cliente (id, nombre, apellidos, localidad, dniNie, fechaNac, activo) VALUES (?, ?, ?, ?, ?, ?, ?)");
//			int registrosInsertados;
//			
//			ps.setInt(1, nextIdEnTabla(conn, "cliente"));
//			ps.setString(2, cli.getNombre());
//			ps.setString(3, cli.getApellidos());
//			ps.setString(4, cli.getLocalidad());
//			ps.setString(5, cli.getDni());
//			ps.setString(6, cli.getFechaNac());
//			ps.setBoolean(7, cli.getActivo());
//			
//			registrosInsertados = ps.executeUpdate();
//			if(registrosInsertados != 1) {
//				throw new ErrorBBDDException("Error al insertar el nuevo registro");
//			}
//			ps.close();
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
//	public static Cliente get(int id)  throws ErrorBBDDException, ParseException{
//		Connection conn = null;
//		Cliente cli = null;
//		
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("select * from cliente where id= " + id);
//			
//			if(rs.next()) {
//				cli = new Cliente();
//				cli.setId(id);
//				cli.setNombre(rs.getString("nombre"));
//				cli.setApellidos(rs.getString("apellidos"));
//				cli.setLocalidad(rs.getString("localidad"));
//				cli.setDni(rs.getString("dniNie"));
//				//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//				cli.setFechaNac(rs.getDate("fechaNac"));
//				//cli.setFechaNac(sdf.parse(Utils.getStringConsola()));
//				cli.setActivo(rs.getBoolean("activo"));	
//			}
//			rs.close();
//			s.close();
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
//		return cli;
//	}

	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 */
	private static void almacenarModificado(Cliente cli)  throws ErrorBBDDException, ParseException{
		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("update cliente set nombre=?, apellidos=?, localidad=?, dniNie=?, fechaNac=?, activo=? where id=?");
//			int registrosModificados;
//			
//			ps.setString(1, cli.getNombre());
//			ps.setString(2, cli.getApellidos());
//			ps.setString(3, cli.getLocalidad());
//			ps.setString(4, cli.getDni());
//			ps.setString(5, cli.getFechaNac());
//			ps.setBoolean(6, cli.getActivo());
//			ps.setInt(7, cli.getId());
//			
//			registrosModificados = ps.executeUpdate();
//			if(registrosModificados != 1) {
//				throw new ErrorBBDDException("No se ha podido hacer la modificaci�n");
//			}
//			
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
	}
	
	
	/**
	 * 
	 * @param cli
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Cliente cli) throws ErrorBBDDException{
		Connection conn = null;
//		try {
//			conn = ConnectionManagerV2.getConexion();
//			PreparedStatement ps = conn.prepareStatement("delete from cliente where id=?");
//			int registrosBorrados;
//			
//			ps.setInt(1, cli.getId());
//			
//			registrosBorrados = ps.executeUpdate();
//			if(registrosBorrados != 1) {
//				throw new ErrorBBDDException("No se pudo borrar el registro");
//			}
//		} catch (SQLException | ImposibleConectarException e) {
//			throw new ErrorBBDDException();
//		}
	}
	public ControladorCliente() {
		// TODO Auto-generated constructor stub
	}

}
