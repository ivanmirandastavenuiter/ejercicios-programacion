/**
 * Ejercicio02
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
 * sería el 1). Para convertir un número en una cadena de caracteres podemos
 * usar String.valueOf(n) .
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    
    int palo = (int)(Math.random() * 4);
    int numero = (int)(Math.random() * 13 + 2);
      
      switch (palo) {
        
        case 0:
          
          switch (numero) {
            
            case 2:
              System.out.println("Ha salido el 2 de picas 🂢");
              break;
            case 3:
              System.out.println("Ha salido el 3 de picas 🂣");      
              break;
            case 4:
              System.out.println("Ha salido el 4 de picas 🂤");
              break;
            case 5:
              System.out.println("Ha salido el 5 de picas 🂥");
              break;
            case 6:
              System.out.println("Ha salido el 6 de picas 🂦");
              break;
            case 7:
              System.out.println("Ha salido el 7 de picas 🂧");
              break;
            case 8:
              System.out.println("Ha salido el 8 de picas 🂨");
              break;
            case 9:
              System.out.println("Ha salido el 9 de picas 🂩");
              break;
            case 10:
              System.out.println("Ha salido el 10 de picas 🂪");
              break;
            case 11:
              System.out.println("Ha salido la J de picas 🂫");
              break;
            case 12:
              System.out.println("Ha salido la Q de picas 🂭");
              break;
            case 13:
              System.out.println("Ha salido la K de picas 🂮");
              break;
            case 14:
              System.out.println("Ha salido la A de picas 🂡");
              break;
            }
              break;
          
        case 1:
          
          switch (numero) {
            
            case 2:
              System.out.println("Ha salido el 2 de corazones 🂲");
              break;
            case 3:
              System.out.println("Ha salido el 3 de corazones 🂳");      
              break;
            case 4:
              System.out.println("Ha salido el 4 de corazones 🂴");
              break;
            case 5:
              System.out.println("Ha salido el 5 de corazones 🂵");
              break;
            case 6:
              System.out.println("Ha salido el 6 de corazones 🂶");
              break;
            case 7:
              System.out.println("Ha salido el 7 de corazones 🂷");
              break;
            case 8:
              System.out.println("Ha salido el 8 de corazones 🂸");
              break;
            case 9:
              System.out.println("Ha salido el 9 de corazones 🂹");
              break;
            case 10:
              System.out.println("Ha salido el 10 de corazones 🂺");
              break;
            case 11:
              System.out.println("Ha salido la J de corazones 🂻");
              break;
            case 12:
              System.out.println("Ha salido la Q de corazones 🂽");
              break;
            case 13:
              System.out.println("Ha salido la K de corazones 🂾");
              break;
            case 14:
              System.out.println("Ha salido la A de corazones 🂱");
              break;
            }
              break;
        case 2:
          
          switch (numero) {
            
            case 2:
              System.out.println("Ha salido el 2 de diamantes 🃂");
              break;
            case 3:
              System.out.println("Ha salido el 3 de diamantes 🃃");      
              break;
            case 4:
              System.out.println("Ha salido el 4 de diamantes 🃄");
              break;
            case 5:
              System.out.println("Ha salido el 5 de diamantes 🃅");
              break;
            case 6:
              System.out.println("Ha salido el 6 de diamantes 🃆");
              break;
            case 7:
              System.out.println("Ha salido el 7 de diamantes 🃇");
              break;
            case 8:
              System.out.println("Ha salido el 8 de diamantes 🃈");
              break;
            case 9:
              System.out.println("Ha salido el 9 de diamantes 🃉");
              break;
            case 10:
              System.out.println("Ha salido el 10 de diamantes 🃊");
              break;
            case 11:
              System.out.println("Ha salido la J de diamantes 🃋");
              break;
            case 12:
              System.out.println("Ha salido la Q de diamantes 🃍");
              break;
            case 13:
              System.out.println("Ha salido la K de diamantes 🃎");
              break;
            case 14:
              System.out.println("Ha salido la A de diamantes 🃁");
              break;
            }
              break;
        case 3:
          
          switch (numero) {
            
            case 2:
              System.out.println("Ha salido el 2 de tréboles 🃒");
              break;
            case 3:
              System.out.println("Ha salido el 3 de tréboles 🃓");      
              break;
            case 4:
              System.out.println("Ha salido el 4 de tréboles 🃔");
              break;
            case 5:
              System.out.println("Ha salido el 5 de tréboles 🃕");
              break;
            case 6:
              System.out.println("Ha salido el 6 de tréboles 🃖");
              break;
            case 7:
              System.out.println("Ha salido el 7 de tréboles 🃗");
              break;
            case 8:
              System.out.println("Ha salido el 8 de tréboles 🃘");
              break;
            case 9:
              System.out.println("Ha salido el 9 de tréboles 🃙");
              break;
            case 10:
              System.out.println("Ha salido el 10 de tréboles 🃚");
              break;
            case 11:
              System.out.println("Ha salido la J de tréboles 🃛");
              break;
            case 12:
              System.out.println("Ha salido la Q de tréboles 🃝");
              break;
            case 13:
              System.out.println("Ha salido la K de tréboles 🃞");
              break;
            case 14:
              System.out.println("Ha salido la A de tréboles 🃑");
              break;
            }
              break;
          }
        }
      }
    
  


    
