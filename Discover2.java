import java.time.Duration;
import java.time.Instant;
public class Discover2 {
    public static void main(String[] args){

        Instant start1 = Instant.now();
        for (int i=0;i<10_000_000;i++);
        Instant stop1 = Instant.now();
        Duration duration1 = Duration.between(start1,stop1);
        System.out.println(duration1);

        Instant start2 = Instant.now();
        for (int i=0;i<10_000_000;i++);
        Instant stop2 = Instant.now();
        Duration duration2 = Duration.between(start2,stop2);
        System.out.println(duration2);

        //sunt la fel
    }
}
