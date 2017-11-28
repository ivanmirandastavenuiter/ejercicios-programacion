/**
 * Ejercicio18
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio18 {
  public static void main(String[] args) {

  int contador = 0;
  int primerColor = 40;
  int segundoColor = 41;
  int tercerColor = 42;
  int color;
  int iteraciones = 3;
  
  System.out.println("Pulsa la tecla intro para ver la secuencia de colores que te toca: ");
  System.console().readLine();
  
  for (int i = 0; i < iteraciones; i++) {
    
    color = (int)(Math.random() * 6 + 1);
    
    if ((primerColor != segundoColor) && (segundoColor != tercerColor) && (primerColor != tercerColor) && (color != segundoColor) && (color != tercerColor) && (color != primerColor)) {
    
      switch (color) {
          case 1:
            System.out.print("rojo ");
            break;
          case 2:
            System.out.print("azul ");
            break;
          case 3:
            System.out.print("verde ");
            break;
          case 4:
            System.out.print("amarillo ");
            break;
          case 5:
            System.out.print("violeta ");
            break;
          case 6:
            System.out.print("naranja ");
            break;
          }
          contador++;
          
          if (contador == 1) {
            primerColor = color;
          } 
          if (contador == 2) {
            segundoColor = color;
          } 
          if (contador == 3) {
            tercerColor = color;
          }
        } else {
          iteraciones++;
        }
      }
    }
  } 
        
        
          
        
        
          

    
  
        
  
  
