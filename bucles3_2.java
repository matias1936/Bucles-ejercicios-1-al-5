
package bucles;

import java.util.Scanner;
public class bucles3_2 {
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        int sumaedades = 0;
        int contadoralumnos = 0;
        int contadormayoredad = 0;
        double media;
        
        System.out.print("Introduzca la edad: ");
        int edad = sc.nextInt();
        
        while (edad >=0) {
            sumaedades += edad;
            contadoralumnos++;
            if (edad >= 18) {
                contadormayoredad++;
            }
            System.out.println("Introduzca la edad");
            edad = sc.nextInt();
        }
        media = (double) sumaedades / contadoralumnos;
        System.out.println("la suma de todas las edades es:" + sumaedades);
        System.out.println("La media de las edades es: " + media);
         System.out.println("Hay: " + contadoralumnos + " alumnos en total");
          System.out.println("Hay " + contadormayoredad+ "alumnos que son mayores de edad");
        
    }
    
}