import java.util.Scanner;

public class NumeroTresCifras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene tres cifras");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase NumeroTresCifras
