
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
                  
              case 3:
                  System.out.println("3. Ejercicio 3");
                    //No es necesaio solicitar los datos al usuario
                    // entonces los datos estaran definidos en el programa
                   System.out.println("Entrada 8 vacas");
                    //Entrada 8 vacas
                  int PesoCamion=1000;
                  int vaca1, vaca2, vaca3, vaca4,vaca5,vaca6,vaca7,vaca8;
                  int leche1= 30, leche2=34, leche3=28, leche4=45, leche5=31, leche6=50, leche7=29, leche8=1;
                  
                  vaca1 = 223;
                  vaca2 = 243;
                  vaca3 = 100;
                  vaca4= 200;
                  vaca5 = 200;
                  vaca6 = 155;
                  vaca7= 300;
                  vaca8= 150;
                  int PesoVaca= vaca1 + vaca2 + vaca3+ vaca4+vaca5+ vaca6+vaca7+vaca8;
                  int ProduccionLeche =leche1+ leche2+ leche3+ leche4+ leche6 +leche7+leche8;
                  if(PesoVaca > PesoCamion){//como se sabe la suma total es de 1571 de peso entonces se ecoge las vacas
                      System.out.println("El camión lleva sobrepeso, el programa escogera a las vacas");
                      int PesoVaca2= vaca1 + vaca2 + vaca3+ vaca4+ vaca6;
                      int ProduccionLeche2 =leche1+ leche2+ leche3+ leche4+ leche6;
                      System.out.println("Produccion total en L:" +ProduccionLeche2);
                  }
                  System.out.println(); //espacio vacio entre menú y resultado
                   System.out.println("Entrada 10 vacas");
                    //Entrada 10 vacas
                  int PesoCamion2= 2000;
                  int Vaca1= 340, Vaca2=355, Vaca3=223, Vaca4=243,Vaca5=130,Vaca6=240,Vaca7=260,Vaca8=155,Vaca9 =302, Vaca10= 130;
                  int Leche1=45, Leche2=50, Leche3=34, Leche4=39, Leche5=29, Leche6=40, Leche7=30, Leche8= 52, Leche9=31, Leche10=1;
                  int pesovaca = Vaca1 + Vaca2 +Vaca3+ Vaca4+ Vaca5+ Vaca6+ Vaca7+ Vaca8+ Vaca9+Vaca10;
                  int produccionleche = Leche1 + Leche2 + Leche3 +  Leche4 +  Leche5 +  Leche6 +  Leche7 +  Leche8 +  Leche9 +  Leche10;
                  if(pesovaca > PesoCamion2){
                      System.out.println("El camión lleva sobrepeso, el programa escogera a las vacas");
                      int pesovaca2 = Vaca1 + Vaca2 +Vaca3+ Vaca4+ Vaca5+ Vaca6+ Vaca7+ Vaca8;
                      int produccionleche2 = Leche1 + Leche2 + Leche3 +  Leche4 +  Leche5 +  Leche6 +  Leche7 +  Leche8;
                       System.out.println("Produccion total en L:" +produccionleche2);
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
