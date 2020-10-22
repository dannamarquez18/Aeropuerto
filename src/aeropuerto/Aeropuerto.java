
package aeropuerto;

import java.util.Date;


public class Aeropuerto {

    private String Nombre;//Ete es el nombre del aeropuerto 
    private int NumeroDeTrabajadores;//El numero de trabajadores del aeropuerto
    private Date FechaDeFundación;//Fecha de fundación del aeropuerto
    private String Especialidad;//Los tipos de especialidades del aeropuerto
    private Boolean Internacional;//si realiza viajes de manera internacional

    //Atribuos de composición
    private Check Propietarios = null;
    private final TorrePasajeros torreglow ;
   
    //Este es el constructor de clase
    public Aeropuerto(String Nombre, 
            int NumeroDeTrabajadores,
            Date FechaDeFundación,
            String Especialidad,
            Boolean Internacional) {
        this.Nombre = Nombre;
        this.NumeroDeTrabajadores = NumeroDeTrabajadores;
        this.FechaDeFundación = FechaDeFundación;
        this.Especialidad = Especialidad;
        this.Internacional = Internacional;
        this.torreglow = new TorrePasajeros(300,"Sin registro");
  
    }
 
    public Check getPropietarios(){
        return this.Propietarios;
    }
    
    
    public void setPropietarios(Equiaje  p ){
        this.Propietarios = p;
                 
    }
    
    //El metodo umenta la cantidad de trabajadores de el Aropuerto en 100
    // y la convierte en internacional
    
    public void contratarTrabajadores(){
        this.NumeroDeTrabajadores += 100;
        this.Internacional = true;
    }
    
    /** Este metodo permite actualizar el nombre de la pagina 
     * una especialidad
     * @param nuevoNombre es el nuevo nombre del aeropuerto
     * @param nuevaEspecialidad la nueva especialidad del aeropuerto 
     */
   
    public void Actualizacion(
        String nuevoNombre,
        String nuevaEspecialidad){
        this.Nombre = nuevoNombre; 
        this.Especialidad = nuevaEspecialidad;
        
  }
    
    /**A partir de esta linea se encuentran los metodos get y se
     * @return t*/
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroDeTrabajadores() {
        return NumeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int NumeroDeTrabajadores) {
        this.NumeroDeTrabajadores = NumeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return FechaDeFundación;
    }

    public void setFechaDeFundación(Date FechaDeFundación) {
        this.FechaDeFundación = FechaDeFundación;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Boolean getInternacional() {
        return Internacional;
    }

    public void setInternacional(Boolean Internacional) {
        this.Internacional = Internacional;
    }
    

    public static void main(String[] args) {
        Aeropuerto aeropuertoUno = new Aeropuerto(
                   "Aeropuerto Marquesaa",
                   165,
                   new Date (),
                   "Animales ",
                   false);
        Aeropuerto aeropuertoDos = new Aeropuerto(
                  "Aeropuerto DaEm",
                   30,
                   new Date(),
                   "Personas",
                    true);
        
        System.out.println(aeropuertoUno.getNombre());
        System.out.println(aeropuertoUno.getNumeroDeTrabajadores());
        System.out.println(aeropuertoUno.getInternacional());
        
        aeropuertoUno.contratarTrabajadores();
     
        System.out.println(aeropuertoUno.getNombre());
        System.out.println(aeropuertoUno.getNumeroDeTrabajadores());
        System.out.println(aeropuertoUno.getInternacional());
        }
}


