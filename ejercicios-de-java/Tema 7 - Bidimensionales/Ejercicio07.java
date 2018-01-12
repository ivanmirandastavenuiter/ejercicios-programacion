/*
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
 * de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 */

package ejercicio07;

/**
 *
 * @author Iván Miranda
 */

import java.util.Scanner;
public class Ejercicio07 {
  
static final int VACIO = 0;
static final int MINA = 1;
static final int TESORO = 2;
static final int INTENTO = 3;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] tablero = new int[4][5];
    int fila;
    int columna;
    
    // Rellenas el tablero con todos sus valores en VACÍO.
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        tablero[fila][columna] = VACIO;
      }
    }
    
    // Asignas valores distintos tanto para mina como para tesoro.
    
    int filaMina = (int)(Math.random() * 4);
    int columnaMina = (int)(Math.random() * 5);
    tablero[filaMina][columnaMina] = MINA;
    
    int filaTesoro;
    int columnaTesoro;
    
    do {
      filaTesoro = (int)(Math.random() * 4);
      columnaTesoro = (int)(Math.random() * 5);
    } while ((filaMina == filaTesoro) && (columnaMina == columnaTesoro));
    
    tablero[filaTesoro][columnaTesoro] = TESORO;
    
    System.out.println("BIENVENIDO - JUEGO BUSCA EL TESORO");
    System.out.println();
    System.out.println("Instrucciones: ");
    System.out.println();
    System.out.println("Teniendo en cuenta que la variable x representará las filas");
    System.out.println("y la y las columnas, introduce la información correspondiente");
    System.out.println("para encontrar el tesoro... o la mina.");
    System.out.println("Observa que no se pueden sobrepasar los límites establecidos");
    System.out.println("en el tablero.");
    System.out.println();

    boolean salir = false;
    boolean datosCorrectos = true;
    
    // Se imprime el tablero.
    
    do {
      
      for (fila = 3; fila >= 0; fila--) {
        System.out.printf("%1d %2s", fila, "| ");
          for (columna = 0; columna < 5; columna++) {
          
            switch (tablero[fila][columna]) {
              case VACIO:
                System.out.print("  ");
                break;
              case MINA:
                System.out.print("  ");
                break;
              case TESORO:
                System.out.print("  ");
                break;
              case INTENTO:
                System.out.print("X ");
                break;
            }
          }
        System.out.println();
      }
    
      System.out.printf("%2s", " ");
      System.out.print("-----------\n");
      System.out.printf("%4s", " ");
    
      for (columna = 0; columna < 5; columna++) {
        System.out.print(columna + " ");
      }
      System.out.println();
      System.out.println("Introduce la coordenada x: ");
      int filaUsuario = sc.nextInt();
      System.out.println("Introduce la coordenada y: ");
      int columnaUsuario = sc.nextInt();
      
      
      if ((filaUsuario < 4) && (columnaUsuario < 5)) {
        
        switch (tablero[filaUsuario][columnaUsuario]) {
          case VACIO:
            
            // Para comprobar si hay una mina cerca o no, se comparan los valores de 
            // mina y tesoro. En caso de haber solo una casilla de distancia entre una
            // y otra, saldrá el mensaje de aviso. NOTA: para no sobrepasar los límites
            // del array es necesario usar Math.abs.
            
            tablero[filaUsuario][columnaUsuario] = INTENTO;
            if (Math.abs(filaUsuario - filaMina) == 0 && Math.abs(columnaUsuario - columnaMina) == 1) {
              System.out.println("Cuidado, tienes una mina cerca.");
            } else if (Math.abs(filaUsuario - filaMina) == 1 && Math.abs(columnaUsuario - columnaMina) == 0) {
              System.out.println("Cuidado, tienes una mina cerca.");
            } else if (Math.abs(filaUsuario - filaMina) == 1 && Math.abs(columnaUsuario - columnaMina) == 1) {
              System.out.println("Cuidado, tienes una mina cerca.");
            }
            break;
          case MINA:
            System.out.println("Lo siento, parece que una mina te ha reventado.");
            salir = true;
            break;
          case TESORO:
            System.out.println("Enhorabuena, has encontrado el tesoro!");
            salir = true;
            break;
          case INTENTO:
            System.out.println("Ya has intentado antes esta casilla. Inténtalo de nuevo.");
            break;
        }
      } else {
        datosCorrectos = false;
        System.out.println("Parece que has introducido mal algún dato. Inténtalo de nuevo.");
        salir = true;
      }
    } while (salir == false);

    if (datosCorrectos == true) {
    
      for (fila = 3; fila >= 0; fila--) {
        System.out.printf("%1d %2s", fila, "| ");
          for (columna = 0; columna < 5; columna++) {
          
            switch (tablero[fila][columna]) {
              case VACIO:
                System.out.print("  ");
                break;
              case MINA:
                System.out.print("* ");
                break;
              case TESORO:
                System.out.print("€ ");
                break;
              case INTENTO:
                System.out.print("X ");
                break;
            }
          }
        System.out.println();
      }
    
      System.out.printf("%2s", " ");
      System.out.print("-----------\n");
      System.out.printf("%4s", " ");
    
      for (columna = 0; columna < 5; columna++) {
        System.out.print(columna + " ");
      }
    }
  }
}

