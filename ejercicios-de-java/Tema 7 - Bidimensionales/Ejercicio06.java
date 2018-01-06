/*
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 */

package ejercicio06;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    int[][] a = new int[6][10];
    int numero;
    int maximo = 0;
    int minimo = 1001;
    int fila;
    int columna;
    int filaRecorrido;
    int columnaRecorrido;
    boolean distinto = true;
    
    System.out.printf("%6s", " ");
    
    for(columna = 0; columna < 10; columna++) {
      System.out.printf("%10s %2d", "Columna", columna);
    }
    System.out.println();
    
    for (fila = 0; fila < 6; fila++) {
      System.out.printf("%5s %1d", "Fila:", fila);
        for(columna = 0; columna < 10; columna++) {
        
        // Rellenamos el array con números aleatorios en cada una de las casillas.
        
        numero = (int)(Math.random() * 1001);
        distinto = true;
        
        // A continuación, mediante un booleano, comprobamos si el números está ya
        // almacenado o no. Para ello, realizamos otros dos bucles que recorran el 
        // array comprobando cada valor. Habrá que tener en cuenta si estamos en una
        // fila anterior o en la misma, ya que en cada caso los límites de las columnas
        // serán diferentes.
        
          for (filaRecorrido = 0; filaRecorrido <= fila; filaRecorrido++) {
            if (fila == filaRecorrido) {
             for(columnaRecorrido = 0; columnaRecorrido < columna; columnaRecorrido++) {
               if (a[filaRecorrido][columnaRecorrido] == numero) {
                  distinto = false;
               }
             }
            } else {
                for(columnaRecorrido = 0; columnaRecorrido < 10; columnaRecorrido++) {
                  if (a[filaRecorrido][columnaRecorrido] == numero) {
                    distinto = false;
                  }
                }
              }
           }
          
          // Habiendo obtenido el resultado, si distinto es true, almacenamos el número
          // y avanzamos a la siguiente casilla. De lo contrario, el proceso se repite.
            
          if (distinto == true) {
            a[fila][columna] = numero;
            System.out.printf("%3s %4d %4s", " ", numero, " ");
            if (numero > maximo) {
              maximo = numero;
            } 
            if (numero < minimo) {
              minimo = numero;
            }
          } else {
              columna--;
            }
        }
        System.out.println();
    }
              
    System.out.println();
    
    for (fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        if (a[fila][columna] == maximo) {
          System.out.print("El máximo número localizado se encuentra en ");
          System.out.println("la fila " + fila + ", columna " + columna);
        } else if (a[fila][columna] == minimo) {
          System.out.print("El mínimo número localizado se encuentra en ");
          System.out.println("la fila " + fila + ", columna " + columna);
        }
      }
    }
    System.out.println();
    System.out.printf("%6s", " ");
    
    for(columna = 0; columna < 10; columna++) {
      System.out.printf("%10s %2d", "Columna", columna);
    }
    System.out.println();
    
    for (fila = 0; fila < 6; fila++) {
      System.out.printf("%5s %1d", "\033[30mFila:", fila);
      for(columna = 0; columna < 10; columna++) {
        
        // Señalamos máximo y mínimo.
      
        if (a[fila][columna] == maximo) {
          System.out.printf("%2s %1s %4d %-4s", " ", "\033[31m", a[fila][columna], "!");
        } else if (a[fila][columna] == minimo) {
          System.out.printf("%2s %1s %4d %-4s", " ", "\033[31m", a[fila][columna], "!");
        } else {
          System.out.printf("%2s %1s %4d %4s", " ", "\033[30m", a[fila][columna], " ");
        }
      }
      System.out.println();
    }
  }
}


 
    

    