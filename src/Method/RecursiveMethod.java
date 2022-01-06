package Method;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        loop(100); // high value of recursive method potential to error stackoverflow (depends spec of computers)
    }

    // factorial using loop
    static int factorialLoop(int num) {
        var result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return  result;
    }

    // factorial using recursive
    static int factorialRecursive(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorialRecursive(num - 1);
        }
    }

    // error stackoverflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Method finished!");
        } else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
