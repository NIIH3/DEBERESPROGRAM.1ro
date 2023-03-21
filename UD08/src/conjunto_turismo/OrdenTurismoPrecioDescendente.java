package conjunto_turismo;

import java.util.Comparator;

public class OrdenTurismoPrecioDescendente implements Comparator<Turismo> {
	
	//Compara dos turismos por precio desdente
	@Override
	public int compare(Turismo t1, Turismo t2) {
		Double precio1 = t1.getPrecio();
		Double precio2 = t2.getPrecio();
		return precio2.compareTo(precio1);
	}

}
