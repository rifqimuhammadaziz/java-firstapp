package TypeData;

public class Operator {
    public static void main(String[] args) {
        int angka1 = 200;
        int angka2 = 50;

        System.out.println(angka1 + angka2);
        System.out.println(angka1 - angka2);
        System.out.println(angka1 * angka2);
        System.out.println(angka1 / angka2);
        System.out.println(angka1 % angka2);

        // augmented assignment
        System.out.println(angka1 += 10); // angka1 = angka1 + 10
        System.out.println(angka1 -= 10); // angka1 = angka1 - 10
        System.out.println(angka1 *= 10); // angka1 = angka1 * 10
        System.out.println(angka1 /= 10); // angka1 = angka1 / 10
        System.out.println(angka1 %= 10); // angka1 = angka1 % 10

        // unary operator
        var angka = 20;
        angka++; // angka1 + 1
        System.out.println(angka);
        angka--; // angka1 - 1
        System.out.println(angka);
        System.out.println(!true); // false
    }
}
