import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner (System.in);
// Harjoitus 3
        String tyyppi = "";
        int tila = 0;

        System.out.println("Valitse kohde. Kirjoita ihminen, koira tai hevonen.");
        tyyppi = in.nextLine();
        System.out.println("Anna lampotila.");
        tila = Integer.parseInt(in.nextLine());
        tulostaKuumerajat();
        onkoKuumetta(tyyppi, tila);
    }
// Harjoitus 1 
// Tee tulostaKuumerajat-metodi. Kun metodia kutsutaan, metodi tulostaa konsoliin:
// Ihminen 37
// Koira 39
// Hevonen 38
public static void tulostaKuumerajat ()
{
System.out.println("Ihminen 37");
System.out.println("Koira 39");
System.out.println("Hevonen 38");
}
// Harjoitus 2
// Tee onkoKuumetta-metodi. Metodilla on kaksi parametria:
// 1.tutkittava kohde: hevonen, koira tai ihminen (String)
// 2.lämpötila (int)
// Metodi tutkii, onko kohteella kuumetta ja palauttaa tiedon, onko kuumetta (true tai false). 
// Eli jos metodille lähetetään tiedot ihminen ja 38, metodi palauttaa true, muussa tapauksessa metodi palauttaa false.
public static void  onkoKuumetta (String kohde, int lampotila)
{
    if (kohde.equalsIgnoreCase("Ihminen") && lampotila > 37){
        System.out.println("Kohteella on kuumetta.");
        } else if (kohde.equalsIgnoreCase("Koira") && lampotila > 39)
    {
        System.out.println("Kohteella on kuumetta.");
    } else if (kohde.equalsIgnoreCase("Hevonen") && lampotila > 38)
    {
            System.out.println("Kohteella on kuumetta.");
    } else 
    {
            System.out.println("Kohteella ei ole kuumetta.");
    }
}
}


