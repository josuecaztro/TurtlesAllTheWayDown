import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static void main(String[] args) {

        GCD gcd = new GCD();
        GCD2 gcd2 = new GCD2();

        Instant start = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            gcd.getGcd(88, 488);
        }
        // CODE to be timed goes HERE
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        Instant start2 = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            gcd2.getGcd2(88, 488);
        }
        // CODE to be timed goes HERE
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        System.out.println("GCD Time Elapsed: " + timeElapsed + " milliseconds.");
        System.out.println("GCD2 Time Elapsed: " + timeElapsed2 + " milliseconds.");
    }
}
