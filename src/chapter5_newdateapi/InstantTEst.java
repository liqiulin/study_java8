package chapter5_newdateapi;

import java.time.*;
import java.time.temporal.TemporalUnit;

/**
 * Created by qiulin on 2016-6-19.
 */
public class InstantTest {
    public static void main(String[] args) {
        // 打印瞬时时间
        System.out.println(Instant.now());

        // 计算两个瞬时时间差
        Instant t1 = Instant.now();
        long n = 1;
        for(int i=0; i<100000000; i++) {
            n++;
        }
        Instant t2 = Instant.now();

        // Duration用来表示瞬时时间的持续时间
        Duration duration = Duration.between(t1, t2);
        System.out.println(duration.toMillis());

        // Instant转换成LocalDateTime
        long milliTime = Instant.now().toEpochMilli();
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(ldt);

    }
}
