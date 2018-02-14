/*
 * Programa Main que ejecuta las clases Vehículo, Bicicleta y Coche.
 */
package ejercicio08;

/**
 *
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args)
    throws InterruptedException {
    
    Scanner sc = new Scanner(System.in);
    
    Bicicleta merida = new Bicicleta("Mérida", "750PH");
    Coche leon = new Coche("Seat", "León");
    
    int espacios;
    String dibujo;
    boolean salir = false;
    int opcion;
    int recorrido;
    
    do {
    System.out.println("\nD A M N ! C A R S ! \n");
    
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    opcion = sc.nextInt();
    
    switch (opcion) {
      case 1:
        System.out.println("¿Cuántos km quieres recorrer?");
        recorrido = sc.nextInt();
        merida.setKilometrosRecorridos(merida.getKilometrosRecorridos() + recorrido);
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + recorrido);
        espacios = 0;
        for (int a = 0; a < recorrido; a++) {
          for (int b = 0; b < 100; b++) {
            System.out.println("\b");
          }
          dibujo = merida.pinta(espacios);
          System.out.println(dibujo);
          Thread.sleep(150);
          espacios++;
          if (espacios % 30 == 0) {
            espacios = 0;
          }
        }
        break;
      case 2:
        System.out.println("¿Cuántos km quieres recorrer?");
        recorrido = sc.nextInt();
        merida.setKilometrosRecorridos(merida.getKilometrosRecorridos() + recorrido);
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + recorrido);
        espacios = 0;
        for (int a = 0; a < recorrido; a++) {
          for (int b = 0; b < 100; b++) {
            System.out.println("\b");
          }
          dibujo = merida.pintaCaballito(espacios);
          System.out.println(dibujo);
          Thread.sleep(150);
          espacios++;
          if (espacios % 30 == 0) {
            espacios = 0;
          }
        }
        break;
      case 3:
        System.out.println("¿Cuántos km quieres recorrer?");
        recorrido = sc.nextInt();
        leon.setKilometrosRecorridos(leon.getKilometrosRecorridos() + recorrido);
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + recorrido);
        espacios = 0;
        for (int a = 0; a < recorrido; a++) {
          for (int b = 0; b < 100; b++) {
            System.out.println("\b");
          }
          dibujo = leon.pintaCoche(espacios);
          System.out.println(dibujo);
          Thread.sleep(150);
          espacios++;
          if (espacios % 30 == 0) {
            espacios = 0;
          }
        }
        break;
      case 4:
        System.out.println("¿Cuántos km quieres recorrer?");
        recorrido = sc.nextInt();
        leon.setKilometrosRecorridos(leon.getKilometrosRecorridos() + recorrido);
        Vehiculo.setKilometrosTotales(Vehiculo.getKilometrosTotales() + recorrido);
        espacios = 0;
        for (int a = 0; a < recorrido; a++) {
          for (int b = 0; b < 100; b++) {
            System.out.println("\b");
          }
          dibujo = leon.pintaCocheQuemando(espacios);
          System.out.println(dibujo);
          Thread.sleep(150);
          espacios++;
          if (espacios % 30 == 0) {
            espacios = 0;
          }
        }
        break;
      case 5:
        System.out.println("La bicicleta ha recorrido un total de: " + merida.getKilometrosRecorridos()
        + " kilómetros.");
        break;
      case 6: 
        System.out.println("El coche ha recorrido un total de " + 
        leon.getKilometrosRecorridos() + " kilómetros.");
        break;
      case 7:
        System.out.println("Se han creado " + Vehiculo.getVehiculosCreados()
        + " vehículos");
        System.out.println("Juntos han recorrido un total de " + Vehiculo.getKilometrosTotales()
        + " kilómetros.");
        break;
      case 8:
        salir = true;
        break;
      }
    } while (!salir);
  }
}
   
        
        
        
        
    
     
   
  
      
      
      
      
      
      
      
      
      
  
