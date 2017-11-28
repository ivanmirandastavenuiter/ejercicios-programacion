/**
 * Ejercicio15
 * 
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    
    //Vamos a ir cumpliendo cada una de las condiciones que pide el programa:
    
    //a) Lo primero es crear un número aleatorio que comprenda de 1 a 7 
    //asociado con cada nota. 
    
    //b) Una melodía estará formada por un número aleatorio de notas mayor 
    //o igual a 4, menor o igual a 28 y siempre múltiplo de 4. Esto quiere
    //decir que el bucle ha de repetirse entre 4 y 28 veces y además tiene
    //que ser divisible por 4. Entonces hacemos un número aleatorio de 4 
    //a 28 y luego un if que compruebe si es múltiplo de 4. Si no lo es,
    //se repite el bucle hasta que lo sea, y entonces se sale. De este modo,
    //nos aseguramos de tener un número comprendido entre esas cifras y que
    //sea múltiplo de 4. 
    
    //c) Las barras que marcan fin de compás se pueden controlar mediante contadores.
    //Al llegar a 4 notas, se hace un if que compruebe si es múltiplo de 4
    //y que imprima la barra. Para las finales, comprobar que las iteraciones
    //se han acabado y entonces imprimirlas. 
    
    //Para hacer que la nota principal sea igual a la final: si hago un if contador == 1
    //y almaceno la nota en una variable, la puedo repetir al final de la secuencia
    //sustituyéndola por la que vendría por defecto. Esto se podría hacer 
    //restándole a las iteraciones de las notas un 1. Por ejemplo, si tengo 28,
    //se imprimirían 27 + la nota almacenada. 
    
    String primera = "do";
    int contador = 0;
    int iteraciones;

    do {
      iteraciones = (int)(Math.random() * 25 + 4);
    } while (iteraciones % 4 != 0);
    
    //Paso b realizado
    
    do {
    
      int nota = (int)(Math.random() * 7 + 1);
    
      switch (nota) {
        case 1:
          System.out.print(" do ");
          break;
        case 2:
          System.out.print(" re ");
          break;
        case 3:
          System.out.print(" mi ");
          break;
        case 4:
          System.out.print(" fa ");
          break;
        case 5:
          System.out.print(" sol ");
          break;
        case 6:
          System.out.print(" la ");
          break;
        case 7:
          System.out.print(" si ");
          break;
        }
          contador++;
          
          if (contador == 1) {
            int aux = nota;
            
              switch (aux) {
                case 1:
                  primera = " do ";
                  break;
                case 2:
                  primera = " re ";
                  break;
                case 3:
                  primera = " mi ";
                  break;
                case 4:
                  primera = " fa ";
                  break;
                case 5:
                  primera = " sol ";
                  break;
                case 6:
                  primera = " la ";
                  break;
                case 7:
                  primera = " si ";
                  break;
                }
              }
        
          if (iteraciones == 2) {
            System.out.print(primera + " ||");
          }
          
          //Paso d realizado
        
          if (contador % 4 == 0) {
            System.out.print(" | ");
          }
          
          //Paso c realizado
    
    //Paso a realizado
        
        iteraciones--;
      } while (iteraciones > 1);
    }
  }
  
