package exeptions.ex9;

class ClassWithException {
    public void throwInner() throws Exception {
        throw new Exception(" it is inner exception");
    }

    public void catchInner() throws Exception {
        try {
            this.throwInner();
        } catch (Exception e) {
            throw new Exception(" it is external exception", e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClassWithException instance = new ClassWithException();

        try {
            instance.catchInner();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Cause Exception: " + e.getCause());
        }
    }
}
