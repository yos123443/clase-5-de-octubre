import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de una compra: ");
        double monto = entrada.nextDouble();

        if (monto >= 300) {
            System.out.println("Aplica descuento del 10%");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase DescuentoCompra
