/**
 * Ejercicio14
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio14 {
  public static void main(String[] args) {
  
  int intentos = 5;
  int numeroPrograma = (int)(Math.random() * 101);
  int respuesta;
  int mayor = 0;
  int menor = 1000;
  int aux;
  
  System.out.println("Voy a intentar adivinar el número que estás pensando.");
  System.out.println("Pulsa la tecla intro para comenzar con la secuencia: ");
  System.console().readLine();
  
  do {
 
    System.out.println("¿Es el número " + numeroPrograma + " el que estás pensando?");
    System.out.println("El número que estoy pensando es: 1-menor, 2-mayor, 3-igual.");
    respuesta = Integer.parseInt(System.console().readLine());
    
    switch (respuesta) {
      case 1:
      
        if (menor == 1000) {
          mayor = numeroPrograma;
          numeroPrograma = (int)(Math.random() * mayor);
        }
        if (menor < 1000) {
          mayor = numeroPrograma;
          aux = (mayor - menor) - 1;
          numeroPrograma = (int)(Math.random() * aux + menor + 1);
        }
        break;
        
      case 2: 
      
        if (mayor == 0) {
          menor = numeroPrograma;
          aux = 100 - menor;
          numeroPrograma = (int)(Math.random() * aux + menor + 1);
        } else {
          menor = numeroPrograma;
          aux = (mayor - menor) - 1;
          numeroPrograma = (int)(Math.random() * aux + menor + 1);
        }
        break;
        
      case 3:
        System.out.println("Muy bien, has adivinado el número.");
        break;
        }
       intentos--;
     } while ((intentos > 0) && (respuesta != 3));
     
     if (intentos == 0) && (respuesta != 3)) {
      System.out.println("Lo siento, has agotado tus intentos.");
    }
  }
}
  
        
        


  
  
