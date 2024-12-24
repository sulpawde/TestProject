import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println(calculateDeathInfoInContext());

	}

public static String calculateDeathInfoInContext() {
	String strfirstdate = "13-Oct-2023";
    try {
        LocalDate first_date = LocalDate.parse(strfirstdate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate second_date = LocalDate.now();
        Period diff = Period.between(first_date, second_date);
        String strSecondDate_nformat = second_date.format(DateTimeFormatter.ofPattern("yyyy MMM dd"));
        String strContext = strSecondDate_nformat + " / " + diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days";
        return strContext;
    } catch (DateTimeParseException e) {
        // Log the exception for debugging
        System.err.println("Error parsing date: " + strfirstdate);
        e.printStackTrace();
        return "Invalid date format";
    }
}

}
