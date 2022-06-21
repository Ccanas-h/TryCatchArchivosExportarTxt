import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LibroVenta extends Cliente {
	
	private String nombreVenta;
	private String fechaVenta;
	private Vehiculo vehiculo = new Vehiculo("Rojo", "HASD23");
	private String patenteVenta= vehiculo.getPatente();
	
	
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super("12873", "Dolape", 12, 13);
		this.nombreVenta= nombreVenta;
		this.fechaVenta= fechaVenta;


		
	}


	
	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}


	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	

			
			public void guardarVenta() {
				
				ejecutarCreacionArchivo("carpeta01", "libroventa01");
				
				
				
			}
				
				public void ejecutarCreacionArchivo(String directorio, String fichero){
					
					String directorio1 = "src/"+directorio;
					String fichero1 = fichero +".txt";
					
					

					// Validacion y creacion de carpeta
					try {
					File miCarpeta = new File(directorio1);
					
					if (miCarpeta.exists()) {
						System.out.println("La carpeta ya existe en "+miCarpeta.getAbsolutePath());
					}else {
						miCarpeta.mkdir();
						System.out.println("La carpeta ha sido creada en: "+ miCarpeta.getAbsolutePath());
					}
					
					}catch(Exception ex) {
						System.out.println("Ha ocurrido un error con la creacion de la carpeta");
						
					}
					
					//Creacion de archivo dentro de carpeta. 
					
					File miArchivo = new File(directorio1+"/"+fichero1);

					try {
						
						if (miArchivo.exists()) {
							System.out.println("El archivo tiene el mismo nombre y sera sobreescrito");
							miArchivo.createNewFile();
							System.out.println("El archivo ha sido creado y su direccion es: "+ miArchivo.getAbsolutePath());
						}else {
							miArchivo.createNewFile();
							System.out.println("El archivo ha sido creado y su direccion es: "+ miArchivo.getAbsolutePath());
						}
						
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					
					
					ArrayList<String> lista = new ArrayList<String>();
					lista.add("La edad de cliente es " + super.getEdad() );

					lista.add("La patente del vehiculo es " + vehiculo.getPatente());
					lista.add("La fecha de la venta es " + getFechaVenta());
					lista.add("El nombre de venta es " + getNombreVenta());


					// ESCRIBIR LISTA LINEA x LINEA EN FICHERO.TXT
					try {
					FileWriter fileWriter = new FileWriter(miArchivo);
					BufferedWriter bf = new BufferedWriter(fileWriter);
					
					for (String i: lista) {
						bf.write(i);
						bf.newLine();
					}
					bf.close();
					
					
					}catch(IOException e) {
						System.out.println("Ocurrio un error con el FileWriter");
						e.printStackTrace();
					}finally {

						System.out.println("Ha finalizado el programa");
					}
					
					
					
					
					
				}
				
				
				
			
		}


	 
	

