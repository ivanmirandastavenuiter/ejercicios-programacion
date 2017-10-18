/**
* Ejercicio4
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.print("Por favor, dime las horas que has trabajado esta semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas <= 40) {
      System.out.print("En ese caso vas a cobrar unos " + horas*12 + "\n");
      System.out.print("euros ya que veo que no has hecho ninguna hora extra");
    }
    else {
      System.out.print("En ese caso vas a cobrar unos " + ((16*(horas - 40)) + (12*40)) + "\n");
      System.out.print("euros por las horas extras que has echado");
    }
  }
}
