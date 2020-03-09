package gui;

import java.sql.SQLException;

import java.util.List;

import Tema7.GestionConcesionario.modelo.ErrorBBDDException;
import Tema7.GestionConcesionario.modelo.ImposibleConectarException;
import model.controladores.ControladorConcesionario;

public class GestionDeConcesionario {
	
	public static void menuGestionConcesionario() {
		int opcion = -1;
		do {
			try {
				System.out.println("\n\t\t\tGESTIÓN DE CONCESIONARIO");
				System.out.println("\n\t1.-Listado de concesionarios");
				System.out.println("\n\t2.-Alta de concesionario");
				System.out.println("\n\t3.-Modificación de concesinario");
				System.out.println("\n\t4.-Baja de concesionario");
				System.out.println("\n\t0.-Salir");
				System.out.println("\n\tElija una opción: ");
				
				opcion = Utils.getIntConsola(0, 4);
				switch (opcion) {
				case 0:
					break;
				case 1: listado(true);
					break;
				case 2: alta();
					break;
				case 3: modificacion();
					break;
				case 4: baja();
					break;
				}
				
			} catch (ErrorBBDDException e) {
				System.out.println("\n\t\tError de acceso a datos " + e.getMessage() + "\n");
				e.printStackTrace();
			}	
			
		} while (opcion != 0);
	}

	
	/**
	 * Devuelve el listado de los concesionarios
	 * @param pausaFinal
	 * @throws ErrorBBDDException
	 */
	public static void listado(boolean pausaFinal) throws ErrorBBDDException{
//		List<Concesionario> concesionarios = ControladorConcesionario.getAll();
//		System.out.println("\n\tListado de concesionarios: \n");
//		for (Concesionario concs : concesionarios) {
//			System.out.println("\t" + concs.toString());
//			
//		}
//		if(pausaFinal) {
//			System.out.println("\n\tPulse 'Intro' para continuar");
//			Utils.pausa();
//		}
	}
	
	/**
	 * Alta de concesionario
	 * @throws ErrorBBDDException
	 */
	private static void alta() throws ErrorBBDDException{
		System.out.println("\n\tAlta de concesionario");
		
		Concesionario conce = new Concesionario();
		System.out.println("\nIntroduce 'CIF' del concesionario");
		conce.setCif(Utils.getStringConsola());
		System.out.println("\nIntroduce 'Nombre' del concesionario");
		conce.setNombre(Utils.getStringConsola());
		System.out.println("\nIntroduce 'Localidad' del concesionario");
		conce.setLocalidad(Utils.getStringConsola());
		
		ControladorConcesionario.almacenar(conce);
		
		System.out.println("\n\tInsertado correctamente. Pulse 'Intro' para continuar");
		Utils.pausa();
	}
	
	/**
	 * Modificacion
	 * @throws ErrorBBDDException
	 */
	private static void modificacion () throws ErrorBBDDException {
		System.out.println("\n\tModificación de concesionario\n");
		
		Concesionario conce = seleccionPorElUsuario();
		
		if (conce != null) {
			System.out.println("\nIntroduzca 'CIF' del concesionario ('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			if(!str.equals("")) {
				conce.setCif(str);
			}
			
			System.out.println("\nIntroduzca 'Nombre' del concesionario ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) {
				conce.setNombre(str);
			}
			System.out.println("\nIntroduzca 'Localidad' del concesionario ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) {
				conce.setLocalidad(str);
			}
			
			ControladorConcesionario.almacenar(conce);
			
			System.out.println("\n\tModificado correctamente. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
		
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ImposibleConectarException
	 * @throws SQLException
	 */
	private static void baja() throws ErrorBBDDException {
		System.out.println("\n\tEliminar registro de concesionarios");
		
		Concesionario conce = seleccionPorElUsuario();
		
		if(conce != null) {
			System.out.println("\n\t¿Realmente quieres eliminar el registro? (S/N)");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) {
				//ControladorConcesionario.eliminar(conce);
				System.out.println("\n\tEl registro se eliminó correctamente. Pulse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Concesionario seleccionPorElUsuario () throws ErrorBBDDException{
		Concesionario conce = null;
		int id = -2;
//		do {
//			System.out.println("\n\tIntroduzca ID del concesionario ('-1' para ver el listado, '0' para salir)");
//			id = Utils.getIntConsola(-1);
//			if(id == -1) {
//				listado(false);
//			}
//			else {
//				if(id != 0) {
//					conce = ControladorConcesionario.get(id);
//					if (conce == null) {
//						System.out.println("\tError. Ha especificado un ID inválido.");
//					}
//				}
//			}
//		} while (conce == null && id != 0);
		
		return conce;
		
	}
	
	
}
