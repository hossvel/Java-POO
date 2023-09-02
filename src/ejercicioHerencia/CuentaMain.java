package ejercicioHerencia;

public class CuentaMain {

	public static void main(String[] args) {
		CuentaLimitada cuentaLimitada = new CuentaLimitada(100,10);
		cuentaLimitada.extraerSaldo(15);
		System.out.println("queda saldo " + cuentaLimitada.getSaldo());
		cuentaLimitada.addSaldo(20);
		System.out.println("queda saldo " + cuentaLimitada.getSaldo());
	}

}
