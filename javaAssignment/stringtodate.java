package javaAssignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class stringtodate {
	public class TimeString {

	    public void main(String[] args) {
	        // Format y-M-d or yyyy-MM-d
	        String string = "2017-07-25";
	        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

	        System.out.println(date);
	    }
}
}
