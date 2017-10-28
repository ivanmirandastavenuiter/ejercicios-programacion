/**
* Ejercicio10
* 
* NOTA A RECORDAR: Si estableces el println de pedir el número al principio
* fuera del do, la primera cifra que indiques se va a quedar en bucle
* repitiéndose ya que has excluido la pregunta de esa iteración. Es por 
* eso por lo que tiene que ir dentro.
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
      System.out.println("La media de la suma de dichos números es " + ((total - num)/ 2) + ".");
    }
  }
      
      
      
      
