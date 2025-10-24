import java.util.Scanner;
	public class numerodiesinueve{
	public static void main(String arg[]){
	Scanner jl= new Scanner(System.in);
	double n=0,g=40,t=30,p=30,r=0,rr=0,rrr=0;
	System.out.print("Coloca el presupuesto anual del hospital ");
	n= jl.nextDouble();
	r=(t*n)/100;
	rr=(p*n)/100;
	rrr=(g*n)/100;
	System.out.print("Estos son los presupuesto ya repartidos\n " + r + "pesos a traumologia\n" + rr + "pesos a Pediatra \n" + rrr + "pesos Ginecologia");

	
	







}
}