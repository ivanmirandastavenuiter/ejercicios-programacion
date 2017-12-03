/**
 * Ejercicio12
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de
 * la posición inicial en la posición final, rotando el resto de números para que no
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
    int[] n = new int[10];
    int numero;
    int origen;
    int destino;
    int auxOrigen;
    int auxDestino;
    int limite;
    
    System.out.println("Este programa cambia la posición en la tabla.");
    System.out.println("En primer lugar, introduce 10 números seguidos: ");
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      numero = Integer.parseInt(System.console().readLine());
      n[i] = numero;
    }

    System.out.println("\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    System.out.println();
    System.out.println("Introduce la posición del número que quieras cambiar: ");
    origen = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Introduce la posición en la que lo quieres colocar: ");
    destino = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    auxOrigen = n[origen];
    auxDestino = n[destino];
    limite = destino;
    
    if ((origen < destino) && (origen >= 0) && (origen <= 9) && (destino >= 0) && (destino <= 9)) {
      
      do {
        n[origen] = n[origen + 1];
        origen++;
      } while (origen < destino);
      
      do {
        if (destino == 9) {
        n[destino] = auxOrigen;
        auxOrigen = auxDestino;
        auxDestino = n[0];
        destino++;
      } else { 
        n[destino] = auxOrigen;
        auxOrigen = auxDestino;
        auxDestino = n[destino + 1];
        destino++;
        }
      } while (destino <= 9);
      
      destino = 0;
      
      do {
        n[destino] = auxOrigen;
        auxOrigen = auxDestino;
        auxDestino = n[destino + 1];
        destino++;
        
      } while (destino < limite);
      
      System.out.println("\nArray final:");
      System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
      System.out.print("│ Valor  ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", n[i]);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    } else {
      System.out.println("Parece que alguno de los datos no es correcto. Míralos de nuevo.");
    }
  }
}
  
    
    
    
    
