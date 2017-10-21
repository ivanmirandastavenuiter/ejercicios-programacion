/**
* Ejercicio23
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Introduce la base imponible: ");
    double baseImp = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String iva = System.console().readLine();
    
    System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = System.console().readLine();
    
    if ((iva.equals("general")) && (codigo.equals("nopro"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (21%)", baseImp * 0.21);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.21));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (nopro)", 00.00);
    System.out.printf("%-25s %5.2f\n", "Total", baseImp + (baseImp * 0.21));
    }
    
    if ((iva.equals("general")) && (codigo.equals("mitad"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (21%)", baseImp * 0.21);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.21));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (mitad)", -(baseImp + (baseImp * 0.21))/2);
    System.out.printf("%-25s %5.2f\n", "Total", (baseImp + (baseImp * 0.21)) - (baseImp + (baseImp * 0.21))/2);
    }
    
    if ((iva.equals("general")) && (codigo.equals("meno5"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (21%)", baseImp * 0.21);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.21));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (meno5)",- 5.00);
    System.out.printf("%-25s %5.2f\n", "Total", ((baseImp + (baseImp * 0.21)) - 5.00));
    }
    
    if ((iva.equals("general")) && (codigo.equals("5porc"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (21%)", baseImp * 0.21);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.21));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (5porc)", -(baseImp + (baseImp * 0.21)) * 0.05);
    System.out.printf("%-25s %5.2f\n", "Total", ((baseImp + (baseImp * 0.21)) - (baseImp + (baseImp * 0.21)) * 0.05));
    }
    
    if ((iva.equals("reducido")) && (codigo.equals("nopro"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (10%)", baseImp * 0.10);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.10));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (nopro)", 00.00);
    System.out.printf("%-25s %5.2f\n", "Total", baseImp + (baseImp * 0.10));
    }
    
    if ((iva.equals("reducido")) && (codigo.equals("mitad"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (10%)", baseImp * 0.10);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.10));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (mitad)", -(baseImp + (baseImp * 0.10))/2);
    System.out.printf("%-25s %5.2f\n", "Total", (baseImp + (baseImp * 0.10)) - (baseImp + (baseImp * 0.10))/2);
    }
    
    if ((iva.equals("reducido")) && (codigo.equals("meno5"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (10%)", baseImp * 0.10);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.10));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (meno5)",- 5.00);
    System.out.printf("%-25s %5.2f\n", "Total", ((baseImp + (baseImp * 0.10)) - 5.00));
    }
    
    if ((iva.equals("reducido")) && (codigo.equals("5porc"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (10%)", baseImp * 0.10);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.10));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (5porc)", -(baseImp + (baseImp * 0.10)) * 0.05);
    System.out.printf("%-25s %5.2f\n", "Total", ((baseImp + (baseImp * 0.10)) - (baseImp + (baseImp * 0.10)) * 0.05));
    }
    
    if ((iva.equals("superreducido")) && (codigo.equals("nopro"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (4%)", baseImp * 0.04);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.04));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (nopro)", 00.00);
    System.out.printf("%-25s %5.2f\n", "Total", baseImp + (baseImp * 0.04));
    }
    
    if ((iva.equals("superreducido")) && (codigo.equals("mitad"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (4%)", baseImp * 0.4);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.04));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (mitad)", -(baseImp + (baseImp * 0.04))/2);
    System.out.printf("%-25s %5.2f\n", "Total", (baseImp + (baseImp * 0.04)) - (baseImp + (baseImp * 0.04))/2);
    }
    
    if ((iva.equals("superreducido")) && (codigo.equals("meno5"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (4%)", baseImp * 0.04);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.04));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (meno5)",- 5.00);
    System.out.printf("%-25s %5.2f\n", "Total", ((baseImp + (baseImp * 0.04)) - 5.00));
    }
    
    if ((iva.equals("superreducido")) && (codigo.equals("5porc"))) {
    System.out.printf("%-25s %5.2f\n", "Base Imponible", baseImp);
    System.out.printf("%-25s %5.2f\n", "IVA (4%)", baseImp * 0.04);
    System.out.printf("%-25s %5.2f\n", "Precio con IVA", baseImp + (baseImp * 0.04));
    System.out.printf("%-25s %5.2f\n", "Cód. promo. (5porc)", -(baseImp + (baseImp * 0.04)) * 0.05);
    System.out.printf("%-25s %5.2f\n", "Total", ((baseImp + (baseImp * 0.04)) - (baseImp + (baseImp * 0.04)) * 0.05));
    }
  }
}
