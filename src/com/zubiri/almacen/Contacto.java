/**
 * 
 */
package com.zubiri.almacen;

/**
 * @author xoni
 *
 */
public class Contacto {

	
	private String nombre;
	private String apellido;
	private String dni;
	private Direccion direccion;
	private Telefono telefono;
	/**
	 * 
	 */
	public Contacto() {
		
	}

	/**
	 * Constructor que recibe en forma de String las propiedades separadas entre sí por el caracter '*'.
	 */

	public Contacto(String linedContacto, String separator) {

		String[] strArray = linedContacto.split(separator);
		
		this.setNombre(strArray[0]);
		this.setApellido(strArray[1]);
		this.setDni(strArray[2]);
		this.setDireccion(new Direccion(strArray[3],"-"));
		this.setTelefono(new Telefono(strArray[4],"-"));
	}
	
	public String getNombre() {
		
		return this.nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
	public String formattedContacto() {
		
		String formattedContacto = 
		"NOMBRE Y APELLIDO:" +	this.nombre + " " + this.apellido + "\n" +
	    "DNI:" + this.dni + "\n" +
		this.direccion.formattedDireccion() + "\n" +
		this.telefono.formattedTelefono();
		
		return formattedContacto;
	}
	
}
