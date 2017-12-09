// BUCLE PARA COMPROBAR NÚMEROS ALEATORIOS

for (int i = 0; i < 300; i++) {
      nota = (int)(Math.random() * 25 + 4);
      System.out.print(nota + " ");
    }}}

// SWITCH 

switch (nota) {
        case 1:
          System.out.print(" do ");
          break;
        case 2:
          System.out.print(" re ");
          break;
        case 3:
          System.out.print(" mi ");
          break;
        case 4:
          System.out.print(" fa ");
          break;
        case 5:
          System.out.print(" sol ");
          break;
        case 6:
          System.out.print(" la ");
          break;
        case 7:
          System.out.print(" si ");
          break;
        }
        
// NÚMEROS ALEATORIOS

nota = (int)(Math.random() * 25 + 4);

// DIFERENCIAS ENTRE TRES VARIABLES - TRAGAPERRAS

if ((tiradaUno != tiradaDos) && (tiradaUno != tiradaTres) && (tiradaDos != tiradaTres)) {
        System.out.println("Lo siento, ha perdido");
      }
      
      if ((tiradaUno == tiradaDos) && (tiradaUno == tiradaTres)) {
        System.out.println("Bien, ha ganado");
      }
      
      if ((tiradaUno == tiradaDos) && (tiradaUno != tiradaTres)) {
        System.out.println("Recuperda diez monedas");
      }
      
      if ((tiradaUno != tiradaDos) && (tiradaDos == tiradaTres)) {
        System.out.println("Recuperda diez monedas");
      }
      
      if ((tiradaUno == tiradaTres) && (tiradaDos != tiradaTres)) {
        System.out.println("Recuperda diez monedas");
      }
      
// CÓDIGO DE LA PECERA

/**
 * Repaso11
 *
 * @author Iván Miranda Stavenuiter
 */

public class Repaso11 {
  public static void main(String[] args) {
    
    int altura;
    int ancho;
    int aleatorioAlto;
    int aleatorioAncho;
    int bichoAltoDos;
    int bichoAnchoDos;
    int bichoAltoTres;
    int bichoAnchoTres;
    
    System.out.println();
    System.out.println("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Introduce el ancho: ");
    ancho = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
     }
     System.out.println();
     
    int anchoRelleno = ancho - 2;
    int altoRelleno = altura - 2;
    
    aleatorioAlto = (int)(Math.random() * altoRelleno);
    bichoAltoDos = (int)(Math.random() * altoRelleno);
    bichoAltoTres = (int)(Math.random() * altoRelleno);
    
    do {
      aleatorioAncho = (int)(Math.random() * anchoRelleno);
      bichoAnchoDos = (int)(Math.random() * anchoRelleno);
      bichoAnchoTres = (int)(Math.random() * anchoRelleno);
    } while ((aleatorioAncho == bichoAnchoDos) || (aleatorioAncho == bichoAnchoTres) || (bichoAnchoDos == bichoAnchoTres));
    
    
    for (int i = 0; i < altoRelleno; i++) {
      
      System.out.print("*");
      
      if ((i == aleatorioAlto) && (i == bichoAltoDos) && (i != bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == aleatorioAncho) {
            System.out.print("?");
          } else if (r == bichoAnchoDos) {
            System.out.print("@");
          } else {
          System.out.print(" ");
          }
        }
      }
      
      if ((i == aleatorioAlto) && (i != bichoAltoDos) && (i == bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == aleatorioAncho) {
            System.out.print("?");
          } else if (r == bichoAnchoTres) {
            System.out.print("%");
          } else {
          System.out.print(" ");
          }
        }
      } 
      
      if ((i != aleatorioAlto) && (i == bichoAltoDos) && (i == bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == bichoAnchoDos) {
            System.out.print("@");
          } else if (r == bichoAnchoTres) {
            System.out.print("%");
          } else {
          System.out.print(" ");
          }
        }
      }
      
      if ((i == aleatorioAlto) && (i != bichoAltoDos) && (i != bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == aleatorioAncho) {
            System.out.print("?");
          } else {
          System.out.print(" ");
          }
        }
      }
      
      if ((i != aleatorioAlto) && (i == bichoAltoDos) && (i != bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == bichoAltoDos) {
            System.out.print("@");
          } else {
          System.out.print(" ");
          }
        }
      }
      
      if ((i != aleatorioAlto) && (i != bichoAltoDos) && (i == bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == bichoAltoDos) {
            System.out.print("%");
          } else {
          System.out.print(" ");
          }
        }
      }
      
      if ((i == aleatorioAlto) && (i == bichoAltoDos) && (i == bichoAltoTres)) {
        
        for (int r = 0; r < anchoRelleno; r++) {
          
          if (r == aleatorioAncho) {
            System.out.print("?");
          } else if (r == bichoAnchoDos) {
            System.out.print("@");
          } else if (r == bichoAnchoTres) {
            System.out.print("%");
          } else {
          System.out.print(" ");
          }
        }
      }
      
      if ((i != aleatorioAlto) && (i != bichoAltoDos) && (i != bichoAltoTres)) {
        
        for (int e = 0; e < anchoRelleno; e++) {
          System.out.print(" ");
        }
      }

        System.out.print("*");
        System.out.println();
      }
    
    
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
     }
     System.out.println();
     System.out.print(aleatorioAlto + " ");
     System.out.print(bichoAltoDos + " ");
     System.out.print(bichoAltoTres + " ");
     System.out.print(aleatorioAncho + " ");
     System.out.print(bichoAnchoDos + " ");
     System.out.print(bichoAnchoTres);
   }
 }
 
