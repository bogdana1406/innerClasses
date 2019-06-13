package exeptions.except.ex1;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHendingMain {

    public static void main(String[] args) {

        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException ");
            e.printStackTrace();
        }
    }

    private static void doEverything() {
        Scanner sc = new Scanner(System.in);
//        PrintWriter writer = null;
        boolean continueLoop = true;
        do {
            try (PrintWriter writer =  new PrintWriter(new FileWriter("out.txt"))){
                System.out.println("Please enter numerator");
                int numerator = sc.nextInt();
                System.out.println("Please enter denominator");
                int denominator = sc.nextInt();
//                System.out.println(divide(numerator, denominator));
//                writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result " + divide(numerator, denominator));
                continueLoop = false;
//                int[] intArray = new int[1];
//                int i = intArray[2];
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception " + e);
                sc.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {

                System.out.println("All Exceptions here");
                throw new InvalidInputParamException("Index out of bound. Thrown in doEverything " + e);
            }
                finally {
                System.out.println("File closed");

//                if (writer != null) {
//                    writer.close();
//                }

            }

            System.out.println("try catch block finished");
        } while (continueLoop);
    }


    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException{
        return numerator / denominator;
    }

}

