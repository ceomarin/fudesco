import java.util.Scanner;

public class Cadena {

    public static void main(String[] args) {
        int contador = 0;
        String cadena,
        cadenaLimpia="";
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un texto ");
            cadena = sc.nextLine();
        }while(cadena.isEmpty());
        
        System.out.println("Cadena por consola: ");
        
        for (char a : cadena.toCharArray()) {
            if (!(a == ' ')) {
                cadenaLimpia += a;
                System.out.println(a);
            }
        }
        char[] arrayCadena =  cadenaLimpia.toCharArray();

        for (int i = 0; i < abecedario.length; i++) {
            int aux = 0;
            for (int j = 0; j < arrayCadena.length; j++) {
                if (abecedario[i] == arrayCadena[j]) {
                    aux++;
                }
            }
            System.out.println(abecedario[i]+" ("+aux+")");
        }


    }
}
