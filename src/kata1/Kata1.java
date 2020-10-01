package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Héctor
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Pedro", LocalDate.of(1952, Month.MARCH, 2));
        System.out.println(p.getName() + " " + p.getAge());
    }
    
}
