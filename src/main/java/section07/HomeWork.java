package section07;

public class HomeWork {
    public static void main(String[] args) {
        int[] firstArray = new int[900];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = 100 + i;
        }

        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[(firstArray.length - 1) - i];
        }

        for (int i : secondArray) {
            System.out.println(i);
        }
    }
}
