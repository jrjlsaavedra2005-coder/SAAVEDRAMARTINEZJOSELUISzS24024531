import java.util.Scanner;
	public class numeronueve{
	public static void main(String arg[]){
	Scanner jl= new Scanner(System.in);
	double s=0,ss=0,sss=0;
	System.out.print("Ingresa el salario actual");
	s=jl.nextDouble();
	ss=(s*25)/100;
	sss=s+ss;
	System.out.print("Este es el nuevo salario " + sss);






}
}