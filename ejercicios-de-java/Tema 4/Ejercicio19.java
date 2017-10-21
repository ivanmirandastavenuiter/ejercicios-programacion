/**
* Ejercicio19
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Introduce un número negativo o positivo de hasta");
    System.out.println("5 cifras y te digo cuántos dígitos tiene. Grasia.");
    
    int num = Integer.parseInt(System.console().readLine());
        
    if ((num >= 0) && (num < 10)) { 
      System.out.println("El número " + num + " tiene un dígito");
    }
    if ((num <= 0) && (num > (-10))) { 
      System.out.println("El número negativo " + num + " tiene un dígito");
    }
    if ((num >= 10) && (num < 100)) { 
      System.out.println("El número " + num + " tiene dos dígitos");
    }
    if ((num <= (-10)) && (num > (-100))) { 
      System.out.println("El número negativo " + num + " tiene dos dígitos");
    }
    if ((num >= 100) && (num < 1000)) { 
      System.out.println("El número " + num + " tiene tres dígitos");
    }
    if ((num <= (-100)) && (num > (-1000))) { 
      System.out.println("El número negativo " + num + " tiene tres dígitos");
    }
    if ((num >= 1000) && (num < 10000)) { 
      System.out.println("El número " + num + " tiene cuatro dígitos");
    }
    if ((num <= (-1000)) && (num > (-10000))) { 
      System.out.println("El número negativo " + num + " tiene cuatro dígitos");
    }
    if ((num >= 10000) && (num < 100000)) { 
      System.out.println("El número " + num + " tiene cinco dígitos");
    }
    if ((num <= (-10000)) && (num > (-100000))) { 
      System.out.println("El número negativo " + num + " tiene cinco dígitos");
    }
  }
}
