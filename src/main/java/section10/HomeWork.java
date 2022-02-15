package section10;

public class HomeWork {
    public static void main(String[] args) {
        String nameOfMonths = "Май";
        switch (nameOfMonths) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц не существует");
                break;
        }

        System.out.println();

        nameOfMonths = "Сентябрь";
        if (nameOfMonths.equals("Декабрь") || nameOfMonths.equals("Январь") || nameOfMonths.equals("Февраль")) {
            System.out.println("Зима");
        } else if (nameOfMonths.equals("Март") || nameOfMonths.equals("Апрель") || nameOfMonths.equals("Май")) {
            System.out.println("Весна");
        } else if (nameOfMonths.equals("Июнь") || nameOfMonths.equals("Июль") || nameOfMonths.equals("Август")) {
            System.out.println("Лето");
        } else if (nameOfMonths.equals("Сентябрь") || nameOfMonths.equals("Октябрь") || nameOfMonths.equals("Ноябрь")) {
            System.out.println("Осень");
        } else {
            System.out.println("Месяц не существует");
        }
    }
}
