/*
 * Programa main para comprobar las clases definidas.
 */
package ejercicio05;

/**
 *
 * @author Iván Miranda.
 */
public class Main {
  public static void main(String[] args) {
    
    // Declaración de instancias.
    
    Pizza p1 = new Pizza("margarita", "familiar");
    System.out.println(p1);
    Pizza p2 = new Pizza("funghi", "mediana");
    System.out.println(p2);
    Pizza p3 = new Pizza("carbonara", "pequeña");
    System.out.println(p3);
    Pizza p4 = new Pizza("cuatro estaciones", "familiar");
    System.out.println(p4);
    System.out.println();
    
    // Prueba de las funciones.
    
    p2.sirve();
    p4.sirve();
    p2.sirve();
    p4.sirve();
    
    // Recuento mediante el atributo de clase.
    
    System.out.println();
    System.out.println("Se han servido " + Pizza.getServidas() + 
      " pizzas.");
    System.out.println("Se han pedido " + Pizza.getPedidas() + 
      " pizzas.");
  }
}
