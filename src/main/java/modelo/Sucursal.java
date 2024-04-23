package modelo;

import java.rmi.ConnectIOException;
import java.util.ArrayList;


public class Sucursal {
	private int codSucursal;
	private int codPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias;
	private ArrayList<Cliente> clientes;

	public int getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(int codSucursal) {
		this.codSucursal = codSucursal;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Sucursal(int codSucursal, int codPostal) {
		this.codSucursal = codSucursal;
		this.codPostal = codPostal;
		this.cuentasBancarias = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public boolean ClienteExiste (Cliente cliente){
		for(Cliente c : this.clientes){
			if(c.getRut()==cliente.getRut()){
				return true;
			}
		} return false;
	}
	public boolean AgregarCliente (Cliente cliente){
		if(!ClienteExiste(cliente)){
			this.clientes.add(cliente);
			return true;
		}
		return false;
	}
	public boolean CuentaExiste (CuentaBancaria cuentaBancaria){
		for(CuentaBancaria cuenta : this.cuentasBancarias){
			if(cuenta.getNumCuenta()==cuentaBancaria.getNumCuenta()){
				return true;
			}
		} return false;
	}
	public boolean AgregarCuenta (CuentaBancaria cuentaBancaria, Cliente cliente){
		if(!CuentaExiste(cuentaBancaria)){
			this.cuentasBancarias.add(cuentaBancaria);
			cliente.getCuentasBancarias().add(cuentaBancaria);
		}
		return false;
	}
	public void MostrarCuentasCliente (Cliente cliente){
		if(cliente != null){
			ArrayList<CuentaBancaria> cuentas = cliente.getCuentasBancarias();
			System.out.println("Cuentas del cliente: " + cliente.getNombre());
			for(CuentaBancaria cuenta : cuentas){
				System.out.println(cuenta.toString());
			}
		}
		System.out.println("El cliente ingresado no existe");
	}
	public ArrayList<CuentaBancaria> ObtenerCuentasAhorro (){
		ArrayList<CuentaBancaria> cuentasAhorro = new ArrayList<>();
		for(CuentaBancaria cuenta : this.cuentasBancarias){
			if(cuenta.getTipo().equals("Cuenta Ahorro")){
				cuentasAhorro.add(cuenta);
			}
		} return cuentasAhorro;
	}
	public ArrayList<CuentaBancaria> ObtenerCuentasCorriente (){
		ArrayList<CuentaBancaria> cuentasCorriente = new ArrayList<>();
		for(CuentaBancaria cuenta : this.cuentasBancarias){
			if(cuenta.getTipo().equals("Cuenta Corriente")){
				cuentasCorriente.add(cuenta);
			}
		} return cuentasCorriente;
	}
}