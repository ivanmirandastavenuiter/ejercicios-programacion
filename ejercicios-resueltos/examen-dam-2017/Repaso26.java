/**
 * Repaso26
 *
 * @author Iván Miranda Stavenuiter
 */

public class Repaso26 {
  public static void main(String[] args) {
    
    int estacion;
    int temperaturaMaxima = 0;
    int temperaturaMinima = 0;
    int soleadoNublado;
    String clima = " ";
    
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.println("Seleccione la estación del año (1-4): ");
    estacion = Integer.parseInt(System.console().readLine());
    
    switch (estacion) {
      
      case 1:
      
        do {
          
          temperaturaMinima = (int)(Math.random() * 16 + 15);
          temperaturaMaxima = (int)(Math.random() * 16 + 15);
          
        } while (temperaturaMinima > temperaturaMaxima);
        
          soleadoNublado = (int)(Math.random() * 10 + 1);
          
          switch (soleadoNublado) {
            
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
              clima = "soleado";
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              clima = "nublado";
              break;
            }
            
        break;
        
      case 2: 
      
        do {
          
          temperaturaMinima = (int)(Math.random() * 21 + 25);
          temperaturaMaxima = (int)(Math.random() * 21 + 25);
          
        } while (temperaturaMinima > temperaturaMaxima);
        
          soleadoNublado = (int)(Math.random() * 10 + 1);
          
          switch (soleadoNublado) {
            
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
              clima = "soleado";
              break;
            case 9:
            case 10:
              clima = "nublado";
              break;
            }
            
      
        break;
        
      case 3:
      
        do {
          
          temperaturaMinima = (int)(Math.random() * 11 + 20);
          temperaturaMaxima = (int)(Math.random() * 11 + 20);
          
        } while (temperaturaMinima > temperaturaMaxima);
        
          soleadoNublado = (int)(Math.random() * 10 + 1);
          
          switch (soleadoNublado) {
            
            case 1:
            case 2:
            case 3:
            case 4:
              clima = "soleado";
              break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
              clima = "nublado";
              break;
            }
            
        break;
        
      case 4:
          
          do {
          
          temperaturaMinima = (int)(Math.random() * 26 + 0);
          temperaturaMaxima = (int)(Math.random() * 26 + 0);
          
        } while (temperaturaMinima > temperaturaMaxima);
        
          soleadoNublado = (int)(Math.random() * 10 + 1);
          
          switch (soleadoNublado) {
            
            case 1:
            case 2:
              clima = "soleado";
              break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
              clima = "nublado";
              break;
            }
        break;
      }
      
      System.out.println();
      System.out.println("Previsión del tiempo para mañana: ");
      System.out.println("-----------------------------------");
      System.out.println("Temperatura mínima: " + temperaturaMinima + "ºC");
      System.out.println("Temperatura mínima: " + temperaturaMaxima + "ºC");
      System.out.println(clima);
    }
  }

      
    
