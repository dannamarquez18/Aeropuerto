
package aeropuerto;


public class Equiaje extends Check{
    private final String Edad;
    private final Boolean numeroDeEquipaje;

    public Equiaje(String nombre, 
            String apellido,
            String Edad, 
            Boolean numeroDeEquipaje) {
        super(nombre, apellido);
        this.Edad = Edad;
        this.numeroDeEquipaje = numeroDeEquipaje;
        
    }
    
    
}
