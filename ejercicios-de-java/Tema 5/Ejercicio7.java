/**
* Ejercicio7
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    
    int combinacionCorrecta = 4567;
    int oportunidades = 4;
    int combinacionUsuario;
    
    do {
      System.out.println("Introduce las cuatro cifras de la combinación: ");
      combinacionUsuario = Integer.parseInt(System.console().readLine());
      oportunidades--;
      
      if (combinacionUsuario != 4567) {
        System.out.println("Lo siento, esa no es la combinación correcta");
        System.out.println("Te quedan " + (oportunidades) + " intentos");
      } else {
          System.out.println("La caja se ha abierto satisfactoriamente");
      } 
      if (oportunidades == 1) {
        System.out.println("Cuidado, solo te queda un intento más");
      }
      if (oportunidades == 0) {
        System.out.println("Ya no te quedan más intentos");
      } 
    } while ((oportunidades > 0) && (combinacionUsuario != combinacionCorrecta));
  }
}

    
