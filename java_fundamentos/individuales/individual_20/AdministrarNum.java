import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AdministrarNum {

    public static void main(String[] args) {
        int n = 0,
            suma = 0;
        ArrayList<Integer> adminNumber = new ArrayList<Integer>();
        double promedio;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("ingrese un número");
            n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                adminNumber.add(n);
                suma += n;
            }
        } while (!(n == 0));
        sc.close();
        if (adminNumber.size() > 2) {

            promedio = suma / adminNumber.size();
            System.out.println("El Promedio es:" + promedio);
            System.out.println("Mayor número:" + Collections.max(adminNumber));
            System.out.println("Menor úumero:" + Collections.min(adminNumber));

            adminNumber.removeIf(p -> {
                if (p % 2 == 0) {
                    return true;
                }
                return false;
            });

            if (adminNumber.size() > 2) {
                suma = 0;
                System.out.println("\nResultado sin números pares: ");

                for (Integer integer : adminNumber) {
                    suma += integer;
                }

                promedio = suma / adminNumber.size();
                System.out.println("El Promedio es:" + promedio);
                System.out.println("Mayor número:" + Collections.max(adminNumber));
                System.out.println("Menor úumero:" + Collections.min(adminNumber));
            } else {
                System.out.println(
                        "El array es vacío o contiene menos de 3 valores.\nvuelva a correr el programa e ingrese minimo 3 notas y al menos 3 impares ");
            }

        } else {
            System.out.println(
                    "El array es vacío o contiene menos de 3 valores.\nvuelva a correr el programa e ingrese minimo 3 notas y al menos 3 impares ");

        }
    }
}
