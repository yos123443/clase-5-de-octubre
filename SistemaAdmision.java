import java.util.Scanner;

public class SistemaAdmision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la nota de Matemática: ");
        int matematica = entrada.nextInt();

        System.out.print("Ingrese la nota de Comunicación: ");
        int comunicacion = entrada.nextInt();

        if (matematica >= 11 && comunicacion >= 11) {
            System.out.println("Postulante apto");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase SistemaAdmision
