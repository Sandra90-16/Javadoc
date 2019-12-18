package ProyectoCuentas;
/**
 * Creado el 18 de Diciembre de 2019, 11.20 
 * @author Sandra Cabrera
 *
 */
/**
 * Does Whatever
 * @version 1.2.3
 * @since 1.2.0
 * 
 */
/**
 * 
 * @html <a href="https://github.com/Sandra90-16/Javadoc.git"</a>
 * <p><h2>Proyecto Cuentas</p></h2>
 * <b>Programacion</b>
 *
 */
public abstract class CCuenta{
		/**
		 * Atributos de la clase
		 * 
		 */
		
		private String numCuenta;
		private String nombreTitular;
		protected double saldo;
		protected double tipoDeInteres;
		
		/**
		 * Constructores con parámetros
		 * @param numCuenta
		 * @param nombre
		 * @param saldo
		 * @param tipoDeInteres
		 * @param comisiones
		 */
	
		public CCuenta(String numCuenta, String nombre, double saldo, double tipoDeInteres, double comisiones) {
			this.numCuenta = numCuenta;
			this.nombreTitular = nombre;
			this.saldo = saldo;
			this.tipoDeInteres = tipoDeInteres;
		}
		
		//constructor por defecto, sin parámetros
		
		public CCuenta() {
			
		}

		public String getNumCuenta() {
			return numCuenta;
		}

		public void setNumCuenta(String numCuenta) {
			this.numCuenta = numCuenta;
		}
/**
 * 
 * @return
 */
		public String getNombre() {
			return nombreTitular;
		}

		public void setNombre(String nombre) {
			this.nombreTitular = nombre;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public String getNombreTitular() {
			return nombreTitular;
		}
		public void setNombreTitular(String nombreTitular) {
			this.nombreTitular = nombreTitular;
		}
		public double getTipoDeInteres() {
			return tipoDeInteres;
		}
		public void setTipoDeInteres(double tipoDeInteres) {
			this.tipoDeInteres = tipoDeInteres;
		}

		public void ingreso(double cantidad){
			saldo = saldo + cantidad;
		}
		
		public void reintegro(double cantidad) {
			saldo = saldo - cantidad;
		}
		
		//misma estructura
		/**
		 * 
		 * @return
		 */
		public abstract double interes();
		
		public abstract void comisiones();
	}

