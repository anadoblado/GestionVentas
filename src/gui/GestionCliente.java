package gui;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.List;
import java.sql.SQLException;
import java.sql.Date;

import Tema7.GestionConcesionario.modelo.ErrorBBDDException;
import model.controladores.ControladorCliente;
import model.controladores.ControladorFabricante;

public class GestionCliente {

	public static void menuGestioCliente() throws ParseException {
		int option = -1;
		do {
			try {
				System.out.println("\n\t\tGESTIOÓN DE CLIENTE");
				System.out.println("\n\t\t1.- Listado de clientes");
				System.out.println("\n\t\t2.- Alta de cliente");
				System.out.println("\n\t\t3.- Modificación de cliente");
				System.out.println("\n\t\t4.- Baja");
				System.out.println("\n\t\t0.- Salir");
				System.out.println("\n\t\tElija una opción: ");
				
				option = Utils.getIntConsola(0, 4);
				switch (option) {
				case 0:
					break;
				case 1:
					listado(true);
					break;
				case 2:
					alta();
					break;
				case 3:
					modificacion();
					break;
				case 4:
					baja();
					break;
				}
			} catch (ErrorBBDDException e) {
				System.out.println("\n\tError de acceso a datos " + e.getMessage() + "\n");
			}
		} while (option != 0);	
	}
	
	/**
	 * 
	 * @param pausaFinal
	 * @throws ErrorBBDDException
	 * @throws ParseException 
	 */
	public static void listado(boolean pausaFinal) throws ErrorBBDDException, ParseException{
//		List<Cliente> clientes = ControladorCliente.getAll();
//		System.out.println("\n\tListado de clientes: \n");
//		for (Cliente cli : clientes) {
//			System.out.println("\t" + cli.toString());
//		}
//		if(pausaFinal) {
//			System.out.println("\n\tPulse 'Intro' para continuar");
//			Utils.pausa();
//		}
	}
	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	private static void alta() throws ErrorBBDDException, ParseException{
		System.out.println("\n\tAlta de cliente");
		
		Cliente cli = new Cliente();
		System.out.println("\nIntroduce el 'nombre' del cliente");
		cli.setNombre(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'apellidos' del cliente");
		cli.setApellidos(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'localidad' del cliente");
		cli.setLocalidad(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'dni' del cliente");
		cli.setDni(Utils.getStringConsola());
		System.out.println("\nIntroduce la 'fechaNac' del cliente");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		cli.setFechaNac(sdf.parse(Utils.getStringConsola()));
		System.out.println("n\tIntroduce si está 'activo'");
		cli.setActivo(Utils.getStringConsola().equals(Utils.getStringConsola()));
		
		ControladorCliente.almacenar(cli);
		System.out.println("\n\tCoche insertado correctamente. Pulse 'Intro' para continuar.");
		Utils.pausa();
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	private static void modificacion() throws ErrorBBDDException, ParseException{
		System.out.println("\n\tModificacion de cliente");
		
		Cliente cli = seleccionarPorElUsuario();
		if( cli != null) {
			System.out.println("\n\tIntroduzca 'nombre' del cliente ('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			if(!str.equals("")) cli.setNombre(str);
			
			System.out.println("\n\tIntroduzca 'apellidos' del cliente ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) cli.setApellidos(str);
			
			System.out.println("\n\tIntroduzca 'localidad' del cliente ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) cli.setLocalidad(str);
			
			System.out.println("\n\tIntroduzca 'dni' del cliente ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) cli.setDni(str);
			
			System.out.println("\n\tIntroduzca 'fechaNac' del cliente ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(!str.equals("")) cli.setFechaNac(sdf.parse(str));
			
			System.out.println("\n\tIntroduzca 'activo' del cliente ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.contentEquals("")) cli.setActivo(Utils.getStringConsola().equals(Utils.getStringConsola()));
			
			ControladorCliente.almacenar(cli);
			
			System.out.println("\n\tModificado correctamente. Pulse 'Intro' para continuar ");
			Utils.pausa();
		}
	}

	private static Cliente seleccionarPorElUsuario() throws ErrorBBDDException, ParseException {
//		Cliente cli = null;
//		int id = -2;
//		do {
//			System.out.println("\n\tIntroduzca ID del cliente ('-1' para ver el listado, '0' para salir)");
//			id = Utils.getIntConsola(-1);
//			if(id == -1) {
//				listado(false);
//			}
//			else {
//				if(id != 0) {
//					cli = ControladorCliente.get(id);
//					if(cli == null){
//						System.out.println("\n\tError. Ha especificado un ID inválido.");
//					}
//				}
//			}
//		} while (cli == null && id != 0);
		return null;
				//cli;
	}
	
	private static void baja() throws ErrorBBDDException, ParseException{
		System.out.println("\n\tEliminar registro de fabricantes");
		
		Cliente cli = seleccionarPorElUsuario();
		
		if(cli != null) {
			System.out.println("\n\t¿Realmente quiere eliminar el registro? (S/N)");
			String str = Utils.getStringConsola();
			if(str.equalsIgnoreCase("S")) {
				ControladorCliente.eliminar(cli);
				System.out.println("\n\tEl registro se eliminó correctamente. Pulsa 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}
	
	
	
	

}
