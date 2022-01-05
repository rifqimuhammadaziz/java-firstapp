package Looping;

public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;
        // executed min 1x even counter is false
        do {
            System.out.println("Looping " + counter);
            counter++;
        } while (counter <= 10);
    }
}
