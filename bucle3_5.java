
package bucles;
import java.util.Scanner;

public class bucle3_5 {
    
     public static void main (String[] args) {
         int n, min, max;
        Scanner sc= new Scanner (System.in);
        
    System.out.println("Ingrese el valor minimo del rango:  ");
    min = sc.nextInt();
    System.out.println("Ingrese el valor maximo del rango:  ");
    max = sc.nextInt();
    
    do {
        System.out.println("Escriba un numero: ");
        n = sc.nextInt();
    } while (!(min <= n && n <= max ));
    
    System.out.println(n+ "Pertenece al rango.");
    
    }
    
}
