package Method;

public class ReturnMethod {
    public static void main(String[] args) {
        var result = sum(2,3);
        System.out.println(result);
        System.out.println(sum(350, 50));

        System.out.println(operator(200, "+", 500));
        System.out.println(operator(200, "-", 500));
        System.out.println(operator(200, "*", 500));
        System.out.println(operator(200, "test", 500));
    }

    static int sum(int number1, int number2) {
        var total = number1 + number2;
        return total;
    }

    static int operator(int number1, String operation, int number2) {
        switch (operation) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
        }
    }
}
