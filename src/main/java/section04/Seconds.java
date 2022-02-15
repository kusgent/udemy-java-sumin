package section04;

public class Seconds {
    public static void main(String[] args) {
        int seconds = 100000;
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int leftSeconds = seconds - days * 86400 - hours * 3600 - minutes * 60;
        System.out.println("Общее кол-во секунд: " + seconds);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);
    }
}
