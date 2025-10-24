import java.util.*;
public class PromedioCal {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double a=0, b=0, c=0, d=0;
 	System.out.println("La calificación de Matematicas");
	a= sc.nextInt();
	System.out.println("La calificación de Fisica");
	b= sc.nextInt();
	System.out.println("La calificación de Quimica");
	c= sc.nextInt();
	d=(a+b+c)/3;
	System.out.println("Su promedio será: " +d);
}
}