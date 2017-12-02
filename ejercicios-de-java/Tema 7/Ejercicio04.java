/**
 * Ejercicio04
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres numero ,
 * cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero . En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero . A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio04 {
  public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    int n;
    
    for (int i = 0; i < 20; i++)  {
      n = (int)(Math.random() * 101);
      numero[i] = n;
      cuadrado[i] = n * n;
      cubo[i] = n * n * n;
    }
    
    System.out.printf("%-10s %-10s %-10s\n", "Número", "Cuadrado", "Cubo");
      
    for (int i = 0; i < 20; i++) {
       System.out.println();
       System.out.printf("%-10d %-10d %-10d\n", numero[i], cuadrado[i], cubo[i]);
     }
   }
 }
       
        
