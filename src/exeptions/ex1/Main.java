package exeptions.ex1;

public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            a = a / (2 - n);
            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("\nerror handling");
            System.out.println(e.getMessage());
        }
    }
}
