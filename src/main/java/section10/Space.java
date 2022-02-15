package section10;

public class Space {
    public static void main(String[] args) {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : dayOfMonth) {
            System.out.println(i);
        }

        String str = "Hello world!";
        System.out.println(str);
        String name = "Иван";
        int age = 33;
        String result = "Привет, \"" + name + "\"! \nТебе " + age + " года.";
        System.out.println(result);

        String[] months = {"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
        for (int i = 0; i < months.length; i++) {
            if (i < months.length - 1) {
                System.out.print(months[i] + ", ");
            } else {
                System.out.print(months[i] + ".");
            }
        }

        System.out.println();

        int numberOfMonth = 13;
        if (numberOfMonth == 1) {
            System.out.println("Январь");
        } else if (numberOfMonth == 2) {
            System.out.println("Февраль");
        } else if (numberOfMonth == 3) {
            System.out.println("Март");
        } else if (numberOfMonth == 4) {
            System.out.println("Апрель");
        } else if (numberOfMonth == 5) {
            System.out.println("Май");
        } else if (numberOfMonth == 6) {
            System.out.println("Июнь");
        } else if (numberOfMonth == 7) {
            System.out.println("Июль");
        } else if (numberOfMonth == 8) {
            System.out.println("Август");
        } else if (numberOfMonth == 9) {
            System.out.println("Сентябрь");
        } else if (numberOfMonth == 10) {
            System.out.println("Октябрь");
        } else if (numberOfMonth == 11) {
            System.out.println("Ноябрь");
        } else if (numberOfMonth == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Месяц не существует");
        }

        System.out.println();

        numberOfMonth = 7;
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Месяц не существует");
                break;
        }
    }
}
