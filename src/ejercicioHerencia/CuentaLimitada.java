package ejercicioHerencia;

public class CuentaLimitada extends Cuenta {

	private int limite;
	
	CuentaLimitada(int saldo, int limite){
		super(saldo);
		this.limite = limite;
	}
	
	public void LimitarSaldo () {
		limite = getSaldo()/2;
		
	}
	
}
