package ejercicioHerencia;

public class Cuenta {
	private int saldo;

	Cuenta(int saldo){
		this.saldo = saldo;
	}

	public void extraerSaldo(int saldo) {
		this.saldo = this.saldo - saldo;
		
	}
	
	public void addSaldo(int saldo) {
		this.saldo = this.saldo + saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
