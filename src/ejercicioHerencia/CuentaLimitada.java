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

	@Override
	public void extraerSaldo(int saldo) {
		if(saldo <= this.limite)
			super.extraerSaldo(saldo);
		else 
			super.extraerSaldo(limite);
	}


}
