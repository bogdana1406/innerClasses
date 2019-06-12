package test.ex2;

interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {

        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("\nCall method() from anonymous class");
            }
        };

        System.out.println(instance.getClass().toString());
        instance.method();

    }
}
