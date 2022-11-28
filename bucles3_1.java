
package bucles;
import java.util.Scanner;
public class bucles3_1 {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean esPar, esPositivo;
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        
        while (num !=0) {
            esPar = num % 2 == 0 ? true : false ;
            esPositivo = num >= 0 ? true : false;
            
            System.out.println(" El numero ingresado es par? " + esPar + " El numero es positivo?: " + esPositivo);
            System.out.println(" Cuadrado: " + num * num);
            System.out.println(" Ingrese otro numero: ");
            
            num = sc.nextInt();
            
        }
  
    }
    
}
