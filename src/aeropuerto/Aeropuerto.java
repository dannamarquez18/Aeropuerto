
package aeropuerto;



public class Aeropuerto {

    private String Nombre;
    private int NumeroDeTrabajadores;
    private Date FechaDeFundación;
    private String Especialidad;
    private Boolean Internacional;

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
        // TODO code application logic here
    }

    private static class Date {

        public Date() {
        }
    }
    
}
