/**
 * Ejercicio8
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.print("¿Cuántas horas has trabajado esta semana? ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Pues en ese caso creo que deberías cobrar unos " + horasTrabajadas * 12 + " euros esta semana");
  }
}
