/**
 * Ejercicio03
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    
    int palo = (int)(Math.random() * 4);
    int numero = (int)(Math.random() * 10 + 2);
    
    if ((palo == 0) && (numero < 8)) {
      System.out.println("Ha salido el " + numero + " de espadas");
      } else if ((palo == 0) && (numero > 7)) {
      
      switch (numero) {
        
        case 8:
          System.out.println("Ha salido la sota de espadas");
          break;
        case 9:
          System.out.println("Ha salido el caballo de espadas");
          break;
        case 10:
          System.out.println("Ha salido el rey de espadas");
          break;
        case 11:
          System.out.println("Ha salido el as de espadas");
          break;
        }
      }
    
    if ((palo == 1) && (numero < 8)) {
      System.out.println("Ha salido el " + numero + " de copas");
      } else if ((palo == 1) && (numero > 7)) {
      
      switch (numero) {
        
        case 8:
          System.out.println("Ha salido la sota de copas");
          break;
        case 9:
          System.out.println("Ha salido el caballo de copas");
          break;
        case 10:
          System.out.println("Ha salido el rey de copas");
          break;
        case 11:
          System.out.println("Ha salido el as de copas");
          break;
        }
      }
    
    if ((palo == 2) && (numero < 8)) {
      System.out.println("Ha salido el " + numero + " de oro");
      } else if ((palo == 2) && (numero > 7)) {
      
      switch (numero) {
        
        case 8:
          System.out.println("Ha salido la sota de oro");
          break;
        case 9:
          System.out.println("Ha salido el caballo de oro");
          break;
        case 10:
          System.out.println("Ha salido el rey de oro");
          break;
        case 11:
          System.out.println("Ha salido el as de oro");
          break;
        }
      }
      
    if ((palo == 3) && (numero < 8)) {
      System.out.println("Ha salido el " + numero + " de bastos");
      } else if ((palo == 3) && (numero > 7)) {
      
      switch (numero) {
        
        case 8:
          System.out.println("Ha salido la sota de bastos");
          break;
        case 9:
          System.out.println("Ha salido el caballo de bastos");
          break;
        case 10:
          System.out.println("Ha salido el rey de bastos");
          break;
        case 11:
          System.out.println("Ha salido el as de bastos");
          break;
        }
      }
    }
  }
      
      
