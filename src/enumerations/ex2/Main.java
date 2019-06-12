package enumerations.ex2;

enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today) {
            case SATURDAY:
                System.out.println("first day of the weekend - Saturday");
                break;

            case SUNDAY:
                System.out.println("the last day of the weekend - Sunday");
                break;

                default:
                    System.out.println("the weekday " + today);
        }

        if (today == Day.SATURDAY) {
            System.out.println("Finally weekend");
        }

    }




}
