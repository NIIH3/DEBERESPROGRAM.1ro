package conjunto_empleados;

import java.util.Comparator;

public class OrdenDniAscendente implements Comparator<Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		String dni1 = e1.getDni();
		String dni2 = e2.getDni();
		return 0;
	}

}
