/*
 * Realiza el juego de las tres en raya.
 */
package ejercicio07;

/**
 *
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    final String ROJO = "\033[41m";
    final String RESET = "\033[0m";
    String[][] tablero = new String[3][3];
    int coordenadaX = 0;
    String borde = " ";
    String casilla = "   ";
    String usuario = " ☭ ";
    String ordenador = " ✝ ";
    int indiceInferior;
    char letra = 'c';
    boolean ganadorPC = false;
    boolean ganadorJugador = false;
    boolean completo = false;
    int ordenadorX = 0;
    int ordenadorY = 0;
    int intentos = 0;
    int ganadorUsuario;
    int ganadorOrdenador;
    
    System.out.println("   JUEGO TRES EN RAYA");
    System.out.println();
    
    for (int a = 1; a < 8; a++) {
      
    // Línea completa.
      
    if (a % 2 != 0) {
      System.out.print("  ");
      for (int b = 0; b < 19; b++) {
        System.out.print(ROJO + borde + RESET);
      }
      System.out.println();
    
    // Línea con las casillas.
    
    } else {
        System.out.print(letra + " ");
        letra--;
        for (int b = 0; b < 3; b++) {
          System.out.print(ROJO + borde + RESET);
        }
        for (int b = 0; b < 3; b++) {
          tablero[coordenadaX][b] = casilla;
          if (b == 2) {
            System.out.print(tablero[coordenadaX][b] + ROJO + "   " + RESET);
          } else {
            System.out.print(tablero[coordenadaX][b] + ROJO + "  " + RESET);
          }
        }
        System.out.println();
        coordenadaX++;
      }
    }
    
    // Índice inferior.
    
    for (int a = 0; a < 6; a++) {
      System.out.print(" ");
    }
    for (int a = 1; a < 4; a++) {
      System.out.print(a + "    ");
    }
    System.out.println();
    
    // Bucle reiterativo que repite el proceso hasta tener una salida coherente.
    
    do {
    System.out.println("Introduce las coordenadas: ");
    System.out.println();
    String posicionUsuario = sc.nextLine();
    
    letra = 'c';
    for (int a = 0; a < 3; a++) {
      indiceInferior = 1;
      for (int b = 0; b < 3; b++) {
        if (posicionUsuario.equals(String.valueOf(letra) + (indiceInferior))) {
          switch (tablero[a][b]) {
            case "   ":
              if (intentos == 8) {
                tablero[a][b] = usuario;
                intentos++;
                if(intentos == 9) {
                  completo = true;
                }
              } else {
                tablero[a][b] = usuario;
              do {
                ordenadorX = (int)(Math.random() * 3);
                ordenadorY = (int)(Math.random() * 3);
              } while (tablero[ordenadorX][ordenadorY].equals(ordenador) || 
                tablero[ordenadorX][ordenadorY].equals(usuario));
                tablero[ordenadorX][ordenadorY] = ordenador;
                intentos += 2;
              }
              break;
            case " ☭ ":
              System.out.println("Esa posición ya la has ocupado puto imbécil. Concéntrate! Piensa en el puto Rafael Hernando!");
              break;
            case " ✝ ":
              System.out.println("Acabas de toparte con Esperanza Aguirre de frente. Huye.");
              break;
          }
        }
        indiceInferior++;
      }
       letra--;
    }
 
    letra = 'c';
    coordenadaX = 0;
    
    // Líneas completas.
    
    for (int a = 1; a < 8; a++) {
    if (a % 2 != 0) {
      System.out.print("  ");
      for (int b = 0; b < 19; b++) {
        System.out.print(ROJO + borde + RESET);
      }
      System.out.println();
    
    // Línea con las casillas.
    
    } else {
        System.out.print(letra + " ");
        letra--;
        for (int b = 0; b < 3; b++) {
          System.out.print(ROJO + borde + RESET);
        }
        for (int b = 0; b < 3; b++) {  
          if (b == 2) {
            System.out.print(tablero[coordenadaX][b] + ROJO + "   " + RESET);
          } else {
            System.out.print(tablero[coordenadaX][b] + ROJO + "  " + RESET);
          }
        }
        System.out.println();
        coordenadaX++;
      }
    }
    
    // Índice inferior.
    
    for (int a = 0; a < 6; a++) {
      System.out.print(" ");
    }
    for (int a = 1; a < 4; a++) {
      System.out.print(a + "    ");
    }
    System.out.println();
    
    // Comprobación horizontal.
    
    for (int a = 0; a < 3; a++) {
      ganadorUsuario = 0;
      ganadorOrdenador = 0;
      for (int b = 0; b < 3; b++) {
        switch (tablero[a][b]) {
            case " ☭ ":
              ganadorUsuario++;
              break;
            case " ✝ ":
              ganadorOrdenador++;
              break;
        }
        if (ganadorUsuario == 3) {
          ganadorJugador = true;
        } else if (ganadorOrdenador == 3) {
          ganadorPC = true;
        } 
      }
    }
    
    // Comprobación vertical.
    
    for (int a = 0; a < 3; a++) {
      ganadorUsuario = 0;
      ganadorOrdenador = 0;
      for (int b = 0; b < 3; b++) {
        switch (tablero[b][a]) {
            case " ☭ ":
              ganadorUsuario++;
              break;
            case " ✝ ":
              ganadorOrdenador++;
              break;
        }
        if (ganadorUsuario == 3) {
          ganadorJugador = true;
        } else if (ganadorOrdenador == 3) {
          ganadorPC = true;
        } 
      }
    }
    
    // Diagonal hacia la derecha
    
    ganadorUsuario = 0;
    ganadorOrdenador = 0;
    for (int a = 0; a < 3; a++) {
      switch (tablero[a][a]) {
            case " ☭ ":
              ganadorUsuario++;
              break;
            case " ✝ ":
              ganadorOrdenador++;
              break;
      }
        if (ganadorUsuario == 3) {
          ganadorJugador = true;
        } else if (ganadorOrdenador == 3) {
          ganadorPC = true;
        } 
      }
    
    // Diagonal hacia la izquierda 
    
    ganadorUsuario = 0;
    ganadorOrdenador = 0;
    int b = 2;
    for (int a = 0; a < 3; a++) { 
      switch (tablero[a][b]) {
            case " ☭ ":
              ganadorUsuario++;
              break;
            case " ✝ ":
              ganadorOrdenador++;
              break;
      }
      if (ganadorUsuario == 3) {
        ganadorJugador = true;
      } else if (ganadorOrdenador == 3) {
        ganadorPC = true;
      } 
      b--;
     }
    } while (!ganadorPC && !completo && !ganadorJugador);
     
     if (ganadorPC == ganadorJugador) {
       System.out.println("Las fuerzas del bien y el mal terminan en empate.");
     } else if (ganadorPC && !ganadorJugador) {
       System.out.println("Parece que el ordenador te ha dejado calentito.");
     } else if (ganadorJugador && !ganadorPC) {
       System.out.println("Ole, has ganado.");
     } else if (completo && !ganadorPC && !ganadorJugador) {
       System.out.println("La partida termina sin ganador. No existen más casillas.");
     }
  }
}
