import java.util.Scanner;

public class AlumnoDestacado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        int nota = entrada.nextInt();

        if (nota >= 17) {
            System.out.println("Alumno destacado");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase AlumnoDestacado
