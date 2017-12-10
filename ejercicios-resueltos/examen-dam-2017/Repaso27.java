/**
 * Repaso 27
 *
 * @author Iván Miranda Stavenuiter
 */

public class Repaso27 {
  public static void main(String[] args) {
    
    int altura;
    int ancho;
    int bichoAltoUno;
    int bichoAnchoUno;
    int bichoAltoDos;
    int bichoAnchoDos;
    int bichoAltoTres;
    int bichoAnchoTres;
    
    System.out.println("Seleccione la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println("Seleccione el ancho: ");
    ancho = Integer.parseInt(System.console().readLine());
    
    int rellenoAlto = altura - 2;
    int rellenoAncho = ancho - 2;
    
    bichoAltoUno = (int)(Math.random() * rellenoAlto);
    bichoAltoDos = (int)(Math.random() * rellenoAlto);
    bichoAltoTres = (int)(Math.random() * rellenoAlto);
    
    do {
      
      bichoAnchoUno = (int)(Math.random() * rellenoAncho);
      bichoAnchoDos = (int)(Math.random() * rellenoAncho);
      bichoAnchoTres = (int)(Math.random() * rellenoAncho);
      
    } while ((bichoAnchoUno == bichoAnchoDos) || (bichoAnchoUno == bichoAnchoTres) || (bichoAnchoDos == bichoAnchoTres));
    
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    
    System.out.println();
    
    for (int i = 0; i < rellenoAlto; i++) {
      
      if ((i == bichoAltoUno) && (i != bichoAltoDos) && (i != bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoUno) {
            System.out.print("@");
          } else {
            System.out.print(" ");
          }
        }
        System.out.print("*");
        System.out.println();
      }
      
      if ((i != bichoAltoUno) && (i == bichoAltoDos) && (i != bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoDos) {
            System.out.print("#");
          } else {
            System.out.print(" ");
          }
        }
        System.out.print("*");
        System.out.println();
      }
      
      if ((i != bichoAltoUno) && (i != bichoAltoDos) && (i == bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoTres) {
            System.out.print("$");
          } else {
            System.out.print(" ");
          }
        }
        System.out.print("*");
        System.out.println();
      }
      
      if ((i == bichoAltoUno) && (i == bichoAltoDos) && (i != bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoUno) {
            System.out.print("@");
          } else if (e == bichoAnchoDos) {
            System.out.print("#");
          } else {
            System.out.print(" ");
          }
        }
        
        System.out.print("*");
        System.out.println();
      }
      
      if ((i == bichoAltoUno) && (i != bichoAltoDos) && (i == bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoUno) {
            System.out.print("@");
          } else if (e == bichoAnchoTres) {
            System.out.print("$");
          } else {
            System.out.print(" ");
          }
        }
        
        System.out.print("*");
        System.out.println();
      }
      
      if ((i != bichoAltoUno) && (i == bichoAltoDos) && (i == bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoDos) {
            System.out.print("#");
          } else if (e == bichoAnchoTres) {
            System.out.print("$");
          } else {
            System.out.print(" ");
          }
        }
        
        System.out.print("*");
        System.out.println();
      }
      
      if ((i != bichoAltoUno) && (i != bichoAltoDos) && (i != bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
            System.out.print(" ");
          }
        
        System.out.print("*");
        System.out.println();
      }
      
      if ((i == bichoAltoUno) && (i == bichoAltoDos) && (i == bichoAltoTres)) {
        
        System.out.print("*");
    
        for (int e = 0; e < rellenoAncho; e++) {
          
          if (e == bichoAnchoDos) {
            System.out.print("#");
          } else if (e == bichoAnchoTres) {
            System.out.print("$");
          } else if (e == bichoAnchoUno) {
            System.out.print("@");
          } else {
            System.out.print(" ");
          }
        }
        
        System.out.print("*");
        System.out.println();
      }
    }

    for (int r = 0; r < ancho; r++) {
      System.out.print("*");
    
  }
}
}


    
    
    
    
