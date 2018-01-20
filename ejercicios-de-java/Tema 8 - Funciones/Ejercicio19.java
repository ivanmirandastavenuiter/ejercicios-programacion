/*
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 */
package funciones;

/**
 *
 * @author Iván Miranda
 */
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    
    int aux = 0;
    int numero = 0;
    String numeroString = "";
    
    Scanner sc = new Scanner(System.in);
    System.out.printf("%30s", "**********************************\n");
    System.out.printf("%5s %20s %5s", "     ", "CONVERSOR DE BASES", "     \n");
    System.out.printf("%30s", "**********************************\n");
    System.out.println();
    
    System.out.println("Introduce la base del número que vas a convertir: ");
    System.out.println("1.Decimal 2.Binario 3.Hexadecimal 4.Octal");
    int resUno = sc.nextInt();
    
    System.out.println("Introduce la base a la cual deseas convertirlo: ");
    System.out.println("1.Decimal 2.Binario 3.Hexadecimal 4.Octal");
    int resDos = sc.nextInt();
    
    if (resUno == 3) {
    System.out.println("Por último, introduce el número: ");
    numeroString = sc.next();
    } else {
      System.out.println("Por último, introduce el número: ");
      numero = sc.nextInt();
    }
    
    switch (resUno) {
      case 1:
        switch (resDos) {
          case 1:
            System.out.println("Has introducido las mismas bases. Repite de nuevo.");
            break;
          case 2:
            System.out.println("El número correspondiente en binario es " + funciones.Ejercicio19.decimalBinario(numero));
            break;
          case 3:
            System.out.println("El número correspondiente en hexadecimal es " + funciones.Ejercicio19.decimalHexadecimal(numero));
            break;
          case 4:
            System.out.println("El número correspondiente en octal es " + funciones.Ejercicio19.decimalOctal(numero));
            break;
        }
        break;
      case 2:
        switch (resDos) {
          case 1:
            System.out.println("El número correspondiente en decimal es " + funciones.Ejercicio19.binarioDecimal(numero));
            break;
          case 2:
            System.out.println("Has introducido las mismas bases. Repite de nuevo.");
            break;
          case 3:
            aux = funciones.Ejercicio19.binarioDecimal(numero);
            System.out.println("El número correspondiente en hexadecimal es " + funciones.Ejercicio19.decimalHexadecimal(aux));
            break;
          case 4:
            aux = funciones.Ejercicio19.binarioDecimal(numero);
            System.out.println("El número correspondiente en octal es " + funciones.Ejercicio19.decimalOctal(aux));
            break;
        }
        break;
      case 3:
        switch (resDos) {
          case 1:
            System.out.println("El número correspondiente en decimal es " + funciones.Ejercicio19.hexadecimalDecimal(numeroString));
            break;
          case 2:
            aux = funciones.Ejercicio19.hexadecimalDecimal(numeroString);
            System.out.println("El número correspondiente en binario es " + funciones.Ejercicio19.decimalBinario(aux));
            break;
          case 3:
            System.out.println("Has introducido las mismas bases. Repite de nuevo.");
            break;
          case 4:
            aux = funciones.Ejercicio19.hexadecimalDecimal(numeroString);
            System.out.println("El número correspondiente en octal es " + funciones.Ejercicio19.decimalOctal(aux));
            break;
        }  
        break;
      case 4:
        switch (resDos) {
          case 1:
            System.out.println("El número correspondiente en decimal es " + funciones.Ejercicio19.octalDecimal(numero));
            break;
          case 2:
            aux = funciones.Ejercicio19.octalDecimal(numero);
            System.out.println("El número correspondiente en binario es " + funciones.Ejercicio19.decimalBinario(aux));
            break;
          case 3:
            aux = funciones.Ejercicio19.octalDecimal(numero);
            System.out.println("El número correspondiente en hexadecimal es " + funciones.Ejercicio19.decimalHexadecimal(aux));
            break;
          case 4:
            System.out.println("Has introducido las mismas bases. Repite de nuevo.");
            break;
        }  
        break;
      }
    }
  
  /* 
  * Conversor binario a decimal: devuelve el número decimal que se corresponde
  * con el binario introducido.
  *  
  * @param x número binario.
  * @return devuelve el número decimal ya convertido.
  */
  public static int binarioDecimal(int x) {
    
    int exponente = 0;
    int sumaFinal = 0;
    int numerosIndividuales;
    int resultadosIndividuales;
    int cifras = funciones.Funciones.digitos(x);
   
    for (int a = 0; a <= cifras; a++) {
      numerosIndividuales = x % 10;
      x /= 10;
      resultadosIndividuales = (funciones.Funciones.potencia(2, exponente)) * numerosIndividuales;
      sumaFinal += resultadosIndividuales;
      exponente++;
    }
    return sumaFinal;
  } 

  /* 
  * Conversor decimal a binario: devuelve el número binario que se corresponde
  * con el decimal introducido.
  *  
  * @param x número decimal.
  * @return devuelve el número binario ya convertido.
  */
  public static int decimalBinario(int x) {
    
    int ultimoDigito;
    int binarioFinal = 0;
    int suma;
    int exponente = 0;
    
    do {
      ultimoDigito = x % 2;
      suma = ultimoDigito * (funciones.Funciones.potencia(10, exponente));
      binarioFinal += suma;
      exponente++;
      x /= 2;
    } while(x > 0);
    
    return binarioFinal;
  }
  
  /* 
  * Conversor decimal a hexadecimal: devuelve el número hexadecimal que se corresponde
  * con el decimal introducido.
  *  
  * @param x número decimal.
  * @return devuelve el número hexadecimal ya convertido.
  */
  public static String decimalHexadecimal (int x) { 
    
    int cociente;
    int divisor = 16;
    int residuo;
    int aux = x;
    int tamañoArray = 0;
    int indice = 0;
    String numeroFinal = "";
    
    do {
      aux /= divisor;
      tamañoArray++;
    } while (aux >= 16);
    tamañoArray++;
    
    String[] numeros = new String[tamañoArray];
    
    do {
      cociente = x / divisor;
      residuo = x - (cociente * divisor);
        if (residuo < 10) {
          numeros[indice] = Integer.toString(residuo);
        } else {
          switch (residuo) {
            case 10:
              numeros[indice] = "A";
              break;
            case 11:
              numeros[indice] = "B";
              break;
            case 12:
              numeros[indice] = "C";
              break;
            case 13:
              numeros[indice] = "D";
              break;
            case 14:
              numeros[indice] = "E";
              break;
            case 15:
              numeros[indice] = "F";
              break;
          }
        }
      indice++;
      x = cociente;
    } while (x >= 16);
      if (x < 10) {
          numeros[indice] = Integer.toString(x);
        } else {
          switch (x) {
            case 10:
              numeros[indice] = "A";
              break;
            case 11:
              numeros[indice] = "B";
              break;
            case 12:
              numeros[indice] = "C";
              break;
            case 13:
              numeros[indice] = "D";
              break;
            case 14:
              numeros[indice] = "E";
              break;
            case 15:
              numeros[indice] = "F";
              break;
          }
        }
        for (int a = numeros.length - 1; a >= 0; a--) {
          numeroFinal += numeros[a];
        }
        return numeroFinal;
  }
  
  /* 
  * Conversor hexadecimal a decimal: devuelve el número decimal que se corresponde
  * con el hexadecimal introducido.
  *  
  * @param x número hexadecimal.
  * @return devuelve el número decimal ya convertido.
  */
  public static int hexadecimalDecimal (String hexadecimal) { 
    
    int numero = 0;
    String b;
    int exponente = hexadecimal.length() - 1;
    char caracter;
    String numeroString;
    int sumaTotal = 0;
    int resultadoFinal = 0;
   
    for (int i = 0; i < hexadecimal.length(); i++) {
     
    caracter = hexadecimal.charAt(i);
    numeroString = Character.toString(caracter);
    for (int a = 0; a < 10; a++) {
      b = Integer.toString(a);
      if (numeroString.equals(b)) {
        numero = a;
      }
    }
    switch (numeroString) {
      case "A":
        numero = 10;
        break;
      case "B":
        numero = 11;
        break;
      case "C":
        numero = 12;
        break;
      case "D":
        numero = 13;
        break;
      case "E":
        numero = 14;
        break;
      case "F":
        numero = 15;
        break;
    }
    sumaTotal = numero * (funciones.Funciones.potencia(16, exponente));
    resultadoFinal += sumaTotal;
    exponente--;
    }
    return resultadoFinal;
  }
  
  /* 
  * Conversor decimal a octal: devuelve el número octal que se corresponde
  * con el decimal introducido.
  *  
  * @param x número decimal.
  * @return devuelve el número octal ya convertido.
  */
  public static int decimalOctal (int x) { 
    
    int ultimoDigito;
    int octalFinal = 0;
    int suma;
    int exponente = 0;
    
    do {
      ultimoDigito = x % 8;
      suma = ultimoDigito * (funciones.Funciones.potencia(10, exponente));
      octalFinal += suma;
      exponente++;
      x /= 8;
    } while(x > 0);
    
    return octalFinal;
  }
  
  /* 
  * Conversor octal a decimal: devuelve el número decimal que se corresponde
  * con el octal introducido.
  *  
  * @param x número octal.
  * @return devuelve el número decimal ya convertido.
  */
  public static int octalDecimal (int x) {
    
    int exponente = 0;
    int sumaFinal = 0;
    int numerosIndividuales;
    int resultadosIndividuales;
    int cifras = funciones.Funciones.digitos(x);
   
    for (int a = 0; a <= cifras; a++) {
      numerosIndividuales = x % 10;
      x /= 10;
      resultadosIndividuales = (funciones.Funciones.potencia(8, exponente)) * numerosIndividuales;
      sumaFinal += resultadosIndividuales;
      exponente++;
    }
    return sumaFinal;
  }
}
  
    