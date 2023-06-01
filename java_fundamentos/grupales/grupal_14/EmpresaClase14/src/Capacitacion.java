import java.time.*;

public class Capacitacion {
    private int id;
    private int rut;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int id, int rut, LocalDate dia, LocalTime hora, String lugar, int duracion,int cantidadAsistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public String mostrarDetalle() {
        return "La capacitación será en " + lugar + " a las " + hora + " del día " + 
        dia + ", y durará " + duracion +" minutos";
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rut=" + rut +
                ", dia=" + dia +
                ", hora =" + hora +
                ", lugar ='" + lugar + '\'' +
                ", duracion =" + duracion +
                ", cantidadAsistentes =" + cantidadAsistentes +
                '}';
    }
}