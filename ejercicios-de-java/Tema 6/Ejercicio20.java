/**
 * Ejercicio20
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio20 {
  public static void main(String[] args) {
    
    int ancho = 10;
    int relleno = ancho -2;
    
    System.out.println("Introduce por favor la capacidad de la cuba: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    int auxiliar = capacidad + 1;
    
    int contenido;
    contenido = (int)(Math.random() * auxiliar);
    
    int lineasVacias = capacidad - contenido;
    
    // Líneas vacías
    
    for (int i = 0; i < lineasVacias; i++) {
      
      System.out.print("*");
      
      for (int n = 0; n < relleno; n++) {
        
        System.out.print(" ");
      }
      
      System.out.print("*");
      System.out.println();
    }
    
    // Líneas rellenas
    
    for (int i = 0; i < contenido; i++) {
      
      System.out.print("*");
      
      for (int n = 0; n < relleno; n++) {
        
        System.out.print("=");
      }
      
      System.out.print("*");
      System.out.println();
    }
    
    // Base
    
    for (int i = 0; i < ancho; i++) {
        
        System.out.print("*");
      }
    }
  }
    
    
    
      
    
 
