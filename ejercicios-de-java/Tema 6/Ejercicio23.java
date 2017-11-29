/**
 * Ejercicio23
 * 
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio23 {
  public static void main(String[] args) {
  
    for (int i = 0; i < 5; i++) {
    
    int dado = (int)(Math.random() * 6 + 1);

      switch (dado) {
          case 1:
            System.out.print("🂡 ");
            break;
          case 2:
            System.out.print("🂮 ");
            break;
          case 3:
            System.out.print("🂭 ");
            break;
          case 4:
            System.out.print("🂫 ");
            break;
          case 5:
            System.out.print("❼ ");
            break;
          case 6:
            System.out.print("❽ ");
            break;
          }
        }
      }
    }
