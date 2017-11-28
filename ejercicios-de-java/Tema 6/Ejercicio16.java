/**
 * Ejercicio16
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio16 {
  public static void main(String[] args) {
    
    //Vamos a ir de nuevo por pasos:
    
    //a) En a nos pide que el número de figuras a mostrar en pantalla es 
    //de 3. Pero el número de figuras posibles es mayor, 5. Es decir, habrá
    //que realizar un bucle que haga tres vueltas y que ofrezca 5 posibilidades
    //mediante un switch. Estas dependerán de un número aleatorio entre 1
    //y 5.
    
    int iteraciones = 3;
    int simbolo;
    int primero = 0;
    int segundo = 0;
    int tercero = 0;
    int contador = 0;
    
    for (int i = 0; i < 3; i++) {
      
      simbolo = (int)(Math.random() * 5 + 1);
      
      switch (simbolo) {
        case 1:
          System.out.print(" 🐭 ");
          break;
        case 2:
          System.out.print(" 🐮 ");
          break;
        case 3:
          System.out.print(" 🐵 ");
          break;
        case 4:
          System.out.print(" 😭 ");
          break;
        case 5:
          System.out.print(" 😱 ");
          break;
        }
        
        contador++;
        
        if (contador == 1) {
          primero = simbolo;
        } else if (contador == 2) {
          segundo = simbolo;
        } else if (contador == 3) {
          tercero = simbolo;
        }
      }
        System.out.println();
        System.out.println();
      
      if ((primero == segundo) && (segundo != tercero)) {
         System.out.println("Bien, ha recuperado su moneda.");
       }
      if ((primero == tercero) && (segundo != tercero)) {
         System.out.println("Bien, ha recuperado su moneda.");
       }
      if ((segundo == tercero) && (primero != tercero)) {
         System.out.println("Bien, ha recuperado su moneda.");
       }
      if ((primero != segundo) && (primero != tercero) && (segundo != tercero)) {
         System.out.println("Lo siento, ha perdido.");
       }
      if ((primero == segundo) && (segundo == tercero)) {
         System.out.println("Enhorabuena, ha ganado diez monedas.");
       }
     }
   }

      
