package exeptions.ex10;

public class Main {
    public static void main(String[] args) {

        try {
            try {
                try {
                    throw new Exception("Exception1");
                } catch (Exception e) {
                    System.out.println("Catch 1: " + e.getMessage());
                    throw new Exception();
                } finally {
                    System.out.println("Finally 1");
                }
            } catch (Exception e) {
                System.out.println("Catch 2: " + e.getMessage());
                throw new ArithmeticException("Exception 3");
            } finally {
                System.out.println("finally 2: ");
//                throw new IndexOutOfBoundsException("New Exception");
            }
        } catch (Exception e) {
            System.out.println("catch 3: " + e.getMessage());
        } finally {
            System.out.println("finally 3: ");
        }
    }
}
