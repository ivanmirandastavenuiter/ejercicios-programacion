/**
 * Ejercicio15
 * 
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 * personas como máximo e intente de nuevo”. Para el grupo que llega,
 * se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
 * libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
 * grupo es de dos personas, se podrá colocar donde haya una o dos personas.
 * Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
 * vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 * Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
 * funcionamiento del programa se ilustra a continuación:
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio15 {
  public static void main(String[] args) {
  
  // Vamos a ir desgranando el programa línea por línea del enunciado:
  
  // Las mesas tendrán como mínimo 0 y como máximo 4 personas. En caso de
  // ser mayor a 4, se mostrará un mensaje de error.
  
  // Siempre tendrá preferencia, una vez se responda, aquellas celdas del array
  // que valgan 0. Si no hay ninguna que valga 0, se comprueba si hay hueco
  // en las mesas ocupadas para las personas que entran.
  
  // Las mesas se cargarán con números aleatorios.
  
  // La primera línea debe mostrar el estado original de las mesas.
  
  int mesa;
  int[] ocupaciones = new int[11];
  boolean ocupada = false;
  boolean mesaVacia = false;
  boolean haySitio = true;
  int disponibilidad = 0;
  int plazasDisponibles;
  
  
  System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│Mesa nº: ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d ", i);
      }
      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│Ocupación");
      for (int i = 1; i < 11; i++) {
        mesa = (int)(Math.random() * 5);
        ocupaciones[i] = mesa;
        System.out.printf("│ %2d ", mesa);
      }
      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    
  // Ahora es cuando el programa pregunta cuántos comensales son.
  
  System.out.println("¿Cuántos son? ");
  int comensales = Integer.parseInt(System.console().readLine());
  
  // Lo primero es discriminar entre los distintos casos (hacer un switch) que pueden darse.
  
  // Si son 4 comensales: una mesa de 0. En caso de no haberla, mensaje de error.
  
  // Si son 3 comensales: una mesa de 0 o de 1. En caso de no haberla error. 
  // En caso de haber una persona, mensaje indicando que esa mesa será compartida.
  
  // Si son 2 comensales: una mesa de 0, 1 o 2 personas. Si 1 o 2, indicando
  // que será compartida.
  
  // Si es 1 comensal: una mesa de 0, 1, 2 o 3 personas. Si hay ya gente,
  // se indica que es compartida. 
  
  // Dividimos en casos para facilitar la división según comensales:
  
  switch (comensales) {
    case 1:
        
        // El programa pide que, en caso de haber mesas vacías, pongamos 
        // allí a los comensales, aunque haya hueco en anteriores. Entonces,
        // recorremos el array en busca del cero y con un booleano avisamos
        // en caso de haberlo. Si lo hay, ponemos en esa mesa al/los clientes.
        
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
        // La mesa está vacía. Pero necesitamos otro booleano para que, 
        // una vez colocada, no repita el proceso en caso de haber más ceros.
        // Así, en el momento de hacer la colocación, el booleano cambia y
        // ya no tenemos la condición para que el bucle se repita.
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntese en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
        // Lo siguiente que nos podemos encontrar es que no haya mesas vacías.
        // Entonces, por cada celda, deberemos comprobar si hay hueco o no
        // según los comensales que quieren entrar.
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
        // Este if lo que hace es asegurarse de la existencia de plazas en la
        // mesa. Si la resta de las posibles menos las ocupadas es igual o 
        // mayor al número de comensales, entonces ejecutamos.
            
            if (plazasDisponibles >= 1) {
              ocupaciones[i] += 1;
              ocupada = true;
              System.out.println("Tendrá que compartir mesa. Siéntese en la mesa número " + i + ".");
              } else {
                disponibilidad++;
                // Este contador lo que hace es comprobar si no ha habido sitio en ninguna de 
                // las mesas. Como la condición para que el programa tome este camino es 
                // que no haya sitio, si se da 10 veces, quiere decir 10 mesas. Esto indicará
                // que no hay sitio en todo el restaurante.
              }
            }
          }
      break;
    case 2:
      
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntense en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 2) {
              ocupaciones[i] += 2;
              ocupada = true;
              System.out.println("Tendrán que compartir mesa. Siéntense en la mesa número " + i + ".");
              } else {
                disponibilidad++;
              }
            }
          }
      break;
    case 3:
    
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntense en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 3) {
              ocupaciones[i] += 3;
              ocupada = true;
              System.out.println("Tendrán que compartir mesa. Siéntense en la mesa número " + i + ".");
              } else {
                disponibilidad++;
              }
            }
          }
      break;
    case 4:
        
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntense en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 4) {
              ocupaciones[i] += 4;
              ocupada = true;
              } else {
                disponibilidad++;
              }
            }
          }
      break;
    default:
      System.out.println("Lo siento, no admitimos grupos de " + comensales + " personas.");
      System.out.println("Haga grupos de 4 personas como máximo e inténtelo de nuevo.");
      break;
    }
    
    if (comensales <= 4) {
      
      if (disponibilidad == 10) {
        System.out.println("Lo siento, en estos momentos no queda sitio.");
        } else {
      
          System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
          System.out.print("│Mesa nº: ");
            for (int i = 1; i < 11; i++) {
              System.out.printf("│ %2d ", i);
            }
          System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
          System.out.print("│Ocupación");
            for (int i = 1; i < 11; i++) {
              System.out.printf("│ %2d ", ocupaciones[i]);
            }
          System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
        }
      }
    }
  }
    


 

  
  
      
  
  
  
  
  
  
  
