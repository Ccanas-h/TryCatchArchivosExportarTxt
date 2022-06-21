
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
     private String color;
     private String patente;
     
     public Vehiculo(String color, String patente){
         this.color = color;
         this.patente = patente;
     }
     
     public String getColor(){
         return color;
     }
     
     public void setColor(String color){
         this.color = color;
     }
     
     public String getPatente(){
         return patente;
     }
     
     public void setPatente(String patente){
         this.patente = patente;
     }
    
}
