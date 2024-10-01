package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		 Calendar cal=Calendar.getInstance();
		 SimpleDateFormat sd=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		 System.out.println(sd.format(cal.getTime()));
         System.out.println(cal.get(Calendar.DATE));
         System.out.println(cal.get(Calendar.AM_PM)); //if it is am returns 0 pm returns 1
		 System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		 System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println(cal.get(Calendar.MINUTE));

	}

}