// PLANTILLA PARA ROTAR UNA POSICIÓN EN UN ARRAY
 
 int a = 0;
    int b = 1;
    int aux = 0;
    
    for (int i = 0; i < 14; i++) {
      
      aux = n[b];
      n[b] = n[a];
      b++;
      n[a] = aux;
    }
      n[0] = aux;

// PLANTILLA PARA BARAJA DE ARRAYS

 int[] n = new int[10];
  int numero;
  int aleatorio;
  int indiceBarajado = 0;
  boolean diferente = true;
  
  for (int i = 0; i < 10; i++) {
    
    numero = (int)(Math.random() * 101);
    n[i] = numero;
    System.out.print(n[i] + " ");
  }
  
  int[] barajado = new int[10];
  int comprobador = 0;
  
  for (int i = 0; i < 10; i++) {

    do {
      
      diferente = true;
      
      aleatorio = (int)(Math.random() * 10);
      
      comprobador = 0;
    
        do {
        
          if (barajado[comprobador] == n[aleatorio]) {
            diferente = false;
          }
            comprobador++;
        } while ((diferente == true) && (comprobador < 10));
        
      if (diferente == true) {
        barajado[indiceBarajado] = n[aleatorio];
        indiceBarajado++;
      }
    } while (diferente == false);
  }
    
      System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.print(barajado[i] + " ");
    }
  }
}

// ÁRBOL DE NAVIDAD

System.out.println("Seleccione la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int piramide = altura - 1;
    int espacios = piramide - 1;
    int follaje = 1;
    int probabilidadAparecer = 0;
    int probabilidadAdorno = 0;
    
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
      System.out.print("*");
      System.out.println();
    
    do {
      
      
      
      for (int e = 0; e < espacios; e++) {
        System.out.print(" ");
      }
       
      for (int e = 0; e < follaje; e++) {
        
        probabilidadAparecer = (int)(Math.random() * 3);
        probabilidadAdorno = (int)(Math.random() * 3);
        
        switch (probabilidadAparecer) {
          case 0:
          case 1:
            System.out.print("^");
            break;
          case 2:
              
            switch (probabilidadAdorno) {
              case 0:
              case 1:
                System.out.print("O");
                break;
              case 2: 
                System.out.print("*");
              }
              break;
            }
      }
       
      System.out.println();
      follaje += 2;
      espacios--;
      
      } while (espacios >= 0);
    }
  }
  
  // SENDERO OBSTÁCULOS
  
  int espacios = 14;
  int relleno = 4;
  int giros = 0;
  boolean obstaculo;
  int probabilidadDeAparecer;
  int posicionObstaculo;
  int tipoObstaculo;
  
  System.out.println("Seleccione la longitud en metros: ");
  int longitud = Integer.parseInt(System.console().readLine());
  
  for (int e = 0; e < longitud; e++) {
    
    probabilidadDeAparecer = (int)(Math.random() * 2);
  
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    
    switch (probabilidadDeAparecer) {
      
      case 0:
    
        System.out.print("#");
  
        for (int i = 0; i < relleno; i++) {
          System.out.print(" ");
        }
  
        System.out.print("#");
        System.out.println();
    
        giros = (int)(Math.random() * 3);
    
      switch (giros) {
        case 0:
          espacios--;
          break;
        case 1:
          espacios = espacios;
          break;
        case 2:
          espacios++;
          break;
        }
        break;
      
      case 1: 

        posicionObstaculo = (int)(Math.random() * 4);
        tipoObstaculo = (int)(Math.random() * 2);
        
        switch (tipoObstaculo) {
          case 0:
            
            obstaculo = false;
            System.out.print("#");
  
            for (int i = 0; i < relleno; i++) {
                
              if (obstaculo == false) {
          
                  if (i == posicionObstaculo) {
                    System.out.print("*");
                    obstaculo = true;
                  } else {
                    System.out.print(" ");
                  } 
                } else {
                  System.out.print(" ");
                }
              }
              
          System.out.print("#");
          System.out.println();
    
          giros = (int)(Math.random() * 3);
    
          switch (giros) {
            case 0:
              espacios--;
              break;
            case 1:
              espacios = espacios;
              break;
            case 2:
              espacios++;
              break;
            }
            break;
            
          case 1:
        
            obstaculo = false;
            System.out.print("#");
  
            for (int i = 0; i < relleno; i++) {
                
              if (obstaculo == false) {
          
                  if (i == posicionObstaculo) {
                    System.out.print("O");
                    obstaculo = true;
                  } else {
                    System.out.print(" ");
                  } 
                } else {
                  System.out.print(" ");
                }
              }
              
              
          System.out.print("#");
          System.out.println();
    
          giros = (int)(Math.random() * 3);
    
          switch (giros) {
            case 0:
              espacios--;
              break;
            case 1:
              espacios = espacios;
              break;
            case 2:
              espacios++;
              break;
            }
            break;
          }
        }
      }
    }
  }


