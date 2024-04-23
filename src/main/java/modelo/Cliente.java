package modelo;

import java.util.ArrayList;


public class Cliente {
	private String nombre;
	private int rut;
	private String direccion;
	private ArrayList<CuentaBancaria> cuentasBancarias;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}

	public Cliente(String nombre, int rut, String direccion) {
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.cuentasBancarias = new ArrayList<>();
	}
}