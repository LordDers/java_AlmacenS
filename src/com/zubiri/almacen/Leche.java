/**
 * 
 */
package com.zubiri.almacen;

import java.util.Scanner;

/**
 * @author xoni
 *
 */
public class Leche extends Producto  implements Enviable{

	private boolean lactosa;
	private boolean entera;

	
	/**
	 * 
	 */
	public Leche(Distribuidor distribuidor, String marca, Double precio, String procedencia, boolean lactosa, boolean entera) {

		super(distribuidor,marca,precio,procedencia);
		this.lactosa = lactosa;
		this.entera = entera;
	}

	public Leche(Scanner sc) {

		super(sc);
		System.out.println("Contiene lactosa?(SI-NO):");
		switch(sc.next()) {
			case "SI":
				this.setLactosa(true);
				break;
			case "NO":
				this.setLactosa(false);
				break;
		}
		System.out.println("Es entera?(SI-NO):");
		switch(sc.next()) {
		case "SI":
			this.setEntera(true);
			break;
		case "NO":
			this.setEntera(false);
			break;
		}
	}

	public boolean getLactosa() {
		return this.lactosa;
	}


	public void setLactosa(boolean lactosa) {
		this.lactosa = lactosa;
	}

	public boolean getEntera() {
		return this.entera;
	}


	public void setEntera(boolean entera) {
		this.entera = entera;
	}

	public boolean esFragil() {
		return false;
	}
	
	@Override
	public void mostrarProducto() {
			
		System.out.println("LECHE:");
		super.mostrarProducto();
		if (this.entera) {
			System.out.println("\tentera");
		} else {
			System.out.println("\tdesnatada");
		}	
		if (this.lactosa) {
			System.out.println("\tcon lactosa");
		} else {
			System.out.println("\tsin lactosa");			
		}	
	}

}
