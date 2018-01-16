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
              System.out.println("Esa posición ya la has ocupado antes. Inténtalo otra vez.");
              break;
            case " ✝ ":
              System.out.println("Posición ocupada por las fuerzas oscuras. Repite tirada.");
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
   
    int ganaUsuarioHorizontal = 0;
    int ganaOrdenadorHorizontal = 0;
    int ganaUsuarioVertical = 0;
    int ganaOrdenadorVertical = 0;
    int diagonalIzquierdaUsuario = 0;
    int diagonalIzquierdaPC = 0;
    int diagonalDerechaUsuario = 0;
    int diagonalDerechaPC = 0;
    int auxiliarY;
    
    for (int a = 0; a < 3; a++) {
      ganaUsuarioHorizontal = 0;
      ganaOrdenadorHorizontal = 0;
      for (int b = 0; b < 3; b++) {
        ganaUsuarioVertical = 0;
        ganaOrdenadorVertical = 0;
        diagonalIzquierdaUsuario = 0;
        diagonalIzquierdaPC = 0;
        diagonalDerechaUsuario = 0;
        diagonalDerechaPC = 0;
        auxiliarY = 2;
        switch (tablero[a][b]) {
            case " ☭ ":
              ganaUsuarioHorizontal++;
              break;
            case " ✝ ":
              ganaOrdenadorHorizontal++;
              break;     
        }
        for (int c = 0; c < 3; c++) {
        switch (tablero[c][b]) {
            case " ☭ ":
              ganaUsuarioVertical++;
              break;
            case " ✝ ":
              ganaOrdenadorVertical++;
              break;     
        }
        }
        for (int d = 0; d < 3; d++) {
        switch (tablero[d][d]) {
            case " ☭ ":
              diagonalIzquierdaUsuario++;
              break;
            case " ✝ ":
              diagonalIzquierdaPC++;
              break;     
        }
        }
        for (int d = 0; d < 3; d++) {
        switch (tablero[d][auxiliarY]) {
            case " ☭ ":
              diagonalDerechaUsuario++;
              break;
            case " ✝ ":
              diagonalDerechaPC++;
              break;     
        }
        auxiliarY--;
        }
        if (ganaUsuarioHorizontal == 3 || ganaUsuarioVertical == 3 || diagonalIzquierdaUsuario == 3 || diagonalDerechaUsuario == 3)  {
          ganadorJugador = true;
        } else if (ganaOrdenadorHorizontal == 3 || ganaOrdenadorVertical == 3 || diagonalIzquierdaPC == 3 || diagonalDerechaPC == 3) {
          ganadorPC = true;
        } 
      }
    }
    } while (!ganadorPC && !completo && !ganadorJugador);
     
     if (ganadorPC == true && ganadorJugador == true) {
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
