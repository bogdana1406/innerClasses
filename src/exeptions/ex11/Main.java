package exeptions.ex11;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int a = 5, b = 3;

        try {
            System.out.println(a/b);
            System.out.println(arr[8]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
