/**
* Ejercicio7
* 
* PREGUNTAR A LUIS CÓMO MODIFICAR EL TEXTO DEPENDIENDO DE LOS INTENTOS
* QUE QUEDEN
* 
* PREGUNTAR TAMBIÉN POR QUÉ EN LA SOLUCIÓN INICIALIZA LA BOOLEAN ACERTADO
* EN FALSE: seguramente para entrar en el bucle y porque por defecto
* la clave no está acertada. 
* 
* Cuando no sabemos las iteraciones que se van a dar, es mejor o do while
* o while. Ya que como mínimo el usuario va a meter un dato? 
* 
* Si queremos modificar los textos, dice Luis que se puede hacer con if 
* o switch. Por ejemplo, un if dentro del primer if que va después del do,
* y con un else dentro. 
* 
* EN EL SEGUNDO IF PUEDES PONER UN ELSE PARA LA COMBINACÓN CORRECTA
* 
* SI PONEMOS RESTANTES NO FUNCIONA, TIENE QUE SER INTENTOS
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
 

    
