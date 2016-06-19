package chapter5_newdateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 日期校正器
 * Created by qiulin on 2016-6-19.
 */
public class TemporalAdjustersTest {

    public static void main(String[] args) {
        // 下一个星期五
        LocalDate  firstTuesday = LocalDate.of(2016, 6, 1).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(firstTuesday); // 2016-06-03
    }
}
