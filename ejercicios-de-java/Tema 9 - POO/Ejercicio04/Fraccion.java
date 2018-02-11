/*
 * Definición de la clase Fracción.
 */
package ejercicio04;

/**
 *
 * @author Iván Miranda
 */

public class Fraccion {
  
  // Definición de los atributos.
  
  int numerador;
  int denominador;
  
  // Constructor.
  
  public Fraccion() {
  }
  
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  public String invierte() {
    String invertida;
    int auxiliar;
    int auxiliarNum = this.numerador;
    int auxiliarDen = this.denominador;
    
    if ((auxiliarNum < 0 && auxiliarDen > 0) || (auxiliarNum > 0 && auxiliarDen < 0)) {
      auxiliar = -(auxiliarNum);
      auxiliarNum = -(auxiliarDen);
      auxiliarDen = auxiliar;
    } else if ((auxiliarNum > 0 && auxiliarDen > 0) || (auxiliarNum < 0 && auxiliarDen < 0)) {
      auxiliar = auxiliarNum;
      auxiliarNum = auxiliarDen;
      auxiliarDen = auxiliar;
    }
    invertida = String.valueOf(auxiliarNum)+ "/" 
      + String.valueOf(auxiliarDen);
    return invertida;
  }
  
  public String simplifica() {
    
    String simplificada;
    int num = this.numerador;
    int den = this.denominador;
    int auxNum = this.numerador;
    int auxDen = this.denominador;
    int divisor = 2;
    int mcd = 1;

    do {
      if (num % divisor == 0 && den % divisor == 0) {
        num /= divisor;
        den /= divisor;
        mcd *= divisor;
      } else if (num % divisor != 0 && den % divisor == 0) {
        den /= divisor;
      } else if (num % divisor == 0 && den % divisor != 0) {
        num /= divisor;
      } else if (num % divisor != 0 && den % divisor != 0) {
        divisor++;
      }
    } while ((num > 1 && den > 1) || (num < -1 && den > 1)
      || (num > 1 && den < -1) || (num < -1 && den < -1));
    
    auxNum /= mcd;
    auxDen /= mcd;
    
    simplificada = String.valueOf(auxNum) + "/" +
      String.valueOf(auxDen);
    return simplificada;
  }
  
  public String multiplicaEntero(int multiplicador) {
    
    String multiplicacion;
    int auxNum = this.numerador;
    int auxDen = this.denominador;
    auxNum *= multiplicador;
    multiplicacion = String.valueOf(auxNum) + "/" + 
      String.valueOf(auxDen);
    return multiplicacion;
  }
  
  public String multiplicaFraccion(int numerador, int denominador) {
    
    String multiplicacion;
    int auxNum = this.numerador;
    int auxDen = this.denominador;
    auxNum *= numerador;
    auxDen *= denominador;
    multiplicacion = String.valueOf(auxNum) + "/" + 
      String.valueOf(auxDen);
    return multiplicacion;
  }
  
  public String divideFraccion(int numerador, int denominador) {
    
    String division;
    int auxNum = this.numerador;
    int auxDen = this.denominador;
    auxNum *= denominador;
    auxDen *= numerador;
    division = String.valueOf(auxNum) + "/" + 
      String.valueOf(auxDen);
    return division;
  }
  
  @Override
  public String toString() {
    return this.numerador + "/" + this.denominador;
  }
}
