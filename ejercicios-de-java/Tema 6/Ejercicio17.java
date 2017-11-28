/**
 * Ejercicio17
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    
    //Lo primero que nos pide el ejercicio es dibujar el rectángulo que
    //contendrá al pececito dentro.
    
    System.out.println("Este programa pinta una pecera con un pececito muy");
    System.out.println("bonito dentro. Recuerda que la altura y la anchura");
    System.out.println("han de ser como mínimo de 4.");
    System.out.println();
    System.out.println("Por favor, introduce la altura del rectángulo: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce la anchura del rectángulo: ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int relleno = ancho - 2;
    int auxiliar = altura - 2;
    int auxVertical = altura - 2;
    int auxHorizontal = ancho - 2;
    int lineasUno;
    int lineasDos;
    int espaciosUno;
    int espaciosDos;
    
    for (int i = 0; i < ancho; i++) {
      System.out.print("* ");
    }
      System.out.println();
      
    //Empezamos con las líneas verticales:
    
    lineasUno = (int)(Math.random() * auxiliar + 1);
    
    for (int i = 1; i < lineasUno; i++) {
      
      System.out.print("* ");
      
      for (int n = 0; n < relleno; n++) {
      System.out.print("  ");
      }
      
      System.out.print("*");
      System.out.println();
    }
    
    //Aquí lo que estamos haciendo es decirle al programa cuántas líneas
    //debe imprimir hasta llegar a la línea en la que vamos a insertar el pez,
    //que va a ser otro número aleatorio. Iniciamos la i del for ya en 1
    //porque el límite de las iteraciones no queremos incluirlo. Esa línea
    //será la indicada para insertar el pez.
    
    //Ya hemos llegado a la altura aleatoria en la que insertamos el pez.
    //Ahora hacemos el mismo proceso pero en horizontal. Restando 2 al ancho,
    //creo un número aleatorio de 1 a (ancho - 2) y justo ahí meto el símbolo.
    //Lo inicio en 1 por la misma razón que antes: el símbolo contará como
    //un espacio, por lo que si ponemos 0 nos excederíamos.
    
    System.out.print("* ");
    
    espaciosUno = (int)(Math.random() * relleno + 1);
    
      for (int i = 1; i < espaciosUno; i++) {
        System.out.print("  ");
      }
      
    //Pintamos el relleno como queramos.
      
    System.out.print("😎 ");
      
    espaciosDos = relleno - espaciosUno;
    
    //Ahora completamos los espacios hasta terminar la línea. Al ancho
    //le restamos los espacios ocupados más el símbolo, que coincide con
    //el número aleatorio. En este caso sí que hay que iniciar a 0 o bien
    //igualar al límite de iteraciones. 
      
      for (int i = 0; i < espaciosDos; i++) {
        System.out.print("  ");
      }
        System.out.print("*");
        System.out.println();
        
    //Por último, tomamos las líneas restantes a imprimir en cuanto a altura.
    //Aquí hemos iniciado en 0 de nuevo, ya que antes teníamos el excedente
    //del símbolo y ahora no.
    
    lineasDos = auxiliar - lineasUno;
    
      for (int i = 0; i < lineasDos; i++) {
      
        System.out.print("* ");
      
        for (int n = 0; n < relleno; n++) {
          System.out.print("  ");
          }
      
        System.out.print("*");
        System.out.println();
    } 
    
    //Línea final del rectángulo.
      
    for (int i = 0; i < ancho; i++) {
      System.out.print("* ");
    }
  }
}
    
    
    
       
    
    
  
    
