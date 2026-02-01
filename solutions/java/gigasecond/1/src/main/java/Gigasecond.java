import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {


    private LocalDateTime localDateTime;

    public Gigasecond(LocalDate moment) {
        this.localDateTime = moment.atTime(0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.localDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        localDateTime = localDateTime.plusSeconds((long)Math.pow(10, 9));
        return this.localDateTime;
    }
}
