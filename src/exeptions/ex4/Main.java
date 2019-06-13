package exeptions.ex4;

class MyClass {

    public void myMethod() throws Exception {
        Exception excep = new Exception("My exception");
        throw excep;
    }
}

public class Main {

    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("\nMessage: " + e.getMessage());
            System.out.println("\nStack trace\n");
            e.printStackTrace();

        }
    }
}
