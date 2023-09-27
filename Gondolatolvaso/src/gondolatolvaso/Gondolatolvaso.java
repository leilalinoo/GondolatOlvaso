package gondolatolvaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gondolatolvaso {

    static String pakli[] = new String[22];

    public static void main(String[] args) {
        jatekMenet();
    }

    private static void jatekMenet() {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            kever(melyik());
        }
        ezVolt();
    }

    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VII"};

        int a = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && a < pakli.length; e++) {
                pakli[a++] = szin + "_" + ertekek[e];
            }
        }

    }

    private static void kirak() {

        for (int i = 1; i < pakli.length; i++) {
            String lap = pakli[i];
            System.out.print(lap + "\t");
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static int melyik() {
        Scanner sc = new Scanner(System.in);
        boolean jo;
        int oszlopSzama;
        do {
            System.out.print("\nMelyik oszlop? {1-3}: ");
            oszlopSzama = sc.nextInt();
            jo = oszlopSzama >= 1 && oszlopSzama <= 3;
        } while (!jo);

        return oszlopSzama;

    }

    private static void kever(int oszlopSzama) {
        String ujpakli[] = new String[22];
        switch (oszlopSzama) {
            case (1):
                for (int i = 1; i <= 7; i++) {
                    ujpakli[i] = pakli[20 - (i - 1) * 3];
                    ujpakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujpakli[i + 14] = pakli[21 - (i - 1) * 3];
                }

                break;
            case (2):
                for (int i = 1; i <= 7; i++) {
                    ujpakli[i] = pakli[19 - (i - 1) * 3];
                    ujpakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujpakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case (3):
                for (int i = 1; i <= 7; i++) {
                    ujpakli[i] = pakli[19 - (i - 1) * 3];
                    ujpakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujpakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujpakli;
    }

    private static void ezVolt() {
        System.out.println("A gondolt kártya: " + pakli[11]);
    }

}
