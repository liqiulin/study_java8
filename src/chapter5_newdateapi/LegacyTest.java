package chapter5_newdateapi;

import java.time.Instant;
import java.util.Date;

/**
 * Jdk8 与遗留
 * Created by qiulin on 2016-6-20.
 */
public class LegacyTest {
    public static void main(String[] args) {
        Date now = new Date();

        // 转换成Instant
        Instant nowInstant = now.toInstant();

        // 成Instant转换成Date
        now = Date.from(nowInstant);

    }
}
