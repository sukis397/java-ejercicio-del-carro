package banco;

import java.util.*;


public class Banco {
	private List<Cuenta> listaCuenta;
	
	public Banco() {
		this.listaCuenta =new ArrayList<Cuenta>();
	}

	public void agregarCuenta(Cuenta cuenta) {
		this.listaCuenta.add(cuenta);
	}
	
	public void realizarDeposito(long monto,Cuenta cuenta) {
		cuenta.deposito(monto);
	}
	
	public void realizarRetiro(long monto,Cuenta cuenta) {
		cuenta.retiro(monto);
	}

	public Cuenta buscarCuenta(int numero) {
		for (Cuenta cuenta : listaCuenta) {
			if(cuenta.getNumero() == numero)
				return cuenta;
		}
		return null;
	}
	
	public void mostrarCuentas() {
		for (Cuenta cuenta : listaCuenta) {
			System.out.println(cuenta);
		}
	}
	
}
