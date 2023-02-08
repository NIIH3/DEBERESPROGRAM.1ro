package Actividad2x02;

public class Inventario {
	
	private Bebida[] bebidas;
	private int indice;
	
	public Inventario(int capacidad) {
		this.bebidas = new Bebida[capacidad];
		this.indice = 0;
	}
	
	public boolean insertar(Bebida bebida) {
		if (indice < bebidas.length) {
			bebidas[indice] = bebida;
			indice++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean estaVacio() {
		return (indice == 0);
	}
	public boolean estaLleno() {
		return (indice == bebidas.length);
	}
	
	@Override
	public String toString() {
		String cadena = "";
		for (int pos = 0 ; pos < indice ; pos++) {
			Bebida bebida = bebidas[pos];
			cadena = cadena + "(" + pos + ")" + bebida.toString() + "\n"
					+ "...Precio = " + bebida.calcularPrecio() + "...\n";
		}
		return cadena;
	}
	
	
}
