/**
* Ejercicio13
* 
* Este ejercicio lo hace un compañero con if y con else. Se puede especificar
* el contenido de los else.
* 
* Si yo pido tres números a, b y c. 
* 
* Para intercambiar valores: a es 5 y b es 7.
* 
* Tienes que usar una variable auxiliar. La puedo llamar aux.
* 
* Aux = 0
* 
* Guardo a: aux = a. Ahora aux vale 5.
* Ahora sí que meto en a lo que tiene b. a = b. Ahora tienes un siete.
* 
* Y por último b = aux. Ya tienes los valores intercambiados.
* 
* Volvemos a los tres números.
* 
* Suponemos 20, 10 y 6. Se puede hacer en tres pasos. Se compara primero con segundo,
* segundo con tercero y primero con segundo de nuevo. 
* 
* Esta es la solución que propone Luis. ES CON INTERCAMBIO DE VALORES.
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Dime tres números que te los ordeno chaval: ");
    
    int uno = Integer.parseInt(System.console().readLine());
    int dos = Integer.parseInt(System.console().readLine());
    int tres = Integer.parseInt(System.console().readLine());
    
    if ((uno < dos) && (dos < tres)) {
      System.out.println(uno + ", " + dos + ", " + tres);
    }
    if ((uno < tres) && (tres < dos)) {
      System.out.println(uno + ", " + tres + ", " + dos);
    }
    if ((dos < uno) && (uno < tres)) {
      System.out.println(dos + ", " + uno + ", " + tres);
    }
    if ((dos < tres) && (tres < uno)) {
      System.out.println(dos + ", " + tres + ", " + uno);
    }
    if ((tres < dos) && (dos < uno)) {
      System.out.println(tres + ", " + dos + ", " + uno);
    }
    if ((tres < uno) && (uno < dos)) {
      System.out.println(tres + ", " + uno + ", " + dos);
    }
  }
}
    
    
    
