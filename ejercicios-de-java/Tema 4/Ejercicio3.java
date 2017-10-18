/**
* Ejercicio3
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.print("Pon un número del 1 al 7: ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    
    switch (diaSemana) {
      case 1:
      System.out.print("Lunes");
      break;
      case 2:
      System.out.print("Martes");
      break;
      case 3:
      System.out.print("Miércoles");
      break;
      case 4:
      System.out.print("Jueves");
      break;
      case 5:
      System.out.print("Viernes");
      break;
      case 6:
      System.out.print("Sábado");
      break;
      case 7:
      System.out.print("Domingo");
      break;
      default:
        System.out.println("Del 1 al 7 zoquete");
        }
    }
 } 
    
  
    
