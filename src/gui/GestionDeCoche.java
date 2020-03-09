package gui;

import java.util.List;

import java.util.Scanner;

import Tema7.GestionConcesionario.modelo.ErrorBBDDException;
import model.controladores.ControladorCoche;

public class GestionDeCoche {

	public static void menuGestionCoche() {
		int option = -1;
		do {
			try {
				System.out.println("\n\t\tGESTIOÓN DE COCHE");
				System.out.println("\n\t\t1.- Listado de coches");
				System.out.println("\n\t\t2.- Alta de coche");
				System.out.println("\n\t\t3.- Modificación de coche");
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
	 */
	public static void listado(boolean pausaFinal) throws ErrorBBDDException{
//		List<Coche> coches = ControladorCoche.getAll();
//		System.out.println("\n\tListado de coches: \n");
//		for (Coche car : coches) {
//			System.out.println("\t" + car.toString());
//		}
//		if(pausaFinal) {
//			System.out.println("\n\tPulse 'Intro' para continuar");
//			Utils.pausa();
//		}
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void alta() throws ErrorBBDDException{
		System.out.println("\n\tAlta de coche");
		
		Coche car = new Coche();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tPusla 'S' para ver la lista de fabricantes");
		
		String str = sc.next();
		if(str.equalsIgnoreCase("S")) {
			GestionDeFabricante.listado(true);;
		}
		System.out.println("\nIntroduce el 'idfabricante' del fabricante del coche");
		car.setIdfabricante(Utils.getIntConsola(0));
		System.out.println("\nIntroduce el número de 'bastidor' del coche");
		car.setBastidor(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'modelo' del coche");
		car.setModelo(Utils.getStringConsola());
		System.out.println("\nIntroduce el 'color' del coche");
		car.setColor(Utils.getStringConsola());
		
		ControladorCoche.almacenar(car);
		
		System.out.println("\n\tCoche insertado correctamente. Pulse 'Intro' para continuar.");
		Utils.pausa();
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion() throws ErrorBBDDException{
		System.out.println("\n\tModificación de cohe\n");
		
		Coche car = seleccionarPorElUsuario();
		if(car != null) {
			System.out.println("\n\tIntroduzca el 'idfabricante' del coche ('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			int idfab = Integer.parseInt(str);
			if(!str.equals("")) car.setIdfabricante(idfab);
			
			System.out.println("\n\tIntroduza el número de 'bastidor' del coche ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) car.setBastidor(str);
			
			System.out.println("\n\tIntroduza el número de 'modelo' del coche ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) car.setModelo(str);
			
			System.out.println("\n\tIntroduza el número de 'color' del coche ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			if(!str.equals("")) car.setColor(str);
			
			ControladorCoche.almacenar(car);
			
			System.out.println("\n\tModificado de forma correcta. Pulse 'Intro' para continuar");
			Utils.pausa();
			
			
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Coche seleccionarPorElUsuario() throws ErrorBBDDException{
		Coche car = null;
		int id = -2;
//		do {
//			System.out.println("\n\tIntroduzca ID del coche ('-1' para ver el listado de coches, '0' para salir)");
//			id = Utils.getIntConsola(-1);
//			if(id == -1) {
//				listado(false);
//			}
//			else {
//				if(id != 0) {
//					car = ControladorCoche.get(id);
//					if(car == null) {
//						System.out.println("\n\tError. Ha especifiaco un ID inválido");
//					}
//				}
//			}
//		} while (car == null && id != 0);
//		
//		return car;
		return car;
	}

	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja() throws ErrorBBDDException{
		System.out.println("\n\tEliminar registro de coche");
		
		Coche car = seleccionarPorElUsuario();
		
		if(car != null) {
			System.out.println("\n\t¿Realmente quiere eliminar el registro? (S/N)");
			String str = Utils.getStringConsola();
			if(str.equalsIgnoreCase("S")) {
				//ControladorCoche.eliminar(car);
				System.out.println("n\tEl registro se eliminón correctamente. Punlse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}
	
	public GestionDeCoche() {
		// TODO Auto-generated constructor stub
	}

}
