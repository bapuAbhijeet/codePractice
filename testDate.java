import java.util.Calendar;
import java.util.Date;
class testDates{
      public static void main(final String args[]) {
          int year = 2017;
          int month = 8;
          int day = 14;

        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};
        System.out.println( day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1]);
      }
}