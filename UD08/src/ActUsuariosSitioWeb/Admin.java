package ActUsuariosSitioWeb;

public class Admin extends Usuario {
	
	private String categoria;
	private boolean revCom;
	
	public Admin(String correo, String nombre, String contrasena, String categoria, boolean revCom) {
		super(correo, nombre, contrasena);
		this.categoria = categoria;
		this.revCom = revCom;
	}

	@Override
	public String toString() {
		return "Admin [categoria=" + categoria + ", revCom=" + revCom + ", correo=" + correo + ", nombre=" + nombre
				+ ", contrasena=" + contrasena + "]";
	}
	
	
	


}
