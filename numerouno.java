import java.util.Scanner;
public class numerouno{
	public static void main (String arg[]){
	Scanner jl = new Scanner(System.in);
	double m=0,p=0,pul=0;
	System.out.print("Escribe los metros que de seas converti a pies y a pulgadas ");
	m = jl.nextDouble();
	p=m*3.281;
	pul=m*39.37;
	System.out.print("Este es la conversion de a pies " + p + "\n y a pulgadas " + pul);
	




}


}