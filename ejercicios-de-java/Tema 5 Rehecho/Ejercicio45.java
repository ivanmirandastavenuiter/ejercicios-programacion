/**
* Ejercicio45
* 
* Escribe un programa que sea capaz de insertar un dígito dentro de un número
* indicando la posición. El nuevo dígito se colocará en la posición indicada y el
* resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
* izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
* correctamente los datos. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos.

* Ejemplo:
* Por favor, introduzca un número entero positivo: 406783
* Introduzca la posición donde quiere insertar: 3
* Introduzca el dígito que quiere insertar: 5
* El número resultante es 4056783.

* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio45 {
  public static void main(String[] args) {
  
  System.out.println("Este programa inserta un número en el lugar de otro.");
    System.out.println("Puedes elegir, además, la posición.");
    System.out.println();
    System.out.println("Introduce primero un número entero positivo: ");
    long num = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Indica la posición en la que lo quieres insertar: ");
    long posicionUsuario = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Por último, escribe el dígito: ");
    long digitoUsuario = Integer.parseInt(System.console().readLine());
    
    //Para poder trabajar con el número, primero hay que darle la vuelta.
    
    long modulo;
    long auxVolteado = num;
    long volteado = 0;
    
    while (auxVolteado > 0) {
      
      modulo = auxVolteado % 10;
      volteado = volteado * 10 + modulo;
      auxVolteado /= 10;
    }
    
    //Ya lo tenemos. Ahora hay que partirlo contando además las posiciones.
    
    long posicion = 1;
    long moduloDos;
    long primeraParte = 0;
    
    while (posicion < posicionUsuario) {
      
      moduloDos = volteado % 10;
      primeraParte = primeraParte * 10 + moduloDos;
      volteado /= 10;
      posicion++;
    }
    
    //Ya hemos partido el número. Ahora la segunda parte.
    
    long moduloTres;
    long segundaParte = 0;
    
    while (volteado > 0) {
      
      moduloTres = volteado % 10;
      segundaParte = segundaParte * 10 + moduloTres;
      volteado /= 10;
    }
    
    int cifras = 0;
    long auxSegundaParte = segundaParte;
    
    do {
      auxSegundaParte /= 10;
      cifras++;
    } while (auxSegundaParte > 0);
  
  
    int exponente = 1;
    
     for (int i = 1; i < cifras; i++) {
       exponente *= 10;
     }
     
    segundaParte = segundaParte % exponente;
    
    System.out.print("El número resultante es " + primeraParte);
    System.out.print(digitoUsuario);
    System.out.println(segundaParte);
  }
}
    
    
    
    
