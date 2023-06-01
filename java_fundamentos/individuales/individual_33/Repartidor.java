public class Repartidor extends Empleado {
    private String disponibilidadHoraria;

    public Repartidor() {
    }

    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }


    
    @Override
    public void bonoAdicional() {
        if (this.getEdad() < 30) {
            this.setSalario(this.getSalario() + 15000);
        }
    }

    @Override
    public String toString() {
        return "Repartidor [disponibilidadHoraria=" + disponibilidadHoraria + "]";
    }

    
}
