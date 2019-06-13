package exeptions.ex2;

public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("My exception");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("exception handing");
            System.out.println(e.getMessage());
        }
    }
}
