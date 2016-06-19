package chapter5_newdateapi;

import java.time.*;

/**
 * 本地日期、时间是不带时区的
 *
 * Created by qiulin on 2016-6-19.
 */
public class LocalDateTimeTest {


    //
    public static void main(String[] args) {
        // 创建
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.JUNE, 19, 20, 6, 59);

        // 计算两个本地日期的距离
        System.out.println(ldt1.toLocalDate().until(ldt2.toLocalDate()));

        // 计算
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.plusDays(1).isAfter(ldt2));

        // 是否闰年
        System.out.println(ldt1.toLocalDate().isLeapYear());

        // 如何表示程序员日(每年的第256天)
        LocalDate programersDate = LocalDate.of(2015, 1, 1).plusDays(255);

        // 计算月注意最后一天
        LocalDate d = LocalDate.of(2016, 1, 31);
        System.out.println(d);  // 2016-01-31
        System.out.println(d.plusMonths(1)); // 2016-02-29
        System.out.println(d.plusMonths(1).minusMonths(1)); // 2016-01-29

        DayOfWeek mondy = DayOfWeek.MONDAY;

        MonthDay day = MonthDay.now();
    }
}
