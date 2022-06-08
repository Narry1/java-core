package Daily_Practice;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DateFunction {

	public static void main(String[] args) {
		

		
		LocalDate currDate = LocalDate.now();
		System.out.print("Current Date is: "+currDate);
		
		LocalDate date = LocalDate.of(2021, 8, 13);
		System.out.print("\n"+"Date: " + date);
		
		
		LocalDate currDate1 = LocalDate.now();
		LocalDate tomorrow = currDate1.plusDays(1);
		LocalDate yesterday = currDate1.minusDays(1);
		System.out.println("\n"+"Current date is after yesterday date: "+currDate1.isAfter(yesterday));
		System.out.println("Current date is before tomorrow date:" +currDate1.isBefore(tomorrow));
		
		LocalDate currDate3 = LocalDate.now();
		LocalDate date1 = currDate3.plus(5, ChronoUnit.MONTHS);
		LocalDate date2 = currDate3.minus(5, ChronoUnit.DAYS);
		System.out.println("Current Date:" + currDate3);
		System.out.println("Current Date plus five months: "+ date1);
		System.out.println("Current Date minus five days:"  + date2);
		
		
		LocalDate currDate4 = LocalDate.now();
		DayOfWeek dayOfWeek = currDate4.getDayOfWeek();

		int dayOfMonth = currDate4.getDayOfMonth();
		int dayOfYear = currDate4.getDayOfYear();
		System.out.println("Date:" + currDate4);
		System.out.println("Day of Week:  "+ dayOfWeek);
		System.out.println("Day of Month: " + dayOfMonth);
		System.out.println("Day of Year:  " + dayOfYear);
		
		
		LocalDate currDate5 = LocalDate.now();
		System.out.println("currDate" + "is a leap year?" +currDate5.isLeapYear());
		
		
		LocalDate currDate6 = LocalDate.now();
		System.out.println("Current Date :" + currDate6);
		System.out.println( "Length of Month:"   + currDate.lengthOfMonth());
		System.out.println( "Length of Year: " + currDate.lengthOfYear());
	}
	

}
