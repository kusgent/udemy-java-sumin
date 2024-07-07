package Repetition;

public class DataTypes3 {
    public static void main(String[] args) {
        char ch1 = 88;
        char ch2 = 'X';
        System.out.println("ch1 - " + ch1);
        System.out.println("ch2 - " + ch2);
        ch1 += 1;
        System.out.println("ch1 - " + ch1);
        System.out.println("ch2 - " + ch2);
        int temp = 26;
        int time = 23;
        boolean hot = temp >= 25;
        boolean late = time >= 23;
        if (!hot || late) {
            System.out.println("Кондиционер выключен!");
        }
    }
}
