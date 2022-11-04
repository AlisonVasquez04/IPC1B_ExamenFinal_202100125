
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
         System.out.println(); //espacio vacio entre las opciones y menú
         
         switch (opcion) {
             case 1:
                  int numero1;
                  int numero2;
                  System.out.println("1. Ejercicio 1 ");
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
                  System.out.println(); //espacio vacio entre menú y resultado
                  break;
               
              case 2:
                  int numero;
                  System.out.println("2. Ejercicio 2 ");
                  Scanner piramide = new Scanner(System.in);
                  System.out.println("Ingrese un número impar");
                  numero = piramide.nextInt();
                  for (int i=0; i<numero; i++){
                      for (int j =0; j> numero-i; j++){
                      System.out.println("  ");
                      }
                        for(int k=0; k<i; k++){
                        System.out.print("*");
                  }
                      System.out.println();    
                  }
                  System.out.println(); //espacio vacio entre menú y resultado
                  break;
                  
                  
                  
               case 4:
                    salir=true;
                    break;
         }
         }
    }
    
}
