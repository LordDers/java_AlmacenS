/**
 * 
 */
package com.zubiri.almacen;

import java.util.Scanner;

/**
 * @author xoni
 *
 */
public class Manzana extends Producto  implements Enviable {

	private String tipo;
	private String color;
	/**
	 * 
	 */
	public Manzana(Distribuidor distribuidor, String marca, Double precio, String procedencia, String tipo, String color) {

		super(distribuidor,marca,precio,procedencia);
		this.tipo = tipo;
		this.color = color;
	}
	
	public Manzana(Scanner sc) {

		super(sc);
		System.out.println("Tipo de manzana (DELICIOUS-GOLDEN-RED):");
		this.setTipo(sc.next());
	    System.out.println("Color de la manzana:");
	    this.setColor(sc.next());
		
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean esFragil() {
    	return false;
    }
	
	@Override
	public void mostrarProducto() {
		
		System.out.println("MANZANA:");
		super.mostrarProducto();
		System.out.println("\ttipo: " + this.tipo);
		System.out.println("\tcolor: " + this.color);
}

}
