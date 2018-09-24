package przedzialLiczb;


public class PrzedzialLiczb {

    public static void main(String[] args) {
        int start = 0;
        int koniec = 30;

        System.out.println("Pętla While:");

        int i = 0;
        while (start + i <= koniec) {
            if ((start + i) < koniec) {

                System.out.printf("%.1f, ", (double) (start + i) / 10);
                i = i + 1;
            } else {
                System.out.printf("%.1f", (double) (start + i) / 10);
                i = i + 1;
            }
        }


        System.out.println("\nPętla Do ... While:");
        int j = 0;
        while (start + j <= koniec) {
            if ((start + j) < koniec) {

                System.out.printf("%.1f, ", (double) (start + j) / 10);
                j = j + 1;
            } else {
                System.out.printf("%.1f", (double) (start + j) / 10);
                j = j + 1;
            }
        }

    }
}
