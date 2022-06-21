
/**
 * Write a description of class MiniBus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniBus extends Bus
{
    private String tipoViaje;
    
    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje){
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }
    
    public String getTipoViaje(){
        return tipoViaje;
    }
    
    public void setTipoViaje(String tipoViaje){
        this.tipoViaje = tipoViaje;
    }
    
    public void imprimeBus(){
        System.out.println( " color " + super.getColor() );
        System.out.println( " patente " + super.getPatente() );
        System.out.println( " cantidad de asientos " + super.getCantidadDeAsientos() );
        System.out.println( " tipo de viaje " + getTipoViaje() );
    }
    
    
    
    
    
}
