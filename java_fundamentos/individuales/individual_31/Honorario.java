
public class Honorario extends Trabajador {
    private String giro;
    private int anioInicioActividades;

    public Honorario() {
        super();
    } 

    public Honorario(String nombres, String apellidos, String run, String telefono, int edd, String giro,
            int anioInicioActividades) {
        super(nombres, apellidos, run, telefono, edd);
        this.giro = giro;
        this.anioInicioActividades = anioInicioActividades;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnioInicioActividades() {
        return anioInicioActividades;
    }

    public void setAnioInicioActividades(int anioInicioActividades) {
        this.anioInicioActividades = anioInicioActividades;
    }

/**
 * The function displays information about a worker on a contract basis.
 */
    @Override
    public void mostrarDatos() {        
        System.out.println("Datos del trabajador a Honorarios");
        System.out.println("fecha inicio actividades: "+this.getAnioInicioActividades());
        System.out.println("giro: "+this.getGiro());
        System.out.println("telefono: "+super.getTelefono());
    }

    @Override
    public String toString() {
        return "Honorario [giro=" + giro + ", anioInicioActividades=" + anioInicioActividades + "]";
    }
    
}