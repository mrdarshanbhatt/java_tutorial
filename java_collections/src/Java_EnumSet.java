

import java.util.EnumSet;
import java.util.Set;

enum numbers {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NOV, DEC
}

public class Java_EnumSet {

	public static void main(String[] args) {

		// Get All Months
		Set<numbers> months = EnumSet.allOf(numbers.class);
		System.out.println(months);

		// Get Selected months
		Set<numbers> selectedMonths = EnumSet.of(numbers.APR, numbers.DEC);
		System.out.println(selectedMonths);

		// No any month Selected
		Set<numbers> noneMonths = EnumSet.noneOf(numbers.class);
		System.out.println(noneMonths);

		System.out.println(EnumSet.range(numbers.JAN, numbers.JUL));

	}

}
