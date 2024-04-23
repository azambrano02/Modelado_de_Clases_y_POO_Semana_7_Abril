package modelo;

import java.time.LocalDate;

public abstract class CuentaBancaria {
	protected int numCuenta;
	protected LocalDate fechaApertura;
	protected double saldo;
	protected Cliente cliente;

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public abstract String getTipo();

	public abstract String toString();
	public CuentaBancaria(int numCuenta, LocalDate fechaApertura, double saldo, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
		this.cliente = cliente;
	}
}