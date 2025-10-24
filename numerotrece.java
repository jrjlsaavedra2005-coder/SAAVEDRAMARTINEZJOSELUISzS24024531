import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el valor de A: ");
        double a = entrada.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        double b = entrada.nextDouble();

        System.out.print("Ingresa el valor de C: ");
        double c = entrada.nextDouble();

        if (a == 0) {
            System.out.println("Error: La ecuación no es cuadrática");
        } else {
            double discriminante = (b * b) - (4 * a * c);

            if (discriminante < 0) {
                System.out.println("Error: Las raíces son imaginarias");
            } else {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las raíces reales son:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        entrada.close();
    }
}
