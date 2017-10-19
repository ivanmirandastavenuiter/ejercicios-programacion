/**
* Ejercicio9
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* 
* Lo primero es calcular discriminante (número que va dentro de la raíz).
* En caso de ser negativo, esta ni se realiza, puesto que no tiene
* solución.
* 
* En la solución, Luis propone como alternativas (else if) valores de las
* incógnitas iguales a 0 o distintas a 0. En el caso de que a, b y c fuesen
* 0, la solución es una identidad (0=0).
* Si son distintos a 0, dado que ya está el if discriminante < 0, estos
* van a ser distintos pero positivos, con lo que se podrá calcular. 
* 
* Entonces, lo que tienes que hacer es cuándo cada incógnita vale cada cosa.
* Es decir, iguales a cero y distintos a cero.
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Teniendo en cuenta la siguiente ecuación de segundo");
    System.out.println("grado, ax2 + bx + c = 0, resuelve la operación.");
    //Para resolver una ecuación de segundo grado, se aplica esta fórmula:
    //x1 = (-b + raíz cuadrada de (b2 - 4ac))/2a
    //x2 = (-b - raíz cuadrada de (b2 - 4ac))/2a
    //Por tanto, vamos a obtener dos resultados
    
    System.out.println("Introduce un valor para a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce un valor para b: ");
    double b = Double.parseDouble(System.console().readLine());
   
    System.out.println("Introduce un valor para c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double resultado1 = -b + Math.sqrt((b*b) - (4*a*c))/2*a;
    double resultado2 = -b - Math.sqrt((b*b) - (4*a*c))/2*a;
    
    System.out.println("Tenemos dos resultados posibles:");
    System.out.println("Si es -b + raíz, el resultado es " + resultado1);
    System.out.println("Si es -b - raíz, el resultado es " + resultado2);
    
    if (resultado1 < 0) {
      System.out.println("Revisa las cantidades. Puede haber números negativos en la raíz cuadrada");
    } else {
      System.out.println("Enhorabuena, sabes hacer una ecuación de segundo grado");
  }
    if (resultado2 < 0) {
      System.out.println("Revisa las cantidades. Puede haber números negativos en la raíz cuadrada");
    } else {
      System.out.println("Enhorabuena, sabes hacer una ecuación de segundo grado");
  }
}
}

    
