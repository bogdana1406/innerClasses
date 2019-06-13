package exeptions.ex7;

public class Main {

    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("\nyou try divide by zero");
            System.out.println("\na / (2-n) = " + (a / (2-n)));
        }
        catch (Exception e) {
            System.out.println("\nexception handing");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nfinally block");
        }
        System.out.println("\nthe end");
    }
}
