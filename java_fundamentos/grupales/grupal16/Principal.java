

import java.util.ArrayList;
import java.time.LocalDate;


    public class Principal{

    public static void main(String[] args){
        Listado listado = new Listado();
        Usuario user1 = new Usuario("Jhon",LocalDate.parse("1990-01-01"),11111111);
        Usuario user2 = new Usuario("Ansunamung",LocalDate.parse("1960-01-01"),77777777);
        Profesional profesional1 = new Profesional("Pedro",LocalDate.parse("1980-05-01"),22222222,"Profesor", LocalDate.parse("2020-02-20"));
        Administrativo administrativo1 = new Administrativo("Victor",LocalDate.parse("1986-05-01"),33333333,"Bodeg","sin experiencia"); 
        Cliente cliente1 = new Cliente("Octavio",LocalDate.parse("1956-05-01"),21112220,6666666,"Juan","Gabriel",123456789,"AfpUno",1,"Los cotapos 666","Santiago",35);
        
        listado.setListaUsuarios(user1);
        listado.setListaUsuarios(user2);
        listado.setListaUsuarios(profesional1);
        listado.setListaUsuarios(administrativo1);
        listado.setListaUsuarios(cliente1);

        listado.getListaUsuarios();
        System.out.println("fin");
    }
}
