/*
 * Programa main para ejecutar las funciones de la clase Zona.
 */
package ejercicio07;

/**
 *
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    boolean salir = false;
    int eleccion;
    int entradas;
    
    System.out.println("Bienvenido a EXPOCOCHE CAMPANILLAS 2018.");
    System.out.println();
    
    System.out.println("A continuación se muestran las entradas disponibles: ");
    System.out.println("Sala principal: " + salaPrincipal.getEntradasRestantes());
    System.out.println("Compra-venta: " + compraVenta.getEntradasRestantes());
    System.out.println("Zona VIP: " + vip.getEntradasRestantes());
    System.out.println();
    
    do {
    
    System.out.println("¿Qué quieres hacer?");
    System.out.println("1. Mostrar número de entradas libres.");
    System.out.println("2. Vender entradas");
    System.out.println("3. Salir");
    eleccion = sc.nextInt();
    switch (eleccion) {
      case 1:
        System.out.println("Clasificación de entradas disponibles "
          + "y vendidas según categoría: \n");
        System.out.println("Sala Principal: ");
        System.out.println(salaPrincipal);
        System.out.println();
        
        System.out.println("Compra-venta: ");
        System.out.println(compraVenta);
        System.out.println();
        
        System.out.println("Zona VIP: ");
        System.out.println(vip);
        System.out.println();
        
        System.out.println("Total entradas vendidas: " + Zona.getGeneral());
        break;
      case 2:
        System.out.println("Elige la zona: ");
        System.out.println("1. Sala principal.");
        System.out.println("2. Compra-venta.");
        System.out.println("3. Zona VIP.");
        eleccion = sc.nextInt();
        switch (eleccion) {
          case 1:
            System.out.println("Introduce el número de entradas que deseas adquirir: ");
            entradas = sc.nextInt();
            salaPrincipal.vender(entradas);
            break;
          case 2:
            System.out.println("Introduce el número de entradas que deseas adquirir: ");
            entradas = sc.nextInt();
            compraVenta.vender(entradas);
            break;
          case 3:
            System.out.println("Introduce el número de entradas que deseas adquirir: ");
            entradas = sc.nextInt();
            vip.vender(entradas);
            break;
        }
        break;
      case 3:
        salir = true;
        break;
      }
    } while (!salir);
  }
}
    
    
    