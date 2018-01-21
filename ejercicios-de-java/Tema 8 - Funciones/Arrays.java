
package funciones;

/**
 *
 * @author Iván Miranda
 */
public class Arrays {
 
  /* 
  * Ejercicio 20
  *
  * Genera un array de tamaño n con números aleatorios
  * cuyo intervalo (mínimo y máximo) se indica como parámetro.
  *  
  * @param a es el tamaño del array.
  * @param b es el mínimo de los intervalos.
  * @param c es el máximo de los intervalos. 
  * @return devuelve el array generado.
  */
  public static int[] generaArrayInt(int tamaño, int minimo, int maximo) {

    int[] n = new int[tamaño];
    int cantidadNumeros = (maximo - minimo) + 1;
  
    for (int a = 0; a < n.length; a++) {
      n[a] = (int)(Math.random() * cantidadNumeros + minimo);
    }
    return n;
  }
  
  /* 
  * Ejercicio 20
  *
  * Recorre el array previamente generado por la función generaArrayInt.
  *  
  * @param n[] es el array que se toma como parámetro.
  */
  public static void muestraArrayInt(int n[]) {
    
    for (int a : n) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
  
  /* 
  * Ejercicio 21
  *
  * Muestra el menor de los valores contenidos en el array.
  *  
  * @param n[] es el array que se toma como parámetro.
  * @return devuelve el menor generado.
  */
  public static int minimoArrayInt(int n[]) {
    
    int menor = 999999;
    
    for (int a : n) {
      if (a < menor) {
        menor = a;
      }
    }
    return menor;
  }
  
  /* 
  * Ejercicio 22
  *
  * Muestra el mayor de los valores contenidos en el array.
  *  
  * @param n[] es el array que se toma como parámetro.
  * @return devuelve el mayor generado.
  */
  public static int maximoArrayInt(int n[]) {
    
    int mayor = 0;
    
    for (int a : n) {
      if (a > mayor) {
        mayor = a;
      }
    }
    return mayor;
  }
  
  /* 
  * Ejercicio 23
  *
  * Devuelve la media del array que se pasa como parámetro.
  *  
  * @param n[] es el array que se toma como parámetro.
  * @return devuelve la media de los valores contenidos.
  */
  public static double mediaArrayInt (int n[]) {
    
    double suma = 0;
    double media;
    
    for (int a : n) {
      suma += a;
    }
    media = suma / n.length;
    return media;
  }
  
  /* 
  * Ejercicio 24
  *
  * Dice si un número está o no dentro de un array.
  *  
  * @param n[] es el array que se toma como parámetro.
  * @param d es el número a buscar dentro del array.
  * @return dice si un número está o no dentro de un array.
  */
  public static String estaEnArrayInt (int n[], int d) {
    
    boolean encontrado = false;
    String respuesta;
    
    for (int a : n) {
      if (a == d) {
        encontrado = true;
      }
    }
    
    if (encontrado) {
      respuesta = "El número " + d + " se encuentra dentro del array.";
    } else {
      respuesta = "El número " + d + " no se encuentra dentro del array.";
    }
    return respuesta;
  }
  
  /* 
  * Ejercicio 25
  *
  * Busca un número en un array y devuelve la posición
  * (el índice) en la que se encuentra.
  *  
  * @param n[] es el array que se toma como parámetro.
  * @param e es el número que se busca.
  * @return dice la posición del array en la que se encuentra un número.
  */
  public static String posicionEnArray (int n[], int e) {
    
    boolean encontrado = false;
    String respuesta;
    int posicion = 0;
    
    for (int a = 0; a < n.length; a++) {
      if (n[a] == e) {
        encontrado = true;
        posicion = a;
      }
    }
    
    if (encontrado) {
      respuesta = "El número " + e + " se encuentra en la posición " + posicion;
    } else {
      respuesta = "El número " + e + " no se encuentra dentro del array.";
    }
    return respuesta;
  }
  
  /* 
  * Ejercicio 26
  *
  * Le da la vuelta a un array.
  *  
  * @param n[] es el array que se toma como parámetro.
  * @return devuelve el array al revés.
  */
  public static int[] volteaArrayInt (int n[]) {
    
    int[] volteado = new int[n.length];
    int indiceVolteado = volteado.length - 1;
    
    for (int a : n) {
      volteado[indiceVolteado] = a;
      indiceVolteado--;
    }
    return volteado;
  }
 
  /* 
  * Ejercicio 27
  *
  * Rota n posiciones a la derecha los números de un array.
  * 
  * @param n[] es el array que se toma como parámetro.
  * @param f es la cantidad de rotaciones que se quiere realizar.
  * @return devuelve el array rotado.
  */
  public static int[] rotaDerechaArrayInt (int n[], int f) {
    
    int[] rotadoDerecha = new int[n.length];
    
    for (int a : n) {
      rotadoDerecha[f] = a;
      f++;
      if (f == rotadoDerecha.length) {
        f = 0;
      }
    }
    return rotadoDerecha;
  }
  
  /* 
  * Ejercicio 28
  *
  * Rota n posiciones a la izquierda los números de un array.
  * 
  * @param n[] es el array que se toma como parámetro.
  * @param g es la cantidad de rotaciones que se quiere realizar.
  * @return devuelve el array rotado.
  */
  public static int[] rotaIzquierdaArrayInt (int n[], int g) {
    
    int[] rotadoIzquierda = new int[n.length];
    int indiceRotado = rotadoIzquierda.length - g;
    
    for (int a : n) {
      rotadoIzquierda[indiceRotado] = a;
      indiceRotado++;
      if (indiceRotado == rotadoIzquierda.length) {
        indiceRotado = 0;
      }
    }
    return rotadoIzquierda;
  }
}

    

    
   

      
   
  
  
    


  

