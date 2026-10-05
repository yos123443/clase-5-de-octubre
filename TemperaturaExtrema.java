import java.util.Scanner;

public class TemperaturaExtrema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una temperatura: ");
        double temperatura = entrada.nextDouble();

        if (temperatura > 35) {
            System.out.println("Temperatura extrema");
        }

        System.out.println("Adiós!");
    } // Fin del método main
} // Fin de la clase TemperaturaExtrema
