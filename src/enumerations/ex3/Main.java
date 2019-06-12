package enumerations.ex3;

enum Company {
    ITNVID(1000), COOCLE(100), SKYNET(10);

    int value;

    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        Company myComp = Company.ITNVID;
        System.out.println("I work in " + myComp + " and earn " + myComp.getValue() + " per month");

    }
}
