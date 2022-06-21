
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente extends Persona
{
   private int edad;
   
   public Cliente(String rut, String nombre, int edad, int edad2){
       super(rut, nombre, edad);
       this.edad = edad2;
   }
   
   public int getEdad(){
       return edad;
   }
   
   public void setEdad(int edad){
       this.edad = edad;
   }
   
}
