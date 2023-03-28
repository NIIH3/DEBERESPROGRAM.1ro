package conjunto_empleados;

import java.util.Comparator;

public class OrdenEmpleadosDepartamentoNombre implements Comparator<Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		String dep1 = e1.getDepartamento();
		String dep2 = e2.getDepartamento();
		if(dep1.equalsIgnoreCase(dep2)) {
			String nom1 = e1.getNombre();
			String nomb2 = e2.getNombre();
			return nom1.compareToIgnoreCase(nomb2);
		}
		else {
			return dep1.compareToIgnoreCase(dep2);
		}
	}

}
