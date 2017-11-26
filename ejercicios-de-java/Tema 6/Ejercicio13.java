/**
 * Ejercicio13
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    
  int dadoUno;
  int dadoDos;
  
  do { 
    
    dadoUno = (int)(Math.random() * 6 + 1);
    dadoDos = (int)(Math.random() * 6 + 1);
    
    switch (dadoUno) {
      
      case 1:
        System.out.print("⚀");
        break;
      
      case 2:
        System.out.print("⚁");
        break;
        
      case 3:
        System.out.print("⚂");
        break;
        
      case 4:
        System.out.print("⚃");
        break;
        
      case 5:
        System.out.print("⚄");
        break;
        
      case 6:
        System.out.print("⚅");
        break;
      }
      
    switch (dadoDos) {
      
      case 1:
        System.out.print(" ⚀");
        break;
      
      case 2:
        System.out.print(" ⚁");
        break;
        
      case 3:
        System.out.print(" ⚂");
        break;
        
      case 4:
        System.out.print(" ⚃");
        break;
        
      case 5:
        System.out.print(" ⚄");
        break;
        
      case 6:
        System.out.print(" ⚅");
        break;
      }
        System.out.println();
        
    } while (dadoUno != dadoDos);
  }
}
      
        
