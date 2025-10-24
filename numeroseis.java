import java.util.Scanner;
	public class numeroseis{
	public static void main(String arg[]){
	Scanner jl=new Scanner(System.in);
	double gru=0,h=0,m=0,ph=0,pm=0;
	System.out.print("Escriba cuantos alumnos hay en el grupo");
	gru=jl.nextDouble();
	System.out.print("Escribe cuantos hombre hay en el grupo");
	h=jl.nextDouble();
	System.out.print("Escribe cauntas mujeres hay en el grupo");
	m=jl.nextDouble();
	ph=h/gru*100;
	pm=m/gru*100;
	System.out.print("el promedio del grupo de " + gru + "personas  en hombres es  " + ph + "% y el de las mujerdes es "+ pm + "%");





}
}