/**
* Ejercicio18
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Dime un número (máximo cinco cifras) y te digo la primera: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int cifra = 0;
    
    if (num < 10) {
      cifra = num;
    }
    
    if ((num >=10) && (num < 100)) {
      cifra = num / 10;
    }
    
    if ((num >=100) && (num < 1000)) {
      cifra = num / 100;
    }
    
    if ((num >=1000) && (num < 10000)) {
      cifra = num / 1000;
    }
    
    if ((num >=10000) && (num < 100000)) {
      cifra = num / 10000;
    }
    
    System.out.println("La primera cifra del número es " + cifra);
  }
}
