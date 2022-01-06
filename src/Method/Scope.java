package Method;

public class Scope {
    public static void main(String[] args) {
        sayHello("Rifqi");
    }

    /**
     * Var yang berada dalam scope {} tidak dapat diakses diluar scope
     * @param name
     */
    static void sayHello(String name) {
        String hello = "Hello " + name;

        if(!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        // System.out.println(hi); > cannot access var 'hi' (out of block)
        System.out.println(hello);
    }

}
