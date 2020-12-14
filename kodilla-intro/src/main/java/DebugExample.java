public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

       int sum = sumAndDisplay(firstNumber, secondNumber);
        System.out.println(sum);
    }

    private static int sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
        return result;
    }
}
