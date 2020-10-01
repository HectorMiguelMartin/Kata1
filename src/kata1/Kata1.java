package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * @author Héctor
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1959,8,24);
        Person p = new Person("Pedro", date);
        System.out.println(p.getName() + " " + p.getAge());
    }
    
}
