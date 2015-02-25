/**
 * 
 */
package com.zubiri.almacen;

import java.util.Scanner;

/**
 * @author xoni
 *
 */
public class Lechuga extends Producto implements Enviable {

	private boolean fresca;
	
	public Lechuga(Distribuidor distribuidor, String marca, Double precio, String procedencia, boolean fresca) {

		super(distribuidor,marca,precio,procedencia);
		this.fresca = fresca;
	}
	
	public Lechuga(Scanner sc) {

		super(sc);
		System.out.println("Es fresca?(SI-NO):");
		switch(sc.next()) {
			case "SI":
				this.setFresca(true);
				break;
			case "NO":
				this.setFresca(false);
				break;
			default:
				System.out.println("No ha seleccionado la opción correcta");
		}
	}
	
	public boolean getFresca() {
		return fresca;
	}

	public void setFresca(boolean fresca) {
		this.fresca = fresca;
	}

	/**
	 * implementación del método de la interface Enviable
	 */
	public boolean esFragil(){
		return true;
	}

	@Override
	public void mostrarProducto() {
		
		System.out.println("LECHUGA:");
		super.mostrarProducto();
		if (this.fresca) {
			System.out.println("\tfresca");
		} else {
			System.out.println("\tenvasada");	
		}	
	}
}
