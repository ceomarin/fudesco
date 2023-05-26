import java.util.Scanner;

public class Letras {

    public static void main(String[] args) {
        int cantidadVocales = 0;
        int cantidadConsonantes = 0;
        String consonantes = "bcdfghjklmnñpqrstvwxyz",
                vocales = "aeiou",
                palabra;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("ingrese una palabra: ");
            palabra = sc.nextLine();
        } while (palabra.isEmpty());

        for (int i = 0; i < palabra.length(); i++) {
            if (consonantes.contains(Character.toString(palabra.toLowerCase().charAt(i)))) {
                cantidadConsonantes++;
            }
            if (vocales.contains(Character.toString(palabra.toLowerCase().charAt(i)))) {
                cantidadVocales++;
            }
        }

        System.out.println("Resultado");
        System.out.println("Cantidad de Consonantes = " + cantidadConsonantes);
        System.out.println("Cantidad de Vocales = " + cantidadVocales);
    }
}