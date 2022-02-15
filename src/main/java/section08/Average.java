package section08;

public class Average {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        while (i <= 100) {
            j += i;
            i++;
        }
        System.out.println(j / i);
    }
}
