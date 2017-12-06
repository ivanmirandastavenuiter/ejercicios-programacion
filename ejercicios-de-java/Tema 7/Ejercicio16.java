/**
 * Ejercicio16
 * 
 * Escribe un programa que rellene un array de 20 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio16 {
  public static void main(String[] args) {
    
    int[] n = new int[20];
    int numero;
    
    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random() * 401);
      n[i] = numero;
      System.out.print(numero + " ");
    }
    
    System.out.println();
    System.out.println("¿Qué número quiere resaltar? (1 - Múltiplos de 5, 2 - Múltiplos de 7): ");
    int respuesta = Integer.parseInt(System.console().readLine());
    
    switch (respuesta) {
      case 1:
      
        for (int i = 0; i < 20; i++) {
          
          if (n[i] % 5 == 0) {
             System.out.print("[" + n[i] + "] ");
           } else {
             System.out.print(n[i] + " ");
           }
         }
         break;
         
      case 2:
        
         for (int i = 0; i < 20; i++) {
          
          if (n[i] % 7 == 0) {
             System.out.print("[" + n[i] + "] ");
           } else {
             System.out.print(n[i] + " ");
           }
         }
         break;
       }
     }
   }
         
             
          
          
          
          
          
    
