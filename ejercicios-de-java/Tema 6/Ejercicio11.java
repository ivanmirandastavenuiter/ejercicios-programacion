/**
 * Ejercicio11
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    int cantidad = 20;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    int nota;

    do {
      
      nota = (int)(Math.random() * 11);
      
      if ((nota >= 0) && (nota < 5)) {
        System.out.println(nota + ": suspenso");
        suspensos++;
      } else if (nota < 6) {
        System.out.println(nota + ": suficiente");
        suficientes++;
      } else if (nota < 7) {
        System.out.println(nota + ": bien");
        bienes++;
      } else if (nota < 9) {
        System.out.println(nota + ": notable");
        notables++;
      } else if (nota <= 10) {
        System.out.println(nota + ": sobresaliente");
        sobresalientes++;
      }
      
      cantidad--;
    } while (cantidad > 0);
    
      System.out.println();   
      System.out.println("Hay un total de " + suspensos + " suspensos.");
      System.out.println("Hay un total de " + suficientes + " suficientes.");
      System.out.println("Hay un total de " + bienes + " bienes.");
      System.out.println("Hay un total de " + notables + " notables.");
      System.out.println("Hay un total de " + sobresalientes + " sobresalientes.");
    }
  }
      
    
    
    
    
    
    
