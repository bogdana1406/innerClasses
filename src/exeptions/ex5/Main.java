package exeptions.ex5;

class UserException extends Exception {
    public void method() {
        System.out.println("My exception");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("exception handing");
            e.method();
        }
    }
}
