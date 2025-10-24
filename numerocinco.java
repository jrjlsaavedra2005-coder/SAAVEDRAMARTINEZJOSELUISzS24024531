import java.util.Scanner;
	public class numerocinco{
	public static void main(String arg[]){
	Scanner jl = new Scanner (System.in);
	double tem=0,fa=0,ab=0;
	System.out.print("Coloca la temperatura de gardos centigrados que deseas convertir a fahrenheit y a temperatura absoluta");
	tem=jl.nextDouble();
	fa=tem*1.8+32;
	ab=tem+273.15;
	System.out.print("Esta es tu temperatura en fahrenheit " + fa + "y esto es la temperatura absoluta" + ab);




}
}