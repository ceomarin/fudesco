public class Trabajador {
    public String nombres;
    public String apellidos;
    public String run;
    public String telefono;
    public int edad;

    public Trabajador(){

    }

    public Trabajador(String nombre,String apellidos, String run, String telefono, int edad ){
        this.nombres = nombre;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String nombreCompleto(){
        return nombres + " " + apellidos;
    }

    public int descomponerRun(){
        
        return Integer.parseInt(run.split("-")[0]);
    }

    @Override
    public String toString() {
        return "Trabajador{nombre: "+nombres+" "+apellidos+" run: "+run+" telefono: "+telefono+" edad: "+edad+"}";
    }

}
