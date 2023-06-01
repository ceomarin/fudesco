public class Cliente {
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int salud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int salud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.salud = salud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre() {
        return "Nombre:"+this.nombres+" "+this.apellidos;
    }

    public String obtenerSistemaSalud() {
        
        switch (this.getSalud()) {
            case 1:
                return "Fonasa";
            case 2:
                return "Isapre";
            default:
            return "Sistema de salud no definido";
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", salud=" + salud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
}
