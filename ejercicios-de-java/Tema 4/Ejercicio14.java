/**
* Ejercicio14
* 
* Para ver si un número es par se divide entre dos y se calcula si el resto
* es 0 o no. Esto se puede hacer con el módulo (%). Se iguala a cero y si es así,
* cumple con la condición y por tanto, es par.
* 
* Lo mismo con 5.
* 
* ESTO CAE EN EL EXAMEN SEGURO.
* 
* Los if no son excluyentes si están separados. Si es else if sí que son 
* excluyentes. Esto se puede ver con notas de examen, por ejemplo:
* 
* if (nota < 5) {
*   "Insuficiente"
* } else if (nota < 6) {
* "Suficiente"
* } luego menor que 7, etc.
*
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Dime un número y yo te voy a decir si es par");
    System.out.println("y/o si es divisible por 5 :");
    
    //Para comprobar si un número es par habría que ver si la división
    //por dos da como resultado un resto = 0. Si tenemos en cuenta la 
    //fórmula de la división: D = d * c + r. Si introducimos el dividendo,
    // y aparte tenemos divisor y cociente, queda despejar el resto. Si es
    // = 0 será par y si no no. Lo mismo en la división por 5.
    
    //Entonces:
    // D = d * c + r;
    // r = D - (d * c);
    
    int dividendo = Integer.parseInt(System.console().readLine());
    int cociente = dividendo/2;
    int resto = dividendo - (2 * cociente);
    int cociente5 = dividendo/5;
    int resto5 = dividendo - (5 * cociente5);
    
    if ((resto == 0) && (resto5 != 0)){
      System.out.println("Parece ser par, pero no divisible por 5");
    } 
    if ((resto != 0) && (resto5 != 0)){
      System.out.println("Ese número es impar y no es divisible por 5");
    } 
    if ((resto != 0) && (resto5 == 0)){
      System.out.println("No es par pero sí divisible por 5");
    }
    if ((resto == 0) && (resto5 == 0)){
      System.out.println("Parece ser par y divisibe por 5");
    }
    if ((resto == 0) || (resto5 != 0)){
      System.out.println("Parece ser par o no divisible por 5");
    } 
    if ((resto != 0) || (resto5 != 0)){
      System.out.println("Ese número es impar o no es divisible por 5");
    } 
    if ((resto != 0) || (resto5 == 0)){
      System.out.println("Impar o divisible por 5");
    }
    if ((resto == 0) || (resto5 == 0)){
      System.out.println("Parece ser par o divisibe por 5");
    }
  }
}
