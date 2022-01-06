package Method;

public class ParameterMethod {
    public static void main(String[] args) {
        sayHello("Rifqi", "Muhammad Aziz");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
