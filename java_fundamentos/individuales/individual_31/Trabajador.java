public class Trabajador {
    protected String nombres;
    protected String apellidos;
    protected String run;
    protected String telefono;
    protected int edad;

    public Trabajador()   {

    }

    public Trabajador(String nombres , String apellidos, String run, String telefono, int edd ) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Datos del trabajador");
        System.out.println("telefono: "+this.telefono);
        System.out.println("edad: "+this.edad);
    }
    
    public String nombreCompleto()   {
        return nombres + " " + apellidos;
    }

    public int descomponerRun()  

        return Integer.parseInt(run.split("-")[0]);
    }

    public String getNombres() {
        return this.nombres;
    }                                
                   
                   
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRun() {
        return this.run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

	@Override
	public String toString() {
		return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos 
				+ ", run=" + run + ", telefono=" + telefono + ", edad=" 
				+ edad + "]";
}
