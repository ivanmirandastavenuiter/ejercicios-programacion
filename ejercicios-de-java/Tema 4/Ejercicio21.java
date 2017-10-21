/**
* Ejercicio21
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Hola!, dime la nota de tu primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Bien!, ahora la del segundo: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2)/2;
  
    if (media >= 5) {
      System.out.println("¡Estás aprobado chaval! Tienes un " + media + " de media.");
    }
    if (media < 5) {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String respuesta = System.console().readLine();
      
      switch (respuesta) {
        case "apto":
        System.out.println("Tienes una media de 5");
        break;
        case "no apto":
        System.out.println("En ese caso tu nota es " + media);
      }
    }
  }
}
