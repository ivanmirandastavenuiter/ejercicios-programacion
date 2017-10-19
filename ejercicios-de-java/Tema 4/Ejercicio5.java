/**
* Ejercicio5
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* 
* Si la operación da lugar a resultados que no se pueden calcular, hay 
* que poner un if explicándolo en el caso de que se produzca ese fallo.
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Mira la siguiente ecuación: ax + b = 0");
    //Lo primero que hay que hacer es despejarla:
    // ax + b = 0; ax = -b; x = -b/a
    //La ecuación final sería x = -b/a
    System.out.println("Si quieres saber el valor de x, asígnale un valor a la a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Ahora haz lo mismo con la b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.println("Si resolvemos la ecuación, tenemos que x es igual a " + (-b/a));
  }
}
