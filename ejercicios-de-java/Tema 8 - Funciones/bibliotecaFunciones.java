/*
 * Biblioteca de funciones actualizada. 
 */

package funciones;

/**
 *
 * @author Iván Miranda
 */
public class bibliotecaFunciones {
  
  /* 
  * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
  * es capicúa y falso en caso contrario.
  *  
  * @param x número entero positivo.
  * @return <code>true</code> si es un número capicúa.
  * @return <code>false</code> si no lo es.
  */
  public static boolean esCapicua(int x) {
    
    int y = x;
    int modulo;
    int volteado = 0;
    
    do {
      modulo = y % 10;
      volteado = volteado * 10 + modulo;
      y /= 10;
    } while (y > 0);
    
    return x == volteado;
  }
  
  /* 
  * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
  * es primo y falso en caso contrario.
  *  
  * @param x número entero positivo.
  * @return <code>true</code> si es un número primo.
  * @return <code>false</code> si no lo es.
  */
  public static boolean esPrimo(int x) {
    
    for (int a = 2; a < x; a++) {
      if (x % a == 0) {
        return false;
      }
    }
    return true;
  }
  
  /* 
  * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
  * se pasa como parámetro.
  *  
  * @param x número entero positivo.
  * @return el número en cuestión.
  */
  public static int siguientePrimo(int x) {
    
    boolean primerPrimo;
    
    do {
      primerPrimo = true;
      x++;
      for (int a = 2; a < x; a++) {
        if (x % a == 0) {
          primerPrimo = false;
        }
      }
    } while(!primerPrimo);
    
    return x;
  }
  
  /* 
  * 4. potencia: Dada una base y un exponente devuelve la potencia.
  *  
  * @param x base.
  * @param y exponente.
  * @return el resultado de la potencia.
  */
  public static int potencia(int x, int y) {
    
    int resultado = x;
    switch (y) {
      case 0: 
        resultado = 1;
        break;
      case 1:
        resultado = x;
        break;
      default:
        for (int a = 1; a < y; a++) {
          resultado *= x;
        }
    }
    return resultado;
  }
  
  /* 
  * 5. digitos: Cuenta el número de dígitos de un número entero.
  *  
  * @param x número entero positivo.
  * @return el resultado de la operación.
  */
  public static int digitos(int x) {
    
    int digitos = 0;
    
    do {
      x /= 10;
      digitos++;
    } while (x > 0);
    
    return digitos;
  }
  
  /* 
  * 6. voltea: Le da la vuelta a un número.
  *  
  * @param x número entero positivo.
  * @return el resultado de la operación.
  */
  public static int voltea(int x) {
    
    int y = x;
    int modulo;
    int volteado = 0;
    
    do {
      modulo = y % 10;
      volteado = volteado * 10 + modulo;
      y /= 10;
    } while (y > 0);
    
    return volteado;
  }
  
  /* 
  * 7. digitoN: Devuelve el dígito que está en la posición n de un número
  * entero. Se empieza contando por el 0 y de izquierda a derecha.
  *  
  * @param x número entero positivo.
  * @param y posición del dígito dentro del número.
  * @return posición del dígito en el número.
  */
  public static int digitoN(int x, int y) {
    
    int digitos = 0;
    int aux = x;
    int numero = 0;
    
    do {
      aux /= 10;
      digitos++;
    } while (aux > 0);
      
    int z = x;
    int modulo;
    int volteado = 0;
    
    do {
      modulo = z % 10;
      volteado = volteado * 10 + modulo;
      z /= 10;
    } while (z > 0);
    
    for (int a = 0; a <= y; a++) {
      numero = volteado % 10;
      volteado /= 10;
    }
    return numero;
  }
  
