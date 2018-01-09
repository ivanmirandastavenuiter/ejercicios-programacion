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
  
// Se declaran las variables absolutas.
  
static final int VACIO = 0;
static final int MINA = 1;
static final int TESORO = 2;
static final int INTENTO = 3;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] tablero = new int[4][5];
    int fila;
    int columna;
    
    // Se inicializa el array completamente vacío. Todas las casillas tendrán
    // valor 0.
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        tablero[fila][columna] = VACIO;
      }
    }
    
    // Ahora asignamos ubicación tanto a la mina como al tesoro. 
    
    // Empezamos por la mina.
    
    int filaMina = (int)(Math.random() * 4);
    int columnaMina = (int)(Math.random() * 5);
    tablero[filaMina][columnaMina] = MINA;
    
    // Ya hemos asignado una ubicación aleatoria para la mina. Ahora hacemos lo mismo
    // para el tesoro. Las posiciones no podrán ser iguales para mina y tesoro,
    // con lo que mediante un bucle do-while nos aseguramos de que los valores 
    // sean distintos. Por lo demás, es todo igual.
    
    // Se declaran las variables.
    
    int filaTesoro;
    int columnaTesoro;
    
    // Hacemos el bucle.
    
    do {
      filaTesoro = (int)(Math.random() * 4);
      columnaTesoro = (int)(Math.random() * 5);
    } while ((filaMina == filaTesoro) && (columnaMina == columnaTesoro));
    
    // Con los valores distintos, igualamos a TESORO.
    
    tablero[filaTesoro][columnaTesoro] = TESORO;
    
    // NOTA: Una buena manera de comprobar que las asignaciones se han realizado
    // correctamente es recorrer todo el array imprimiendo cada valor. Así se observa
    // de forma muy gráfica si cada elemento está en el lugar que le corresponde.
    
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
    
    // Vamos a crear un booleano que se llame salir. Más adelante se explica.
    
    boolean salir = false;
    boolean datosCorrectos = true;
    
    do {
      
    // El do-while sirve para repetir la operación siempre que no se encuentre 
    // o bien mina o bien tesoro. De lo contrario, el programa finaliza.
    
    // Primero imprimimos el tablero. Las variables VACIO, MINA y TESORO imprimirán
    // un espacio puesto que no se deben mostrar. En caso de leer un intento, imprime
    // una X.
    
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
      
      // Tras pedir la información por teclado, el proceso es sencillo: si ha dado
      // con una casilla vacía, se convierte en intento y en la siguiente pasada
      // lo lee como tal; si lee mina, imprime el mensaje correspondiente y sale
      // del bucle; si lee tesoro, igual que mina pero con mensaje distinto; si
      // por último lee intento, avisa al usuario de que esa casilla ya se rellenó
      // antes. Es aquí donde toma significado el booleano. El if, además, se encarga
      // de comprobar si los datos son correctos.
      
      // ADEMÁS: Hacemos un sistema para numerar las casillas y localizar mediante contadores
      // la mina. Esto nos permitirá más tarde indicar si la mina está a una casilla
      // de distancia o no.
    
      int contadorMina = 0;
    
      for (fila = 0; fila <= filaMina; fila++) {
        if (fila == filaMina) {
          for (columna = 0; columna <= columnaMina; columna++) {
            contadorMina++;
          }
        } else {
            for (columna = 0; columna < 5; columna++) {
              contadorMina++;
            }
          }
      }
   
      // Hacemos lo mismo con la posición. Calculando el valor de estos dos contadores
      // podemos ver si la mina está cerca de la posición del usuario o no.
   
      int contadorPosicion = 0;
    
      for (fila = 0; fila <= filaUsuario; fila++) {
        if (fila == filaUsuario) {
          for (columna = 0; columna <= columnaUsuario; columna++) {
            contadorPosicion++;
          }
        } else {
            for (columna = 0; columna < 5; columna++) {
              contadorPosicion++;
            }
          }
      }
      
      if ((filaUsuario < 4) && (columnaUsuario < 5)) {
        
        switch (tablero[filaUsuario][columnaUsuario]) {
          case VACIO:
            
            // Probablemente existan numerosas maneras de resolver este ejercicio.
            // En este caso, hemos tomado como referencia los múltiplos de 5. ¿Por qué?
            
            // Lo primero que tenemos que pensar es qué condiciones han de cumplirse
            // para la comprobación. La condición es que la mina esté a una casilla de 
            // distancia. Eso quiere decir arriba, abajo, izquierda, derecha. Modificar
            // los parámetros de los índices normalmente da problemas por los límites.
            // En este caso, como método alternativo, hemos tomado dos contadores que
            // numeran cada casilla: de 1 a 20. A partir de sus valores y las diferencias
            // podremos ver si la mina está cerca o no. 
            
            // Si la diferencia es 5, estára o bien arriba o abajo. Si es uno, izquierda
            // o derecha. La única excepción es si un valor está en la primera columna
            // y otro en la última. Aquí las diferencias pueden ser de 1 y no estar
            // la posición junto a la mina. 
            
            tablero[filaUsuario][columnaUsuario] = INTENTO;
            
            // Casos de la última columna.
            
            if ((contadorPosicion % 5 == 0) && (contadorMina % 5 != 0)) {
                if (contadorPosicion - contadorMina == 1) {
                  System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                }
            } else if ((contadorPosicion % 5 != 0) && (contadorMina % 5 == 0)) {
                if (contadorMina - contadorPosicion == 1) {
                  System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                }
            } else if ((contadorPosicion % 5 == 0) && (contadorMina % 5 == 0)) {
                if ((contadorMina - contadorPosicion == 5) || (contadorPosicion - contadorMina == 5)) {
                  System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                }
                
            // Resto de columnas.
            
            } else {
                if (contadorMina - contadorPosicion == 1) {
                    System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                } else if (contadorPosicion - contadorMina == 1) {
                    System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                } else if (contadorPosicion - contadorMina == 5) {
                    System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                } else if (contadorMina - contadorPosicion == 5) {
                    System.out.println("¡Cuidado! ¡Tienes una mina cerca!");
                }
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
    
    // Esta es la última impresión en caso de perder o ganar, mostrando tanto la mina,
    // como tesoro e intentos.
    
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

