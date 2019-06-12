package test.ex7;

interface Interface {

    void method();

    int getValue();
}

class ConcretClass implements Interface {

    protected int protectedField = 10;

    @Override
    public void method() {
        System.out.println("ConcretClass: method() ");
    }

    @Override
    public int getValue() {
        return protectedField;
    }
}

public class Main {

    public static void main(String[] args) {


        ConcretClass instance1 = new ConcretClass() {

            @Override
            public void method() {
//                super.method();
                System.out.println("instance1: method()");
            }

        };

        Interface instance2 = new ConcretClass() {

            int protectedField = 3;
            @Override
            public void method() {
                System.out.println("instance2: method()");
            }

            @Override
            public int getValue() {
                return this.protectedField + super.getValue();
            }
        };

        instance1.method();
        instance2.method();

        System.out.println("instance1: publicField = " + instance1.getValue() + " instance2: publicField = " + instance2.getValue());

    }
}
