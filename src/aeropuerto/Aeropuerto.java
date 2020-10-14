
package aeropuerto;



public class Aeropuerto {

    private String Nombre;
    private int NumeroDeTrabajadores;
    private Date FechaDeFundación;
    private String Especialidad;
    private Boolean Internacional;

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
