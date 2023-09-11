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
        /// int tomb[] = new int[21];
        //for (int i = 0; i < 3; i++) {
        kirak();
        melyik();
        //   kever();
        //  }

        //ezVolt();
    }

    private static void kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VII"};
        /* List<String> llista = new ArrayList<String>();
        for (int i = 0; i < szinek.length - 1; i++) {
            for (int j = 0; j < ertekek.length; j++) {
                llista.add(szinek[i] + "_" + ertekek[j]);
            }
        }
        llista.add(szinek[3] + "_" + ertekek[0]);
        llista.add(szinek[3] + "_" + ertekek[1]);
        llista.add(szinek[3] + "_" + ertekek[2]);
       
       

        for (int i = 0; i < llista.size(); i++) {
            pakli[i] = llista.get(i);
        }*/

 /* int oszlop = 1;
        for (int i = 0; i < pakli.length; i++) {
            if (oszlop % 3 != 0) {
                System.out.print(pakli[i]+"\t");
            }
           /* else if(sor % 3 == 0)
            {
                System.out.println("\t");
            }
            else{
                System.out.println("\n");
            }
            oszlop++;
        }*/
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

    private static void melyik() {
        Scanner sc = new Scanner(System.in);
        boolean jo;
        do {

            System.out.print("Melyik oszlop? {1-3}:");
            int oszlopSzama = sc.nextInt();
            jo = oszlopSzama >= 1 && oszlopSzama <= 3;
        } while (!jo);

    }

    private static void kever(int oszlopSzama) {
        switch (oszlopSzama) {
            case (2):
                for (int i = 1; i < 7; i++) {
                    i = 19 - (i - 1) * 3;
                    i + 7 = 20 - (i - 1) * 3;
                    i + 14 = 21 - (i - 1) * 3;
                }
            case (3):
                for (int i = 1; i < 7; i++) {
                    i = 21 - (i - 1) * 3;
                    i + 7 = 19 - (i - 1) * 3;
                    i + 14 = 20 - (i - 1) * 3;
                }
                break;

        }
    }

    private static void ezVolt(int[] kartya) {
        System.out.println("A gondolt kártya: " + kartya[11]);
    }

}
