
import java.util.Scanner;

class Numeroveinte {
    public static void main(String[] args) {
        Scanner jl = new Scanner(System.in);
        double nn=0,n=0,d=0,dd=0;
	System.out.print("PON EL NUMERO TOTAL DE TUS COMPRAS ");
	nn = jl.nextDouble();
        System.out.print("ESCOGE UN NUMERO AL AZAR ");
        n = jl.nextDouble();

        if (n <= 74) {
            d= (nn*15)/100;
		dd=nn-d;
	 System.out.println("El costo final de tu compra es" + dd);
        } else {
            d= (nn*20)/100;
		dd=nn-d;

        }

        System.out.println("El costo final de tu compra es" + dd);
    }
}







