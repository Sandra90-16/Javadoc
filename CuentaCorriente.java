package ProyectoCuentas;

import java.util.Calendar;

public class CuentaCorriente extends CCuenta {

	int transacciones = 0;
	double importePorTrans;
	int transExentas;
	double intereses = 0;
	
	public CuentaCorriente(String numCuenta, String nombre, double saldo, double tipoDeInteres, double comisiones,
			double importePorTrans, int transExentas) {
		super(numCuenta, nombre, saldo, tipoDeInteres, comisiones);
		this.importePorTrans = importePorTrans;
		this.transExentas = transExentas;
	}

	public CuentaCorriente() {

	}

	@Override
	public double interes() {
	  Calendar calendario = Calendar.getInstance();
	  if(calendario.get(Calendar.DAY_OF_MONTH)== 1) {
			
			if(saldo <= 300.000) {
				intereses = saldo * 0.5;
			}else {
				intereses = saldo * tipoDeInteres;
			}
			saldo = saldo + intereses;		
	 }
	
	return intereses;
}

	@Override
	public void comisiones() {
	  
	    
	    Calendar calendario = Calendar.getInstance();
		if(calendario.get(Calendar.DAY_OF_MONTH)== 1) {
			  saldo = saldo - importePorTrans * transacciones;
			  transacciones = 0;
		}
	}
	
	public void decrementarTransacciones() {
		transacciones--;
	}

	public double getImportePorTrans() {
		return importePorTrans;
	}

	public void setImportePorTrans(double importePorTrans) {
		this.importePorTrans = importePorTrans;
	}
/**
 * 
 * @return
 */
	public int getTransExentas() {
		return transExentas;
	}

	public void setTransExentas(int transExentas) {
		this.transExentas = transExentas;
	}
	public void ingreso(double cantidad) {
		super.ingreso(cantidad);
	}
	public void reintegro(double cantidad) {
		super.reintegro(cantidad);
	}
}
