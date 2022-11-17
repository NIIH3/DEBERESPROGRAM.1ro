
	public class EjemploPelicula {
		// atributos
		private String nombre;
		private int duracion;
		private boolean dobladaCastellano;
		private double puntuacion;
		
		//constructor
		public EjemploPelicula(String nombre, int duracion, boolean dobladaCastellano, double puntuacion) {
			this.nombre = nombre;
			this.duracion = duracion;
			this.dobladaCastellano = dobladaCastellano;
			this.puntuacion = puntuacion;
		}
		
		
		// metodos de acceso a atributos (getters)
		public String getNombre() {
			return nombre;
		}
		
		public int getDuracion() {
			return duracion;
		}
		
		public boolean getDobladaCastellano() {
			return dobladaCastellano;
		}
		
		public double getPuntuacion() {
			return puntuacion;
		}
		
		//metodos de acceso a atributos (setters) que sirven para modificar
		
		public void setNombre (String nombre) {
			this.nombre = nombre;
		}
		
		public void setDuracion (int duracion) {
			this.duracion = duracion;
		}
		
		public void setDobladoCastellano (boolean dobladaCastellano) {
			this.dobladaCastellano = dobladaCastellano;
		}
		
		public void setPuntuacion (double puntuacion) {
			this.puntuacion = puntuacion;
		}
		
		
		//Devuelve una cadena de caracteres con el estado del objeto
		// al ser objetos no usan "static"
		public String obtenerEstado() {
			return
				"Pelicula[Nombre = " + nombre + ", Duración = " + duracion + ", DobladaCastellano = " + dobladaCastellano + ", Puntuación = " + puntuacion+ "]";
		}
		
		
		
		
		
		
		
		
		
		
		
	}


