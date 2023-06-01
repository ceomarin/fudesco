import java.time.LocalDate;

public class Vendedor extends Empleado {
    private LocalDate fechaInicio;

    public Vendedor() {

    }

    public Vendedor(String nombre, String apellido, int edad, double salario, LocalDate fechaInicio) {

        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio() {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public void bonoAdicional() {
        if (this.getEdad() > 40) {
            this.setSalario(this.getSalario() + 50000);
        }
    }

    @Override
    public String toString() {
        return "Vendedor [Fecha de Inicio = " +this.fechaInicio+ "]"+super.toString();
    }
}
