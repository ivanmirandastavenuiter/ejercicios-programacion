/**
* Ejercicio7
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.print("Introduce el precio del primer artículo: ");
    double primerProducto = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el precio del segundo artículo: ");
    double segundoProducto = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el precio del tercer artículo: ");
    double tercerProducto = Double.parseDouble(System.console().readLine());
    
    /*Se pueden incluir salidas formateadas del siguiente modo:
    System.out.printf("Texto %20s %8.2f", datos, datos);
    Cada porcentaje a la izquierda se corresponde con los espacios
    situados entre las comas. 
    */
    
    System.out.println("El precio de los artículos sin el IVA aplicado es " + (primerProducto + segundoProducto + tercerProducto));
    System.out.println("El precio total con el IVA es de " + (primerProducto + segundoProducto + tercerProducto) * 1.21);
  }
}

