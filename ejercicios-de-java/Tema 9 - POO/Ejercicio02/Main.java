/*
 * Programa que ejecuta las funcionalidades de las clases creadas.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda. 
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Vamos a empezar por comprobar las clases de mamífero: gato y perro.
    
    Gato Pancho = new Gato(3, 8, "Felidae", "Siamés");
    Gato Lucy = new Gato(2, 7, "Felidae", "Persa");
    Perro Hooky = new Perro(3, 27, "Cánido", "Pastor Alemán");
    Perro Matthew = new Perro(4, 40, "Cánido", "San Bernardo");
    
    Pancho.setNombre("Pancho");
    Lucy.setNombre("Lucy");
    System.out.println("El gato Pancho tiene bastante sed.");
    Pancho.bebe();
    System.out.println("Lucy tiene bastante hambre. Le ponemos un poco de comida.");
    Lucy.come();
    System.out.println("Pancho y Lucy se quieren mucho y van a tener crías.");
    Gato Cria = Lucy.haParido();
    System.out.println("Lucy ha parido un gato " + Cria.getSexo());
    if (Cria.getSexo().equals("hembra")) {
    System.out.println("Elige un nombre para la gatita: ");
    Cria.setNombre(sc.next());
    } else {
      System.out.println("Elige un nombre para el gatito: ");
      Cria.setNombre(sc.next());
    }
    
    System.out.println("Pancho y Lucy están locos de contentos con " + Cria.getNombre() + ".");
    
    System.out.println("Hooky y Matthew pasean juntos. Se acercan a los gatitos.");
    Hooky.ladra();
    Matthew.ladra();
    System.out.println("Hooky y Matthew están buscando bronca.");
    Hooky.persigue(Lucy);
    
    // Pasamos ahora a ejecutar métodos de Canario y Pingüino.
    
    Canario Pedro = new Canario(true, "fringílido", "belga");
    Canario Gregorio = new Canario(true, "fringílido", "timbrado español");
    Pedro.setNombre("Pedro");
    Gregorio.setNombre("Gregorio");
    
    System.out.println("Pedro y Gregorio están dentro de las jaulas.");
    System.out.println("Hola Pedro!, Hola Gregorio!");
    System.out.println(Pedro.getNombre() + " es de tipo " + Pedro.getCanto()+ ".");
    Pedro.canta();
    System.out.println(Gregorio.getNombre() + " es de tipo " + Gregorio.getCanto() + ".");
    Gregorio.canta();
    
    System.out.println("Se acerca la gatita Lucy.");
    boolean haComido;
    int opcion = (int)(Math.random() * 2);
    if (opcion == 0) {
      System.out.println("Parece que tiene hambre. Su estómago ruge.");
      Pedro.amenazado(Lucy, false);
    } else {
      System.out.println("Lucy no hace caso.");
      Pedro.amenazado(Lucy,true);
    }
    
    Pinguino Alberto = new Pinguino(false, "Spheniscus", 25, "Nueva Zelanda");
    System.out.println("¿Has visto alguna vez a algún pingüino volando?");
    Alberto.vuela();
    System.out.println("Alberto es un pingüino, no puede volar.");
    Alberto.setNombre("Alberto");
    System.out.println("Hay muchas pingüinas alrededor y " + Alberto.getNombre() + 
      " quiere echarse novia.");
    Alberto.sacaPecho();
    System.out.println("Parece que le ha ido regular y no ha conseguido hablar con"
      + " ninguna pingüina. Para consolarse se va a pescar, a ver si come algo.");
    int botin = Alberto.pesca();
    System.out.println("Alberto ha conseguido pescar " + botin + " peces!");
    System.out.println("Después de comer, bebe un poco.");
    Alberto.bebe();
    
    // Por último, la clase Lagartos.
    
    Lagarto Oscar = new Lagarto(2, "terrestre");
    Oscar.setNombre("Óscar");
    Lagarto Enrique = new Lagarto(2, "acuático");
    Enrique.setNombre("Enrique");
    
    System.out.println("Enrique está enfadado con Óscar porque le debe dinero desde"
      + " hace mucho y no se lo devuelve");
    Oscar.peleaCon(Enrique);
    
    System.out.println(Pancho);
    System.out.println(Lucy);
    System.out.println(Hooky);
    System.out.println(Matthew);
    System.out.println(Pedro);
    System.out.println(Gregorio);
    System.out.println(Alberto);
    System.out.println(Oscar);
    System.out.println(Enrique);
  }
}
