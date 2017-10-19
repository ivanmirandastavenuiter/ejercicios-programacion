/**
* Ejercicio1
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* 
* Si, por otro lado, queremos escribir varias líneas dentro de un solo
* comando de out.print, se corta cada uno con sus respectivas comillas
* y se pone un + como cuando imprimes resultados. Las dos opciones están
* aceptadas. 
* 
* Para imprimir en pantalla datos con y sin tilde, como miércoles, 
* tendríamos que poner el case con y sin tilde. Se pueden introduucir 
* comentarios con // para hacer aclaraciones. 
* 
* Se pueden agrupar varios case con el mismo resultado a imprimir.
* 
* Recordar que los datos contenidos en case deben ser indentados.
* 
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
    
  
    
   
