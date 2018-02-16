/*
 * Main que ejecuta las clases creadas en Caballo y Persona.
 */
package ejercicio01;

/**
 *
 * @author Iván Miranda
 */
import java.util.Scanner;

public class Programa {
  public static void main(String[] args)
    throws InterruptedException {

    String ROJO = "\033[41m";
    String AZUL = "\033[44m";
    String MORADO = "\033[45m";
    String NARANJA = "\033[43m";
    String RESET = "\u001B[0m";
    String plano = "";
    int[] puestos = new int[4];
    int aux = 0;

    Scanner sc = new Scanner(System.in);

    // Declaración de las instancias de Caballo.
    Caballo podemos = new Caballo("Simón Bolívar", 7);
    Caballo psoe = new Caballo("Indalecio Prieto", 5);
    Caballo pp = new Caballo("Manuel Fraga", 6);
    Caballo ciudadanos = new Caballo("Heinrich Himmler", 4);

    // Declaración de las instancias de Persona.
    Persona pablito = new Persona("Pablo Iglesias", "alta");
    Persona pedrito = new Persona("Pedro Sánchez", "mala");
    Persona marianito = new Persona("Mariano Rajoy", "alta");
    Persona inesita = new Persona("Inés Arrimadas", "media");

    // Asociación de caballos con jinetes.
    podemos.setJinete(pablito);
    psoe.setJinete(pedrito);
    pp.setJinete(marianito);
    ciudadanos.setJinete(inesita);

    int mayor = 0;
    int menor = 100;
    String respuestaSiNo;
    int caballo;
    int destreza;
    int velocidadElegida;
    String destrezaElegida;
    boolean salir = false;

    podemos.setDopaje(0);
    psoe.setDopaje(0);
    pp.setDopaje(0);
    ciudadanos.setDopaje(0);

    // Nos aseguramos de asignar pistas distintas.
    do {
      podemos.setPista((int) (Math.random() * 5));
      psoe.setPista((int) (Math.random() * 5));
      pp.setPista((int) (Math.random() * 5));
      ciudadanos.setPista((int) (Math.random() * 5));
    } while (podemos.getPista() == psoe.getPista() || podemos.getPista() == pp.getPista()
      || podemos.getPista() == ciudadanos.getPista() || psoe.getPista() == pp.getPista()
      || psoe.getPista() == ciudadanos.getPista() || pp.getPista() == ciudadanos.getPista());

    Circuito campanillas = new Circuito(46);
    int porcentaje;

    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
    System.out.println("* * C A R R E R A   D E   C A B A L L O S   P O L Í T I C O S * * ");
    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
    System.out.println();
    System.out.println("Bienvenido/a a la carrera de caballos de los partidos políticos"
      + " tradicionales y emergentes.\nPresentamos, a continuación, las fichas técnicas de "
      + "los participantes:");

    // Fichas técnicas.
    System.out.print(podemos);
    System.out.print(pablito);
    System.out.print(psoe);
    System.out.print(pedrito);
    System.out.print(pp);
    System.out.print(marianito);
    System.out.print(ciudadanos);
    System.out.println(inesita);

    // Leyenda.
    System.out.println("➤ LEYENDA:");
    System.out.println("Podemos: " + MORADO + "  " + RESET);
    System.out.println("Psoe: " + ROJO + "  " + RESET);
    System.out.println("PP: " + AZUL + "  " + RESET);
    System.out.println("Ciudadanos: " + NARANJA + "  " + RESET);

    System.out.println("➤ INSTRUCCIONES: \n");
    System.out.println("❶ La destreza de los jinetes determina la velocidad punta de los"
      + " caballos.\n Existen tres modos: alta, media y baja. Podrás modificar las que quieras"
      + " en cada pasada.\n");
    System.out.println("❷ Los caballos también se caracterizan por una velocidad concreta."
      + " A mayor destreza, mayor velocidad.\nTambién podrás modificarlas a tu gusto.\n");
    System.out.println("❸ Por último y no menos emocionante: si la desesperación se apodera "
      + " de ti, \ntendrás la opción de inyectar anabolizantes al caballo para así doparlo"
      + " y que gane la carrera. Úsalos con precaución!\n");
    System.out.println("❹ Para usar el programa: ");
    System.out.println();
    System.out.println("Introduce 1 para dejar que la carrera siga su curso.");
    System.out.println("Introduce 2 para tongo.");
    System.out.println();

    System.out.println("➤ EMPEZEMOS: 😈😈😈😈😈😈😈😈\n");
    System.out.println("⚐ ⚑ ⚐ ⚑  I N I C I O  ⚐ ⚑ ⚐ ⚑");

    // Función de la clase Circuito que pinta el tablero a cada pasada.
    System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");
    int opcion;
    int trampa;

    // Comienzo del bucle central del programa.
    do {
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          // Los valores se resetean a cada pasada del bucle, de modo que si queremos
          // realizar algún cambio, lo tenemos que introducir nosotros.
          podemos.setVelocidad(7);
          pablito.setDestreza("alta");
          psoe.setVelocidad(5);
          pedrito.setDestreza("mala");
          pp.setVelocidad(6);
          marianito.setDestreza("alta");
          ciudadanos.setVelocidad(4);
          inesita.setDestreza("media");

          porcentaje = (int) (Math.random() * 10 + 1);
          switch (podemos.getJinete().getDestreza()) {
            case "alta":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  podemos.setVelocidad(podemos.getVelocidad() - 1);
                  break;
                case 4:
                case 5:
                case 6:
                  podemos.setVelocidad(podemos.getVelocidad());
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() + podemos.getVelocidad() * 0.8)));
                  break;
              }
              break;
            case "media":
              podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() + 1)));
              break;
            case "mala":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() - 3)));
                  break;
                case 4:
                case 5:
                case 6:
                  podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() - 2)));
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() + 1)));
                  break;
              }
              break;
          }
          porcentaje = (int) (Math.random() * 10 + 1);
          switch (psoe.getJinete().getDestreza()) {
            case "alta":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  psoe.setVelocidad(psoe.getVelocidad() - 1);
                  break;
                case 4:
                case 5:
                case 6:
                  podemos.setVelocidad(psoe.getVelocidad());
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() + psoe.getVelocidad() * 0.8)));
                  break;
              }
              break;
            case "media":
              psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() + 1)));
              break;
            case "mala":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() - 3)));
                  break;
                case 4:
                case 5:
                case 6:
                  psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() - 2)));
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() + 1)));
                  break;
              }
              break;
          }
          porcentaje = (int) (Math.random() * 10 + 1);
          switch (pp.getJinete().getDestreza()) {
            case "alta":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  pp.setVelocidad(pp.getVelocidad() - 1);
                  break;
                case 4:
                case 5:
                case 6:
                  pp.setVelocidad(pp.getVelocidad());
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() + pp.getVelocidad() * 0.8)));
                  break;
              }
              break;
            case "media":
              pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() + 1)));
              break;
            case "mala":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() - 3)));
                  break;
                case 4:
                case 5:
                case 6:
                  pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() - 2)));
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() + 1)));
                  break;
              }
              break;
          }
          porcentaje = (int) (Math.random() * 10 + 1);
          switch (ciudadanos.getJinete().getDestreza()) {
            case "alta":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  ciudadanos.setVelocidad(ciudadanos.getVelocidad() - 1);
                  break;
                case 4:
                case 5:
                case 6:
                  ciudadanos.setVelocidad(ciudadanos.getVelocidad());
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() + ciudadanos.getVelocidad() * 0.8)));
                  break;
              }
              break;
            case "media":
              ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() + 1)));
              break;
            case "mala":
              switch (porcentaje) {
                case 1:
                case 2:
                case 3:
                  ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() - 3)));
                  break;
                case 4:
                case 5:
                case 6:
                  ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() - 2)));
                  break;
                case 7:
                case 8:
                case 9:
                case 10:
                  ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() + 1)));
                  break;
              }
              break;
          }
          podemos.setPosicion(podemos.getPosicion() + podemos.getVelocidad());
          psoe.setPosicion(psoe.getPosicion() + psoe.getVelocidad());
          pp.setPosicion(pp.getPosicion() + pp.getVelocidad());
          ciudadanos.setPosicion(ciudadanos.getPosicion() + ciudadanos.getVelocidad());

          puestos[0] = podemos.getPosicion();
          puestos[1] = psoe.getPosicion();
          puestos[2] = pp.getPosicion();
          puestos[3] = ciudadanos.getPosicion();

          for (int a = 0; a < puestos.length; a++) {
            for (int b = a + 1; b < puestos.length; b++) {
              if (puestos[a] < puestos[b]) {
                aux = puestos[a];
                puestos[a] = puestos[b];
                puestos[b] = aux;
              }
            }
          }

          System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");
          System.out.println("**CURRENT POSITIONS**\n");
          if (podemos.getPosicion() == puestos[0]) {
            System.out.println("Podemos va en cabeza.");
          } else if (psoe.getPosicion() == puestos[0]) {
            System.out.println("Psoe va en cabeza.");
          } else if (pp.getPosicion() == puestos[0]) {
            System.out.println("PP va en cabeza.");
          } else if (ciudadanos.getPosicion() == puestos[0]) {
            System.out.println("Ciudadanos va en cabeza.");
          }

          if (podemos.getPosicion() == puestos[1]) {
            System.out.println("Podemos está en la segunda posición.");
          } else if (psoe.getPosicion() == puestos[1]) {
            System.out.println("Psoe está en la segunda posición.");
          } else if (pp.getPosicion() == puestos[1]) {
            System.out.println("PP está en la segunda posición.");
          } else if (ciudadanos.getPosicion() == puestos[1]) {
            System.out.println("Ciudadanos está en la segunda posición.");
          }

          if (podemos.getPosicion() == puestos[2]) {
            System.out.println("Podemos está en la tercera posición.");
          } else if (psoe.getPosicion() == puestos[2]) {
            System.out.println("Psoe está en la tercera posición.");
          } else if (pp.getPosicion() == puestos[2]) {
            System.out.println("PP está en la tercera posición.");
          } else if (ciudadanos.getPosicion() == puestos[2]) {
            System.out.println("Ciudadanos está en la tercera posición.");
          }

          if (podemos.getPosicion() == puestos[3]) {
            System.out.println("Podemos va último");
          } else if (psoe.getPosicion() == puestos[3]) {
            System.out.println("Psoe va último");
          } else if (pp.getPosicion() == puestos[3]) {
            System.out.println("PP va último");
          } else if (ciudadanos.getPosicion() == puestos[3]) {
            System.out.println("Ciudadanos va último");
          }

          // Si decides hacer trampas, se accede a un menú especial.
          break;
        case 2:
          System.out.println("Eres un zorro. ¿Qué quieres hacer?");
          System.out.println("1. Modificar velocidades.");
          System.out.println("2. Modificar destrezas.");
          System.out.println("3. Dopar al caballo.");
          trampa = sc.nextInt();
          switch (trampa) {
            case 1:
              salir = false;
              do {
                System.out.println("¿A qué caballo se la quieres cambiar?");
                System.out.println("1. Simón Bolívar.");
                System.out.println("2. Indalecio Prieto.");
                System.out.println("3. Manuel Fraga.");
                System.out.println("4. Heinrich Himmler.");
                caballo = sc.nextInt();
                switch (caballo) {
                  case 1:
                    System.out.println("Indica la velocidad deseada (Min: 0 - Máx: 10): ");
                    velocidadElegida = sc.nextInt();
                    podemos.setVelocidad(velocidadElegida);
                    break;
                  case 2:
                    System.out.println("Indica la velocidad deseada (Min: 0 - Máx: 10): ");
                    velocidadElegida = sc.nextInt();
                    psoe.setVelocidad(velocidadElegida);
                    break;
                  case 3:
                    System.out.println("Indica la velocidad deseada (Min: 0 - Máx: 10): ");
                    velocidadElegida = sc.nextInt();
                    pp.setVelocidad(velocidadElegida);
                    break;
                  case 4:
                    System.out.println("Indica la velocidad deseada (Min: 0 - Máx: 10): ");
                    velocidadElegida = sc.nextInt();
                    ciudadanos.setVelocidad(velocidadElegida);
                    break;
                }

                System.out.println("¿Deseas modificar alguna otra?");
                System.out.println("♞ Ja");
                System.out.println("♞ Nein");
                respuestaSiNo = sc.next().toLowerCase();
                switch (respuestaSiNo) {
                  case "ja":
                    salir = false;
                    break;
                  case "nein":
                    salir = true;
                    break;
                }
              } while (!salir);
              break;
            case 2:
              salir = false;
              do {
                System.out.println("¿A qué jinete le quieres cambiar su destreza?");
                System.out.println("1. Pablo Iglesias.");
                System.out.println("2. Pedro Sánchez.");
                System.out.println("3. Mariano Rajoy.");
                System.out.println("4. Inés Arrimadas.");
                destreza = sc.nextInt();
                switch (destreza) {
                  case 1:
                    System.out.println("Indica la destreza: alta / media / mala ");
                    destrezaElegida = sc.next();
                    pablito.setDestreza(destrezaElegida);
                    break;
                  case 2:
                    System.out.println("Indica la destreza: alta / media / mala ");
                    destrezaElegida = sc.next();
                    pedrito.setDestreza(destrezaElegida);
                    break;
                  case 3:
                    System.out.println("Indica la destreza: alta / media / mala ");
                    destrezaElegida = sc.next();
                    marianito.setDestreza(destrezaElegida);
                    break;
                  case 4:
                    System.out.println("Indica la destreza: alta / media / mala ");
                    destrezaElegida = sc.next();
                    inesita.setDestreza(destrezaElegida);
                    break;
                }

                System.out.println("¿Deseas modificar alguna otra?");
                System.out.println("♞ Ja");
                System.out.println("♞ Nein");
                respuestaSiNo = sc.next().toLowerCase();
                switch (respuestaSiNo) {
                  case "ja":
                    salir = false;
                    break;
                  case "nein":
                    salir = true;
                    break;
                }
              } while (!salir);
              break;
            case 3:
              salir = false;
              do {
                System.out.println("¿A qué caballo quieres dopar?");
                System.out.println("1. Simón Bolívar.");
                System.out.println("2. Indalecio Prieto.");
                System.out.println("3. Manuel Fraga.");
                System.out.println("4. Heinrich Himmler.");
                caballo = sc.nextInt();
                switch (caballo) {
                  case 1:
                    System.out.println("Droga inyectada.");
                    podemos.setVelocidad(20);
                    pablito.setDestreza("alta");
                    podemos.setDopaje(podemos.getDopaje() + 1);
                    if (podemos.getDopaje() > 2) {
                      System.out.println(podemos.getNombre() + " ha muerto de un paro cardíaco."
                        + " Tenemos un corredor menos.\nLa cosa se pone interesante.");
                      podemos.setPosicion(-1);
                    }
                    break;
                  case 2:
                    System.out.println("Droga inyectada.");
                    psoe.setVelocidad(20);
                    pedrito.setDestreza("alta");
                    psoe.setDopaje(psoe.getDopaje() + 1);
                    if (psoe.getDopaje() > 2) {
                      System.out.println(psoe.getNombre() + " ha muerto de un paro cardíaco."
                        + " Tenemos un corredor menos.\nLa cosa se pone interesante.");
                      psoe.setPosicion(-1);
                    }
                    break;
                  case 3:
                    System.out.println("Droga inyectada.");
                    pp.setVelocidad(20);
                    marianito.setDestreza("alta");
                    pp.setDopaje(pp.getDopaje() + 1);
                    if (pp.getDopaje() > 2) {
                      System.out.println(pp.getNombre() + " ha muerto de un paro cardíaco."
                        + " Tenemos un corredor menos.\nLa cosa se pone interesante.");
                      pp.setPosicion(-1);
                    }
                    break;
                  case 4:
                    System.out.println("Droga inyectada.");
                    ciudadanos.setVelocidad(20);
                    inesita.setDestreza("alta");
                    ciudadanos.setDopaje(ciudadanos.getDopaje() + 1);
                    if (ciudadanos.getDopaje() > 2) {
                      System.out.println(ciudadanos.getNombre() + " ha muerto de un paro cardíaco."
                        + " Tenemos un corredor menos.\nLa cosa se pone interesante.");
                      ciudadanos.setPosicion(-1);
                    }
                    break;
                }
                System.out.println("¿Deseas inyectar más anabolizantes?");
                System.out.println("♞ Ja");
                System.out.println("♞ Nein");
                respuestaSiNo = sc.next().toLowerCase();
                switch (respuestaSiNo) {
                  case "ja":
                    salir = false;
                    break;
                  case "nein":
                    salir = true;
                    break;
                }
              } while (!salir);
              break;
          }
          podemos.setPosicion(podemos.getPosicion() + podemos.getVelocidad());
          psoe.setPosicion(psoe.getPosicion() + psoe.getVelocidad());
          pp.setPosicion(pp.getPosicion() + pp.getVelocidad());
          ciudadanos.setPosicion(ciudadanos.getPosicion() + ciudadanos.getVelocidad());

          puestos[0] = podemos.getPosicion();
          puestos[1] = psoe.getPosicion();
          puestos[2] = pp.getPosicion();
          puestos[3] = ciudadanos.getPosicion();

          for (int a = 0; a < puestos.length; a++) {
            for (int b = a + 1; b < puestos.length; b++) {
              if (puestos[a] < puestos[b]) {
                aux = puestos[a];
                puestos[a] = puestos[b];
                puestos[b] = aux;
              }
            }
          }

          System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");
          System.out.println("**CURRENT POSITIONS**\n");
          if (podemos.getPosicion() == puestos[0]) {
            System.out.println("Podemos va en cabeza.");
          } else if (psoe.getPosicion() == puestos[0]) {
            System.out.println("Psoe va en cabeza.");
          } else if (pp.getPosicion() == puestos[0]) {
            System.out.println("PP va en cabeza.");
          } else if (ciudadanos.getPosicion() == puestos[0]) {
            System.out.println("Ciudadanos va en cabeza.");
          }

          if (podemos.getPosicion() == puestos[1]) {
            System.out.println("Podemos está en la segunda posición.");
          } else if (psoe.getPosicion() == puestos[1]) {
            System.out.println("Psoe está en la segunda posición.");
          } else if (pp.getPosicion() == puestos[1]) {
            System.out.println("PP está en la segunda posición.");
          } else if (ciudadanos.getPosicion() == puestos[1]) {
            System.out.println("Ciudadanos está en la segunda posición.");
          }

          if (podemos.getPosicion() == puestos[2]) {
            System.out.println("Podemos está en la tercera posición.");
          } else if (psoe.getPosicion() == puestos[2]) {
            System.out.println("Psoe está en la tercera posición.");
          } else if (pp.getPosicion() == puestos[2]) {
            System.out.println("PP está en la tercera posición.");
          } else if (ciudadanos.getPosicion() == puestos[2]) {
            System.out.println("Ciudadanos está en la tercera posición.");
          }

          if (podemos.getPosicion() == puestos[3]) {
            System.out.println("Podemos va último");
          } else if (psoe.getPosicion() == puestos[3]) {
            System.out.println("Psoe va último");
          } else if (pp.getPosicion() == puestos[3]) {
            System.out.println("PP va último");
          } else if (ciudadanos.getPosicion() == puestos[3]) {
            System.out.println("Ciudadanos va último");
          }
          System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");
          break;
      }
    } while (podemos.isGanador() != true && psoe.isGanador() != true
      && pp.isGanador() != true && ciudadanos.isGanador() != true);

    System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");

    if (podemos.isGanador()) {
      System.out.print(MORADO + "G ");
      Thread.sleep(500);
      System.out.print(MORADO + "A ");
      Thread.sleep(500);
      System.out.print(MORADO + "N ");
      Thread.sleep(500);
      System.out.print(MORADO + "A ");
      Thread.sleep(500);
      System.out.print(MORADO + "  ");
      Thread.sleep(500);
      System.out.print(MORADO + "P ");
      Thread.sleep(500);
      System.out.print(MORADO + "O ");
      Thread.sleep(500);
      System.out.print(MORADO + "D ");
      Thread.sleep(500);
      System.out.print(MORADO + "E ");
      Thread.sleep(500);
      System.out.print(MORADO + "M ");
      Thread.sleep(500);
      System.out.print(MORADO + "O ");
      Thread.sleep(500);
      System.out.print(MORADO + "S ");
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    } else if (psoe.isGanador()) {
      System.out.print(ROJO + "G ");
      Thread.sleep(500);
      System.out.print(ROJO + "A ");
      Thread.sleep(500);
      System.out.print(ROJO + "N ");
      Thread.sleep(500);
      System.out.print(ROJO + "A ");
      Thread.sleep(500);
      System.out.print(ROJO + "  ");
      Thread.sleep(500);
      System.out.print(ROJO + "P ");
      Thread.sleep(500);
      System.out.print(ROJO + "S ");
      Thread.sleep(500);
      System.out.print(ROJO + "O ");
      Thread.sleep(500);
      System.out.print(ROJO + "E ");
      Thread.sleep(500);
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    } else if (pp.isGanador()) {
      System.out.print(AZUL + "G ");
      Thread.sleep(500);
      System.out.print(AZUL + "A ");
      Thread.sleep(500);
      System.out.print(AZUL + "N ");
      Thread.sleep(500);
      System.out.print(AZUL + "A ");
      Thread.sleep(500);
      System.out.print(AZUL + "  ");
      Thread.sleep(500);
      System.out.print(AZUL + "P ");
      Thread.sleep(500);
      System.out.print(AZUL + "P ");
      Thread.sleep(500);
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    } else if (ciudadanos.isGanador()) {
      System.out.print(NARANJA + "G ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "N ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "  ");
      Thread.sleep(500);
      System.out.print(NARANJA + "C ");
      Thread.sleep(500);
      System.out.print(NARANJA + "I ");
      Thread.sleep(500);
      System.out.print(NARANJA + "U ");
      Thread.sleep(500);
      System.out.print(NARANJA + "D ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "D ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "N ");
      Thread.sleep(500);
      System.out.print(NARANJA + "O ");
      Thread.sleep(500);
      System.out.print(NARANJA + "S ");
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    }
    System.out.println("Si hubiese sido una carrera justa...");
    podemos.setPosicion(0);
    psoe.setPosicion(0);
    pp.setPosicion(0);
    ciudadanos.setPosicion(0);
    podemos.setGanador(false);
    psoe.setGanador(false);
    pp.setGanador(false);
    ciudadanos.setGanador(false);
    System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");
    Thread.sleep(1000);

    do {
      podemos.setVelocidad(7);
      pablito.setDestreza("alta");
      psoe.setVelocidad(5);
      pedrito.setDestreza("mala");
      pp.setVelocidad(6);
      marianito.setDestreza("alta");
      ciudadanos.setVelocidad(4);
      inesita.setDestreza("media");

      porcentaje = (int) (Math.random() * 10 + 1);
      switch (podemos.getJinete().getDestreza()) {
        case "alta":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              podemos.setVelocidad(podemos.getVelocidad() - 1);
              break;
            case 4:
            case 5:
            case 6:
              podemos.setVelocidad(podemos.getVelocidad());
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() + podemos.getVelocidad() * 0.8)));
              break;
          }
          break;
        case "media":
          podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() + 1)));
          break;
        case "mala":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() - 3)));
              break;
            case 4:
            case 5:
            case 6:
              podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() - 2)));
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              podemos.setVelocidad((int) (Math.random() * (podemos.getVelocidad() + 1)));
              break;
          }
          break;
      }
      porcentaje = (int) (Math.random() * 10 + 1);
      switch (psoe.getJinete().getDestreza()) {
        case "alta":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              psoe.setVelocidad(psoe.getVelocidad() - 1);
              break;
            case 4:
            case 5:
            case 6:
              podemos.setVelocidad(psoe.getVelocidad());
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() + psoe.getVelocidad() * 0.8)));
              break;
          }
          break;
        case "media":
          psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() + 1)));
          break;
        case "mala":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() - 3)));
              break;
            case 4:
            case 5:
            case 6:
              psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() - 2)));
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              psoe.setVelocidad((int) (Math.random() * (psoe.getVelocidad() + 1)));
              break;
          }
          break;
      }
      porcentaje = (int) (Math.random() * 10 + 1);
      switch (pp.getJinete().getDestreza()) {
        case "alta":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              pp.setVelocidad(pp.getVelocidad() - 1);
              break;
            case 4:
            case 5:
            case 6:
              pp.setVelocidad(pp.getVelocidad());
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() + pp.getVelocidad() * 0.8)));
              break;
          }
          break;
        case "media":
          pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() + 1)));
          break;
        case "mala":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() - 3)));
              break;
            case 4:
            case 5:
            case 6:
              pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() - 2)));
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              pp.setVelocidad((int) (Math.random() * (pp.getVelocidad() + 1)));
              break;
          }
          break;
      }
      porcentaje = (int) (Math.random() * 10 + 1);
      switch (ciudadanos.getJinete().getDestreza()) {
        case "alta":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              ciudadanos.setVelocidad(ciudadanos.getVelocidad() - 1);
              break;
            case 4:
            case 5:
            case 6:
              ciudadanos.setVelocidad(ciudadanos.getVelocidad());
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() + ciudadanos.getVelocidad() * 0.8)));
              break;
          }
          break;
        case "media":
          ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() + 1)));
          break;
        case "mala":
          switch (porcentaje) {
            case 1:
            case 2:
            case 3:
              ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() - 3)));
              break;
            case 4:
            case 5:
            case 6:
              ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() - 2)));
              break;
            case 7:
            case 8:
            case 9:
            case 10:
              ciudadanos.setVelocidad((int) (Math.random() * (ciudadanos.getVelocidad() + 1)));
              break;
          }
          break;
      }
      podemos.setPosicion(podemos.getPosicion() + podemos.getVelocidad());
      psoe.setPosicion(psoe.getPosicion() + psoe.getVelocidad());
      pp.setPosicion(pp.getPosicion() + pp.getVelocidad());
      ciudadanos.setPosicion(ciudadanos.getPosicion() + ciudadanos.getVelocidad());
      System.out.println(campanillas.pinta(podemos, psoe, pp, ciudadanos) + "\n");
      Thread.sleep(1000);
    } while (podemos.isGanador() != true && psoe.isGanador() != true
      && pp.isGanador() != true && ciudadanos.isGanador() != true);

    if (podemos.isGanador()) {
      System.out.print(MORADO + "G ");
      Thread.sleep(500);
      System.out.print(MORADO + "A ");
      Thread.sleep(500);
      System.out.print(MORADO + "N ");
      Thread.sleep(500);
      System.out.print(MORADO + "A ");
      Thread.sleep(500);
      System.out.print(MORADO + "  ");
      Thread.sleep(500);
      System.out.print(MORADO + "P ");
      Thread.sleep(500);
      System.out.print(MORADO + "O ");
      Thread.sleep(500);
      System.out.print(MORADO + "D ");
      Thread.sleep(500);
      System.out.print(MORADO + "E ");
      Thread.sleep(500);
      System.out.print(MORADO + "M ");
      Thread.sleep(500);
      System.out.print(MORADO + "O ");
      Thread.sleep(500);
      System.out.print(MORADO + "S ");
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    } else if (psoe.isGanador()) {
      System.out.print(ROJO + "G ");
      Thread.sleep(500);
      System.out.print(ROJO + "A ");
      Thread.sleep(500);
      System.out.print(ROJO + "N ");
      Thread.sleep(500);
      System.out.print(ROJO + "A ");
      Thread.sleep(500);
      System.out.print(ROJO + "  ");
      Thread.sleep(500);
      System.out.print(ROJO + "P ");
      Thread.sleep(500);
      System.out.print(ROJO + "S ");
      Thread.sleep(500);
      System.out.print(ROJO + "O ");
      Thread.sleep(500);
      System.out.print(ROJO + "E ");
      Thread.sleep(500);
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    } else if (pp.isGanador()) {
      System.out.print(AZUL + "G ");
      Thread.sleep(500);
      System.out.print(AZUL + "A ");
      Thread.sleep(500);
      System.out.print(AZUL + "N ");
      Thread.sleep(500);
      System.out.print(AZUL + "A ");
      Thread.sleep(500);
      System.out.print(AZUL + "  ");
      Thread.sleep(500);
      System.out.print(AZUL + "P ");
      Thread.sleep(500);
      System.out.print(AZUL + "P ");
      Thread.sleep(500);
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    } else if (ciudadanos.isGanador()) {
      System.out.print(NARANJA + "G ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "N ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "  ");
      Thread.sleep(500);
      System.out.print(NARANJA + "C ");
      Thread.sleep(500);
      System.out.print(NARANJA + "I ");
      Thread.sleep(500);
      System.out.print(NARANJA + "U ");
      Thread.sleep(500);
      System.out.print(NARANJA + "D ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "D ");
      Thread.sleep(500);
      System.out.print(NARANJA + "A ");
      Thread.sleep(500);
      System.out.print(NARANJA + "N ");
      Thread.sleep(500);
      System.out.print(NARANJA + "O ");
      Thread.sleep(500);
      System.out.print(NARANJA + "S ");
      System.out.print(RESET + "\n");
      Thread.sleep(500);
    }
  }
}
