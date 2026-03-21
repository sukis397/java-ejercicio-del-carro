package banco;

public class Cuenta {
	private int numero;
	private Persona titular;
	private long saldo;
	
	public Cuenta(int numero, Persona titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero " + this.numero + " Titular " + this.titular + " Saldo " + this.saldo;
	}

	public void deposito(long monto) {
		this.saldo += monto; 
	}
	

	
	public void retiro(long monto) {
		if(monto > this.saldo )
			System.out.println("Error Yuca Saldo Insuficiente");
		else
			this.saldo -= monto;
	}
}
