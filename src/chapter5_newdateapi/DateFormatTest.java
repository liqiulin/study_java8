package chapter5_newdateapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by qiulin on 2016-6-20.
 */
public class DateFormatTest {
    public static void main(String[] args) {
        LocalDateTime  ldt = LocalDateTime.now();
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(ldt));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt));

        // 自定义日期格式
        // 从日期转换成指定格式字符串
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(ldt));

        // 从字符串转换成日期时间对象
        String dateTimeStr = "2018-01-20 12:13:14";
        ldt = LocalDateTime.parse(dateTimeStr, dtf);
        System.out.println(dtf.format(ldt));


    }
}
