/**
* Ejercicio11
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Introduce un número y te muestro el cuadrado y ");
    System.out.println("y el cubo de los cinco siguientes: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int total = num + 5;

    do {
      num++;
      
      System.out.printf("%-10s %-10s %-10s\n", "Original", "Cuadrado", "Cubo");
      System.out.printf("%-10d %-10d %-10d\n", num, (num * num), (num * num * num));
    
    } while (num < total);
  }
}
