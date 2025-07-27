
import java.time.*;
import java.time.temporal.*;

public class Clock {
	static StringBuffer milliBuffer = new StringBuffer();
	static StringBuffer microBuffer = new StringBuffer();
	static StringBuffer nanoBuffer = new StringBuffer();
	
	public static void main(String args[]) {
		// get current time and date
		LocalDateTime now = LocalDateTime.now();
		int hour = now.get(ChronoField.HOUR_OF_DAY);
		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		int month = now.get(ChronoField.MONTH_OF_YEAR);
		int day = now.get(ChronoField.DAY_OF_MONTH);
		int year = now.get(ChronoField.YEAR);
		int second = now.get(ChronoField.SECOND_OF_MINUTE);
		int milli = now.get(ChronoField.MILLI_OF_SECOND);
		int micro = now.get(ChronoField.MICRO_OF_SECOND);
		int nano = now.get(ChronoField.NANO_OF_SECOND);
		
		String milliString = "" + milli;
		char[] milliChar = milliString.toCharArray();
		String microString = "" + micro;
		char[] microChar = microString.toCharArray();
		String nanoString = "" + nano;
		char[] nanoChar = nanoString.toCharArray();
		
		for (int dex = 0; dex < milliString.length(); dex++) {
			char currentMilli = milliChar[dex];
			milliBuffer.append(currentMilli);
		}
		
		for (int i = 0; i < microString.length(); i++) {
			char currentMicro = microChar[i];
			microBuffer.append(currentMicro);
		}
		
		for (int j = 0; j < nanoString.length(); j++) {
			char currentNano = nanoChar[j];
			nanoBuffer.append(currentNano);
		}
		
		
		int milliLength = milliBuffer.length();
		microBuffer.delete(0, milliLength);
		int microLength = microBuffer.length();
		if (microBuffer.charAt(0) == '0') {
			microBuffer.delete(0, 1);
		}
		if (microBuffer.charAt(0) == '0') {
			microBuffer.delete(0, 1);
		}
		nanoBuffer.delete(0, (milliLength + microLength));
		if (nanoBuffer.charAt(0) == '0') {
			nanoBuffer.delete(0, 1);
		}
		if (nanoBuffer.charAt(0) == '0') {
			nanoBuffer.delete(0, 1);
		}
		
		
		//display greeting
		if (hour < 12) {
			System.out.println("Good morning.\n");
		} else if (hour < 17) {
			System.out.println("Good afternoon.\n");
		} else {
			System.out.println("Good evening.\n");
		}
		
		// begin the message by showing the minutes
		System.out.print("It's");
		if (minute != 0) {
			System.out.print(" " + minute + " ");
			System.out.print( (minute != 1) ? "minutes" : "minute");
		}
		
		//display the second
		System.out.print(" " + second + " ");
		System.out.print( (second != 1) ? "seconds," : "second,");
		
		//display the millisecond
		System.out.print(" " + milli + " ");
		System.out.print( (milli != 1) ? "milliseconds," : "millisecond,");
		
		//display the microsecond
		System.out.print(" " + microBuffer + " ");
		System.out.print( (microBuffer != new StringBuffer(1)) ? "microseconds," : "microsecond,");
		
		//display the nanosecond
		System.out.print(" and " + nanoBuffer + " ");
		System.out.print( (nanoBuffer != new StringBuffer(1)) ? "nanoseconds" : "nanosecond");
		System.out.print(" past");
		
		// display the hour
		System.out.print(" ");
		System.out.print( (hour > 12) ? (hour - 12) : hour );
		System.out.print(" o'clock on ");
		
		//display the name of the month
		switch (month) {
			case 1:
				System.out.print("January");
				break;
			case 2:
				System.out.print("Feburary");
				break;
			case 3:
				System.out.print("March");
				break;
			case 4:
				System.out.print("April");
				break;
			case 5:
				System.out.print("May");
				break;
			case 6:
				System.out.print("June");
				break;
			case 7:
				System.out.print("July");
			case 8:
				System.out.print("August");
				break;
			case 9:
				System.out.print("September");
				break;
			case 10:
				System.out.print("October");
				break;
			case 11:
				System.out.print("November");
				break;
			case 12:
				System.out.print("December");
				
				
		}
		
		// display the date and year
		System.out.println(" " + day + ", " + year + ".");
	}
}
