package ActUsuariosSitioWeb;

import java.util.Collections;
import java.util.List;

public class Coleccion {

	public List<Usuario> ordenarPorNombreAsc() {
		List<Usuario> listaAux = new LinkedList<Usuario>();
		listaAux.addAll(listaUsuarios);
		Collections.sort(listaAux, new OrdenUsuarios);
	}
	
	public List<Usuario> consultarCompradoresPorTamanoLista() {
		int tamanoMaximoLista = 0;
		for (Usuario usuario : listaUsuarios) {
			if (usuario instanceof Comprador) {
				Comprador comprador = (Comprador) usuario;
				int tamanoListaComprador = comprador.obtenerTamanoLista();
				if (tamanoListaComprador > tamanoMaximoLista) {
					tamanoMaximoLista = tamanoListaComprador;
				}

			}
		}
		List<Usuario> listaAux = new LinkedList<Usuario>();
		for (Usuario usuario : listaUsuarios) {
			if (usuario instanceof Comprador) {
				Comprador comprador = (Comprador) usuario;
				int tamanoListaComprador = comprador.obtenerTamanoLista();
				if (tamanoListaComprador > tamanoMaximoLista) {
					listaAux.add(usuario);
				}
			}
		}
		return listaAux;
	}
}
