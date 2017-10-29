/**
* Ejercicio14
* 
*Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    
    int base;
    int expo;
    
    do {
    System.out.println("Introduce una base: ");
    base = Integer.parseInt(System.console().readLine());

    System.out.println("Ahora el exponente: ");
    expo = Integer.parseInt(System.console().readLine());
    
      switch (expo) {
        case 1:
        System.out.println(Math.pow(base, 1));
        break;
        case 2:
        System.out.println(Math.pow(base, 2));
        break;
        case 3:
        System.out.println(Math.pow(base, 3));
        break;
        case 4:
        System.out.println(Math.pow(base, 4));
        break;
        case 5:
        System.out.println(Math.pow(base, 5));
        break;
        case 6:
        System.out.println(Math.pow(base, 6));
        break;
        case 7:
        System.out.println(Math.pow(base, 7));
        break;
        case 8:
        System.out.println(Math.pow(base, 8));
        break;
        case 9:
        System.out.println(Math.pow(base, 9));
        break;
        case 10:
        System.out.println(Math.pow(base, 10));
        break;
        default:
        System.out.println("A tanto no llego.");
      }
    } while (expo < 11);
  }
}
        
        
        
        
        
        
        
        
        
