package section05;

public class Temp {
    public static void main(String[] args) {
        int temp = 23;
        if (temp > 25) {
            System.out.println("Включить кондиционер");
        } else if (temp < 22) {
            System.out.println("Выключить кондиционер");
        } else {
            System.out.println("Отсутствие действия для кондиционера");
        }
    }
}
