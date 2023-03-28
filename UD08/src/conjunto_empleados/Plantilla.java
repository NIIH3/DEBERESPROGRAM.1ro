package conjunto_empleados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
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
	
	public List<Empleado> consultarPorDepartamentoNombreAsc() {
		List<Empleado> listaEmpleadosAux = new ArrayList<>();
		listaEmpleadosAux.addAll(conjuntoEmpleados);
		Collections.sort(listaEmpleadosAux, new OrdenEmpleadosDepartamentoNombre());
		return listaEmpleadosAux;
	}
	
	public List<Empleado> consultarPorSalarioMaximo(String departamento) {
		double salarioMaximo = 0.0, salario;
		for (Empleado emp : conjuntoEmpleados) {
				if (emp.getDepartamento().equalsIgnoreCase(departamento)) {
				salario = emp.getSalario();
				if (salario > salarioMaximo) {
					salarioMaximo = salario;
				}
			}
		}	
		List<Empleado> lista = new ArrayList<Empleado>();
		for (Empleado emp : conjuntoEmpleados) {
			if (emp.getDepartamento().equalsIgnoreCase(departamento) && emp.getSalario() == salarioMaximo) {
				lista.add(emp);
			}
		}
		return lista;
	}
	
	public Set<String> obtenerDepartamentos() {
		Set<String> conjuntoDepartamentos = new HashSet<String>();
		for (Empleado emp : conjuntoEmpleados) {
			String departamento = emp.getDepartamento();
			conjuntoDepartamentos.add(departamento);
		}
		return conjuntoDepartamentos;
	}
	

	public List<Empleado> consultarEmpleadosPorDept() {
		Set<String> conjuntoDepartamentos = obtenerDepartamentos();
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		for (String departamento : conjuntoDepartamentos) {
			List<Empleado> listaPorDeptAux = consultarPorSalarioMaximo(departamento);
			listaEmpleados.addAll(listaPorDeptAux);
		}
		return null;
	}
	
	public int eliminarPorDepartamento (String departamento) {
		Iterator<Empleado> iterador = conjuntoEmpleados.iterator();
		return 0;
	}
	






	
}
