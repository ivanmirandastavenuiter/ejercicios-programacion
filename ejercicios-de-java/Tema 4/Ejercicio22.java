/**
* Ejercicio22
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Hola querido amigo. Si fuese usted tan amable ");
    System.out.println("de proporcionarme la hora, minutos y el día en que ");
    System.out.println("nos encontramos, le indicaré cuánto queda en minutos ");
    System.out.println("para que comience nuestro tan codiciado, amado y ");
    System.out.println("sin embargo efímero fin de semana. Introduzca, buen hombre, ");
    System.out.println("la hora que es: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Ahora los minutos bribón: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    System.out.println("¿Y en qué día de la semana estamos pichonsito?");
    String dia = System.console().readLine();
    
    int diaMin = 1440;
    int minutosPasados = (hora*60) + minutos;
    
    switch (dia) {
      case "lunes":
      System.out.println("Quedan " + ((1440 - minutosPasados) + 3*diaMin + 900) + " minutos para el fin de semana.");
      break;
      case "martes":
      System.out.println("Quedan " + ((1440 - minutosPasados) + 2*diaMin + 900) + " minutos para el fin de semana.");
      break;
      case "miércoles":
      System.out.println("Quedan " + ((1440 - minutosPasados) + diaMin + 900) + " minutos para el fin de semana.");
      break;
      case "jueves":
      System.out.println("Quedan " + ((1440 - minutosPasados) + 900) + " minutos para el fin de semana.");
      break;
      case "viernes":
      System.out.println("Quedan " + ((900 - minutosPasados)) + " minutos para el fin de semana.");
      break;
    }
  }
}
