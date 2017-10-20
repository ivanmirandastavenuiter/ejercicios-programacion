/**
* Ejercicio15
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Vamos a dibujar una pirámide campeón/a.");
    System.out.println("Y tú me vas a ayudar a hacerla.");
    System.out.println("Para ello, por favor, introduce el símbolo");
    System.out.println("o caracter que te gustaría ver: \n");
    
    String h = System.console().readLine();
    
    System.out.println("\n¡Gracias! Ahora dime hacia dónde quieres que ");
    System.out.println("apunte el vértice de la pirámide escribiendo ");
    System.out.println("la palabra correspondiente: \n");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Derecha");
    System.out.println("4. Izquierda\n");
    
    String direccion = System.console().readLine().toLowerCase();
    
    switch (direccion) {
      case "arriba":
      System.out.println("\n    "+h+"    ");
      System.out.println("   "+h+h+h+"    ");
      System.out.println("  "+h+h+h+h+h+"   ");
      System.out.println(" "+h+h+h+h+h+h+h+" ");
      System.out.println(h+h+h+h+h+h+h+h+h);
      break;
      case "abajo":
      System.out.println("\n"+h+h+h+h+h+h+h+h+h);
      System.out.println(" "+h+h+h+h+h+h+h+" ");
      System.out.println("  "+h+h+h+h+h+"  ");
      System.out.println("   "+h+h+h+"   ");
      System.out.println("    "+h+"    ");
      break;
      case "derecha":
      System.out.println("\n"+h);
      System.out.println(h+h+h);
      System.out.println(h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h);
      System.out.println(h+h+h);
      System.out.println(h);
      break;
      case "izquierda":
      System.out.println("\n       "+h);
      System.out.println("     "+h+h+h);
      System.out.println("   "+h+h+h+h+h);
      System.out.println(" "+h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h+h);
      System.out.println(" "+h+h+h+h+h+h+h);
      System.out.println("   "+h+h+h+h+h);
      System.out.println("     "+h+h+h);
      System.out.println("       "+h);
      break;
    }
  }
}
