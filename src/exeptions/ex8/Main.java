package exeptions.ex8;

class UserException extends Exception {
    public void method() {
        System.out.println("My Exception");
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            throw new UserException();
        } catch (UserException userEx) {
            System.out.println("exception handing 1: ");
            userEx.method();

            try {
                throw userEx;
            } catch (UserException ex) {
                System.out.println("exception handing 2:  ");
                ex.method();
            }
            finally {
                System.out.println("finally block");
            }
            System.out.println("the end");
        }
    }
}
