package enumerations.ex1;

import com.sun.jdi.PathSearchingVirtualMachine;

enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        System.out.println("today is " + today);


    }
}
