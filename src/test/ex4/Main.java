package test.ex4;

interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {

        Interface instance = new Interface() {
            public int publicField = 3;

            @Override
            public void method() {
               publicField = 1234;
                System.out.println("instance: publicField = " + getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };

        instance.method();

    }
}
