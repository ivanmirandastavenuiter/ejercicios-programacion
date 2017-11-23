/**
 * Ejercicio06
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
 * ducido es menor o mayor que el número secreto.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    
    int intentos = 5;
    int numeroSecreto = (int)(Math.random() * 101);
    
    int numIntroducido;
    
    System.out.println("Introduce el número secreto. Recuerda que tienes solo 5 intentos: ");
    
    do {

      numIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numIntroducido != numeroSecreto) {
        System.out.println("Ese número no es el correcto");
        intentos--;
        System.out.println("Te quedan " + intentos + " intentos");
      
        if (numIntroducido < numeroSecreto) {
         System.out.println("El número introducido es menor que el número secreto");
        }
        if (numIntroducido > numeroSecreto) {
         System.out.println("El número introducido es mayor que el número secreto");
        }
      }
       else {
         System.out.println("Enhorabuena, el número introducido coincide con el secreto!");
      }
    } while ((intentos > 0) && (numIntroducido != numeroSecreto));
  }
}
      
      
 
