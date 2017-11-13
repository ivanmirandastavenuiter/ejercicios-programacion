/**
* Ejercicio33
* 
* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
* programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
* dos asteriscos menos en la base para simular la curvatura de las esquinas
* inferiores.
*
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio33 {
  public static void main(String[] args) {
    
    //Según el ejemplo la longitud en horizontal es igual a la altura,
    //con lo que esta se puede tomar como referencia.
    
    System.out.println("Este programa pinta una U por pantalla. Lo único");
    System.out.println("que tienes que hacer es introducir la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    
    //Si la altura es igual también al ancho de la letra, y teniendo en 
    //cuenta que son dos puntos separados por espacios, el primer punto
    //se puede hacer con una variable iniciada en 1 y el resto de esa
    //línea calcularse mediante alturaIntroducida - 1, como en la pirámide.
    
    int asterisco = 1;
    int altura = alturaIntroducida;
    
    //Creo una variable auxiliar que tome el valor de la altua introducida
    //por teclado, ya que luego me afecta al funcionamiento del bucle si
    //la dejo como está.
    
    do {
    
      for (int i = asterisco; i > 0; i--) {
        System.out.print("*");
      }
    
    //El primer asterisco ya lo tenemos. Ahora el resto de la línea. Lo 
    //siguiente son tres espacios. También sabemos el total de carácteres
    //restantes: todo espacios menos el último. Es decir, tenemos que pintar
    //todo espacios - 1, que es el asterisco del otro lado de la letra.
    
      int espacios = altura - 2;
    
    //Se le restan 2 por cada uno de los asteriscos. Con esta variable, ya
    //podemos crear la línea de espacios.
    
      for (int i = espacios; espacios > 0; espacios--) {
        System.out.print(" ");
      }
    
    //Ya tenemos los espacios listos. Ahora lo siguiente: otro for exacto
    //al primero.
    
      for (int i = asterisco; i > 0; i--) {
      System.out.print("*");
      }
      System.out.println();
    
    //Pero esto es solo una línea: queremos que se repita a lo largo de las
    //unidades de altura. Pues se hace un do-while que haga vueltas hasta
    //agotar la variable.
    
      alturaIntroducida--;
    
    } while (alturaIntroducida > 1);
  
    //Ya está lista la estructura, sin embargo la última línea tiene que ser
    //distinta. Ponemos el bucle hasta la penúltima y modificamos la última
    //línea. Sería al revés: dos espacios en los lados y relleno de asteriscos.
    
    int base = altura - 2;
      
      for (int i = asterisco; i > 0; i--) {
        System.out.print(" ");
      }
      
      for (int i = base; i > 0; i--) {
        System.out.print("*");
      }
    }
  }
      
    
    
    
    