  /* 
  * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
  * dentro de un número entero. Si no se encuentra, devuelve -1.
  *  
  * @param num número entero positivo al cual se le realiza la operación.
  * @param numUsuario pide al usuario el número que quiere comprobar.
  * @return posición del dígito en el número. Si no se encuentra, imprimirá -1.
  */
  public static int posicionDeDigito(int x, int y) {
    
    int z = funciones.bibliotecaFunciones.voltea(x);
    int cifra;
    int posicion = 0;
    
    do {
      cifra = z % 10;
      z /= 10;
      if (cifra == y) {
        return posicion;
      }
      posicion++;
    } while (z > 0);
    
    return -1;
  }
  
  /* 
  * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
  * derecha).
  *  
  * @param x número entero positivo al cual se le realiza la operación.
  * @param y cantidad de cifras que se suprimen por la derecha.
  * @return el número sin n cifras que el usuario ha creado.
  */
  public static int quitaPorDetras(int x, int y) {
    
    int divisor = 10;
    int resultado = 1;
    
    for (int a = 1; a <= y; a++) {
      resultado *= divisor;
    }
    
    x /= resultado;
    return x;
  }
  
/* 
  * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
  * izquierda).
  *  
  * @param x número entero positivo al cual se le realiza la operación.
  * @param y cantidad de cifras que se suprimen por la izquierda.
  * @return el número sin n cifras que el usuario ha creado.
  */
  public static int quitaPorDelante(int x, int y) {
    
    int z = funciones.bibliotecaFunciones.voltea(x);
    int divisor = 10;
    int resultado = 1;
    
    for (int a = 1; a <= y; a++) {
      resultado *= divisor;
    }
    
    z /= resultado;
    z = funciones.bibliotecaFunciones.voltea(z);
    return z;
  }
  
  /* 
  * 11. pegaPorDetras: Añade un dígito a un número por detrás.
  *  
  * @param x número entero positivo al cual se le realiza la operación.
  * @param y número que se añade al introducido.
  * @return el número introducido con el nuevo añadido.
  */
  public static int pegaPorDetras(int x, int y) {
    
    int z = (x * 10) + y;
    return z;
  }
  
  /* 
  * 12. pegaPorDelante: Añade un dígito a un número por delante.
  *  
  * @param x número entero positivo al cual se le realiza la operación.
  * @param y número que se añade al introducido.
  * @return el número introducido con el nuevo añadido.
  */
  public static int pegaPorDelante(int x, int y) {
    
    int aux = x;
    int cifras = 0;
    
    do {
      aux /= 10;
      cifras++;
    } while (aux > 0);
   
    int potencia = 10;
    int resultado = 1;
    
    for (int a = 1; a <= cifras; a++) {
      resultado *= potencia;
    }
    x = (y * resultado) + x;
    return x;
  }
  
  /* 
  * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
  * dentro de un número y devuelve el trozo correspondiente.
  *  
  * @param x número entero positivo al cual se le realiza la operación.
  * @return el número con los parámetros incial y final suprimidos.
  */
  public static int trozoDeNumero(int x) {
    
    x /= 10;
    x = funciones.bibliotecaFunciones.voltea(x);
    x /= 10;
    x = funciones.bibliotecaFunciones.voltea(x);
    return x;
  }
  
  /* 
  * 14. juntaNumeros: Pega dos números para formar uno.
  *  
  * @param x número primero.
  * @param y número segundo.
  * @return imprime los dos números resultantes pegados.
  */
  public static int juntaNumeros(int x, int y) {
  
  int cifras = funciones.bibliotecaFunciones.digitos(y);
  
  int divisor = 10;
  int resultado = 1;
    
  for (int a = 1; a <= cifras; a++) {
    resultado *= divisor;
  }
  
  x = (x * resultado) + y;
  return x;
  }
  
