package test.ex1;

public class Main {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        Phone p2 = new Phone();

        Computer c1 = new Computer();
        Computer c2 = new Computer();

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        Phone[] p = {p1, p2, m1.createPhone()};
        Computer[] c = {c1, c2, m2};

        for (Computer temp: c) {
            temp.process();
        }
        System.out.println("------------------");

        for (Phone temp: p) {
            temp.process();
        }
    }
}
