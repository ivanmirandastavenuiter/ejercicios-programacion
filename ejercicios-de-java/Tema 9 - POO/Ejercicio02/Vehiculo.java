/*
 * Definición de la superclase Vehículo.
 */
package ejercicio08;

/**
 *
 * @author Iván Miranda.
 */
public abstract class Vehiculo {
  
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  
  public Vehiculo(){
    Vehiculo.vehiculosCreados++;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }
}
