package exeptions.ex12;

public class Main {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
