/**
* Ejercicio10
* 
* NOTA A RECORDAR: Si estableces el println de pedir el número al principio
* fuera del do, la primera cifra que indiques se va a quedar en bucle
* repitiéndose ya que has excluido la pregunta de esa iteración. Es por 
* eso por lo que tiene que ir dentro.
* 
* Otra manera es introducir un if que ponga num introducido mayor que 0
* y que sume los dígitos y sume uno al contador, con un while número mayor
* que 0.
* 
* ¿Pero qué pasa si directamente ponemos el negativo?
* Poniendo un if contador > 0 y mostrar un mensaje de error en un else
* que diga un mensajito. 
* 
* 
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Vas a introducir una serie de números por teclado ");
    System.out.println("y te voy a mostrar la media de la suma total.");
    
    int num;
    int contador = 0;
    int total = 0;
    int media = total / 2;
    
    do {
      System.out.println("Introduce un número: ");
      num = Integer.parseInt(System.console().readLine());
      contador++;
      total = total + num;
    } while (num > 0);
      System.out.println("Has introducido " + (contador - 1) + " números positivos.");
      System.out.println("La media de la suma de dichos números es " + ((total - num)/ (contador -1)) + ".");
    }
  }
      
      
      
      
