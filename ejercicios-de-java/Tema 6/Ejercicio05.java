/**
 * Ejercicio05
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    
    long mayor = 0;
    long menor = 99999999;
    int contador = 0;
    long suma = 0;
    
    for (int i = 0; i < 50; i++) {
      
      long numero = (long)(Math.random() * 100 + 100);
      
      System.out.print(numero + " ");
      contador++;
      suma += numero;
      
      if (numero > mayor) {
        mayor = numero;
      } 
      
      if (numero < menor) {
        menor = numero;
      }
    }
    
     System.out.println();
    
     System.out.println("La media de los números es " + (double)suma/contador);
     System.out.println("El mínimo es " + menor);
     System.out.println("El máximo es " + mayor);
   }
 }
    
      
      
      
      
      
      
      
    
    
