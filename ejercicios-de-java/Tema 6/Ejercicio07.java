/**
 * Ejercicio07
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
 * nas para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio07 {
  public static void main(String[] args) {
    
  //Si son tres pronósticos por cada partido y son 14 en total más el pleno,
  //se hace un número aleatorio que se asigne con cada posibilidad de la 
  //apueste y lo muestre por pantalla.
  
  int pronosticos;
  int partidos = 14;
  
  //Empezamos por un bucle while que pinte 14 partidos, cada uno con tres
  //pronósticos. De este modo, en cada línea hacemos otro bucle que se 
  //repita tres veces y que imprima los 3 pronósticos.
  
  while (partidos > 0) {
    
    pronosticos = 3;
  
  do {
  
    int apuesta = (int)(Math.random() * 3);
  
      if (apuesta == 0) {
        System.out.print("\033[31m1" + "\033[37m|X|2" + " ");
      }
      if (apuesta == 1) {
        System.out.print("\033[37m1|" + "\033[31mX" + "\033[37m|2" + " ");
      }
      if (apuesta == 2) {
        System.out.print("\033[37m1|X|" + "\033[31m2" + " ");
      }
      
      pronosticos--;
      
    } while (pronosticos > 0);
    
       System.out.println();
       
       partidos--;
     }
     
  //Por último, pintamos una línea con el pleno
  
    int apuesta = (int)(Math.random() * 3);
    
      System.out.print("\033[37mPleno: ");
  
      if (apuesta == 0) {
        System.out.print("\033[31m1" + "\033[37m|X|2" + " ");
      }
      if (apuesta == 1) {
        System.out.print("\033[37m1|" + "\033[31mX" + "\033[37m|2" + " ");
      }
      if (apuesta == 2) {
        System.out.print("\033[37m1|X|" + "\033[31m2" + "\033[37m ");
      }
    }
  }

    
  
    
    

      

  
  
