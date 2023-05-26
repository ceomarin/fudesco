public class Eventual extends Trabajador {
    private String disponibilidad;
    private String correo;

    public Eventual() {

    }

    public Eventual(String nombre, String apellidos, String run, String telefono, int edad, String disponibilidad,
            String correo) {
        super(nombre, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo = correo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Datos trabajador eventual");
        System.out.println("telefono: "+super.getTelefono());
        System.out.println("disponibilidad: "+this.getDisponibilidad());
        System.out.println("correo: "+this.getCorreo());
    }

    @Override
    public String toString() {
        return "Eventual [disponibilidad=" + disponibilidad + ", correo=" + correo + "]";
    }
    
}
