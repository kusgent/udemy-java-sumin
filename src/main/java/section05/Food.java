package section05;

public class Food {
    public static void main(String[] args) {
        int purse = 550;
        if (purse >= 500) {
            System.out.println("Пицца");
        } else if (purse >= 300) {
            System.out.println("Шаурма");
        } else if (purse >= 100) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Доширак");
        }
    }
}
