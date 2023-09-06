package gondolatolvaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gondolatolvaso {
    static String pakli[] = new String [22];
    public static void main(String[] args) {
        jatekMenet();
    }

    private static void jatekMenet() {
       /// int tomb[] = new int[21];
        //for (int i = 0; i < 3; i++) {
           kirak();
            melyik();
            kever();
      //  }

        //ezVolt();
    }

    private static void kirak() {
        List<String> llista = new ArrayList<String>();
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VII"};
        for (int i = 0; i < szinek.length-1; i++) {
            for (int j = 0; j < ertekek.length; j++) {
                llista.add(szinek[i]+"_"+ertekek[j]);
            }
        }
        llista.add(szinek[3]+"_"+ertekek[0]);
    }

    private static int melyik() {
        Scanner sc = new Scanner(System.in);
        int oszlopSzama = sc.nextInt();
        return oszlopSzama;
    }

    private static void kever() {
    }

    private static void ezVolt(int[] kartya) {
        System.out.println("A gondolt kártya: " + kartya[11]);
    }

}
