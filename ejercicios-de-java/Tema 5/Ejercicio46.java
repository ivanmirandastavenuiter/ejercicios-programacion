/**
* Ejercicio46
* 
* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
* asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
* que tanto la anchura como la altura sean mayores o iguales que 2, en caso
* contrario se debe mostrar un mensaje de error.
* 
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio46 {
  public static void main(String[] args) {
  
    System.out.println("Este programa pinta un rectángulo en la pantalla.");
    System.out.println("Tanto la altura como la anchura deben ser iguales o");
    System.out.println("superiores a 2.");
    System.out.println();
    System.out.println("Introduce la altura del rectángulo: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Introduce la anchura del rectángulo: ");
    int anchoIntroducido = Integer.parseInt(System.console().readLine());
    
    if ((alturaIntroducida >= 2) && (anchoIntroducido >= 2)) {
    
    int rellenoAncho = anchoIntroducido - 2;
    int rellenoAlto = alturaIntroducida - 2;
  
    for (int i = 0; i < anchoIntroducido; i++) {
      System.out.print("* ");
    }
       System.out.println();
    
    do {
      
      for (int i = 1; i > 0; i--) {
        System.out.print("*");
      }
    
      for (int i = 0; i < rellenoAncho; i++) {
        System.out.print("  ");
      }
    
      for (int i = 1; i > 0; i--) {
        System.out.print(" *");
      }
      System.out.println();
      
      rellenoAlto--;
    } while (rellenoAlto > 0);
    
    for (int i = 0; i < anchoIntroducido; i++) {
      System.out.print("* ");
    }
  } else {
      
      System.out.print("Los datos introducidos no son correctos. Inténtalo de nuevo.");
    }
  }
}

    
    
    
  
