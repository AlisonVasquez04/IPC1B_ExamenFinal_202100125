
package ipc1.examenfinal;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class IPC1ExamenFinal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
         while(!salir){//menu contiene 4 opciones
            System.out.println("1. Ejercicio 1 ");
            System.out.println("2. Ejercicio 2 ");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
         
         System.out.println("Introduzca una opción ");
         opcion = sn.nextInt();
         
         switch (opcion) {
             case 1:
                  int numero1;
                  int numero2;
                  Scanner numeros = new Scanner(System.in);
                  System.out.println("Ingrese el primer número");
                  numero1 = numeros.nextInt();
                  System.out.println("Ingrese el segundo número");
                  numero2 = numeros.nextInt();
                  
                  if(numero1>numero2){
                      System.out.println("El número mayor es:" +numero1);
                      
                  }else{
                     System.out.println("El número mayor es:" +numero2); 
                  }
                  break;
               
               
                  
                  
                  
               case 4:
                    salir=true;
                    break;
         }
         }
    }
    
}
