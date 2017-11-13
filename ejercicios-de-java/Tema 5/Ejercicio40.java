/**
* Ejercicio40
* 
* Realiza un programa que pinte por pantalla un rombo hueco hecho con
* asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
* sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
* mensaje de error.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio40 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pinta un rombo hueco en pantalla.");
    System.out.println("Introduce una altura impar e igual o mayor que 3: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int espaciosInicio = alturaIntroducida / 2;
    int alturaInicio = alturaIntroducida / 2;
    int espacioInterno = 0;
    int segundoAsterisco = 0;
    
    if ((alturaIntroducida % 2 != 0) && (alturaIntroducida > 3)) {
    
    //Pirámide base
    
    do {
    
      for (int i = 0; i < espaciosInicio; i++) {
        System.out.print(" ");
      }
    
      for (int i = 1; i > 0; i--) {
        System.out.print("*");
      }
      
      for (int i = espacioInterno - 1; i > 0; i--) {
        System.out.print(" ");
      }
      
      for (int i = segundoAsterisco; i > 0; i--) {
        System.out.print("*");
      }
      
      System.out.println();
      segundoAsterisco = 1;
      alturaInicio--;
      espaciosInicio--;
      espacioInterno += 2;
      
    } while (alturaInicio >= 0); 
    
    //Pirámide inversa
    
    int espaciosFinal = 1;
    int espacioRelleno = alturaIntroducida - 4;
    segundoAsterisco = 1;
    int segundaAltura = alturaIntroducida / 2;
    
    do {
    
      for (int i = espaciosFinal; i > 0; i--) {
        System.out.print(" ");
      }
    
      for (int i = 1; i > 0; i--) {
        System.out.print("*");
      }
    
      for (int i = espacioRelleno; i > 0; i--) {
        System.out.print(" ");
      }
    
      if (espacioRelleno > 0) {
      
        for (int i = segundoAsterisco; i > 0; i--) {
          System.out.print("*");
        }
      }
    
      System.out.println();
      espaciosFinal++;
      espacioRelleno -= 2;
      segundaAltura--;
    
    } while (segundaAltura > 0);
    
    } else {
    System.out.println("La altura ha de ser impar e igual o mayor a 3.");
    }
  }
}

      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

      
   
