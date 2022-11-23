package ej2x1Cuenta;

	public class Cuenta {
		//att
			private int numero;
			private String cliente;
			private double saldo;
	
//constr
	public Cuenta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0;
	}
	

	public String obtenerEstado() {
		return "Cuenta\n "
				+"[Número = "+ this.numero + "]\n"
				+"[Cliente = "+this.cliente+"]\n"
				+"[Saldo = "+this.saldo+"]";
	}
	public boolean ingresar(double importe) {
		boolean ingresado = false;
			if (importe > 0.0) {
				this.saldo = this.saldo + importe;
			return true;
			}
			 return ingresado;
	}
	public boolean retirar (double importe) {
		boolean retirado = false;
			if (importe > 0.0 && importe <= this.saldo) {
				this.saldo = this.saldo - importe;
			return true;
			}
			return retirado;		
	}
	public boolean transferir (double importe, Cuenta destino) {
		boolean transferido = false;
			if (importe > 0.0 && importe <= this.saldo) {
				this.saldo = this.saldo - importe;
				destino.saldo = destino.saldo + importe;
			return true;
			}
			return transferido;
	}
	
	
	
	
	
	
}

