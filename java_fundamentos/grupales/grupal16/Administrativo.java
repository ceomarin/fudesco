package grupal16;

import java.time.LocalDate;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo(){
       
    }

    public Administrativo(String nombre, LocalDate fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("\nArea: " + this.area);
        System.out.println("Experiencia Previa: " + this.experienciaPrevia);
    }

    

    
}
