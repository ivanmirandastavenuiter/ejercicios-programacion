/**
* Ejercicio30
* 
* Realiza una programa que calcule las horas transcurridas entre dos horas de
* dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
* El día de la semana se puede pedir como un número (del 1 al 7) o como una
* cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
* los datos correctamente y que el segundo día es posterior al primero.
*
* Ejemplo:
* Por favor, introduzca la primera hora.
* Día: lunes
* Hora: 18
* Por favor, introduzca la segunda hora.
* Día: martes
* Hora: 20
* Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio30 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula las horas que hay entre dos días de");
    System.out.println("de la semana. El 24 no se considerará válido. Escribe los días con tilde, por favor.");
    System.out.println();
    
    System.out.println("Introduce los datos del primer día.");
    System.out.println("Día: ");
    String diaUno = System.console().readLine();
    System.out.println("Hora: ");
    int horaUno = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce los datos del segundo día.");
    System.out.println("Día: ");
    String diaDos = System.console().readLine();
    System.out.println("Hora: ");
    int horaDos = Integer.parseInt(System.console().readLine());
    
    int ordenDiaUno = 0;
    int ordenDiaDos = 0;
    int horasRestantesPrimero = 0;
    int diasCompletos = 0;
    int horasRestantesSegundo = 0;
    int horaPrimera = horaUno;
    
    switch (diaUno) {
      
      case "lunes":
        ordenDiaUno = 1;
        break;
      
      case "martes":
        ordenDiaUno = 2;
        break;
      
      case "miércoles":
        ordenDiaUno = 3;
        break;
      
      case "jueves":
        ordenDiaUno = 4;
        break;
      
      case "viernes":
        ordenDiaUno = 5;
        break;
      
      case "sábado":
        ordenDiaUno = 6;
        break;
      
      case "domingo":
        ordenDiaUno = 7;
        break;
      
        default: 
      
        System.out.println("El primer día introducido no es correcto.");
      }
      
    if ((horaUno < 0) || (horaUno > 23)) {
      System.out.println("Parece que la hora introducida no es correcta.");
      System.out.println("Inténtalo de nuevo.");
    }
    
    switch (diaDos) {
      
      case "lunes":
        ordenDiaDos = 1;
        break;
      
      case "martes":
        ordenDiaDos = 2;
        break;
      
      case "miércoles":
        ordenDiaDos = 3;
        break;
      
      case "jueves":
        ordenDiaDos = 4;
        break;
      
      case "viernes":
        ordenDiaDos = 5;
        break;
      
      case "sábado":
        ordenDiaDos = 6;
        break;
      
      case "domingo":
        ordenDiaDos = 7;
        break;
      
      default: 
      
        System.out.println("El segundo día introducido no es correcto.");
      }
      
    if ((horaDos < 0) || (horaDos > 23)) {
      System.out.println("Parece que la hora introducida no es correcta.");
      System.out.println("Inténtalo de nuevo.");
    }
    
    if (ordenDiaUno >= ordenDiaDos) {
      System.out.println("El segundo día debe ser posterior. Inténtalo de nuevo.");
    }
    

      do { 
        horaUno++;
        horasRestantesPrimero++;
      } while (horaUno <= 23);
    
      for (int i = ordenDiaUno + 1; i < ordenDiaDos; i++) {
        diasCompletos += 24;
      }
      
      do { 
        horasRestantesSegundo++;
      } while (horasRestantesSegundo <= horaDos);
      
      horasRestantesSegundo -= 1;
      
      if ((horaPrimera >= 0) && (horaPrimera <= 23) && (horaDos >= 0) && (horaDos <= 23) && (ordenDiaUno < ordenDiaDos)) {
      
        System.out.println();
        System.out.print("Entre las " + horaPrimera + ":00 horas del " + diaUno + " y las " + horaDos + ":00 horas del " + diaDos);
        System.out.print(" hay " + (horasRestantesPrimero + diasCompletos + horasRestantesSegundo) + " horas.");
      }
      
  }
}
    
    
    
        
      
    

