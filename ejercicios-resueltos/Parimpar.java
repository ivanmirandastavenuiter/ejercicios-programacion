/**
 *
 *
 * Par impar, alternando en array
 * 
 * 
 * @author Iván Miranda Stavenuiter
 */

public class Parimpar {
  public static void main(String[] args) {
    
    int[] n = new int[15];
    int numero;
    int[] par = new int[15];
    int[] impar = new int[15];
    int pares = 0;
    int impares = 0;
    
    System.out.println("Array original: ");
    
    for (int i = 0; i < 15; i++) {
      
      numero = (int)(Math.random() * 101);
      n[i] = numero;
      System.out.print(numero + " ");
      
      if (n[i] % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
    
    int indicePar = 0;
    int indiceImpar = 0;
    
    for (int i = 0; i < 15; i++) {
      
      if (n[i] % 2 == 0) {
        par[indicePar] = n[i];
        indicePar++;
      } else {
        impar[indiceImpar] = n[i];
        indiceImpar++;
      }
    }
    
    int[] ordenado = new int[15];
    
    if (pares > impares) {
      
    indicePar = 0;
    indiceImpar = 1;
      
      for (int d = 0; d < impares; d++) {
        
        ordenado[indicePar] = par[d];
        ordenado[indiceImpar] = impar[d];
        indicePar += 2;
        indiceImpar += 2;
      }
      
      for (int d = impares; d < pares; d++) {
        
        ordenado[indicePar] = par[d];
        indicePar++;
      }
    } else {
      
      indicePar = 0;
      indiceImpar = 1;
      
      for (int d = 0; d < pares; d++) {
        
        ordenado[indicePar] = par[d];
        ordenado[indiceImpar] = impar[d];
        indicePar += 2;
        indiceImpar += 2;
      }
      
      for (int d = pares; (d < impares) && (indiceImpar < 15); d++) {
        
        ordenado[indiceImpar] = impar[d];
        indiceImpar++;
      }
    }
      
    System.out.println();
    System.out.print("Array final: ");
    System.out.println();  
    
    for (int r = 0; r < 15; r++) {
      System.out.print(ordenado[r] + " ");
    }
  }
}

    
    
  
    
  
    
    

      
      
      
      
        
        
      
      
      
        
    
    
  
        
        
        
        
        
        
        
  
  
  
  
    
    
    
    
