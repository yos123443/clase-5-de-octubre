import java.util.Scanner;

public class AccesoTorneo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad del participante: ");
        int edad = entrada.nextInt();

        if (edad >= 15 && edad <= 18) {
            System.out.println("Puede participar");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase AccesoTorneo
