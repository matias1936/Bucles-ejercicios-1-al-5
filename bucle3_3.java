
package bucles;
import java.util.Scanner;

public class bucle3_3 {
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        int numsecreto =(int) (Math.random()* 100 + 1);
        
        System.out.println("Ingrese un numero entre 1 y 100: ");
 int num=sc.nextInt();
 
 while (numsecreto !=num && num!= -1) {
     if (numsecreto < num) {
         System.out.println("El numero secreto es menor. ");
     } else {
         System.out.println("El numero secreto es mayor. ");
     }
         System.out.println("Ingrese otro numero: ");
         num = sc.nextInt();
     }
     if (numsecreto == num) {
         System.out.println("Felicidades, has acertado.");
     } else {
         System.out.println("Sigue participando. ");
         
     }
 }
    }
    

