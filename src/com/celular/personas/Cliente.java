package com.celular.personas;

public class Cliente {
	String nombre;
	String rut;
	int edad;
	char sexo;
	
	public Cliente(String nombre, String rut, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.sexo = sexo;
	}
	public Cliente() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	
	
}
