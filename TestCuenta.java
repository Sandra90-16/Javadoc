package ProyectoCuentas;

public class TestCuenta {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
	 CCuentaAhorro cliente01 = new CCuentaAhorro("111/6666","Sandra",10000, 3.5, 30);                  
	 System.out.println(cliente01.getNombre());    
	 System.out.println(cliente01.getNumCuenta());   
	 System.out.println(cliente01.getSaldo());    
	 System.out.println(cliente01.getTipoDeInteres());
	 System.out.println(cliente01.interes());
	 CCuentaCorrienteConIn cliente02 = new CCuentaCorrienteConIn();  
	 cliente02.setNombre("Ainhoa");
	 cliente02.setNumCuenta("1234567890");
	 cliente02.setTipoDeInteres(3.0); 
	 cliente02.setTransExentas(0);
	 cliente02.setImportePorTrans(1.0);
	 cliente02.ingreso(20000);
	 System.out.println("\n");
	 System.out.println("saldo después del ingreso es " + cliente02.getSaldo());
	 cliente02.reintegro(10000);
	 System.out.println("saldo después del reintegro es " + cliente02.getSaldo());
	 cliente02.intereses();
	 System.out.println("saldo después de intereses es " + cliente02.getSaldo());
	 cliente02.comisiones();
	 System.out.println("saldo después de comisiones es " + cliente02.getSaldo());
	 System.out.println(cliente02.getNombre());
	 System.out.println(cliente02.getNumCuenta());
	 System.out.println(cliente02.getSaldo());
	}

}
