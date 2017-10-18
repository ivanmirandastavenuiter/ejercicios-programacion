/**
* Ejercicio6
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Teniendo en cuenta la respectiva fórmula de tiempo: ");
    System.out.println("t = raíz cuadrada de (2h/g), ");
    System.out.println("que g = 9.81 y que h es la altura, ");
    System.out.println("asigna un valor a h para poder calcular el tiempo: ");
    double h = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduciendo ese valor, t es igual a " + Math.sqrt((2*h)/9.81));
  }
}

