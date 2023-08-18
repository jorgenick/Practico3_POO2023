package ar.edu.unju.fi.dominio;

import ar.edu.unju.fi.manager.Manager;

public class Automovil {
	
	private String dominio;
	private char marca;
	private char tipo;
	private int modelo;
	private int kilometraje;
	private float precioValuado;
	private float precioVenta;
	private char estado= 'd';
	
	// Manager man = new Manager();
	
	
	public Automovil(String dominio, char marca, char tipo, int modelo, int kilometraje, float precioValuado,
			 char estado) {
		super();
		this.dominio = dominio;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.precioValuado = precioValuado;
		this.precioVenta = calcularPorcentaje(precioValuado);
		this.estado = estado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public char getMarca() {
		return marca;
	}

	public void setMarca(char marca) {
		this.marca = marca;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public float getPrecioValuado() {
		return precioValuado;
	}

	public void setPrecioValuado(float precioValuado) {
		this.precioValuado = precioValuado;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	public float calcularPorcentaje(float precioVenta) {
		return precioVenta*1.1f;
	}

	@Override
	public String toString() {
		return "Automovil [dominio=" + dominio + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo
				+ ", kilometraje=" + kilometraje + ", precioValuado=" + precioValuado + ", precioVenta=" + precioVenta
				+ ", estado=" + estado + "]";
	}
	
	
	
	

}
