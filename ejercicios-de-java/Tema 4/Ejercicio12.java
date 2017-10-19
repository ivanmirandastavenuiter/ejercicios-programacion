/**
* Ejercicio12
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Te propongo hacer un cuestionario sobre la asignatura.");
    System.out.println("¿Te apetece hacerlo?");
    String respuesta = System.console().readLine().toLowerCase();
    
    int calificacion1;
    int calificacion2;
    int calificacion3;
    int calificacion4;
    int calificacion5;
    int calificacion6;
    int calificacion7;
    int calificacion8;
    int calificacion9;
    int calificacion10;
    
    switch (respuesta) {
      case "si":
      System.out.println("Perfecto, vamos con ello.");
      System.out.println("1. ¿En qué lenguaje programamos en clase?");
      System.out.println("a) En Java");
      System.out.println("b) En élfico");
      System.out.println("c) En arameo");
      String pregunta1 = System.console().readLine().toLowerCase();
      
      if (pregunta1.equals("a")) {
        calificacion1 = 1;
      } else {
        calificacion1 = 0;
      }      
      
      System.out.println("2. ¿Qué es el lenguaje MD?");
      System.out.println("a) Eso no es nada");
      System.out.println("b) Es Linux");
      System.out.println("c) Es el lenguaje Mark Down");
      String pregunta2 = System.console().readLine().toLowerCase();
      
      if (pregunta2.equals("c")) {
        calificacion2 = 1;
      } else {
        calificacion2 = 0;
      }
      
      System.out.println("3. ¿Cómo se llama el profesor de Sistemas?");
      System.out.println("a) Primitivo");
      System.out.println("b) Sandalio");
      System.out.println("c) Antonio");
      String pregunta3 = System.console().readLine().toLowerCase();
      
      if (pregunta3.equals("c")) {
        calificacion3 = 1;
      } else {
        calificacion3 = 0;
      }      
      
      System.out.println("4. ¿Qué tienes los viernes a última hora?");
      System.out.println("a) Entornos");
      System.out.println("b) Lenguajes");
      System.out.println("c) BBDD");
      String pregunta4 = System.console().readLine().toLowerCase();
      
      if (pregunta4.equals("b")) {
        calificacion4 = 1;
      } else {
        calificacion4 = 0;
      }
      
      System.out.println("5. ¿Cuál es la contraseña del wifi?");
      System.out.println("a) Mariano");
      System.out.println("b) Zapatos");
      System.out.println("c) Compromiso");
      String pregunta5 = System.console().readLine().toLowerCase();
      
      if (pregunta5.equals("c")) {
        calificacion5 = 1;
      } else {
        calificacion5 = 0;
      }      
      
      System.out.println("6. ¿Cuántos exámenes hemos hecho ya?");
      System.out.println("a) 345");
      System.out.println("b) 4");
      System.out.println("c) 2");
      String pregunta6 = System.console().readLine().toLowerCase();
      
      if (pregunta6.equals("c")) {
        calificacion6 = 1;
      } else {
        calificacion6 = 0;
      }
      
      System.out.println("7. ¿Qué es el html?");
      System.out.println("a) Un lenguaje para hacer páginas web");
      System.out.println("b) Un coche de Nissan");
      System.out.println("c) Un jeroglífico");
      String pregunta7 = System.console().readLine().toLowerCase();
      
      if (pregunta7.equals("a")) {
        calificacion7 = 1;
      } else {
        calificacion7 = 0;
      }      
      
      System.out.println("8. ¿Dónde ve Luis tus ejercicios?");
      System.out.println("a) En Mordor");
      System.out.println("b) En su casa");
      System.out.println("c) En GitHub");
      String pregunta8 = System.console().readLine().toLowerCase();
      
      if (pregunta8.equals("c")) {
        calificacion8 = 1;
      } else {
        calificacion8 = 0;
      }
      
      System.out.println("9. ¿Qué es el sublime text?");
      System.out.println("a) Un pájaro");
      System.out.println("b) Una comida");
      System.out.println("c) Un editor de textos html");
      String pregunta9 = System.console().readLine().toLowerCase();
      
      if (pregunta9.equals("c")) {
        calificacion9 = 1;
      } else {
        calificacion9 = 0;
      }      
      
      System.out.println("10. ¿Es normal que te duela la cabeza después de dar Programación o BBDD?");
      System.out.println("a) Para nada");
      System.out.println("b) Pos claro");
      System.out.println("c) No");
      String pregunta10 = System.console().readLine().toLowerCase();
      
      if (pregunta10.equals("b")) {
        calificacion10 = 1;
      } else {
        calificacion10 = 0;
      }
      
      System.out.println("Tu calificación es de " + ((calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5 + calificacion6 + calificacion7 + calificacion8 + calificacion9 + calificacion10)));
      break;
      case "no":
        System.out.println("Pues cómprate un loro sieso/a");
        
    }
  }
}
    
