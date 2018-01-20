/*
 * Escribe un programa que pase de decimal a binario.
 */
package funciones;

/**
 * NOTA: Para ver la función, consultar el archivo funcionesAdicionales.java
 * de este mismo directorio.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    

   Scanner sc = new Scanner(System.in);
   System.out.println("Introduce el número a convertir en decimal: ");
   int numero = sc.nextInt();
   
   System.out.println(funciones.NuevasFunciones.decimalBinario(numero));
  }
}