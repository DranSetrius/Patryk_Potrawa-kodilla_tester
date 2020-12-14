import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) {
        int LeapYear = LocalDate.now().getYear();
        System.out.println(LeapYear);

        if (LeapYear % 4 == 0 || LeapYear % 400 == 0 || LeapYear % 100 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}