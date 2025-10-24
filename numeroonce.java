import java.util.Scanner;

public class dif {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
	double num1=0, num2=0, num3=0, mayor=0, menor=0, prom=0;
        System.out.print("Ingresa el primer valor: ");
        num1 = val.nextDouble();

        System.out.print("Ingresa el segundo valor: ");
        num2 = val.nextDouble();

        System.out.print("Ingresa el tercer valor: ");
        num3 = val.nextDouble();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales: " + num1);
        } else {
            if (num1 > num2 && num1 > num3) {
                mayor = num1;
            } else if (num2 > num1 && num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
            if (num1 < num2 && num1 < num3) {
                menor = num1;
            } else if (num2 < num1 && num2 < num3) {
                menor = num2;
            } else {
                menor = num3;
            }

          	prom = (num1 + num2 + num3) / 3;

            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            System.out.println("El promedio es: " + prom);
        }

    }
}
