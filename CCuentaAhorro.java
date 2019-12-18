package ProyectoCuentas;

import java.util.Calendar;

public class CCuentaAhorro extends CCuenta{

	double cuotaMantenimiento;
		
	public CCuentaAhorro(String numCuenta, String nombre, double saldo, double tipoDeInteres, double comisiones,
			double cuotaMantenimiento) {
		super(numCuenta, nombre, saldo, tipoDeInteres, comisiones);
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	@Override
	public double interes() {
		Calendar calendario = Calendar.getInstance();
		if(calendario.get(Calendar.DAY_OF_MONTH)== 1) {
			this.saldo = this.saldo * this.tipoDeInteres;
		}
		return this.saldo * this.tipoDeInteres;
	}

	@Override
	public void comisiones() {
		Calendar calendario = Calendar.getInstance();
		if(calendario.get(Calendar.DAY_OF_MONTH)== 1) {
			this.saldo = this.saldo - cuotaMantenimiento;
		}

	}

	public CCuentaAhorro(String numCuenta, String nombre, double saldo, double interes, double comisiones) {
		super(numCuenta, nombre, saldo, interes, comisiones);
		
	}

	
}
