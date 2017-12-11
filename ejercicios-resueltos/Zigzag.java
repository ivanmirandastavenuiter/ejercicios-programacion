/**
 *
 *
 * Figura en zigzag cuyas líneas serán tan largas como los dígitos
 * de un número generado de forma aleatoria entre 0 y 100000. Por ejemplo,
 * si es 456: serán cuatro hacia la derecha, cinco hacia la izquierda y seis a la derecha.
 * 
 * 
 * @author Iván Miranda Stavenuiter
 */

public class Zigzag {
  public static void main(String[] args) {
    
    int numero = (int)(Math.random() * 100001);
    int espacios = 20;
    int direccion = 0;
    
    System.out.println("El número generado es: " + numero);
    
    // Lo primero es voltear el número para imprimir según el orden
    
    int modulo;
    int volteado = 0;
    int cifra;
    
    do {
      modulo = numero % 10;
      volteado = volteado * 10 + modulo;
      numero /= 10;
    } while (numero > 0);
    
    do {
      
      cifra = volteado % 10;
      
      if (cifra == 0) {
        
        if (direccion == 1) {
          direccion = 0;
        } else {
          direccion = 1;
        }
      }
      
      if (direccion == 0) {
      
        for (int i = 0; i < cifra; i++) {
          
          if (i == cifra - 1) {
            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
              System.out.print("*");
              System.out.println();
              espacios--;
            } else {
        
              for (int r = 0; r < espacios; r++) {
                System.out.print(" ");
              }
                System.out.print("*");
                System.out.println();
                espacios++;
              }
            }
            direccion = 1;
            volteado /= 10;
        } else {
          
            for (int i = 0; i < cifra; i++) {
          
          if (i == cifra - 1) {
            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
              System.out.print("*");
              System.out.println();
              espacios++;
            } else {
        
              for (int r = 0; r < espacios; r++) {
                System.out.print(" ");
              }
                System.out.print("*");
                System.out.println();
                espacios--;
              }
            }
              direccion = 0;
              volteado /= 10;
            }
        
        } while (volteado > 0);
      }
    }
  

    
    
    
    
    
    
