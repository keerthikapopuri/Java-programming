import java.util.Date;
import java.text.SimpleDateFormat;
 
public class time_format {
   
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("Current Time is : " + date);
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm.ss aa");
        SimpleDateFormat formatTime1 = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat formatTime2 = new SimpleDateFormat("hh/mm/ss");
        String time = formatTime.format(date);
        String time2 = formatTime1.format(date);
        String time3 = formatTime2.format(date);
        System.out.println("Current Time in AM/PM Format is : " + time);
        System.out.println("Format with : is: "+time2);
        System.out.println("Format with / is: "+time3);
    }
}