  /* 
  * 35. Esta función convierte el número n al sistema de palotes y lo devuelve en una
  * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
  * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
  * para comprobar que funciona bien. Desde la función no se debe mostrar nada
  * por pantalla, solo se debe usar print desde el programa principal.
  *
  * @param numero toma el número a convertir.
  * @return String con el número convertido en palotes.
  */
  public static String convierteEnPalotes(int numero) {
    
    int volteado = funciones.bibliotecaFunciones.voltea(numero);
    String palotes = "";
    int ultimaCifra = volteado % 10;
    int digitos = funciones.bibliotecaFunciones.digitos(numero);
    
    for (int b = 0; b < digitos; b++) {
    
    if (b == digitos - 1) {
      for (int a = 0; a < ultimaCifra; a++) {
        palotes += "| ";
      }
    } else {
       for (int a = 0; a < ultimaCifra; a++) {
        if (a == ultimaCifra - 1) {
          palotes += "| - ";
        } else {
          palotes += "| ";
        }
       }
      }
    volteado /= 10;
    ultimaCifra = volteado % 10;
    }
    return palotes;
  }
  
  /* 
  * 36. Crea la función de manejo de arrays que tenga la siguiente cabecera y que
  * haga lo que se especifica en los comentarios (puedes incluirla en tu propia
  * biblioteca de rutinas):
  *
  * // Devuelve un array con todos los
  * // números primos que se encuentren
  * // en otro array que se pasa como
  * // parámetro.
  * // Obviamente el tamaño del array
  * // que se devuelve será menor o
  * // igual al que se pasa como
  * // parámetro.
  
  * @param x toma el array original.
  * @return int[] en el que figuran solo los primos.
  */
  public static int[] filtraPrimos(int x[]) {
    
    int numerosPrimos = 0;
    
    for (int a : x) {
      if (funciones.bibliotecaFunciones.esPrimo(a)) {
        numerosPrimos++;
      }
    }
    
    int[] soloPrimos = new int[numerosPrimos];
    int indice = 0;
    
    for (int a : x) {
      if (funciones.bibliotecaFunciones.esPrimo(a)) {
        soloPrimos[indice] = a;
        indice++;
      }
    }
    return soloPrimos;
  }
  
  /* 
  * 37. Crea una función con la siguiente cabecera:
  * public String convierteEnMorse(int n)
  * Esta función convierte el número n al sistema Morse y lo devuelve en una
  * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
  * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
  * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
  * desde el programa principal.
  *
  * @param n es el número que se convierte a morse.
  * @return String con los caracteres correspondientes.
  *
  */
  public static String convierteEnMorse(int n) {
    
    int volteado = funciones.bibliotecaFunciones.voltea(n);
    String morse = "";
    int ultimaCifra = volteado % 10;
    int digitos = funciones.bibliotecaFunciones.digitos(n);
    
    String[] codigos = new String[10];
    
    codigos[0] = "-----";
    codigos[1] = ".----";
    codigos[2] = "..---";
    codigos[3] = "...--";
    codigos[4] = "....-";
    codigos[5] = ".....";
    codigos[6] = "-....";
    codigos[7] = "--...";
    codigos[8] = "---..";
    codigos[9] = "----.";
    
    for (int a = 0; a < digitos; a++) { 
      morse += codigos[ultimaCifra];
      volteado /= 10;
      ultimaCifra = volteado % 10;
    }
    return morse;
  }
  
  /* 
  * 38. Crea la función de manejo de arrays que tenga la siguiente cabecera y que
  * haga lo que se especifica en los comentarios (puedes incluirla en tu propia
  * biblioteca de rutinas):
  * 
  * // Devuelve un array con todos los números
  * // capicúa que se encuentren en otro array
  * // que se pasa como parámetro.
  * // Obviamente el tamaño del array que se
  * // devuelve será menor o igual al que se
  * // pasa como parámetro.
  *
  * @param n es el número que se convierte a morse.
  * @return String con los caracteres correspondientes.
  *
  */
  public static int[] filtraCapicuas(int x[]) {
    
    int numerosCapi = 0;
    
    for (int a : x) {
      if (funciones.bibliotecaFunciones.esCapicua(a)) {
        numerosCapi++;
      }
    }
   
    int[] soloCapis = new int[numerosCapi];
    int indice = 0;
    
    if (numerosCapi == 0) {
      soloCapis = new int[1];
      soloCapis[0] = -1;
    } else {
    for (int a : x) {
      if (funciones.bibliotecaFunciones.esCapicua(a)) {
        soloCapis[indice] = a;
        indice++;
      }
     }
    }
    return soloCapis;
   }

