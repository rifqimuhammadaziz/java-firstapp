package Method;

public class VariableArgumentMethod {
    public static void main(String[] args) {
        int[] nilai = {80, 90, 80, 90, 20};
        sayCongrats("Rifqi", nilai);
        sayCongrats2("Rifqi Muhammad Aziz", 90, 40, 80, 50, 20);
    }

    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >=  75) {
            System.out.println("Congratulation to " + name + ", You Graduated!");
        } else {
            System.out.println("Sorry " + name + ", You must repeat the test!");
        }
    }

    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >=  75) {
            System.out.println("Congratulation to " + name + ", You Graduated!");
        } else {
            System.out.println("Sorry " + name + ", You must repeat the test!");
        }
    }
}
