
/**
 * Write a description of class Vendedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vendedor extends Persona
{
   private String direccion;
   
   public Vendedor(String rut, String nombre, int edad, String direccion){
       super(rut, nombre, edad);
       this.direccion = direccion;
   }
   
   public String getDireccion(){
       return direccion;
   }
   
   public void setDireccion(String direccion){
       this.direccion = direccion;
   }
   
}
