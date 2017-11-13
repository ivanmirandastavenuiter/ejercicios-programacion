/**
* Ejercicio19
* 
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también se debe
* pedir por teclado.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una pirámide en la pantalla.");
    System.out.println("Si quieres ver la tuya, introduce la altura que quieres que tenga: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Perfecto. Ahora pon el carácter que prefieras: ");
    String c = System.console().readLine();
    
    int fila = 0;
    
    do {
    
      for (int espacio = altura - 1; espacio > 0; espacio--) {
      System.out.print(" ");
      }
  
      for (int i = fila; i > 0; i--) {
        System.out.print(c);
      }
        System.out.println(c);
      
        fila += 2;  
        altura--;
        
    } while (altura > 0);
  }
}

