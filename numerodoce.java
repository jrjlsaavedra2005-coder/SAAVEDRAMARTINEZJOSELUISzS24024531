import java.util.Scanner;

public class hor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	double total=0, sueldo=0;
	int opcion=0,horas=0;
	System.out.print("¿Cuantas horas trabajas? ");
	horas=sc.nextInt();
  System.out.print("¿A que categoría perteneces? ");
	opcion=sc.nextInt();
 	switch (opcion) {
	case 1:
		total=20000*.928;
		System.out.print("Tu sueldo del mes con el descuento del 7.2% por concepto de salud es de " + total);
		break;
	case 2:
		total=15000*.928;
		System.out.print("Tu sueldo del mes con el descuento del 7.2% por concepto de salud es de " + total);
   		break;
	case 3:
		total=10000*.928;
		System.out.println("Tu sueldo del mes con el descuento del 7.2% por concepto de salud es de " + total);
		break;
	case 4:
		total=7500*.928;
		sueldo=total*1.15;
		System.out.println("Tu sueldo del mes con el descuento del 7.2% por concepto de salud es de " + total);
		System.out.println("El sueldo con el subsidio del 15% es de " + sueldo);
		break;
	default:
		System.out.print("Ingresa un valor del 1-4");
        }

    }
}