package modelo;

import java.time.LocalDate;

public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public double getReajusteAnual() {
		return reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}
	public String getTipo() {
		return "Cuenta Ahorro";
	}
	public String toString(){
		return  "numero de cuenta: " + numCuenta +
				"fecha apertura: " + fechaApertura +
				"saldo: " + saldo +
				"cliente: " + cliente.getNombre() +
				"reajuste anual: " + reajusteAnual;
	}
	public CuentaAhorro(int numCuenta, LocalDate fechaApertura, double saldo, Cliente cliente, double reajusteAnual) {
		super(numCuenta, fechaApertura, saldo, cliente);
		this.reajusteAnual = reajusteAnual;
	}
}