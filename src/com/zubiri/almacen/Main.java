package com.zubiri.almacen;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws IOException,UnsupportedEncodingException {
	
		int seleccion;
		Scanner sc = new Scanner(System.in);
		Productos productos = null;
		
		/*if (args.length == 0) {
			System.out.println("El número de argumentos no es válido:");
			System.out.println("java main.java <fichero_distribuidores>");
			System.exit(-1);
		} */

		try {
			//Leemos la lista de distribuidores del fichero.
			Distribuidores.leerDistribuidores(args[0]);
		} catch (FileNotFoundException fichero_no_encontrado) {
			System.out.println("Fichero incorrecto.");
			System.out.print("Introduzca el nombre el fichero: ");
			Distribuidores.leerDistribuidores(sc.next());
		} /*finally {
			System.out.println("El fichero se ha leído correctamente.\n");
		}*/

		do {
			
			//Visualiza por terminal (stdout) las opciones del menú
			System.out.println("Mostrar distribuidores---------------------------1");
			System.out.println("Solicitar productos------------------------------2");
			System.out.println("Mostrar productos--------------------------------3");
			System.out.println("SALIR DEL PROGRAMA-------------------------------4");
			
			
			seleccion = sc.nextInt();
			switch (seleccion) {
				
				case 1: //Mostrar distribuidores
					Distribuidores.mostrarDistribuidores();
					break;
					
				case 2: //Solicitar productos
					productos = new Productos(sc);
					break;
				case 3: //Mostrar productos
					/*if (productos == null) {
						System.out.println("No es posible mostrar productos sin haber sido solicitados");
					}*/
					try {
					productos.mostrarProductos();
					} catch(NullPointerException e) {
						System.out.println("\nNo has solicitado productos. "
								+ "\nA continuación, se le pedirá los productos.\n");
						productos = new Productos(sc);
						productos.mostrarProductos();
					} finally {
						System.out.println("Productos solicitados y mostrados correctamente.\n");
					}
					break;
				case 4: //Salimos
					break;
				default:
					System.out.println("No ha insertado la opción correcta");
			}
		} while (seleccion != 4);
		System.out.println("Gracias por usar nuestro programa. Que tenga un buen día!");
		sc.close();
	}

}
