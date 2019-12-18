package ProyectoCuentas;

public class CuentaBancaria {
	/**
	 * 
	 */
		//Atributos
		private String numCuenta;
		private String nombre;
		private double saldo;
		private double interes;

		/**
		 * 
		 * @param numCuenta
		 * @param nombre
		 * @param saldo
		 * @param interes
		 */
		//constructor con parámetros	
		public CuentaBancaria(String numCuenta, String nombre, double saldo, double interes) {
			this.numCuenta = numCuenta;
			this.nombre = nombre;
			this.saldo = saldo;
			this.interes = interes;
		}
		//constructor por defecto, sin parámetros
		public CuentaBancaria() {
			
		}

//////////////////////////
		public CuentaBancaria(CuentaBancaria copia){
			interes = copia.interes;
			nombre = copia.nombre;
			numCuenta = copia.numCuenta;
			saldo = copia.saldo;

		 }
//////////////////////////
		public String getNombre() {  
			return nombre;
		}
//////////////////////////
	  	public void setNombre(String nombre){
	  		this.nombre = nombre;
	  	}
//////////////////////////
	  	public String getCuenta() {
	  		return numCuenta;
	  	}
//////////////////////////
	  	public void setCuenta(String cuenta) {
	  		this.numCuenta = cuenta;
	  	}
//////////////////////////
	  	public double getInteres() {
	  		return interes;
	  	}
//////////////////////////
	  	public void setInteres(double interes) {
	  		this.interes = interes;
	  	}
//////////////////////////
	  	public double getSaldo() {
	  		return saldo;
	  	}
//////////////////////////
	  	public void ingreso(double cantidad){
	  		if(cantidad > 0) {
	  			saldo = saldo + cantidad;
	  		}else{
	  			System.err.println("El ingreso debe ser mayor que 0");
	  		}
	  	}	
//////////////////////////
	  	public void reintegro(double cantidad){
	  		if(cantidad > saldo){
	  			System.err.println("El reintegro ha superado el saldo de la cuenta");
	  		}else{

	  			if(cantidad > 0) {
	  				saldo = saldo - cantidad;
	  			}else{
	  				System.err.println("El reintegro debe ser mayor que 0");
			}
		}

	}

}
