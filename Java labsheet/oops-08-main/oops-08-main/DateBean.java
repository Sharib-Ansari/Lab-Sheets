
import java.time.LocalDate;

public class DateBean {
    public DateBean() {
    }

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static void main(String[] args) {
        DateBean d = new DateBean();
        System.out.println("Today's Date: " + d.getCurrentDate());
    }
}
