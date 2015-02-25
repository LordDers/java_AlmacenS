/**
 * 
 */
package com.zubiri.almacen;

/**
 * @author xoni
 *
 */
public class Telefono {
	
	private TipoTelefono tipo;
    private int codInternacional = -1;
    private int codNacional = -1;
    private int digitos;

	/**
	 * 
	 */
	public Telefono() {

	}

	/**
	 * Constructor que recibe en forma de String las propiedades separadas entre sí por el caracter '*'.
	 */
	public Telefono(String linedTelefono, String separator) {
		
		String[] strArray = linedTelefono.split(separator);
		switch (strArray[0]) {	
			case "MOVIL":
				this.tipo = TipoTelefono.MOVIL;
				break;
			case "FIJO":
				this.tipo = TipoTelefono.FIJO;
				break;
			default:
				System.out.println("No existe el tipo de teléfono especificado");
				System.exit(-1);
				break;
		}
		if (strArray[1].compareTo("") != 0) {
			this.codInternacional = Integer.parseInt(strArray[1]);
		}
		if (strArray[2].compareTo("") != 0) {
			this.codNacional = Integer.parseInt(strArray[2]);
		}
		this.digitos = Integer.parseInt(strArray[3]);
		
	}

	/**
	 * 
	 */
	public TipoTelefono getTipo() {
		return tipo;
	}

	/**
	 * 
	 */
	public void setTipo(TipoTelefono tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 */
	public int getCodInternacional() {
		return codInternacional;
	}

	/**
	 * 
	 */
	public void setCodInternacional(int codInternacional) {
		this.codInternacional = codInternacional;
	}

	/**
	 * 
	 */
	public int getCodNacional() {
		return codNacional;
	}

	/**
	 * 
	 */
	public void setCodNacional(int codNacional) {
		this.codNacional = codNacional;
	}

	/**
	 * 
	 */
	public int getDigitos() {
		return digitos;
	}

	/**
	 * 
	 */
	public void setDigitos(int digitos9) {
		this.digitos = digitos9;
	}

	public String formattedTelefono() {
		
		String strTelefono = null;
		
		if (this.tipo == TipoTelefono.MOVIL) {
			strTelefono = 
			"TELEFONO " + this.tipo + ":\n" +
			"(+" + this.codInternacional + ")" + 
			this.digitos;
		} else {
			strTelefono = 
			"TELEFONO " + this.tipo + ":\n" +
			"(" + this.codNacional + ")" + 
			this.digitos;
		}
		
		return strTelefono;
	}
}
