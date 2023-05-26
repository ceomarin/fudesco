package entity;

import java.time.*;

public class Pago {
    private LocalDate fechaPago;
    private double importe;
    private String direccionFacturacion;
    
    public Pago() {
    }

    public Pago(LocalDate fechaPago, double importe, String direccionFacturacion) {
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.direccionFacturacion = direccionFacturacion;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    @Override
    public String toString() {
        return "Pago [fechaPago=" + fechaPago + ", importe=" + importe + ", direccionFacturacion="
                + direccionFacturacion + "]";
    }

    
}
