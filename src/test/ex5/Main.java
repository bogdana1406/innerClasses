package test.ex5;

interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {

        int n = 100;

        Interface instance = new Interface() {

            public int publicField = 11;


            @Override
            public void method() {
                publicField = n;
                System.out.println("\ninstance: n = " + publicField);

            }
        };

        instance.method();

    }
}
