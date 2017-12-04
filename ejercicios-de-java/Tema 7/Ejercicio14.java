/**
 * Ejercicio14
 * 
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio14 {
  public static void main(String[] args) {
    
  int comprobador = 0;
  
  String[] colores = new String[9];
  
  colores[0] = "verde";
  colores[1] = "rojo";
  colores[2] = "azul";
  colores[3] = "amarillo";
  colores[4] = "naranja";
  colores[5] = "rosa";
  colores[6] = "negro";
  colores[7] = "blanco";
  colores[8] = "morado";
  
  String[] original = new String[8];
  
  System.out.println("Escribe 8 palabras seguidas: ");
  System.out.println();
  
  for (int i = 0; i < 8; i++) {
    original[i] = System.console().readLine();
  }
  
  String[] ordenado = new String[8];
  int posicion = 0;
  
  for (int i = 0; i < 8; i++) {
    
    for (int r = 0; r < 9; r++) {
      
      if ((original[i]).equals(colores[r])) {
        ordenado[posicion] = (original[i]);
        posicion++;
      }
    }
  }
  
  for (int i = 0; i < 8; i++) {
    
    comprobador = 0;
    
    for (int r = 0; r < 9; r++) {
      
      if ((original[i]).equals(colores[r])) {
        comprobador++;
      }
    } 
    
    if (comprobador == 0) {
      ordenado[posicion] = (original[i]);
      posicion++;
    }
  }
  
  System.out.println("\nArray original:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (int i = 0; i < 8; i++) {
      System.out.printf("│%-8s", original[i]);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  System.out.println();
  
  System.out.println("\nArray original:");
    System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for (int i = 0; i < 8; i++) {
      System.out.printf("│   %d    ", i);
    }
    System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");

    for (int i = 0; i < 8; i++) {
      System.out.printf("│%-8s", ordenado[i]);
    }
    System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
  }
}
 

  
  
    
    
  
  
    
    
        
    
    
    
    
    
    
  
  
  
  
  
  
