package section04;

public class Var {
    public static void main(String[] args) {
        int days = 1000;
        int speed = 300000;
        int seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);
        byte a = 127;
        a += 2;
        System.out.println(a);
        byte b = 10;
        int c = b;
        System.out.println(c);
        int d = 15;
        byte e = (byte) d;
        System.out.println(e);
    }
}
