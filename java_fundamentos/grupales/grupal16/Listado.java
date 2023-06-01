package grupal16;

import java.util.ArrayList;

public class Listado {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public Listado(){

    }

    public void getListaUsuarios() {
       for (Usuario usuario : listaUsuarios) {
         System.out.println(usuario.analizarUsuario());
         System.out.println("\n");
       }
    }

    public void setListaUsuarios(Usuario usuario) { 
        this.listaUsuarios.add(usuario);
    }

}
