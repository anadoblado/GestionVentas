package gui;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import Tema7.GestionConcesionario.modelo.ErrorBBDDException;
import model.controladores.ControladorCliente;
import model.controladores.ControladorCoche;
import model.controladores.ControladorVentas;

public class GestionVenta {
	
	public static void menuGestioVenta() throws ParseException {
		int option = -1;
		do {
			try {
				System.out.println("\n\t\tGESTIOÓN DE VENTA");
				System.out.println("\n\t\t1.- Listado de ventas");
				System.out.println("\n\t\t2.- Alta de venta");
				System.out.println("\n\t\t3.- Modificación de venta");
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
	public static void listado(boolean pausaFinal) throws ErrorBBDDException, ParseException {
//		List<Venta> ventas = ControladorVentas.getAll();
//		System.out.println("\n\tListado de ventas: \n");
//		for (Venta ven : ventas) {
//			System.out.println("\t" + ven.toString());
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
	private static void alta() throws ErrorBBDDException, ParseException {
		System.out.println("\n\tAlta de venta");
		
		Venta v = new Venta();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tPusla 'S' para ver la lista de clientes");
		String str = sc.next();
		if(str.equalsIgnoreCase("S")) {
			GestionCliente.listado(true);
		}
		System.out.println("\nIntroduce el 'idCliente' del comprador del coche");
		v.setIdCliente(Utils.getIntConsola(0));
		
		System.out.println("\n\tPusla 'S' para ver la lista de concesionarios");
		 str = sc.next();
		if(str.equalsIgnoreCase("S")) {
			GestionDeConcesionario.listado(true);
		}
		System.out.println("\nIntroduce el 'idConcesionario' que vendió del coche");
		v.setIdCliente(Utils.getIntConsola(0));
		
		System.out.println("\n\tPusla 'S' para ver la lista de coches");
		 str = sc.next();
		if(str.equalsIgnoreCase("S")) {
			GestionDeCoche.listado(true);
		}
		System.out.println("\nIntroduce el 'idCoche' del coche");
		v.setIdCliente(Utils.getIntConsola(0));
		
		System.out.println("\nIntroduce la 'fecha' de la venta");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		v.setFecha(sdf.parse(Utils.getStringConsola()));
		
		System.out.println("\n\tIntroduce el 'precioVenta' del coche");
		//v.setPrecioVenta(Utils.getFloatConsola());
		//System.out.println(Float.parseFloat(Utils.getStringConsola()));
		str = Utils.getStringConsola();
		float parse = Float.parseFloat(str);
		v.setPrecioVenta(parse);
		//v.setPrecioVenta(Float.parseFloat(Utils.getStringConsola()));
		
		
		ControladorVentas.almacenar(v);
		System.out.println("\n\tVenta insertada correctamente. Pulse 'Intro' para continuar.");
		Utils.pausa();
	}

	
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	public static void modificacion()  throws ErrorBBDDException, ParseException{
		System.out.println("\n\tModificación de venta");
		Venta v = new Venta();
		if (v != null) {
			System.out.println("\n\tIntroduzca 'idCliente' del cliente comprador('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			int parseo = Integer.parseInt(str);
			if(!str.equals("")) v.setIdCliente(parseo);
			
			System.out.println("\n\tIntroduzca 'idConcesionario' del vendedor ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			parseo = Integer.parseInt(str);
			if(!str.equals("")) v.setIdConcesionario(parseo);
			
			System.out.println("\n\tIntroduzca 'idCoche' del coche que se vende ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			parseo = Integer.parseInt(str);
			if(!str.equals("")) v.setIdCoche(parseo);
			
			System.out.println("\n\tIntroduzca 'fecha' de la venta ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(!str.equals("")) v.setFecha(sdf.parse(str));
			
			System.out.println("\n\tIntroduzca 'precioVenta' de la venta('Intro' para modificar): ");
			str = Utils.getStringConsola();
			float parse = Float.parseFloat(str);
			if(!str.equals("")) v.setPrecioVenta(parse);
			
			ControladorVentas.almacenar(v);
			
			
			
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	private static Venta seleccionarPorElUsuario() throws ErrorBBDDException, ParseException {
		Venta v = null;
		int id = -2;
//		do {
//			System.out.println("\n\tIntroduzca ID de la venta ('-1' para ver el listado, '0' para salir)");
//			id = Utils.getIntConsola(-1);
//			if(id == -1) {
//				listado(false);
//			}
//			else {
//				if(id != 0) {
//					v = ControladorVentas.get(id);
//					if(v == null){
//						System.out.println("\n\tError. Ha especificado un ID inválido.");
//					}
//				}
//			}
//		} while (v == null && id != 0);
		return v;
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 */
	private static void baja() throws ErrorBBDDException, ParseException{
		System.out.println("\n\tEliminar registro de fabricantes");
		
		Venta v = seleccionarPorElUsuario();
		
		if(v != null) {
			System.out.println("\n\t¿Realmente quiere eliminar el registro? (S/N)");
			String str = Utils.getStringConsola();
			if(str.equalsIgnoreCase("S")) {
				//ControladorVentas.eliminar(v);
				System.out.println("\n\tEl registro se eliminó correctamente. Pulsa 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}
	
	public GestionVenta() {
		// TODO Auto-generated constructor stub
	}

}
