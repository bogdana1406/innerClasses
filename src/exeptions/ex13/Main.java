package exeptions.ex13;

import java.util.concurrent.ExecutionException;

class MyExceptionA extends Exception{
    public MyExceptionA(String message) {
        super(message);
    }
}

class MyExceptionB extends MyExceptionA {

    public MyExceptionB(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            throw new MyExceptionA("MyExceptionA");
        } catch (MyExceptionB e) {
            System.out.println(e.getMessage());
        } catch (MyExceptionA e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
