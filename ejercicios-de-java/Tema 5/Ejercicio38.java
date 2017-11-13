/**
* Ejercicio38
* 
* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
* programa debe pedir la altura. Se debe comprobar que la altura sea un número
* impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
* error.
* 
*
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio38 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pinta un reloj de arena en pantalla.");
    System.out.println("Introduce la altura, por favor: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int altura = alturaIntroducida;
    int espacios = 2;
    int inicio = alturaIntroducida / 2;
    int mitad = alturaIntroducida / 2;
    int primeraParte = alturaIntroducida / 2;
    
    if ((alturaIntroducida % 2 != 0) && (alturaIntroducida >= 3)) {  
    
    do {
      
      for (int i = inicio; i < mitad; i++) {
        System.out.print(" ");
      }
      
      for (int i = 1; i > 0; i--) {
        System.out.print("*");
      }
      
      for (int i = alturaIntroducida - espacios; i > 0; i--) {
        System.out.print("*");
      }
      
      for (int i = 1; i > 0; i--) {
        System.out.println("*");
      }

      inicio--;
      espacios +=2;
      primeraParte--;
      
    } while (primeraParte >= 1);

    int alturaPiramide = alturaIntroducida - mitad ;
    int espacioPir = 0;
    int primera = 0;
    
    do {
      
      for (int i = 1; i < alturaPiramide; i++) {
        System.out.print(" ");
      }
      
      for (int i = 1; i > 0; i--) {
        System.out.print("*");
      }
      
      for (int i = espacioPir - 1; i > 0; i--) {
        System.out.print("*");
      }
      
      for (int i = primera; i > 0; i--) {
        System.out.print("*");
      }
       System.out.println();
      
      primera = 1;
      espacioPir += 2;
      alturaPiramide--;
    } while (alturaPiramide > 0);
  } else {
     System.out.println("El número ha de ser impar y mayor o igual que 3.");
   }
 }
}

      
