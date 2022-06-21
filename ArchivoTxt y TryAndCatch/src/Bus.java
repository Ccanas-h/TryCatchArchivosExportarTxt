
/**
 * Write a description of class Bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bus extends Vehiculo
{
    
    private int cantidadDeAsientos;

    /**
     * Constructor for objects of class Bus
     */
    public Bus(String color, String patente,int cantidadDeAsientos){
        super(color,patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    
    public int getCantidadDeAsientos(){
        return cantidadDeAsientos;
    }
    
    public void setCantidadDeAsientos(int cantidadDeAsientos){
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    
    public int asientosDisponibles(){
        return getCantidadDeAsientos();
    }

       
}
