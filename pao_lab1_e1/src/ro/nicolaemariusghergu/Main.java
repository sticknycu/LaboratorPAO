package ro.nicolaemariusghergu.laboratorPAO;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        int x;
        x = 5;

        int y = 10;

        Pisica cat = new Pisica();
        cat.name = "Nume 1";
        cat.color = "Red";

        cat.sayMoew();

        int x1 = 10;
        int x2 = 070;
        int x3 = 0xff;

        System.out.println(x3);

        int x4 = 1_000_000;

        double x5 = 10.5;
        float x6 = 10.5f;

        BigDecimal bigDecimal = new BigDecimal("20.5");

        char x7 = 'a';
        char x8 = '\n';
        char x9 = '\u0100';
        char x10 = 10;

        String x11 = "HELLO";
        String x12 = "h\u0100ELLO\nQ";

        // Java 15+
        String x13 = """
                    HELLO
                    WORLD!
                """;

        boolean x14 = true;
        boolean x15 = false;


    }
}
