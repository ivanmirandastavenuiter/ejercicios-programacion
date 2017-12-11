/**
 * Realiza un programa que pinte un degradado por pantalla de arriba hacia abajo hecho con asteriscos.
 * Se pide al usuario la anchura del degradado, a continuación se debe pintar una línea continua hecha
 * de asteriscos. En la siguiente línea habrá un hueco en una posición aleatoria; en la siguiente, dos
 * huecos también colocados aleatoriamente... así hasta la última línea en la que habrá un único
 * asterisco.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Degradado {
  public static void main(String[] args) {
    
    System.out.println("Seleccione la altura:  ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int[] n = new int[altura];
    boolean distinto = true;
    int indice = 0;
    int limite = 0;
    
    for (int d = 0; d < altura; d++) {
      
      indice = 0;
      
      // Este do while se encarga de cargar un array con posiciones aleatorias
      // que nunca se repiten. Este paso es clave, ya que al tratarse de 
      // números aleatorios, es más que probable que se repitan, sobre todo
      // por el estrecho margen entre 0 y la altura que se introduzca.
    
      do {
      
        distinto = true;
        
        // La variable indice se inicia en 0. El número aleatorio discurrirá
        // entre 0 y la anchura  - 1, ya que la última línea tendrá un asterisco.
        // La primera celda del array la rellenamos directamente, puesto que 
        // no hay ningún valor anterior con el cual compararlo. Sin embargo,
        // al incrementar indice, ya tenemos que comprobar si el nuevo número
        // generado es igual o no a alguna de las celdas anteriores.
        // Si lo es, el booleano distinto se pasa a false y no se almacena nada.
        // Este ciclo se repetirá hasta que todo el array se complete, algo que 
        // no ocurrirá hasta que todos los números sean distintos.
      
        n[indice] = (int)(Math.random() * altura);
      
          if (indice > 0) {
          
            for (int r = 0; r < indice; r++) {
          
              if (n[r] == n[indice]) {
                distinto = false;
                }
              }
          }
      
          if (distinto == true) {
            indice++;
          }
      } while (indice < altura);
      
      // Aquí termina el comprobador de números distintos. Ahora bien, lo idóneo
      // es actualizar y generar una nueva disposición del array a cada vuelta.
      // Se hace así porque de otro modo, al pintar los caracteres, las posiciones
      // de los espacios estarían siempre en el mismo lugar. Así nos aseguramos
      // de que los espacios sean aleatorios en cada una de las líneas, además
      // de diferentes.
    
    
      for (int i = 0; i < altura - limite; i++) {
        
        // La condición será altura - limite (espacios pintados), lógicamente,
        // debido a que a cada espacio pintado, habrá que compensar con un asterisco 
        // menos.
      
        for (int r = 0; r < limite; r++) {
          
          // Este for controla los espacios que se pintan. Al ser limite la condición
          // y aumentarse esta una unidad a cada pasada, r avanzará en el array
          // tantas celdas como unidades haya de 0 al valor de limite. Esto quiere
          // decir que si limite vale 3, los valores de 0, 1 y 2 en el array contendrán
          // tres valores que se corresponderán con tres posiciones, y que habrán
          // de coincidir, por fuerza, con i en algún momento. Será entonces
          // cuando se imprima el espacio.
          
          if (n[r] == i) {
            System.out.print(" ");
            }
          }
        System.out.print("*");
      }
      
      // Todo se engloba dentro de otro for que imprime tantas líneas como altura se haya 
      // introducido.
      
      limite++;
      System.out.println();
    }
  }
}


      
    
    
    
    
    
    

      
      
      
      
      
      
      
      

    
    
    
    
    
    
    
        
      
      
      
      
      
      
          
          
          
          
          
          
          
    
    
    
    
    
    
    
    
    
    
    
  
