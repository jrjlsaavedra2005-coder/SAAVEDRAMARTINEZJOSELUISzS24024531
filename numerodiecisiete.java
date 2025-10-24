import java.util.*;
public class Ejercicio17{
	public static void main (String args[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Introduzca un numero");
 	 int n = sc.nextInt();
	  if(n!=1){
		if(Math.sqrt(n)==1){
		 System.out.println("Es primo");
		}else{ 
		System.out.println("No es primo");

		}
	}

}
}