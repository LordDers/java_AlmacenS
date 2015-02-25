/**
 * 
 */
package com.zubiri.almacen;

/**
 * @author xoni
 *
 */

public class Distribuidor {
	
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto contacto;

	private static int count = 0;
	
	/**
	 * 
	 */
	public Distribuidor() {
	
	}

	/**
	 * Constructor que recibe en forma de String las propiedades separadas entre sí por el caracter ','.
	 */
	public Distribuidor(String linedDistribuidor, String separator) {
		
		
		String[] strArray = linedDistribuidor.split(separator);
		this.setNombre(strArray[0]);
		this.setCif(strArray[1]);
		this.setDireccion(new Direccion(strArray[2],";"));
		this.setContacto(new Contacto(strArray[3],";"));
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto personaContacto) {
		this.contacto = personaContacto;
	}

	public String formattedDistribuidor() {

		String distribuidorStr = 
		"NOMBRE DISTRIBUIDOR:" + this.nombre + "\n" + 
		"CIF:" + this.cif  + "\n" + 
		"\t" + this.direccion.formattedDireccion() + "\n" +
		"\t" + this.contacto.formattedContacto() + "\n";
		
		return distribuidorStr;
	}
	
	public static void contador() {
		
		count++;
	}
	
	public static int cantidad() {
		
		return count;
	}
}
