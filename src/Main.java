public class Main {
    public static void main(String[] args) {

        int[] array = {3, 4, 2, 5, 8, 2, 1};

        replaceMiddleElements(array);

        System.out.println("Масив після заміни середніх елементів:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void replaceMiddleElements(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = (arr[i - 1] + arr[i + 1]) / 2;
        }
    }
}