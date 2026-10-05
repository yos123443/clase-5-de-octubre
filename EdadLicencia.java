import java.util.Scanner;

public class EdadLicencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Puede obtener licencia de conducir");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase EdadLicencia
