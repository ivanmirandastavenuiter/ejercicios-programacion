/**
* Ejercicio32
* 
* Escribe un programa que, dado un número entero, diga cuáles son y cuánto
* suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
* izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
* números largos.

* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 94026782
* Dígitos pares: 4 0 2 6 8 2
* Suma de los dígitos pares: 22

* Ejemplo 2:
* Por favor, introduzca un número entero positivo: 31779
* Dígitos pares:
* Suma de los dígitos pares: 0

* Ejemplo 3:
* Por favor, introduzca un número entero positivo: 2404
* Dígitos pares: 2 4 0 4
* Suma de los dígitos pares: 10
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio32 {
  public static void main(String[] args) {
    
    //El programa se realiza en tres pasos: se va haciendo el módulo de cada
    //y comprobando si son divisibles por 2. En caso de serlos, se imprimen
    //y aparte se crea una variable que vaya acumulando la suma. Además,
    //dice que los coloques en el orden en el que aparecen, es decir, de izquierda
    //a derecha.
    
    System.out.println("Este programa te dice cuáles son los números pares de otro");
    System.out.println("que tú introduzcas por pantalla y te dice cuál es la suma");
    System.out.println("de todos ellos.");
    System.out.println();
    System.out.println("Introduce un número: ");
    long num = Integer.parseInt(System.console().readLine());
    
    long auxiliar = 0;
    long volteado = 0;
    
    while (num > 0) {

      auxiliar = num % 10;
      
      //Ejemplo: 9586. Si quiero saber los pares en orden izquierda a derecha,
      //no queda otra que voltearlo y sacar los pares.
      
      volteado = volteado * 10 + auxiliar;
      
      //Con esta línea tomamos la última cifra del número introducido y
      //se guarda en volteado, que será 0 una vez multiplicado. A cada vuelta
      //el número se va formando a medida que se va multiplicando.
      
      num = num / 10;
      
      //El número tiene que ir reduciéndose una cifra a cada vuelta,
      
    }
    
    System.out.println();
    System.out.print("Los dígitos pares son: ");
    
    int suma = 0;
    
    while (volteado > 0) {
      
      //Ahora se hacen los módulos uno por uno del número volteado, se guardan
      //los contadores de los pares y se suma todo.
      
      long numFinal = volteado % 10;
      int pares = 0;
      
      
        if (numFinal % 2 == 0) {
          System.out.print(numFinal + " ");
          pares++;
          suma += numFinal;
        }
        
      volteado = volteado / 10;
    }
    System.out.println();
    System.out.println("La suma total de los pares es de " + suma);
  }
}
          
          
      
      
      
      
      
      
      
      
      
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
