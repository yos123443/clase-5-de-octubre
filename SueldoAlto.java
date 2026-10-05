import java.util.Scanner;

public class SueldoAlto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de un trabajador: ");
        double sueldo = entrada.nextDouble();

        if (sueldo > 3500) {
            System.out.println("Pertenece al grupo de ingresos altos");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase SueldoAlto
