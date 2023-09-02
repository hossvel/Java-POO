package ejercicioHerencia;

public class CuentaMain {

	public static void main(String[] args) {
		CuentaLimitada cuentaLimitada = new CuentaLimitada(100,70);
		cuentaLimitada.extraerSaldo(15);
		System.out.println("queda saldo " + cuentaLimitada.getSaldo());
		cuentaLimitada.addSaldo(25);
		System.out.println("queda saldo " + cuentaLimitada.getSaldo());
		cuentaLimitada.extraerSaldo(90);
		System.out.println("queda saldo " + cuentaLimitada.getSaldo());
	}

}
