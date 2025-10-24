import java.util.Scanner;
	public class numerodos{
	public static void main (String args[]){
	Scanner jl = new Scanner (System.in);
	double r=0,li=3.1416,a=0,p=0,aa=0,pp=0;
	System.out.print("Escribe el radio de el circulo que deseas saber su longitus y su area ");
	r=jl.nextDouble();
	a=(r*2);
	p=(2*li);
	aa=li*a;
	pp=p*r;
	System.out.print("Gracias al radio el area de el circulo es " + aa + "\n y su perimetro es " + pp);
	
	



}
}