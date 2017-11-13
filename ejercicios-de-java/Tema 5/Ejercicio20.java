/**
* Ejercicio20
* 
* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una pirámide en la pantalla.");
    System.out.println("Si quieres ver la tuya, introduce la altura que quieres que tenga: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Perfecto. Ahora pon el carácter que prefieras: ");
    String c = System.console().readLine();
    
    //¿Pintar una pirámide dentro de otra?
    
    
    int fila = 0;
    int primera = 0;
    
    do {
    
      for (int espacio = altura - 1; espacio > 0; espacio--) {
      System.out.print(" ");
      }
  
      for (int i = primera; i > 0; i--) {
        System.out.print(c);
      }
      
      for (int esp = fila - 1; esp > 0; esp--) {
        System.out.print(" ");
      }
        System.out.println(c);
      
        primera = 1;
        fila += 2;  
        altura--;
        
    } while (altura > 1);
    
        for (int i = fila; i > 0; i--) {
        System.out.print(c);
      }
        System.out.println(c);
      
  }
}
