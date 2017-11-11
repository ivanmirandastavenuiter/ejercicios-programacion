/**
* Ejercicio34
* 
* Escribe un programa que pida dos números por teclado y que luego mezcle en
* dos números diferentes los dígitos pares y los impares. Se van comprobando
* los dígitos de la siguiente manera: primer dígito del primer número, primer
* dígito del segundo número, segundo dígito del primer número, segundo
* dígito del segundo número, tercer dígito del primer número... Para facilitar
* el ejercicio, podemos suponer que el usuario introducirá dos números de la
* misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
* long en lugar de int donde sea necesario para admitir números largos.

* Ejemplo 1:

* Por favor, introduzca un número: 9402
* Introduzca otro número: 6782
* El número formado por los dígitos pares es 640822
* El número formado por los dígitos impares es 97

* Ejemplo 2:

* Por favor, introduzca un número: 137
* Introduzca otro número: 909
* El número formado por los dígitos pares es 0
* El número formado por los dígitos impares es 19379
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio34 {
  public static void main(String[] args) {
  
  //Dado que los números se cuentan de izquierda a derecha, lo primero
  //que hay que hacer es voltearlos.
  
  System.out.println("Este programa mezcla pares e impares de dos números");
  System.out.println("introducidos por teclado. ");
  System.out.println("Introduce un primer número: ");
  int primerIntroducido = Integer.parseInt(System.console().readLine());
  System.out.println();
  System.out.println("Introduce un segundo número: ");
  int segundoIntroducido = Integer.parseInt(System.console().readLine());
  System.out.println();
  
  int primerNumero = primerIntroducido;
  int segundoNumero = segundoIntroducido;
  int volteadoUno = 0;
  int volteadoDos = 0;
  
  while (primerNumero > 0) {
    
    int auxUno = 0;
    auxUno = primerNumero % 10;
    volteadoUno = volteadoUno * 10 + auxUno;
    primerNumero /= 10;
  }
  
  //Primero volteado. Ahora el segundo.
    
  while (segundoNumero > 0) {
    
    int auxDos = 0;
    auxDos = segundoNumero % 10;
    volteadoDos = volteadoDos * 10 + auxDos;
    segundoNumero /= 10;
  }
  
  //Ahora podemos ir comprobando ya sí cada uno a partir de los volteados.
  
  int auxPrimero = 0;
  int auxSegundo = 0;
  int numeroPar = 0;
  int numeroImpar = 0;
  
  while ((volteadoUno > 0) && (volteadoDos > 0)) {
    
    auxPrimero = volteadoUno % 10;
    if (auxPrimero % 2 == 0) {
      numeroPar = numeroPar * 10 + auxPrimero;
    } else {
      numeroImpar = numeroImpar * 10 + auxPrimero;
    }
    
    auxSegundo = volteadoDos % 10;
    if (auxSegundo % 2 == 0) {
      numeroPar = numeroPar * 10 + auxSegundo;
    } else {
      numeroImpar = numeroImpar * 10 + auxSegundo;
    }
    
    volteadoUno /= 10;
    volteadoDos /= 10;
  }
  
  System.out.println();
  System.out.println("El número par resultante es " + numeroPar + ".");
  System.out.println("El número par resultante es " + numeroImpar + ".");
  }
}
    
    
    
      
    
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
