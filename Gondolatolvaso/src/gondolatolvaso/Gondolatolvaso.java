package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    public static void main(String[] args) {
        int tomb[];
        for (int i = 0; i < 3; i++) {
            tomb = kirak();
            melyik();
            kever();
        }

        ezVolt(tomb);
    }

    private static int[] kirak() {
        int kartya[] = new int[21];
        for (int i = 1; i < 22; i++) {
            kartya[i] = i;

        }
        return kartya;
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
