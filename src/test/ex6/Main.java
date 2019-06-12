package test.ex6;

interface Interface123 {

    void method();

    int getValue();
}

public class Main {
    public static void main(String[] args) {

        Interface123 instance = new Interface123() {

            int field = 6;

            @Override
            public void method() {

                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        Interface123 instance2 = new Interface123() {

            int field = -1;

            @Override
            public void method() {
                field = instance.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        instance.method();
        instance2.method();

        System.out.println("\ninstance: field = " + instance.getValue() + " instance: field = " + instance2.getValue());

    }
}
