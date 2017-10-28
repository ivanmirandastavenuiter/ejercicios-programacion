/**
* Ejercicio7
* 
* PREGUNTAR A LUIS CÓMO MODIFICAR EL TEXTO DEPENDIENDO DE LOS INTENTOS
* QUE QUEDEN
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    
    int c = 3244;
    int intento = 0;
    int com = 0;
    int restantes = 4;
    
    do {
      System.out.println("Por favor, introduce la combinación correcta");
      com = Integer.parseInt(System.console().readLine());
      
      if (com != c) {
        System.out.println("Lo siento, esa no es la combinación.");
        intento++;
        System.out.println("Te quedan " + (restantes - intento) + " intentos.");
      } 

      if (com == c) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
      } 
      
    } while ((intento < 4) && (com != c));
  }
}

    
