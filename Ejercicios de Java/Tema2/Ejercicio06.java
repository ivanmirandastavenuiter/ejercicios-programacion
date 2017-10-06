/**
 * Ejercicio06
 *
 * @author Luis J. Sánchez
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.printf("%-10s\n", "Factura");
    System.out.printf("%-15s %-15s\n", "Producto", "Precio");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.printf("%-15s %-15s\n", "Placa Base", "240.85");
    System.out.printf("%-15s %-15s\n", "Procesador", "140.82");
    System.out.printf("%-15s %-15s\n", "Memoria", "70.95");
    System.out.printf("%-15s %-15s\n", "Ventilador", "19.90");
    System.out.printf("%-15s %-15s\n", "Pantalla", "320.50");
    System.out.printf("%-15s %-15s\n", "Torre", "52.20");
    
    double placa = 240.85;
    double procesador = 140.82;
    double memoria = 70.95;
    double ventilador = 19.90;
    double pantalla = 320.50;
    double torre = 52.20;
    double resultado;
    
    resultado = (double)placa + (double)procesador + (double)memoria + (double)ventilador + (double)pantalla + (double)torre;
    System.out.printf("%-15s %-15s\n", "Total", resultado);
  }
}
