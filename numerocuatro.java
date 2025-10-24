import java.util.Scanner;
	class numerocautro{
	public static void main(String arg[]){
	Scanner jl = new Scanner(System.in);
	double ac=0,pasa=0,f=0;
	System.out.print("Escribe el año en que naciste ");
	pasa=jl.nextDouble();
	System.out.print("Escribe el año actual");
	ac=jl.nextDouble();
	f=ac-pasa;
	System.out.print("Esta es tu edad actualmente" + f);
	






}
}