/**
 * Ejercicio17
 * 
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir
 * un número al usuario. Se debe comprobar que el número introducido por
 * teclado se encuentra dentro del array, en caso contrario se mostrará un
 * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
 * introduzca uno correctamente. A continuación, el programa rotará el array
 * hacia la derecha las veces que haga falta hasta que el número introducido
 * quede situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    
    int[] n = new int[10];
    int numero;

    System.out.println("\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
      for (int i = 0; i < 10; i++) {
        numero = (int)(Math.random() * 101);
        n[i] = numero;
        System.out.printf("│%4d ", n[i]);
      }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    System.out.println();
    System.out.println("Escribe un número de la secuencia y pulsa intro: ");
    System.out.println();
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    boolean correcto = false;
    
    do {
      
      for (int i = 0; i < 10; i++) {
        if (n[i] == numeroIntroducido) {
          correcto = true;
        }
      }
    
      if (correcto == false) {
        System.out.println("Ese número no está en la secuencia. Míralos bien e introduce otro:");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
      }
    } while (correcto == false);
    
    // El programa pide que cojas el número que ha pedido el usuario y lo rotes
    // las veces que haga falta hasta que ese número se coloque en la posición
    // 0 del array.
    
    // Pues hacemos un bucle que recorra el array hasta encontrar el número que
    // se haya introducido.
    
    // Una vez encontrado el número que coincide con el del usuario, guardas
    // ese valor en una variable para saber dónde empezar con el array que
    // queremos construir. Creamos ese array y lo iniciamos a 0. La clave 
    // del ejercicio es comenzar a almacenar en ese array auxiliar desde 
    // el número que se ha introducido. Si en el array original lo encuentras
    // en la celda n[2], el nuevo se construirá con n[2] como el valor n[0].
    // Le creas un contador al nuevo para que vaya contando las celdas y 
    // desplazas hasta el final, hasta el 9. 
    
    // Ya tienes casi listo el ejercicio. Luego tendrás que ver los números
    // que te faltan por la izquierda. Previamente, si igualas la posición
    // inicial a una variable, la puedes usar como limite. Tendrás que seguir
    // leyendo hasta justo antes de esa variable, siguiendo con la celda en la
    // que te quedaste previamente. Y listo.
    
    int[] rotado = new int[10];
    int celdasRotado = 0;
    int i;
    int posicionInicio = 0;
    boolean encontrado = false;
    
    for (i = 0; encontrado == false; i++) {
      
      if (n[i] == numeroIntroducido) {
        posicionInicio = i;
        encontrado = true;
      }
    }
    
    int limite = posicionInicio;
    
    for (int d = posicionInicio; d < 10; d++) {
      rotado[celdasRotado] = n[d];
      celdasRotado++;
    }
    
    for (int r = 0; r < limite; r++) {
      rotado[celdasRotado] = n[r];
      celdasRotado++;
    }
    
    System.out.println("\nArray final:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
      for (int r = 0; r < 10; r++) {
        System.out.printf("│%4d ", r);
      }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
      for (int r = 0; r < 10; r++) {
        System.out.printf("│%4d ", rotado[r]);
      }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}

    
  
    
    
    
        
   
      
    
    

