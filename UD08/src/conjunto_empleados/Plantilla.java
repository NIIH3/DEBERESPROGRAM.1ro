package conjunto_empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Plantilla {

	private Set<Empleado> conjuntoEmpleados;

	public Plantilla() {
		super();
		this.conjuntoEmpleados = new TreeSet<Empleado>();
	}
	
	public boolean insertar (Empleado empleado) {
		return conjuntoEmpleados.add(empleado);
	}
	
	public boolean eliminar(Empleado empleado) {
		return conjuntoEmpleados.remove(empleado);
	}
	
	public boolean estaVacia() {
		return conjuntoEmpleados.isEmpty();
	}
	
	public boolean buscarPorDni (String dni) {
		Empleado empleado = new Empleado(dni, "", 0, "");
		return conjuntoEmpleados.contains(empleado);
		//for (Empleado emp : conjuntoEmpleados) {
		//	if (emp.getDni().equals(dni)) {
		//		return true;
		//	}
		//}
		//return false;
	}
	
	public boolean buscarPorSalarioDesc (double salario) {
		for (Empleado e : conjuntoEmpleados) {
			if (e.getSalario() == salario) {
				return true;
			}
		}
		return false;
	}
	public Set<Empleado> obtenerEmpleados() {
		return conjuntoEmpleados;
	}
	
	public List<Empleado> ordenarSalarioDescendente () {
		List<Empleado> listaOrdenada = new ArrayList<Empleado>();
		listaOrdenada.addAll(conjuntoEmpleados);
		Collections.sort(listaOrdenada, new OrdenSalarioDescendiente());
		return listaOrdenada;
	}
	
	public List<Empleado> consultarPorDepartamento() {
		return null;
		
	}





	
}
