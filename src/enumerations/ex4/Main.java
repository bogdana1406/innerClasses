package enumerations.ex4;

public class Main {

    public static void main(String[] args) {
        Company myComp = Company.ITNVID;
        System.out.println(myComp);

        int salary = myComp.getValue();
        String currency = myComp.getCurrency();

        System.out.println("I earn " + salary + " " + currency + " per month");
    }
}
