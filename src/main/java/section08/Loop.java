package section08;

public class Loop {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 1000) {
            System.out.println(a);
            a++;
            if (a == 5) {
                break;
            }
        }

        int b = 0;
        do {
            System.out.println("Привет");
        } while (b != 0);

        for(int i = 1000; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
