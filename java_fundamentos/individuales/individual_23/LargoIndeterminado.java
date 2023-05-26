import java.util.ArrayList;
import java.util.Scanner;

public class LargoIndeterminado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaTexto,
                cadenaResultado = "";

        System.out.println("\ningrese una cadena de texto de largo indeterminado, puede usar mayusculas y minusculas: ");
        cadenaTexto = sc.nextLine();

        if (!cadenaTexto.isEmpty()) {

            for (int i = 0; i < cadenaTexto.length(); i++) {
                if (Character.isLetter(cadenaTexto.charAt(i))) {

                    if (cadenaTexto.charAt(i) == Character.toLowerCase(cadenaTexto.charAt(i))) {
                        cadenaResultado += Character.toUpperCase(cadenaTexto.charAt(i));
                    }
                    if (cadenaTexto.charAt(i) == Character.toUpperCase(cadenaTexto.charAt(i))) {
                        cadenaResultado += Character.toLowerCase(cadenaTexto.charAt(i));
                    }
                }
            }

            System.out.println("cadena resultado: " + cadenaResultado);

        } else {
            System.out
                    .println("La cadena de texto no contiene valores, volver a lanzar el programa e ingrese valores.");
        }

    }
}
