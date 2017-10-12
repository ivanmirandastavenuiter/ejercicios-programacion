/**
* Ejercicio12
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduce la nota del primer examen: ");
    double primero = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota final que te gustaría obtener: ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    //La suma convencional de las notas sería con el 50%. Entonces, se 
    //multiplica cada cantidad por su porcentaje, se suman y se dividen 
    //100.
    //notaFinal = ((primero * 40) + (segundo * 60))/100
    //segundo = ((notaFinal * 100) - (primero * 40))/60
    
    double segundo = ((notaFinal*100)-(primero*40))/60;
    
    System.out.print("Para sacar un " + notaFinal + " tienes que obtener una nota de " + segundo + " en el segundo examen");
  }
}
