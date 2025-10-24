import java.util.*;
public class Ejercicio14{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	int opcion=0;
	double n=0, in=0;
	System.out.println("Si el vendedor vendió igual o menos de 10,000,000 ponga 1\nSi el vendedor vendió mas de 10 y menos de 15 millones ponga 2\nSi el vendedor vendió mas de 15 millones ponga 3 ");
		System.out.println("Elija la de cuanto vendió en el mes para darle su información");
	opcion = sc.nextInt();
		switch (opcion) {
	case 1:
		System.out.println("Introduzca cuanto fue la cantidad que vendio");
		n = sc.nextDouble();
		if (n<10000000){
		in=n*1.02;
		System.out.println("Su ingreso neto es: "+in);
			}else{ System.out.println(" Introduzca una cantidad valida");
			}
		break;
	case 2:
		System.out.println("Introduzca cuanto fue la cantidad que vendio porfavor");
		n = sc.nextDouble();
		if (n>=10000000 && n<15000000 ){
		in=n*1.04;
		System.out.println("Su ingreso neto es: "+in);
			}else{ System.out.println(" Introduzca una cantidad valida");
			}
		break;
	case 3:
		System.out.println("Introduzca cuanto fue la cantidad que vendio:");
		n = sc.nextDouble();
		if (n>=15000000){
		in=n*1.10;
		System.out.println("Su ingreso neto es: "+in);
			}else{ System.out.println(" Introduzca una cantidad valida");
			}
		break;
 	default:
		System.out.println("Por favor elija correctamente segun lo vendido");
		break;
		}
	}
	
}
