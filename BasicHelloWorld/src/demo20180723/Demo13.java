package demo20180723;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/24.
 2.Instat
     a.概述
         时间戳，即时间轴上的一个点
         从元年1970-1-1 00:00:00到现在的nanosecond数
 */
public class Demo13 {

    public static void main(String[] args) {
        //b. Instant.now();获取当前时间
        // 获取当前时间
        Instant now = Instant.now();
        // T代表东西经0°经线区时：伦敦时间
        System.out.println(now);// 2017-11-25T14:06:57.079Z

        //c.Instant.ofEpochMilli(new Date().getTime()); 旧日期转为新日期
        // 获取当前时间
        Instant instant = Instant.ofEpochMilli(new Date().getTime());
        System.out.println(instant);

        //d. Instant.parse();日期文本格式转换为时间格式
        // 获取当前时间
        Instant instant1 = Instant.parse("1993-02-06T10:12:35Z");
        System.out.println(instant1);

        /**
        3.LocalDate
            表示不带时区的日期，比如2014-01-14
            a.LocalDateTime.now();获取当前日期时间
            b.now.minusDays(2);将当前日期时间减去两天
            c.LocalDateTime.of(2016, 10, 23);构造一个指定日期时间的对象
        */
        // 当前时间
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        // 往前推两天
        LocalDate date = now1.minusDays(2);
        System.out.println(date);
        // 制定一个日期
        LocalDate localDate = LocalDate.of(1993, 2, 6);
        System.out.println(localDate);
        /**
         4.LocalTime
             表示不带时区的时间
             a. LocalTime.now();当前时间
             b. LocalTime.of(22, 33);确定的时间
             c.LocalTime.ofSecondOfDay(4503); 一天中的第4503秒
         */
        // 当前时间
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        // 22:33
        LocalTime localTime = LocalTime.of(22, 33);
        System.out.println(localTime);
        // 一天中的4503秒
        LocalTime ofDay = LocalTime.ofSecondOfDay(4503);
        System.out.println(ofDay);

        /**
         5.LocalDateTim
             是LocalDate和LocalTime的组合体，表示的是不带时区的日期及时间
             a.LocalDateTime.now();当前时间
             b.localDateTime.plusHours(25).plusMinutes(3); 当前时间加上25小时３分钟
             c.LocalDateTime.of(2014, 1, 20, 3, 30, 20)；转换
         */
        // 当前时间
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3);
        // 当前时间加上25小时３分钟
        LocalDateTime plusMinutes = now3.plusHours(25).plusMinutes(3);
        System.out.println(plusMinutes);
        // 转换
        LocalDateTime of = LocalDateTime.of(1993, 2, 6, 11, 23, 30);
        System.out.println(of);

        /**
         6.ZoneDateTime
             含有时区信息的时间
             a.ZonedDateTime.now();获取包含时区的当前日期时间
             b.ZonedDateTime.of(LocalDateTime.of(2014, 1, 20, 3, 30, 20), ZoneId.of("+08"));创建时区的日期时间对象
         */
        // 当前时间
        ZonedDateTime now4 = ZonedDateTime.now();
        System.out.println(now4);
        // 创建时区的日期时间对象
        ZonedDateTime of4 = ZonedDateTime.of(LocalDateTime.of(1993, 2, 6, 11, 23, 30), ZoneId.of("+08"));
        System.out.println(of4);

        /**
         7.DateTimeFormatter
             格式化日期和解析日期格式字符串。DateTimeFormatter是不可变类
             a.格式化：日期对象转换为格式字符串
         */
        // 格式化
        String time = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss").format(LocalDateTime.now());
        System.out.println(time);
        /**b.解析：格式字符串转换为日期对象*/
        // 格式化
        LocalDateTime parse = LocalDateTime.parse("2017.01.01 08:08:08", DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        System.out.println(parse);
    }

}
