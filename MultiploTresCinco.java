import java.util.Scanner;

public class MultiploTresCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es múltiplo de 3 y de 5");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase MultiploTresCinco
