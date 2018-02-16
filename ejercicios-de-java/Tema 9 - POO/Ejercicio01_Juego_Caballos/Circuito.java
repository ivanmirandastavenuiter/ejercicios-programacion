/*
 * Definición de la clase Circuito.
 */
package ejercicio01;

/**
 *
 * @author Iván Miranda
 */
public class Circuito {
  
  // Definición de los atributos.
  
  String nombre;
  int extension;
  
  public Circuito(int extension) {
    this.extension = extension;
  }

  public String getNombre() {
    return nombre;
  }

  public int getExtension() {
    return extension;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setExtension(int extension) {
    this.extension = extension;
  }
  
  public String pinta(Caballo podemos, Caballo psoe, Caballo pp, Caballo ciudadanos) {

    String ROJO = "\033[41m";
    String AZUL = "\033[44m";
    String MORADO = "\033[45m";
    String NARANJA = "\033[43m";
    String RESET = "\u001B[0m";
    String plano = "";

    if (podemos.isGanador() != true && psoe.isGanador() != true
      && pp.isGanador() != true && ciudadanos.isGanador() != true) {
      plano += "\n";
      for (int a = 0; a < 5; a++) {

        if (a == podemos.getPista() && podemos.getDopaje() < 3) {
          for (int b = 0; b < (this.extension); b++) {
            if (b < podemos.getPosicion()) {
              if (b == this.extension - 1) {
                plano += " =|";
              } else {
                plano += " >";
              }
            } else if (b == podemos.getPosicion()) {
              if (podemos.getPosicion() == this.extension - 1) {
                plano += " " + MORADO + "☢|" + RESET;
              } else {
                plano += " " + MORADO + "☢" + RESET;
              }
            } else if (b == this.extension - 1) {
              plano += " =|";
            } else {
              plano += " =";
            }
          }
        } else if (a == psoe.getPista() && psoe.getDopaje() < 3) {
          for (int b = 0; b < (this.extension); b++) {
            if (b < psoe.getPosicion()) {
              if (b == this.extension - 1) {
                plano += " =|";
              } else {
                plano += " >";
              }
            } else if (b == psoe.getPosicion()) {
              if (psoe.getPosicion() == this.extension - 1) {
                plano += " " + ROJO + "☢|" + RESET;
              } else {
                plano += " " + ROJO + "☢" + RESET;
              }
            } else if (b == this.extension - 1) {
              plano += " =|";
            } else {
              plano += " =";
            }
          }
        } else if (a == pp.getPista() && pp.getDopaje() < 3) {
          for (int b = 0; b < (this.extension); b++) {
            if (b < pp.getPosicion()) {
              if (b == this.extension - 1) {
                plano += " =|";
              } else {
                plano += " >";
              }
            } else if (b == pp.getPosicion()) {
              if (pp.getPosicion() == this.extension - 1) {
                plano += " " + AZUL + "☢|" + RESET;
              } else {
                plano += " " + AZUL + "☢" + RESET;
              }
            } else if (b == this.extension - 1) {
              plano += " =|";
            } else {
              plano += " =";
            }
          }
        } else if (a == ciudadanos.getPista() && ciudadanos.getDopaje() < 3) {
          for (int b = 0; b < (this.extension); b++) {
            if (b < ciudadanos.getPosicion()) {
              if (b == this.extension - 1) {
                plano += " =|";
              } else {
                plano += " >";
              }
            } else if (b == ciudadanos.getPosicion()) {
              if (ciudadanos.getPosicion() == this.extension - 1) {
                plano += " " + NARANJA + "☢|" + RESET;
              } else {
                plano += " " + NARANJA + "☢" + RESET;
              }
            } else if (b >= this.extension - 1) {
              plano += " =|";
            } else {
              plano += " =";
            }
          }
        } else {
          plano += " ✖";
          for (int b = 0; b < (this.extension - 1); b++) {
            if (b == this.extension - 2) {
              plano += " =|";
            } else {
              plano += " =";
            }
          }
        }
        if (a % 2 == 0) {
          for (int c = 0; c < 4; c++) {
            if (c % 2 == 0) {
              plano += NARANJA + "   " + RESET;
            } else {
              if (c == 1 && a == podemos.getPista() && podemos.getPosicion() >= this.extension) {
                plano += MORADO + " ☢ " + RESET;
              } else if (c == 1 && a == psoe.getPista() && psoe.getPosicion() >= this.extension) {
                plano += ROJO + " ☢ " + RESET;
              } else if (c == 1 && a == pp.getPista() && pp.getPosicion() >= this.extension) {
                plano += AZUL + " ☢ " + RESET;
              } else if (c == 1 && a == ciudadanos.getPista() && ciudadanos.getPosicion() >= this.extension) {
                plano += NARANJA + " ☢ " + RESET;
              } else {
                plano += ROJO + "   " + RESET;
              }
            }
          }
        } else {
          for (int c = 0; c < 4; c++) {
            if (c % 2 == 0) {
              plano += ROJO + "   " + RESET;
            } else {
              if (c == 1 && a == podemos.getPista() && podemos.getPosicion() >= this.extension) {
                plano += MORADO + " ☢ " + RESET;
              } else if (c == 1 && a == psoe.getPista() && psoe.getPosicion() >= this.extension) {
                plano += ROJO + " ☢ " + RESET;
              } else if (c == 1 && a == pp.getPista() && pp.getPosicion() >= this.extension) {
                plano += AZUL + " ☢ " + RESET;
              } else if (c == 1 && a == ciudadanos.getPista() && ciudadanos.getPosicion() >= this.extension) {
                plano += NARANJA + " ☢ " + RESET;
              } else {
                plano += NARANJA + "   " + RESET;
              }
            }
          }
        }
        plano += "\n";
      }
    if (podemos.getPosicion() >= this.extension) {
      podemos.setGanador(true);
    } else if (psoe.getPosicion() >= this.extension) {
      psoe.setGanador(true);
    } else if (pp.getPosicion() >= this.extension) {
      pp.setGanador(true);
    } else if (ciudadanos.getPosicion() >= this.extension) {
      ciudadanos.setGanador(true);
    }
    } return plano;
  } 
}
  


