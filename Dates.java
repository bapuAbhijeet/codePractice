import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.*; 

public class Dates{
   public static void main(String args[]){
	 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	 String addonAdditionDate1 = "02 02 2020";
	 String currentDate1 = "27 11 2020";

	 try {
	       Date addonAdditionDate = myFormat.parse(addonAdditionDate1);
	       Date currentDate = myFormat.parse(currentDate1);
	       long difference = currentDate.getTime() - addonAdditionDate.getTime();
	       //float daysBetween = (difference / (1000*60*60*24));
               /* You can also convert the milliseconds to days using this method
                * float daysBetween = 
                *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                */
            float daysBetween = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            float N = daysBetween / 29;
	       System.out.println("Number of Days between dates: "+daysBetween);
	       System.out.println("N : "+ N);
	       System.out.println("Ceil : " + Math.ceil(N));
	       //Date newRecurrenceDate = addonAdditionDate + (N*29);
	       //System.out.println("New Recurrence Date: "+newRecurrenceDate);
	 } catch (Exception e) {
	       e.printStackTrace();
	 }
   }
}