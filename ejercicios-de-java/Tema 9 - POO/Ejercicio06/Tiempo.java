/*
 * Definición de la clase Tiempo.
 */
package ejercicio06;

/**
 *
 * @author Iván Miranda.
 */
public class Tiempo {
  
  int horas;
  int minutos;
  int segundos;
  
  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public int getHoras() {
    return horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }
  
  public Tiempo suma(Tiempo dos) {
  
    int s = 0;
    int m = 0;
    int h = 0;
    
    if ((this.getSegundos() + dos.getSegundos()) >= 60) {
      m++;
      s = (this.getSegundos() + dos.getSegundos()) - 60;
    } else {
      s = (this.getSegundos() + dos.getSegundos());
    }
    
    if ((this.getMinutos() + dos.getMinutos()) >= 60) {
      h++;
      m += (this.getMinutos() + dos.getMinutos()) - 60;
    } else {
      m += (this.getMinutos() + dos.getMinutos());
    }
    
    h += this.getHoras() + dos.getHoras();
    
    Tiempo tres = new Tiempo(h, m, s);
    return tres;
  }
  
  public Tiempo resta(Tiempo dos) {
    
    int s = 0;
    int m = 0;
    int h = 0;
    
    if (this.getSegundos() < dos.getSegundos()) {
      s += (60 - dos.getSegundos()) + this.getSegundos();
      m--;
    } else {
      s += this.getSegundos() - dos.getSegundos();
    }
    
    if (this.getMinutos() < dos.getMinutos()) {
      m += (60 - dos.getMinutos()) + this.getMinutos();
      h--;
    } else {
      m += this.getMinutos() - dos.getMinutos();
    }
    h += this.getHoras() - dos.getHoras();
    
    Tiempo tres = new Tiempo(h, m, s);
    return tres;
  }

  @Override
  public String toString() {
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
  }
}
