package conjunto_turismo;

import java.util.Comparator;

public class OrdenTurismoMatriculaAsc implements Comparator<Turismo> {

	//COMPARA DOS TURISMOS POR MATRICULA ASCENDENTE
	@Override
	public int compare(Turismo t1, Turismo t2) {
		String matricula1 = t1.getMatricula();
		String matricula2 = t2.getMatricula();
		return matricula1.compareTo(matricula2);
	}

}
