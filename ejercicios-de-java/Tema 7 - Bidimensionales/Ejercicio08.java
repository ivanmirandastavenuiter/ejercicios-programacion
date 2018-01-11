/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
 * indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
 * 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
 * se indican del 1 al 8. 
 */

package ejercicio08;

/**
 *
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    final String ROJO  = "\033[41m";
    final String AMARILLO = "\033[43m";
    final String RESET = "\033[0m";
    String[][] tablero = new String[10][10];
    int[][] colores = new int[10][10];
    String casilla = "   ";
    String movimiento = "\033[30m" + " * ";
    int casillasPosibles = 0;
    
    // Pintamos el tablero
    
    System.out.print("   a  b  c  d  e  f  g  h \n");
    
    for (int a = 8; a >= 1; a--) {
      System.out.print(a + " ");
      for (int b = 1; b < 9; b++) {
        if (a % 2 == 0) {
          if (b % 2 == 0) {
            System.out.print(ROJO + "   " + RESET);
            tablero[a][b] = ROJO + casilla + RESET;
            colores[a][b] = 1;
          } else {
            System.out.print(AMARILLO + "   " + RESET);
            tablero[a][b] = AMARILLO + casilla + RESET;
            colores[a][b] = 0;
          }
        }
        if (a % 2 != 0) {
          if (b % 2 == 0) {
            System.out.print(AMARILLO + "   " + RESET);
            tablero[a][b] = AMARILLO + casilla + RESET;
            colores[a][b] = 0;
          } else {
            System.out.print(ROJO + "   " + RESET);
            tablero[a][b] = ROJO + casilla + RESET;
            colores[a][b] = 1;
          }
        }
      }
      System.out.print(" " + a);
      System.out.println();
    }
    System.out.print("   a  b  c  d  e  f  g  h \n");
    
    //Encuentra la posición del alfil
    
    System.out.println("Introduce la posición del aflil: ");
    String posicionAlfil = sc.nextLine();
    int alfilX = 0;
    int alfilY = 0;
    char letra = 'a';
    for (int a = 1; a < 9; a++) {
      for (int b = 1; b < 9; b++) {
        if (posicionAlfil.equals(String.valueOf(letra) + (b))) {
          alfilX = b;
          alfilY = a;
          if (colores[a][b] == 1) {
            tablero[alfilX][alfilY] = ROJO + " ♝ " + RESET;
          } else {
            tablero[alfilX][alfilY] = AMARILLO + " ♝ " + RESET;
          }
        }
      }
        letra++;
    }    
    System.out.print("   a  b  c  d  e  f  g  h \n");
    
    int diagonalX = alfilX;
    int diagonalY = alfilY;
    
    // Superior izquierda
   
    while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
      diagonalX++;
      diagonalY--;
      tablero[diagonalX][diagonalY] = movimiento;
    } 
    diagonalX = alfilX;
    diagonalY = alfilY;
    
    // Superior derecha
    
    while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
      diagonalX++;
      diagonalY++;
      tablero[diagonalX][diagonalY] = movimiento;
    }
    diagonalX = alfilX;
    diagonalY = alfilY;

    // Inferior izquierda
    
    while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
      diagonalX--;
      diagonalY++;
      tablero[diagonalX][diagonalY] = movimiento;
    }
    diagonalX = alfilX;
    diagonalY = alfilY;
    
    // Inferior derecha
    
    while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
      diagonalX--;
      diagonalY--;
      tablero[diagonalX][diagonalY] = movimiento;
    }
    for (int a = 8; a >= 1; a--) {
      System.out.print(a + " ");
      for (int b = 1; b < 9; b++) {
        if (tablero[a][b].equals(movimiento)) {
          casillasPosibles++;
          if (colores[a][b] == 1) {
            System.out.print(ROJO + movimiento + RESET);
          } else {
            System.out.print(AMARILLO + movimiento + RESET);
          }
        } else {
          System.out.print(tablero[a][b]);
        }
      }
      System.out.print(" " + a);
      System.out.println();
    }
    System.out.print("   a  b  c  d  e  f  g  h \n");
    System.out.println("\nLas posiciones posibles son las siguientes: ");
    for (int a = 1; a < 9; a++) {
      letra = 'a';
      for (int b = 1; b < 9; b++) {
        if (tablero[a][b].equals(movimiento)) {
          System.out.print(String.valueOf(letra) + a + " ");
        }
        letra++;
      } 
    }
    System.out.println();
  }
}

    
   

       
