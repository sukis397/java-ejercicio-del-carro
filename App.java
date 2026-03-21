package banco;

public class App {

	public static void main(String[] args) {
		Banco miBanco =new Banco();
		
		Persona titular1 =new Persona("Juanita");
		
		Cuenta cuenta1 =new Cuenta(102030,titular1);
		
		Persona titular2 =new Persona("Paris");
		
		Cuenta cuenta2 =new Cuenta(102040,titular2);
		
		miBanco.agregarCuenta(cuenta1);
		miBanco.agregarCuenta(cuenta2);
		
		miBanco.mostrarCuentas();
		
		Cuenta cuentica = miBanco.buscarCuenta(102030);
		miBanco.realizarDeposito(1680450, cuentica);
		miBanco.mostrarCuentas();
	}

}
