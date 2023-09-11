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
        kirak();

        kever(melyik());
        System.out.println("");
        kirak();
        //ezVolt();
    }

    private static void kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VII"};

        int a = 1;
        for (String szin : szinek) {
            for (int e = 0; a < 22 && e < ertekek.length; e++) {
                pakli[a++] = szin + "_" + ertekek[e];
            }
        }

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
            System.out.print("Melyik oszlop? {1-3}: ");
            oszlopSzama = sc.nextInt();
            jo = oszlopSzama >= 1 && oszlopSzama <= 3;
        } while (!jo);

        return oszlopSzama;

    }

    private static void kever(int oszlopSzama) {
        switch (oszlopSzama) {
            case (1):
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[20 - (i - 1) * 3];
                    pakli[i + 7] = pakli[19 - (i - 1) * 3];
                    pakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                for (int i = 1; i < pakli.length; i++) {
                    String lap = pakli[i];
                    System.out.print(lap + "\t");
                    if (i % 3 == 0) {
                        System.out.println("");
                    }
                }
                break;
            case (2):
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[19 - (i - 1) * 3];
                    pakli[i + 7] = pakli[20 - (i - 1) * 3];
                    pakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                for (int i = 1; i < pakli.length; i++) {
                    String lap = pakli[i];
                    System.out.print(lap + "\t");
                    if (i % 3 == 0) {
                        System.out.println("");
                    }
                }
                break;
            case (3):
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[21 - (i - 1) * 3];
                    pakli[i + 7] = pakli[20 - (i - 1) * 3];
                    pakli[i + 14] = pakli[19 - (i - 1) * 3];
                }

                for (int i = 1; i < pakli.length; i++) {
                    String lap = pakli[i];
                    System.out.print(lap + "\t");
                    if (i % 3 == 0) {
                        System.out.println("");
                    }
                }
                break;
        }
    }

    private static void ezVolt() {
        System.out.println("A gondolt kártya: " + pakli[11]);
    }

}
