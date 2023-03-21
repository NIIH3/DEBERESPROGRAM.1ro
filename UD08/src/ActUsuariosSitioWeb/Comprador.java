package ActUsuariosSitioWeb;

import java.util.List;

public class Comprador extends Usuario {

	private String tarjeta;
	private String direccion;
	private List<String> listaFavoritos;
	
	public Comprador(String correo, String nombre, String contrasena, String tarjeta, String direccionEnvio,
			List<String> listaFavoritos) {
		super(correo, nombre, contrasena);
		this.tarjeta = tarjeta;
		this.direccion = direccionEnvio;
		this.listaFavoritos = listaFavoritos;
	}

	@Override
	public String toString() {
		return "comprador [tarjeta=" + tarjeta + ", direccion=" + direccion  + ", correo=" + correo + ", nombre=" + nombre + ", contrasena=" + contrasena + ", listaFavoritos="
				+ listaFavoritos + "]";
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public boolean insertar(String producto) {
		if (listaFavoritos.contains(producto)) {
			return false;
		}
		else {
			return listaFavoritos.add(producto);
		}		
	}
	
	public int obtenerTamanoLista() {
		return listaFavoritos.size();
	}
	
}
