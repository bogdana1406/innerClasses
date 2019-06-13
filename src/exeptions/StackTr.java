package exeptions;

public class StackTr {

    public static void main(String[] args) {
        method1();
    }
    public static void method1() {

        method2();
    }

    public static void method2() {

        method3();
    }
    public static void method3() {

        StackTraceElement[] st = Thread.currentThread().getStackTrace();

        for (StackTraceElement temp: st) {
            System.out.println(temp.getMethodName());

        }
    }
}
