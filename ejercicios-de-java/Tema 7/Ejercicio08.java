/**
 * Ejercicio08
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio08 {
  public static void main(String[] args) {

    String[] meses = new String[12];
    
    meses[0] = "enero";
    meses[1] = "febrero";
    meses[2] = "marzo";
    meses[3] = "abril";
    meses[4] = "mayo";
    meses[5] = "junio";
    meses[6] = "julio";
    meses[7] = "agosto";
    meses[8] = "septiembre";
    meses[9] = "octubre";
    meses[10] = "noviembre";
    meses[11] = "diciembre";
    
    int[] temperatura = new int[12];
    
    for (int i = 0; i < 12; i++) {
      
      System.out.println("Introduce la temperatura media de " + meses[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
      System.out.println();
    
    int a = 0;
    
    for (int i = 0; i < 12; i++) {
      
      System.out.print(meses[i] + ": ");
      
      for (int r = 0; r < temperatura[a]; r++) {
        System.out.print("\033[31m**");
      }
      
       System.out.println("\033[37m");
      
      a++;
    }
  }
}
      
      
    
    
