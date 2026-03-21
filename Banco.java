package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cuenta> listaCuenta;
	
	public Banco() {
		this.listaCuenta =new ArrayList<Cuenta>();
	}
	/**
	 * Recibe como parámetro una referencia a un objeto Cuenta y permite
	 * adicionar un objeto cuenta a la lista de cuentas.
	 * @param cuenta
	 */
	public void agregarCuenta(Cuenta cuenta) {
		this.listaCuenta.add(cuenta);
	}
	
	public void realizarDeposito(long monto,Cuenta cuenta) {
		cuenta.deposito(monto);
	}
	
	public void realizarRetiro(long monto,Cuenta cuenta) {
		cuenta.retiro(monto);
	}
	/**
	 * 
	 * @param numero
	 * @return
	 */
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
