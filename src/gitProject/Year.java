package gitProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Year {
	public static void main(String[] args) throws ParseException {
		Calendar cal=Calendar.getInstance();
		/*SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sim.parse("2017-02-19");*/
		cal.setTime(new Date());
		int day=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
}
