import java.util.Scanner;
	public class Numeroocho{
	public static void main(String arg[]){
	Scanner jl = new Scanner(System.in);
	double i=0,p=0,pp=0;
	System.out.print("Cuanta capital deseas invertir en la empresa");
	i=jl.nextDouble();
	p=(i*2)/100;
	pp=i-p;
	System.out.print("Tu ingreso mensual de tu inversión de " + i + "al mes con 	el 2% es" + p);



}
}