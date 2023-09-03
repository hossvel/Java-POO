package ejercicioEmpresa;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MainEmpresa {

	public static void main(String[] args) {
		Period p=Period.of(2, 10, 25);
		System.out.println(p.toTotalMonths());
		mostrarEmpleado(new Director("Hoss", 35, LocalDate.of(1990, Month.JANUARY, 1), 1500, "AQP", 21));
		mostrarEmpleado(new Operario("Ho",35,LocalDate.of(2021, Month.JANUARY, 1),2500,2));
	}

	
	public static void mostrarEmpleado(Empleado e1) {
		e1.incentivar();
		System.out.println("Nombre: " + e1.getNombre() + " Salario: " + e1.getSalario());
		
	}
}
