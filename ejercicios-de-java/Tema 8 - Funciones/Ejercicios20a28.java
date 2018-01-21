package funciones;

import java.util.Scanner;

/**
 * NOTA: Consultar archivo Arrays.java para ver las funciones.
 * 
 * @author Iván Miranda
 */

public class Ejercicios20a28 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el tamaño del array: ");
    int a = sc.nextInt();
    System.out.println("Introduce el mínimo de los valores: ");
    int b = sc.nextInt();
    System.out.println("Introduce el máximo de los valores: ");
    int c = sc.nextInt();
    
    int[] array = funciones.Arrays.generaArrayInt(a, b, c);
    System.out.println("El array generado es: "); 
    funciones.Arrays.muestraArrayInt(array);
    System.out.println("El número menor generado es: " + funciones.Arrays.minimoArrayInt(array));
    System.out.println("El número mayor generado es: " + funciones.Arrays.maximoArrayInt(array));
    System.out.println("La media de los valores es: " + funciones.Arrays.mediaArrayInt(array));
    
    System.out.println("¿Quieres saber si un número está dentro del array? Introdúcelo: ");
    int d = sc.nextInt();
    System.out.println(funciones.Arrays.estaEnArrayInt(array, d));
    
    System.out.println("¿Quieres saber la posición de algún número dentro del array? Introdúcelo: ");
    int e = sc.nextInt();
    System.out.println(funciones.Arrays.posicionEnArray(array, e));
    
    System.out.println("El resultado de voltear el array sería: ");
    int[] volteado = funciones.Arrays.volteaArrayInt(array);
    funciones.Arrays.muestraArrayInt(volteado);
    
    System.out.println("Rota el array hacia la derecha tantas veces como quieras: ");
    int f = sc.nextInt();
    System.out.println("El resultado del array rotado es: ");
    int[] rotadoDerecha = funciones.Arrays.rotaDerechaArrayInt(array, f);
    funciones.Arrays.muestraArrayInt(rotadoDerecha);
    
    System.out.println("Rota el array hacia la izquierda tantas veces como quieras: ");
    int g = sc.nextInt();
    System.out.println("El resultado del array rotado es: ");
    int[] rotadoIzquierda = funciones.Arrays.rotaIzquierdaArrayInt(array, g);
    funciones.Arrays.muestraArrayInt(rotadoIzquierda);
  }
}
    