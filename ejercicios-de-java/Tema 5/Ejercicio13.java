/**
* Ejercicio13
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Introduce números y te digo cuántos son positivos ");
    System.out.println("y cuántos negativos: ");
    
    int preguntas = 0;
    int npos = 0;
    int nneg = 0;
    int num;
    
    do { 
      System.out.println("Introduce un número: ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num < 0) {
        nneg++;
        preguntas++;
      } else {
        npos++;
        preguntas++;
      }
    } while (preguntas < 10);
      System.out.println("Has introducido " + nneg + " números negativos ");
      System.out.println("y " + npos + " números positivos");
  }
}
