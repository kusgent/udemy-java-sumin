package section05;

public class Weather {
    public static void main(String[] args) {
        int time = 13;
        boolean night = time >= 23 || time <= 5;
        boolean goodWeather = true;
        if (night) {
            System.out.println("Спать");
        }
        if (!night && goodWeather) {
            System.out.println("Гулять");
        }
        if (!night && !goodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
