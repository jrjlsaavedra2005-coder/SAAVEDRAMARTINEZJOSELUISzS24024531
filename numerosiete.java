import java.util.Scanner;
	public class numerosiete{
	public static void main(String arg[]){
	Scanner jl = new Scanner(System.in);
	double t=0,p=15,l=0,k=0;
	System.out.print("Coloca la cantidad que vas a pagar para darte tu descuento");
	t=jl.nextDouble();
	l= (p*t)/100;
	k=t-l;
	System.out.print("Este es tu precio final de la compra que realizaste" + k);
}
}