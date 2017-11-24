/**
 * Ejercicio08
 * 
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio08 {
  public static void main(String[] args) {

  int pronosticos;
  int partidos = 14;
  
  while (partidos > 0) {
    
    pronosticos = 3;
  
  do {
  
    int apuesta = (int)(Math.random() * 6 + 1);
    
    switch (apuesta) {
      
      case 1:
      case 2:
      case 3:
        System.out.print("\033[31m1" + "\033[37m|X|2" + " ");
        break;

      case 4:
      case 5:
        System.out.print("\033[37m1|" + "\033[31mX" + "\033[37m|2" + " ");
        break;
        
      case 6:
        System.out.print("\033[37m1|X|" + "\033[31m2" + " ");
        break;
      }
      pronosticos--;
      
    } while (pronosticos > 0);
    
       System.out.println();
       
       partidos--;
     }
  
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
