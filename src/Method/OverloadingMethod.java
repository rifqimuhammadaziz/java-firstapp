package Method;

public class OverloadingMethod {
    public static void main(String[] args) {
        sayHello();
        sayHello("Rifqi");
        sayHello("Rifqi", "Muhammad");
        sayHello("Rifqi", "Muhammad", "Aziz");
    }

    // OVERLOADING : create same method name with different parameters

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String middleName) {
        System.out.println("Hello " + firstName + middleName);
    }

    static void sayHello(String firstName, String middleName, String lastName) {
        System.out.println("Hello " + firstName + middleName + lastName);
    }
}
