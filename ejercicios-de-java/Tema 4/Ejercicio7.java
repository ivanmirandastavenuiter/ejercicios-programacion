/**
* Ejercicio7
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* 
* Se pueden poner if de nuevo para los datos incorrectos. 
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Para saber tu nota media en la asignatura de ");
    System.out.println("Programación, dime qué sacaste en el primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("¿Y en el segundo? ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Y ahora dime la nota del último: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Tu media del primer trimestre entonces es de " + ((nota1 + nota2 + nota3)/3));
  }
}

