
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculo1 = new Vehiculo("Rojo", "HZJD26");
		
		Cliente cliente1 = new Cliente("16.313.232-2", "Arnold", 15, 16);
		
		LibroVenta venta1 = new LibroVenta("1era venta", "13101988");
		
		venta1.ejecutarCreacionArchivo("Directorio01", "Fichero01");
		venta1.ejecutarCreacionArchivo("Directorio02", "Fichero02");

		
		
	}


}
