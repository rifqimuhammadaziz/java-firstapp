package Looping;

public class Break {
    public static void main(String[] args) {
        var counter = 1;

        // unlimited loop
        while (true) {
            System.out.println("Loop " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Exit.");
    }
}
