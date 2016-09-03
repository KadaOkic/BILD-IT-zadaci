/**
 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
 * a calendar for a specified month using the Calendar and GregorianCalendar
 * classes. Your program receives the month and year from the command line. For
 * example:
 * java Exercise13_04 5 2016
 * You also can run the program without the year. In this case, the year is the current
 * year. If you run the program without specifying a month and a year, the month is
 * the current month.
 */
package zadaci_02_09_2016;

import java.util.Calendar;

public class DisplayCalendars {

	 public static void main(String[] args) {
		 if (args.length >= 2) {
	            int month = Integer.parseInt(args[0]);
	            int year = Integer.parseInt(args[1]);
	 
	            printMonth(month, year);
	        } else {
	            Calendar now = Calendar.getInstance();
	            printMonth((now.get(Calendar.MONTH) + 1), now.get(Calendar.YEAR));
	        }
	 
	    }
	 
	    public static void printMonth(int month, int year) {
	        if (month != 0 && year != 0) {
	            // printing out header (month and year)
	            System.out.println("  \t\t  " + whichMonth(month) + "\t" + year + "\n");
	            // printing out days of the week
	            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	            System.out.println("___________________________________________________\n");
	            int firstDayInMonth = getFirstDay(year, month);
	            // printing out spaces until we reach day of the 1st in the month
	            if (firstDayInMonth % 7 != 0) {
	 
	                for (int i = 0; i < firstDayInMonth; i++)
	                    System.out.print("\t");
	            }
	            // printing out the rest of the month
	            for (int i = 1; i <= (numberOfDaysInMonth(year, month)); i++) {
	                if (i < 10) { //
	                    System.out.print(" " + i + "\t");
	                } else {
	                    System.out.print(i + "\t");
	                }
	                if ((firstDayInMonth + i) % 7 == 0) {
	                    System.out.println();
	                }
	 
	            }
	            System.out.println();
	        }
	 
	    }
	 
	    // method that calculates how many days month have
	 
	    public static int numberOfDaysInMonth(int year, int monthNum) {
	        int days = 0;
	        // Defining number of days in a month first for leap year (month) then
	        // for the rest month
	        if (((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) && (monthNum == 2))
	            days = 29;
	        else
	            switch (monthNum) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                days = 31;
	                break;
	            case 2:
	                days = 28;
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                days = 30;
	                break;
	            }
	        return days;
	    }
	 
	    // method that uses Calendar class to find first day of the month
	 
	    public static int getFirstDay(int year, int month) {
	        // creating calendar object
	        Calendar cal = Calendar.getInstance();
	        // setting month value(decreasing by one, months in calendar class are 0
	        // based)
	        cal.set(Calendar.MONTH, (month - 1));
	        // setting year
	        cal.set(Calendar.YEAR, year);
	        // setting day of month
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        // getting value of day of week for currently set date
	        int firstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
	        // returning value -1 since our calendar starts at sunday
	        return firstDayOfMonth - 1;
	 
	    }
	 
	    // method that returns month as a string with month name
	 
	    public static String whichMonth(int monthNum) {
	        String month = "";
	        // switch statmenet that assigns value to month string depending on the
	        // month number
	        switch (monthNum) {
	        case 1:
	            month = "January";
	            break;
	        case 2:
	            month = "February";
	            break;
	        case 3:
	            month = "March";
	            break;
	        case 4:
	            month = "April";
	            break;
	        case 5:
	            month = "May";
	            break;
	        case 6:
	            month = "June";
	            break;
	        case 7:
	            month = "July";
	            break;
	        case 8:
	            month = "August";
	            break;
	        case 9:
	            month = "September";
	            break;
	        case 10:
	            month = "Oktober";
	            break;
	        case 11:
	            month = "November";
	            break;
	        case 12:
	            month = "December";
	            break;
	        default:
	            month = "Invalid month";
	            break;
	        }
	        return month;
	 
	    }
	 
}