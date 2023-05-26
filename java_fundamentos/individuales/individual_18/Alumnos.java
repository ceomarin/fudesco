import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0,
                posicionMenor = 0;
        double nota = 0,
                aux = 0,
                sumaNotas = 0,
                promedio = 0;
        String nombre = "";

        ArrayList<String> listaNombres = new ArrayList<>();
        ArrayList<Double> listaNotas = new ArrayList<>();

        do {
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = sc.next().toLowerCase();
            if (!nombre.equals("salir")) {
                listaNombres.add(nombre);
                try {
                    System.out.println("Ingrese la calificación del alumno: ");
                    nota = sc.nextDouble();
                    listaNotas.add(nota);
                } catch (Exception e) {
                    System.out.println("\nError en calificación: " + e);
                }
            }

        } while (!nombre.equals("salir"));

        sc.close();
        if (listaNotas.size() >= 2) {

            for (int i = 0; i < listaNotas.size(); i++) {

                if (listaNotas.get(i) > aux) {
                    aux = listaNotas.get(i);
                    posicion = i;

                }
                sumaNotas += listaNotas.get(i);
            }

            for (int i = 0; i < listaNotas.size(); i++) {

                if (listaNotas.get(i) < aux) {
                    aux = listaNotas.get(i);
                    posicionMenor = i;

                }

            }
            System.out.println("\nResultado: ");
            System.out.println("El alumno con mayor nota es: " + listaNombres.get(posicion) + " con la nota: "
                    + listaNotas.get(posicion));
            System.out.println("El alumno con menor nota es: " + listaNombres.get(posicionMenor) + " con la nota: "
                    + listaNotas.get(posicionMenor));

            promedio = sumaNotas / listaNotas.size();
            
            System.out.println("\nEl promedio es: (suma de notas) / (total alumnos) = (" + sumaNotas + ") / ("
                    + listaNotas.size() + ") = ");
            System.out.printf(" %,.2f", promedio);
        }
    }

}
