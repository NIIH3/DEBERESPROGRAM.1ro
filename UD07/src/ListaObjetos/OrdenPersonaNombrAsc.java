package ListaObjetos;

import java.util.Comparator;

public class OrdenPersonaNombrAsc implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		String apellido1 = persona1.getApellidos();
		String apellido2 = persona2.getApellidos();
		if (apellido1.equals(apellido2)) {
			String nombre1 = persona1.getNombre();
			String nombre2 = persona2.getNombre();
			return nombre1.compareTo(nombre2);
		}
		else {
			return apellido1.compareTo(apellido2);
		}
	}

}
