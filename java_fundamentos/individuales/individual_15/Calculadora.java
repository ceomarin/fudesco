import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double operandoUno =0,
                operandoDos =0,
                resultado = 0,
                aux = 0;
        String operacion;

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA\n");

        System.out.println("ingrese un número: ");
        operandoUno = sc.nextInt();

        System.out.println("ingrese un segundo número: ");
        operandoDos = sc.nextInt();

        System.out.println("ingrese un signo ('+', '-', '/', '*', '%') para realizar la operación: ");
        operacion = sc.next();

        switch (operacion) {
            case "+":
                resultado = operandoUno + operandoDos;
                break;
            case "-":
            resultado = operandoUno - operandoDos;
                break;
            case "*":
            resultado = operandoUno * operandoDos;
                break;
            case "/":
            resultado = operandoUno / operandoDos;
                break;
            case "%":
                resultado =  operandoUno % operandoDos;
                break;
            default:
                resultado = 0;
                break;
        }

        System.out.printf("resultado: %.2f",resultado);

    }
}
