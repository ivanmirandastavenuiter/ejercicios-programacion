/*
 * Escribe un programa que pase de binario a decimal.
 */
package funciones;

/**
 * NOTA: Para ver la función, consultar el archivo funcionesAdicionales.java
 * de este mismo directorio.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    
   // El sistema binario opera en base 2, mientras que el decimal lo hace en base 10.
   // El valor del número decimal será igual a la suma de las potencias de dos multiplicadas
   // por los respectivos dígitos binarios: 0 o 1.
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Introduce el número a convertir en decimal: ");
   int numero = sc.nextInt();
   
   System.out.println(funciones.NuevasFunciones.binarioDecimal(numero));
  }
}