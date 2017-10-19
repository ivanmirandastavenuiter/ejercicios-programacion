/**
* Ejercicio11
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Vamos a jugar a un juego. Tú me dices la hora que");
    System.out.println("es y yo te digo cuánto queda hasta medianoche");
    
    System.out.println("Dime primero la hora que es: ");
    int hora = Integer.parseInt(System.console().readLine());

    System.out.println("Ahora inserta los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundosPasados = ((hora*3600) + (minutos*60));
    int segundosDia = 24*3600;
    int total = segundosDia - segundosPasados;
    
    if ((hora <= 0) || (hora >24) || (minutos < 0) || (minutos >60)) {
      System.out.println("Esa hora no está bien");
    } else { 
      System.out.println("Quedan exactamente " + total + " segundos para la medianoche");
    }
      
  }
}
    
    
    
    
