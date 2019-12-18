package ProyectoCuentas;

import java.util.Calendar;

public class CCuentaCorrienteConIn extends CuentaCorriente{

	public CCuentaCorrienteConIn() {
	 
	}

	public CCuentaCorrienteConIn(String numCuenta, String nombre, double saldo, double tipoDeInteres, double comisiones,
			double importePorTrans, int transExentas) {
		super(numCuenta, nombre, saldo, tipoDeInteres, comisiones, importePorTrans, transExentas);
		
	}
	
	public void intereses() {	
		Calendar calendario = Calendar.getInstance();
		if(calendario.get(Calendar.DAY_OF_MONTH)== 1) {
			double intereses = 0;
			if(saldo >= 300000) {
				saldo = saldo * tipoDeInteres;
			}		
		}
	}
}

