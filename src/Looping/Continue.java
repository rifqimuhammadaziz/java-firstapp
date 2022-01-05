package Looping;

public class Continue {
    public static void main(String[] args) {
        for (var counter = 1; counter <= 100; counter++) {
            // even (genap) counter is skipped, but loop not stopped
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
