/**
* Ejercicio10
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Dime de qué mes eres: ");
    String mes = System.console().readLine().toLowerCase();
    
    System.out.print("Dime la fecha exacta de nacimiento: ");
    int fecha = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case "marzo":
      if ((fecha >=1) && (fecha <=20)) {
      System.out.print("Eres Piscis, aunque no te valga para nada");
      break;
    }
      if ((fecha >=21) && (fecha <=31)) {
      System.out.print("Eres Aries, aunque no te valga para nada");
      break;
    }
      case "abril":
      if ((fecha >=1) && (fecha <=19)) {
      System.out.print("Eres Aries, aunque no te valga para nada");
      break;
    }
      if ((fecha >=20) && (fecha <=30)) {
      System.out.print("Eres Tauro, aunque no te valga para nada");
      break;
    }
      case "mayo":
      if ((fecha >=1) && (fecha <=20)) {
      System.out.print("Eres Tauro, aunque no te valga para nada");
      break;
    }
      if ((fecha >=20) && (fecha <=31)) {
      System.out.print("Eres Géminis, aunque no te valga para nada");
      break;
    }
      case "junio":
      if ((fecha >=1) && (fecha <=20)) {
      System.out.print("Eres Géminis, aunque no te valga para nada");
      break;
    }
      if ((fecha >=21) && (fecha <=30)) {
      System.out.print("Eres Cáncer, aunque no te valga para nada");
      break;
    }
      case "julio":
      if ((fecha >=1) && (fecha <=22)) {
      System.out.print("Eres Cáncer, aunque no te valga para nada");
      break;
    }
      if ((fecha >=23) && (fecha <=31)) {
      System.out.print("Eres Leo, aunque no te valga para nada");
      break;
    }
      case "agosto":
      if ((fecha >=1) && (fecha <=23)) {
      System.out.print("Eres Leo, aunque no te valga para nada");
      break;
    }
      if ((fecha >=24) && (fecha <=31)) {
      System.out.print("Eres Virgo, aunque no te valga para nada");
      break;
    }
      case "septiembre":
      if ((fecha >=1) && (fecha <=22)) {
      System.out.print("Eres Virgo, aunque no te valga para nada");
      break;
    }
      if ((fecha >=23) && (fecha <=30)) {
      System.out.print("Eres Libra, aunque no te valga para nada");
      break;
    }
      case "octubre":
      if ((fecha >=1) && (fecha <=20)) {
      System.out.print("Eres Libra, aunque no te valga para nada");
      break;
    }
      if ((fecha >=21) && (fecha <=31)) {
      System.out.print("Eres Escorpio, aunque no te valga para nada");
      break;
    }
      case "noviembre":
      if ((fecha >=1) && (fecha <=21)) {
      System.out.print("Eres Escorpio, aunque no te valga para nada");
      break;
    }
      if ((fecha >=22) && (fecha <=30)) {
      System.out.print("Eres Sagitario, aunque no te valga para nada");
      break;
    }
      case "diciembre":
      if ((fecha >=1) && (fecha <=21)) {
      System.out.print("Eres Sagitario, aunque no te valga para nada");
      break;
    }
      if ((fecha >=22) && (fecha <=31)) {
      System.out.print("Eres Capricornio, aunque no te valga para nada");
      break;
    }
      case "enero":
      if ((fecha >=1) && (fecha <=19)) {
      System.out.print("Eres Capricornio, aunque no te valga para nada");
      break;
    }
      if ((fecha >=20) && (fecha <=31)) {
      System.out.print("Eres Acuario, aunque no te valga para nada");
      break;
    }
      case "febrero":
      if ((fecha >=1) && (fecha <=19)) {
      System.out.print("Eres Acuario, aunque no te valga para nada");
      break;
    }
      if ((fecha >=20) && (fecha <=28)) {
      System.out.print("Eres Piscis, aunque no te valga para nada");
      break;
      }
      default: 
      System.out.print("Por tu bien deja los horóscopos que son un timo");
    }
  }
}
