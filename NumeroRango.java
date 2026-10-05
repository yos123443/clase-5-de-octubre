import java.util.Scanner;

public class NumeroRango {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero >= 20 && numero <= 50) {
            System.out.println("El número está dentro del rango");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase NumeroRango
