package entity;

import java.time.*;

public class Envio {
    private LocalDate fechaEnvio;
    private String direccionEnvio;

    public Envio() {
    }

    public Envio(LocalDate fechaEnvio, String direccionEnvio) {
        this.fechaEnvio = fechaEnvio;
        this.direccionEnvio = direccionEnvio;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    @Override
    public String toString() {
        return "Envio [fechaEnvio=" + fechaEnvio + ", direccionEnvio=" + direccionEnvio + "]";
    }

}
