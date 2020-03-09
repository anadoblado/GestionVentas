package gui;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Utils {

	private static Scanner scanner = null;
	
	
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int getIntConsola(int minimo, int maximo) {
		boolean numeroValido = false;
		int numero = 0;
		
		do {
			try {
				numero = Integer.parseInt (getScanner().nextLine());
				if (numero >= minimo && numero <= maximo) {
					numeroValido = true;
				}
			} catch (Exception e) {}
			if (!numeroValido) {
				System.out.println("Número incorrecto. Debe introducir valor entre " + minimo + " y " + maximo);
			}
		} while (!numeroValido);
		
		return numero;
	}

	
	
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int getIntConsola(int minimo) {
		boolean numeroValido = false;
		int numero = 0;
		
		do {
			try {
				numero = Integer.parseInt (getScanner().nextLine());
				if (numero >= minimo) {
					numeroValido = true;
				}
			} catch (Exception e) {}
			if (!numeroValido) {
				System.out.println("Número incorrecto. Debe introducir valor mayor que " + minimo);
			}
		} while (!numeroValido);
		
		return numero;
	}
	
	/**
	 * 
	 * @param minimo
	 * @return
	 */
	public static float getFloatConsola() {
		boolean numeroValido = false;
		float numero = 0;
		
		do {
			float minimo = 0;
			try {
				numero = Float.parseFloat(getScanner().nextLine());
				if (numero >= minimo) {
					numeroValido = true;
				}
			} catch (Exception e) {}
			if (!numeroValido) {
				System.out.println("Número incorrecto. Debe introducir valor mayor que " + minimo);
			}
		} while (!numeroValido);
		
		return numero;
	}

	
	
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static String getStringConsola() {
		return getScanner().nextLine();
	}
	
	public static String getDateConsola() {
		return getScanner().nextLine();
		
	}

	
	public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
	/**
	 * 
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static void pausa() {
		getScanner().nextLine();
	}


	
	public static Scanner getScanner () {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
