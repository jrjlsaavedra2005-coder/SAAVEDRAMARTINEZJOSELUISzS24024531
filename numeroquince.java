import java.util.*;
public class Ejercicio15{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	int opcion=0;
	double a=0;
	System.out.println("Introduzca la calificación del alumno");
	a = sc.nextDouble();
	if(a<1.1){
		System.out.println("Su nota es: P  (Pésimo)");
	  }else if(a>1 && a<2.1){ 
		System.out.println("Su nota es: M  (Mal) ");
	    }else if(a>2 && a<3){ 
		System.out.println("Su nota es: R (Regular) ");
		}else if(a>2.9 && a<4.1){ 		
		System.out.println("Su nota es: B (Bien)");
		  }else if(a>4 && a<5.1){
		System.out.println("Su nota es: E (Excelente)");
	
	}
}
}


		



