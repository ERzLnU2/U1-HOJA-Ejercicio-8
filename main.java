/**
   PAGINA 18
   EJERCICIO 8. 
   
 * Un frutero necesita calcular los beneficios anuales que obtiene de la 
   venta de manzanas y peras. 
   
 * Por este motivo, es necesario diseñar una aplicación que solicite las ventas 
  (en kilos) de cada semestre para cada fruta. 
 
 * La aplicación mostrará el importe total sabiendo que el precio del kilo de 
   manzanas está fijado a 2,35€ y el kilo de peras en 1,95€.
  
   pueden ser ternarios..
   @author Daw120
 */
package com.solomongo.ejercicio8_daw120;
import java.util.Scanner;
public class Ejercicio8_DAW120 {
    public static void main(String[] args) {       
    Scanner teclado = new Scanner(System.in); // Crea teclado 
    final float PERASKILO=1.95f; // CONSTANTES final +f
    final float MANZANASKILO=2.35f;
    // variables a saco, son mismo tipo int...
    int perasSEM1, manzanasSEM1, perasTotalSEM1, manzanasTotalSEM1, perasSEM2, manzanasSEM2,perasTotalSEM2,manzanasTotalSEM2, total; 

     // 1er  S E M E S T R E: 
     System.out.print("\n---------------------------------------------\n");
     System.out.print("             1er S E M E S T R E:              ");
     System.out.print("\n____________________________________________\n");
      
     System.out.print("\n- PERAS, kilos vendidos: "); 
       perasSEM1=teclado.nextInt();       //pasa del String al int !!!!!!!!!!
       System.out.print("\t"+perasSEM1+"Kg. de peras");
         perasTotalSEM1=(int) (perasSEM1*PERASKILO); // hace un CAST.......... 
           System.out.print(" (a "+PERASKILO+"euro/kilo), TOTAL: "+perasTotalSEM1+" euros;\n");

    System.out.print("\n- MANZANZAS, kilos vendidos: "); 
      manzanasSEM1=teclado.nextInt();
      System.out.print("\t"+manzanasSEM1+"Kg. de manzanas");
        manzanasTotalSEM1=(int) (manzanasSEM1*MANZANASKILO);
          System.out.print(" (a "+MANZANASKILO+"euro/kilo), TOTAL: "+manzanasTotalSEM1+" euros.\n");
    
      // 2º  S E M E S T R E:
     System.out.print("\n--------------------------------------------\n");
     System.out.print("                2. S E M E S T R E:             ");
     System.out.print("\n____________________________________________\n");
   
     System.out.print("\n- PERAS, kilos vendidos: "); 
       perasSEM2=teclado.nextInt();       
       System.out.print("\t"+perasSEM2+"Kg. de peras.");
         perasTotalSEM2=(int) (perasSEM2*PERASKILO); // el CAST..
           System.out.print(" (a "+PERASKILO+"euro/kilo), "+perasTotalSEM2+" euros;\n");

    System.out.print("\n- MANZANZAS, kilos vendidos: "); 
      manzanasSEM2=teclado.nextInt();
      System.out.print("\t"+manzanasSEM2+"Kg. de manzanas.");
        manzanasTotalSEM2=(int) (manzanasSEM2*MANZANASKILO);
          System.out.print(" (a "+MANZANASKILO+"euro/kilo), "+manzanasTotalSEM2+" euros.\n");
    
    // B  E  N  E  F  I  C  I  O  S: 
    System.out.print("\n--------------------------------------------\n");    
      total= manzanasTotalSEM1+manzanasTotalSEM2+perasTotalSEM1+perasTotalSEM2;
        System.out.print("\n\tTOTAL GANANCIA ANUAL: "+total+" euros.\n\n");
    }
}
