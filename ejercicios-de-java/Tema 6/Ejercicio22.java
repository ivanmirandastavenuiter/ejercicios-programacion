/**
 * Ejercicio22
 * 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio22 {
  public static void main(String[] args) {
    
    System.out.println("Introduce por favor la altura de la serpiente: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int espacios = 12;
    int serpenteo;
    
    for (int n = 0; n < espacios; n++) {
        System.out.print(" ");
      }
        System.out.print("@");
        System.out.println();
    
    for (int i = 1; i < altura; i++) {
    
    // La posición de la cabeza (13) constituye el eje sobre el que colocar
    // los asteriscos y el espacio lo fijamos en una variable a 12. A cada línea que avance,
    // el espacio tendrá que modificarse automáticamente en función del carácter
    // aleatorio con el que se encuentre. Por ejemplo, en el primer caso, 
    // si la posición incial es 13, la siguiente estará en 12, 13 o 14. 
    // Esto quiere decir que el primer carácter susceptible de colocarse es 12
    // y que los espacios tienen que ser como máximo de 11, es decir, 12 - 1,
    // e ir modificándose si salen otros números aleatorios. 
  
    // De este modo, si en el primer caso sale 0, los espacios se reducen 
    // una unidad, alineando los siguientes con este carácter.
    
    // Y así con el resto.
  
      for (int r = 0; r < espacios - 1; r++) {
        System.out.print(" ");
      }
    
      serpenteo = (int)(Math.random() * 3);
    
      switch (serpenteo) {
            case 0:
              System.out.print("*");
              espacios--;
              break;
            case 1:
              System.out.print(" *");
              break;
            case 2:
              System.out.print("  *");
              espacios++;
              break;
            }
    
      System.out.println();
    }
  }
}
  
          
    
  
  
  
     
  
  
  
  
  
  
  
  
  
