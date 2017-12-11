/**
 * Versión tacaña de un número
 *
 * @author Iván Miranda Stavenuiter
 */

public class Tacana {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int volteado = 0;
    int modulo = 0;
    int aux = numero;
    
    do {
      modulo = numero % 10;
      volteado = volteado * 10 + modulo;
      numero /= 10;
    } while (numero > 0);
    
    // Ya tienes el número volteado, que es necesario para imprimirlo
    // luego en orden.
    
    int borrado;
    
    System.out.print("La versión tacaña del número " + aux + " es ");
    
    do {
      borrado = (int)(Math.random() * 2);
      
      // Con los valores 0 y 1 decides si cada cifra la imprimes o no.
      
      switch (borrado) {
        case 0:
          System.out.print(volteado % 10);
          volteado /= 10;
          break;
        case 1:
          volteado /= 10;
          break;
        }
      } while (volteado > 0); 
    }
  }

      
      
      
      
      
      
      
      
      
      
      
      
      
      
    
    
    
