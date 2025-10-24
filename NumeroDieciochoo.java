import java.util.Scanner;

class NumeroDieciochoo {
    public static void main(String[] args) {
        Scanner jl = new Scanner(System.in);
        double minutos, costoTotal;

        System.out.print("Coloca los minutos que durará tu llamada: ");
        minutos = jl.nextDouble();

        if (minutos <= 3) {
            costoTotal = 10;
        } else {
            costoTotal = 10 + (minutos - 3) * 1;
        }

        System.out.println("El costo total de tu llamada es: $" + costoTotal);
    }
}