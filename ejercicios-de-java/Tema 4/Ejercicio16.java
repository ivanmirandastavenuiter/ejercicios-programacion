/**
* Ejercicio16
* 
* Si ponemos delante de una variable ++ o bien detrás igualmente, lo que
* estamos haciendo es incrementar en una unidad el valor de x. Si está 
* delante se hace primero el incremento. Si se pone detrás primero se aplica
* el valor de la variable y luego el de ++.
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    
    int nota = 0;
    
    System.out.println("¿Qué tal campeón/a?");
    System.out.println("Te propongo hacer un test de fidelidad para ver");
    System.out.println("si tu novio/a es, respectivamente, un gracioso");
    System.out.println("y/o una graciosa.");
    System.out.println("\nContesta, si eres tan amable, con v o f, según");
    System.out.println("sea verdadero o falso y pulsa intro.");
    
    System.out.println("\n1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    String pregunta1 = System.console().readLine();
    
    if (pregunta1.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n2. Ha aumentado sus gastos de vestuario.");
    String pregunta2 = System.console().readLine();
    
    if (pregunta2.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n3. Ha perdido el interés que mostraba anteriormente por ti.");
    String pregunta3 = System.console().readLine();
    
    if (pregunta3.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    String pregunta4 = System.console().readLine();
    
    if (pregunta4.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n5. No te deja que mires la agenda de su teléfono móvil.");
    String pregunta5 = System.console().readLine();
    
    if (pregunta5.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    String pregunta6 = System.console().readLine();
    
    if (pregunta6.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    String pregunta7 = System.console().readLine();
    
    if (pregunta7.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    String pregunta8 = System.console().readLine();
    
    if (pregunta8.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n9. Has notado que últimamente se perfuma más.");
    String pregunta9 = System.console().readLine();
    
    if (pregunta9.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    System.out.println("\n10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    String pregunta10 = System.console().readLine();
    
    if (pregunta10.equals("v")) {
      nota++;
      nota++;
      nota++;
    } 
    
    if ((nota >= 0) && (nota <=10)) {
    System.out.println("\nEnhorabuena loco/a, has sacado " + nota + " puntos.");
    System.out.println("\nPuedes tirar pa casa contento/a");
    }
    
    if ((nota >= 11) && (nota <=22)) {
    System.out.println("\nMmm... cuidao loco/a, que has sacao " + nota + " puntos.");
    System.out.println("\nYo estaría ahíiiii, con el resquemor.");
    }
    
    if ((nota >= 22) && (nota <=30)) {
    System.out.println("\n" + nota + " puntos.");
    System.out.println("\nTienes más cuernos que un reno picha. Ve pensando en buscarte otra shorva/o.");
    }
  }
}
    
