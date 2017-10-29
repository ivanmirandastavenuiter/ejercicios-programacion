/**
* Ejercicio11
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Introduce un número cualquiera: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int total = num + 6;

    do {
      System.out.printf("%-10s %-10s %-10s\n", "Original", "Cuadrado", "Cubo");
      System.out.printf("%-10d %-10d %-10d\n", num, (num * num), (num * num * num));
      num++;
    } while (num < total);
  }
}
    
      
      
      
      
