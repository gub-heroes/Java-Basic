package ProblemSolve;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String fDate = dateFormat.format(date);

        System.out.println("Current Date: "+fDate);

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formetKoraTime = time.format(formatter);

        System.out.println("Current Time : "+formetKoraTime);
    }
}
