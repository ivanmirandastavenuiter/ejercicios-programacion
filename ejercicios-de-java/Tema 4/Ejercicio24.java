/**
* Ejercicio24
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("1. Programador Junior");
    System.out.println("2. Programador Senior");
    System.out.println("3. Jefe de proyecto\n");
    System.out.println("Introduzca el cargo del empleado(1-3): ");
    int puesto = Integer.parseInt(System.console().readLine());
    
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    int dias = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca su estado estado civil (1- Soltero, 2- Casado): ");
    int estado = Integer.parseInt(System.console().readLine());
    
    double sueldo1 = 950;
    double sueldo2 = 1200;
    double sueldo3 = 1600;
    double diasTotales = 30 * dias;
    double bruto = sueldo1 + diasTotales;
    double bruto2 = sueldo2 + diasTotales;
    double bruto3 = sueldo3 + diasTotales;
    double retencion1 = bruto * 0.20;
    double retencion2 = bruto * 0.25;
    double retencion3 = bruto2 * 0.20;
    double retencion4 = bruto2 * 0.25;
    double retencion5 = bruto3 * 0.20;
    double retencion6 = bruto3 * 0.25;
    double neto = bruto - retencion1;
    double neto2 = bruto - retencion2;
    double neto3 = bruto2 - retencion3;
    double neto4 = bruto2 - retencion4;
    double neto5 = bruto3 - retencion5;
    double neto6 = bruto3 - retencion6;
    
    switch (puesto) {
      
      case 1:
        System.out.printf("%-25s %8.2f\n", "Sueldo base", sueldo1);
        System.out.printf("%-25s %8.2f\n", "Dietas (" + dias + " viajes)", diasTotales);
        System.out.printf("%-25s %8.2f\n", "Sueldo bruto", bruto);
        
      if (estado == 2) {
        System.out.printf("%-25s %8.2f\n", "Retención IRPF (20%)", retencion1);
        System.out.printf("%-25s %8.2f\n", "Sueldo neto", neto);
      }
      
       if (estado == 1) {
        System.out.printf("%-25s %8.2f\n", "Retención IRPF (25%)", retencion2);
        System.out.printf("%-25s %8.2f\n", "Sueldo neto", neto2);
      }
      
      break;
      
      case 2:
        System.out.printf("%-25s %8.2f\n", "Sueldo base", sueldo2);
        System.out.printf("%-25s %8.2f\n", "Dietas (" + dias + " viajes)", diasTotales);
        System.out.printf("%-25s %8.2f\n", "Sueldo bruto", bruto2);
        
      if (estado == 2) {
        System.out.printf("%-25s %8.2f\n", "Retención IRPF (20%)", retencion3);
        System.out.printf("%-25s %8.2f\n", "Sueldo neto", neto3);
      }
      
       if (estado == 1) {
        System.out.printf("%-25s %8.2f\n", "Retención IRPF (25%)", retencion4);
        System.out.printf("%-25s %8.2f\n", "Sueldo neto", neto4);
      }
      
      break;
      
      case 3:
        System.out.printf("%-25s %8.2f\n", "Sueldo base", sueldo3);
        System.out.printf("%-25s %8.2f\n", "Dietas (" + dias + " viajes)", diasTotales);
        System.out.printf("%-25s %8.2f\n", "Sueldo bruto", bruto3);
        
      if (estado == 2) {
        System.out.printf("%-25s %8.2f\n", "Retención IRPF (20%)", retencion5);
        System.out.printf("%-25s %8.2f\n", "Sueldo neto", neto5);
      }
      
       if (estado == 1) {
        System.out.printf("%-25s %8.2f\n", "Retención IRPF (25%)", retencion6);
        System.out.printf("%-25s %8.2f\n", "Sueldo neto", neto6);
      }
      
      break;
    }
  }
}

    
    
