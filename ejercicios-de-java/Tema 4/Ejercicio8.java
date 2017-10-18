/**
* Ejercicio8
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Para saber tu nota media en la asignatura de ");
    System.out.println("Programación, dime qué sacaste en el primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("¿Y en el segundo? ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Y ahora dime la nota del último: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = ((nota1 + nota2 + nota3)/3);
    
    System.out.println("Tu media del primer trimestre entonces es de " + media);
    
    if (media < 5) {
      System.out.println("Insuficiente, no vales para programar");
    }
    if ((media >=5) && (media < 6)) {
      System.out.println("Suficiente, malo pero tienes un pase");
    }
    if ((media >=6) && (media < 7)) {
      System.out.println("Bien, aunque podrías mejorar");
    }
    if ((media >=7) && (media < 9)) {
      System.out.println("Notable, eres bueno");
    }
    if ((media >=9) && (media <= 10)) {
      System.out.println("Sobresaliente, eres la reencarnación de Luis");
    }
  }
}

