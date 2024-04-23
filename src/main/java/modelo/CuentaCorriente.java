package modelo;

import java.time.LocalDate;

public class CuentaCorriente extends CuentaBancaria {
	private double sobregiro;

	public double getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(double sobregiro) {
		this.sobregiro = sobregiro;
	}
	public String getTipo() {
		return "Cuenta Corriente";
	}
	public String toString(){
		return  "numero de cuenta: " + numCuenta +
				"fecha apertura: " + fechaApertura +
				"saldo: " + saldo +
				"cliente: " + cliente.getNombre() +
				"sobregiro: " + sobregiro;
	}
	public CuentaCorriente(int numCuenta, LocalDate fechaApertura, double saldo, Cliente cliente, double sobregiro) {
		super(numCuenta, fechaApertura, saldo, cliente);
		this.sobregiro = sobregiro;
	}
}