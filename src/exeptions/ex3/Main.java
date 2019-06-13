package exeptions.ex3;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("my exception");
        } catch (Exception e) {
            System.out.println("exception handing");
            System.out.println(e.getMessage());
        }
    }

}
