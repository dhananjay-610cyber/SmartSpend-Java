import com.smartspend.model.*;
import com.smartspend.util.ValidationUtil;
import java.time.LocalDate;

public class SmartSpendTest {
    public static void main(String[] args) {
        assert ValidationUtil.validUsername("student_01");
        assert ValidationUtil.validPassword("1234");
        Expense e = new Expense("student_01", 250.0, "Food", "Lunch", LocalDate.now());
        Income i = new Income("student_01", 1000.0, "Allowance", "Monthly", LocalDate.now());
        assert e.getType().equals("EXPENSE");
        assert i.getType().equals("INCOME");
        assert e.getAmount() == 250.0;
        System.out.println("All SmartSpend tests passed.");
    }
}
