/**
* Ejercicio1
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.print("Dime un día cualquiera de la semana: ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    switch (diaSemana) {
      case "lunes":
      System.out.print("Tienes Sistemas Informáticos");
      break;
      case "martes":
      System.out.print("Te toca Bases de Datos");
      break;
      case "miércoles":
      System.out.print("Tienes Programación");
      break;
      case "jueves":
      System.out.print("Te toca clase con Antonio");
      break;
      case "viernes":
      System.out.print("Entornos de desarrollo");
      break;
      default:
        System.out.println("Ese día te lo has inventado");
        }
    }
 } 
    
  
    
   
