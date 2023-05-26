import java.time.LocalDate;

public class Contratado extends Trabajador{
    private LocalDate fechaIngreso;
    private double salarioMensual;

    public Contratado() {
        super();
    }

    public Contratado(String nombre, String apellidos, String run, String telefono, int edad, LocalDate fechaIngreso,
            double salarioMensual) {
        super(nombre, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    

    @Override
    public String toString() {
        return "Contratado [fechaIngreso=" + fechaIngreso + ", salarioMensual=" + salarioMensual + "]";
    }

    
}
