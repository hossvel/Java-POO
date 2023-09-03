package ejercicioEmpresa;

import java.time.LocalDate;
import java.time.Period;

public class Operario extends Empleado {
	private int nivel=1;
	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.setNivel(nivel);
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		//si no es un nivel valido lo deja a 1
		if(nivel>=1&&nivel<=5) {
			this.nivel = nivel;
		}
	}
	@Override
	public void incentivar() {		
		if(this.getEdad()>30&&this.getNivel()>2) {
			this.setSalario(this.getSalario()+2*Empleado.BONO);
		}else if(this.getEdad()>30||this.getNivel()>2) {
			this.setSalario(this.getSalario()+Empleado.BONO);
		}
	}
	public void actualizarNivel() {
		//obtiene el periodo de tiempo que lleva en la empresa
		Period period=Period.between(this.getFechaIngreso(), LocalDate.now());
		//a partir del periodo comprueba si lleva m�s de dos a�os
		//y no esta en el m�ximo nivel
		if(period.toTotalMonths()>24&&this.getNivel()<5) {	
			this.setNivel(this.getNivel()+1);
		}
	}
}
