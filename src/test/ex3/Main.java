package test.ex3;

interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        Interface instance = new Interface() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {

                num = 1234;
                System.out.println("instance: d = " + d + ", str = " + str + ", num = " + num);
            }
        };

        instance.method();
    }
}
