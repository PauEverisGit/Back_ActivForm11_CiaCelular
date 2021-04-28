package com.celular.productos;

public class Celular {
	int numero;
	String marca;

	public Celular(int numero, String marca) {
		super();
		this.numero = numero;
		this.marca = marca;
	}

	public Celular() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Celular [numero=" + numero + ", marca=" + marca + "]";
	}

}
