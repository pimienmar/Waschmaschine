import java.util.Scanner;

public class Online_008_Waschmaschine {
    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        // Temperatur: 30, 60, 90
        // Zeit: Kurz, Normal, Extra spülen
        // Starten / Beenden

        int auswahl2;
        do {
            int auswahl;

            do {
                System.out.println("Programm Auswahl:");
                System.out.println("1: Feinwäsche (30°C)");
                System.out.println("2: Buntwäsche (60°C)");
                System.out.println("3: Weißwäsche (90°C)");

                auswahl = eingabe.nextInt();

            } while (auswahl <= 0 || auswahl >= 4);

            do {

            System.out.println("Bitte Waschzeit wählen:");
            System.out.println("1: Kurz (29min)");
            System.out.println("2: Normal (49min)");
            System.out.println("3: Extra spülen (59min)");
            System.out.println("4: Zurück");
            System.out.println("5: Beenden");

            auswahl2 = eingabe.nextInt();

            if (auswahl2 == 1) {
                System.out.println("Ihre Wäsche ist in 29 Minuten sauber!");
                break;
            }
            if (auswahl2 == 2) {
                System.out.println("Ihre Wäsche ist in 49 Minuten sauber!");
                break;
            }
            if (auswahl2 == 3) {
                System.out.println("Ihre Wäsche ist in 59 Minuten sauber!");
                break;
            }
            if (auswahl2 == 4) {

            }
            if (auswahl2 == 5) {
                break;
            }
            }
            while (auswahl2 >= 5 || auswahl2 <= 0);

        } while (auswahl2 == 4);

    }
}
