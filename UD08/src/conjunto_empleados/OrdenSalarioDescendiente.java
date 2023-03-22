package conjunto_empleados;

import java.util.Comparator;

public class OrdenSalarioDescendiente implements Comparator<Empleado>{

	@Override
	public int compare(Empleado e1, Empleado e2) {
		Double salario1 = e1.getSalario();
		Double salario2 = e2.getSalario();
		return salario1.compareTo(salario2);
	}

}