  /* 
  * 39. Crea una función con la siguiente cabecera:
  * public String convierteEnPalabras(int n)
  * Esta función convierte los dígitos del número n en las correspondientes
  * palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el
  * 470213 convertido a palabras sería:
  *
  * cuatro, siete, cero, dos, uno, tres
  *
  * Utiliza esta función en un programa para comprobar que funciona bien. Desde
  * la función no se debe mostrar nada por pantalla, solo se debe usar print desde
  * el programa principal. Fíjate que hay una coma detrás de cada palabra salvo
  * al final.
  *
  * @param n toma el número entero de referencia.
  * @return cadena de caracteres con los números escritos.
  */
  public static String convierteEnPalabras(int n) {
    
    int volteado = funciones.bibliotecaFunciones.voltea(n);
    String respuesta = "";
    int ultimaCifra = volteado % 10;
    int digitos = funciones.bibliotecaFunciones.digitos(n);
    
    String[] numeros = new String[10];
    
    numeros[0] = "cero";
    numeros[1] = "uno";
    numeros[2] = "dos";
    numeros[3] = "tres";
    numeros[4] = "cuatro";
    numeros[5] = "cinco";
    numeros[6] = "seis";
    numeros[7] = "siete";
    numeros[8] = "ocho";
    numeros[9] = "nueve";
    
    for (int a = 0; a < digitos; a++) { 
      if (a == digitos -1) {
        respuesta += numeros[ultimaCifra];
      } else {
        respuesta += numeros[ultimaCifra] + ", ";
        volteado /= 10;
        ultimaCifra = volteado % 10;
      }
    }
    return respuesta;
  }
  
  /* 
  * 40. Crea la función de manejo de arrays que tenga la siguiente cabecera y que
  * haga lo que se especifica en los comentarios (puedes incluirla en tu propia
  * biblioteca de rutinas):
  * public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
  * // que contienen el 7 (por ej. 7, 27, 782)
  * // que se encuentren en otro array que se
  * // pasa como parámetro. El tamaño del array
  * // que se devuelve será menor o igual al
  * // que se pasa como parámetro.
  * Utiliza esta función en un programa para comprobar que funcionan bien. Para
  * que el ejercicio resulte más fácil, las repeticiones de números que contienen 7
  * se conservan; es decir, si en el array x el número 875 se repite 3 veces, en el
  * array devuelto también estará repetido 3 veces. Si no existe ningún número
  * que contiene 7 en el array x, se devuelve un array con el número -1 como
  * único elemento.
  */
  public static int[] filtraCon7(int x[]) {
    
    int auxiliar;
    int digitos = 0;
    int ultimaCifra;
    boolean siete;
    int contadorSietes = 0;
    
    for (int a : x) {
      digitos = funciones.bibliotecaFunciones.digitos(a);
      auxiliar = a;
      siete = false;
      for (int b = 0; b < digitos; b++) {
        ultimaCifra = auxiliar % 10;
          if (ultimaCifra == 7) {
            siete = true;
          }
        auxiliar /= 10;
      }
      if (siete) {
        contadorSietes++;
      }
    }
   
    int[] arraySietes = new int[contadorSietes];
      
    int indice = 0;
    for (int a : x) {
      digitos = funciones.bibliotecaFunciones.digitos(a);
      auxiliar = a;
      siete = false;
      for (int b = 0; b < digitos; b++) {
        ultimaCifra = auxiliar % 10;
          if (ultimaCifra == 7) {
            siete = true;
          }
        auxiliar /= 10;
      }
      if (siete) {
        arraySietes[indice] = a;
        indice++;
      }
    }
    return arraySietes;
  }
}
    
    
      
      

    
    
  
    
    
    

    

  


 
    
  
  

    
      
    

    

  
 
    
  



