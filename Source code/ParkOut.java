import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
public class ParkOut {
public LocalTime park_out(){

    System.out.print("Departure Time: ");
    LocalTime myobj = LocalTime.now();
    System.out.println(myobj);
    return myobj;

    //System.out.println(java.time.LocalTime.now());
    //return java.time.LocalTime.now();
}
}
