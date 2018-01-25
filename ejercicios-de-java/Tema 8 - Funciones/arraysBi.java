/*
 * Biblioteca de funciones para arrays bidimensionales. 
 */
package funciones;

/*
 * 
 * @author Iván Miranda
 */
public class arraysBi {

 /*
 * 1. generaArrayBiInt: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 *
 * @param a indica filas de array.
 * @param b indica columnas de array.
 * @param minimo indica el mínimo de los valores. 
 * @param maximo indica el máximo de los valores. 
 * @return array generado.
 */
 public static int[][] generaArrayBiInt(int a, int b, int minimo, int maximo) {
 
 int[][]n = new int[a][b];
 int cantidadNumeros = (maximo - minimo) + 1;
 
 for (int g = 0; g < n.length; g++) {
   for (int h = 0; h < n[g].length; h++) {
     n[g][h] = (int)(Math.random() * cantidadNumeros + minimo);
   }
 }
 return n;
 }
 
 /*
 * 1. muestraArrayBiInt: imprime el array generado.
 *
 * @param array[][] es el array bidimensional que se va a imprimir.
 */
 public static void muestraArrayBiInt(int n[][]) {
 
   for (int g = 0; g < n.length; g++) {
    for (int h : n[g]) {
      System.out.print(h + " ");
    }
    System.out.println();
   }
 }
 
 /*
 * 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
 * parámetro.
 *
 * @param array[][] es el array bidimensional que se va a imprimir.
 * @param e es el número de la fila que se elige.
 * @return el array correspondiente a la fila.
 */
 public static int[] filaDeArrayBiInt(int n[][], int e) {
 
 int[] fila = new int[n[0].length];
 int indice = 0;
 
  for (int b : n[e]) {
   fila[indice] = b;
   indice++;
  }
 return fila;
 }
 
/*
 * 2. muestraArrayUnidimensional: imprime array unidimensional.
 *
 * @param array[] es el array unidimensional que se va a imprimir.
 */
 public static void muestraArrayUnidimensional(int n[]) {
   
   for (int a : n) {
     System.out.print(a + " ");
   }
 }
 
/*
 * 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 *
 * @param array[][] es el array bidimensional que se va a imprimir.
 * @param f es el número de la fila que se elige.
 * @return la columna correspondiente en forma de array unidimensional.
 */
 public static int[] columnaDeArrayBiInt(int n[][], int f) {
   
   int[] columna = new int[n.length];
   int indice = 0;
   
   for (int a = 0; a < columna.length; a++) {
     columna[a] = n[a][f];
   }
   return columna;
 }
 
 /*
 * 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 *
 * @param array[][] es el array bidimensional que se toma como fuente.
 * @param g es el número a buscar dentro del array.
 * @return cadena de String indicando las coordenadas.
 */
 public static String coordenadasEnArrayBiInt(int n[][], int g) {
   
   int[] coordenadas = new int[2];
   coordenadas[0] = -1;
   coordenadas[1] = -1;
   String respuesta = "-1, -1";
   
   for (int a = 0; a < n.length; a++) {
     for (int b = 0; b < n[0].length; b++) {
       if (n[a][b] == g) {
         coordenadas[0] = a;
         coordenadas[1] = b;
         respuesta = "El número se encuentra en la posición " + coordenadas[0] 
         + ", coordenada " + coordenadas[1] + ".";
       }
     }
   }
   return respuesta;
 }
 
 /*
 * 5. arrayManual: se crea un array con valores introducidos.
 *
 * @return array rellenado.
 */
 public static int[][] arrayManual() {

   int[][] n = 
      {
      {1,43,56,18,8,9,76,123,65,32},
      {54,32,54,27,51,89,0,54,32,10},
      {35,78,43,28,65,97,40,32,50,31},
      {38,51,67,0,95,37,12,38,65,39},
      {63,67,9,3,16,42,71,3,67,12}
      };
   return n;
 }

 /*
 * 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 *
 * @param array[][] es el array bidimensional que se toma como fuente.
 * @param h es el número que se comprueba.
 * @return String con la respuesta que corresponda.
 */
 public static String esPuntoDeSilla(int n[][],int h) {

   String respuesta;
   int x = 0;
   int y = 0;
   
   for (int a = 0; a < n.length; a++) {
     for (int b = 0; b < n[0].length; b++) {
       if (n[a][b] == h) {
         x = a;
         y = b;
       }
     }
   }
   
   int menorFila = 999;
   int mayorColumna = 0;
   
   for (int c = 0; c < n[0].length; c++) {
     if (n[x][c] < menorFila) {
       menorFila = n[x][c];
     }
   }
   for (int d = 0; d < n.length; d++) {
     if (n[d][y] > mayorColumna) {
       mayorColumna = n[d][y];
     }
   }
   if (h == menorFila && h == mayorColumna) {
     respuesta = "El número introducido es el punto de silla";
   } else {
     respuesta = "El número introducido no es el punto de silla";
   }
   return respuesta;
 }
 
  /*
 * 6. diagonal: Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro. Se pasan como
 * parámetros fila, columna y dirección. La fila y la columna determinan
 * el número que marcará las dos posibles diagonales dentro del array. La
 * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
 * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
 * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
 * que va del noreste hacia el suroeste.
 *
 * @param array[][] es el array bidimensional que se toma como fuente.
 * @param fila es la fila que se introduce.
 * @param columna es la columna que se introduce.
 * @param respuesta es la dirección de la diagonal.
 * @return array con la diagonal.
 */
 public static int[] diagonal(int n[][], int fila, int columna, String respuesta) {
   
   int x = 0;
   int y = 0;
   for (int a = 0; a <= fila; a++) {
     for (int b = 0; b <= columna; b++) {
       if (a == fila && b == columna) {
         x = a;
         y = b;
       }
     }
   }
   
   if (respuesta.equals("nose")) {
   
   int limiteDiagonal = 0;
   int refX = x;
   int refY = y;
   
   // Retrocede hasta comienzo de diagonal.
   
   do {
     if (refX > 0 && refY > 0) {
       refX--;
       refY--;
     }
   } while (refX != 0 && refY != 0);
   
   // Ya tenemos las referencias correctas. 
   // Contamos el índice para la diagonal.
   
   x = refX;
   y = refY;
   
   do {
     limiteDiagonal++;
     refX++;
     refY++;
   } while (refX != n.length && refY != n[0].length);
   
   int[] diagonal = new int[limiteDiagonal];
   int indice = 0;
   
   // Completamos la diagonal.
   
   do {
     diagonal[indice] = n[x][y];
     indice++;
     x++;
     y++;
   } while (x != n.length && y != n[0].length); 
   return diagonal;
 } else {
     
    int limiteDiagonal = 0;
    int refX = x;
    int refY = y;
   
    // Retrocede hasta comienzo de diagonal.
   
    do {
     if (refX > 0 && refY < n[0].length - 1) {
       refX--;
       refY++;
     }
    } while (refX != 0 && refY != n[0].length - 1);
   
    // Ya tenemos las referencias correctas. 
    // Contamos el índice para la diagonal.
   
    x = refX;
    y = refY;
   
    do {
     refX++;
     refY--;
     limiteDiagonal++;
    } while (refX != n.length && refY != 0);
   
    int[] diagonal = new int[limiteDiagonal + 1];
    int indice = 0;
   
    // Completamos la diagonal.
   
    do {
      diagonal[indice] = n[x][y];
      indice++;
      x++;
      y--;
    } while (x != n.length && y != -1); 
    return diagonal;
    } 
  }
}
   
   
   
   
   
 


   
      
   

 
 
 


  
 
