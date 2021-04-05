package bai4_oop.baitap;

import java.time.Duration;
import java.time.Instant;

public class Watch {
    private Instant startTime() {
        Instant start = Instant.now();
        return start;
    }

    private Instant endTime() {
        Instant end = Instant.now();
        return end;
    }

    public Instant stop() {
        return endTime();
    }
    public Instant start(){
        return startTime();
    }
    public void getElapsedTime(Instant start,Instant stop){
        Duration timeElapse=Duration.between(start,stop);
        System.out.println(timeElapse.toMillis()+"millis Second");
    }
}
