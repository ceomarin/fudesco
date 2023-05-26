import java.util.Scanner;

public class Contrasenia {

    public static void main(String[] args) {
        int contador = 3;
        Scanner sc = new Scanner(System.in);
        String constrasenia,
                confirmacion = "secret123";

        try{
            do {
                System.out.println("introduzca una contraseña, tiene " + contador + " intentos: ");
                constrasenia = sc.next();
                if (constrasenia.equals(confirmacion)) {
                    System.out.println("La clave ingresada es correcta");
                    break;
                }
                contador--;
                if(contador == 0){
                    System.out.println("Te has equivocado en los intentos de contraseña, fin del programa.");
                }
            } while (contador > 0);
            sc.close();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        
    }
}
