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
    
    System.out.println("El precio de los artículos sin el IVA aplicado es " + (primerProducto + segundoProducto + tercerProducto));
    System.out.println("El precio total con el IVA es de " + (primerProducto + segundoProducto + tercerProducto) * 1.21);
  }
}

