import java.util.Scanner;
	public class numerotres{
	public static void main(String arg[]){
	Scanner jl = new Scanner(System.in);
	double e=0,pu=0;
	System.out.print("Deseas calcular el numero de pulsasiones que debes tener en diez segundos de ejercicio solo coloca tu edad ");
	e=jl.nextDouble();
	pu=(220-e)/10;
	System.out.print("Este es el numero de pulsasiones que deberias tener " + pu);




}
}