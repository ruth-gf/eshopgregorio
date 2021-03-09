package com.gf;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Permite el mapeo con la tabla de la base de datos
public class Usuario {
	
	@Id
	private String nombre;
	private String apellidos;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public Usuario () {
		super();
	}
	
	

}
