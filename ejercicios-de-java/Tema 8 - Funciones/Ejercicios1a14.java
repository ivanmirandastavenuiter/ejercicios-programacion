/*
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.

 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 */

package funciones;

/**
 *
 * @author Iván Miranda
 */
public class Funciones {
  
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
  * @param numUsuario pide al usuario el número que quiere comprobar
  * @return posición del dígito en el número. Si no se encuentra, imprimirá -1.
  */
  public static int posicionDeDigito(int x, int y) {
    
    int z = funciones.Funciones.voltea(x);
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
    
    int z = funciones.Funciones.voltea(x);
    int divisor = 10;
    int resultado = 1;
    
    for (int a = 1; a <= y; a++) {
      resultado *= divisor;
    }
    
    z /= resultado;
    z = funciones.Funciones.voltea(z);
    return z;
  }
  
  /* 
  * 11. pegaPorDetras: Añade un dígito a un número por detrás.
  *  
  * @param x número entero positivo al cual se le realiza la operación.
  * @param y número que se añade al introducido.
  * @return el número introducido con el nuevo añadido
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
    x = funciones.Funciones.voltea(x);
    x /= 10;
    x = funciones.Funciones.voltea(x);
    return x;
  }
  
  /* 
  * 14. juntaNumeros: Pega dos números para formar uno.
  *  
  * @param x número primero.
  * @param y número segundo.
  * @return imprime los dos números resultantes pegados
  */
  public static int juntaNumeros(int x, int y) {
  
  int cifras = funciones.Funciones.digitos(y);
  
  int divisor = 10;
  int resultado = 1;
    
  for (int a = 1; a <= cifras; a++) {
    resultado *= divisor;
  }
  
  x = (x * resultado) + y;
  return x;
  }
}

  
    

  


 
    
  
  

    
      
    

    

  
 
    
  



