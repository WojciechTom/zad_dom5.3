package piecImionHello;

        import java.util.Scanner;

public class PiecImionHello {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać pięć imion");
        String[] imiona = new String[5];

        for (int i = 0; i <= 4; i++) {
            imiona[i] = scan.next();
        }

        for (int j = 4; j >= 0; j--) {
            System.out.println("Cześć " + imiona[j]);
        }

    }
}