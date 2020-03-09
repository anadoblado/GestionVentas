package gui;

import java.util.List;

import model.Fabricante;
import model.controladores.ControladorFabricante;

public class GestionDeFabricante {
	
	public static void menuGestionFabricante() {
		int option = -1;
		do {
			System.out.println("\n\t\tGESTIÓN DE FABRICANTE");
			System.out.println("\n\t\t1.- Listado de fabricantes");
			System.out.println("\n\t\t2.- Alta de fabricante");
			System.out.println("\n\t\t3.- Modificación de fabricante");
			System.out.println("\n\t\t4.- Baja de fabricante");
			System.out.println("\n\t\t0.- Salir");
			System.out.println("\n\t\tElija una opción: ");
			
			option = Utils.getIntConsola(0, 4);
			switch (option) {
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
		} while (option != 0);
	}
	
	/**
	 * 
	 * @param pausaFinal
	 */
	public static void listado(boolean pausaFinal) {
		List<Fabricante> fabricantes = ControladorFabricante.getAll();
		System.out.println("\n\tListado de fabricantes: \n");
//		for (Fabricante fab : fabricantes) {
//			System.out.println("\t" + fab.toString());
//			
//		}
		if (pausaFinal) {
			System.out.println("\n\tPulse 'Intro' para continuar");
			Utils.pausa();
		}
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void alta() {
		System.out.println("\n\tAlta de fabricante");
		
		Fabricante fab = new Fabricante();
		System.out.println("\nIntroduce el 'CIF' del fabricante");
		fab.setCif(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'Nombre' del fabricante");
		fab.setNombre(Utils.getStringConsola());
		
		ControladorFabricante.almacenar(fab);
		//almacenarNuevo(fab);
		//almacenar(fab);
		
		System.out.println("\n\tFabricante insertado correctamente. Pulse 'Intro' para continuar");
		Utils.pausa();
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion() {
		System.out.println("\n\tModificación de fabricante\n");
		
		Fabricante fab = seleccionarPorElUsuario();
		
		if (fab != null) {
			System.out.println("\nIntroduzca 'CIF' del fabricante ('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			if(!str.equals("")) fab.setCif(str);
			
			System.out.println("\nIntroduzca 'Nombre' del fabricante ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) fab.setNombre(str);
			
			ControladorFabricante.almacenar(fab);
			
			System.out.println("\n\tModificado correctamente. Pulse 'Intro' para continuar ");
			Utils.pausa();
		}
		
	}
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Fabricante seleccionarPorElUsuario() {
		Fabricante fab = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' para ver el listado, '0' para salir)");
			id = Utils.getIntConsola(-1);
			if(id == -1) {
				listado(false);
			}
			else {
				if(id != 0) {
					fab = ControladorFabricante.get(id);
					if(fab == null) {
						System.out.println("\n\tError. Ha especificado un ID inválido.");
					}
				}
			}
			
		} while (fab == null && id != 0);
		return fab;
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja() {
		System.out.println("\n\tEliminar registro de fabricantes");
		
		Fabricante fab = seleccionarPorElUsuario();
		
		if(fab != null) {
			System.out.println("\n\t¿Realmente quiere eliminar el registro? (S/N)");
			String str = Utils.getStringConsola();
			if(str.equalsIgnoreCase("S")) {
				//ControladorFabricante.eliminar(fab);
				System.out.println("\n\tEl registro se eliminó correctamente. Pulsa 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}
	

}
