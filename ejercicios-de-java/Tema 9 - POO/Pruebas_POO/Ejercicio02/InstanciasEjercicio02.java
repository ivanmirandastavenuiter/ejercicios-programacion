/*
 * Programa para probar las distintas clases de animales.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class InstanciasEjercicio02 {
  public static void main(String[] args) {
    
    Persona paula = new Persona("doctora");
    System.out.print(paula);
    System.out.print("Paula dice que va a dormir porque ");
    paula.trabaja();
    System.out.println();
    
    Persona javier = new Persona("carpintero");
    System.out.print(javier);
    System.out.print("Javier tiene que recorrer ");
    javier.conduce();
    System.out.println();
    
    Perro goofy = new Perro(Sexo.MACHO, 5);
    System.out.println("Goofy es " + goofy.getSexo() + " y pesa " + goofy.peso + " kilos.");
    System.out.println();
    
    Gato tom = new Gato(Sexo.MACHO);
    System.out.println("Tom juega con su " + tom.juguete + ".");
    System.out.println();
    
    Caballo rocinante = new Caballo(Sexo.MACHO, "Establo 2");
    System.out.println("Mira cómo relincha el caballo: ");
    rocinante.relincha();
    System.out.println();
    
    Mineral cuarzo = new Mineral(4000);
    System.out.println("Mira lo que dice en la vitrina: ");
    System.out.println(cuarzo.toString());
    System.out.println();
  }
}
