package com.javaerhelpers.basehelper.date;

import com.javaerhelpers.basehelper.logger.util.LoggerUtils;
import org.slf4j.Logger;

import java.util.Calendar;
import java.util.Locale;

/**
 * @desc <p>calendar工具类</p>
 * @createDate: 2021/8/24
 * @author: 王凯宁
 * @version: 0.0.1
 */
public class CalendarUtils {

    private final static Logger logger= LoggerUtils.getLogger(CalendarUtils.class);

    /**
     * @desc:<p>根据地区参数获取Calendar</p>
     * @date:2021/8/24
     * @author:王凯宁
     * @version:0.0.1
     * @param locale 可以为空，默认是CHINESE`
     * @return Calendar对象
     */
    public static Calendar getCalendar(Locale locale) {
        Calendar cal = Calendar.getInstance(locale==null?Locale.CHINESE:locale);
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        return cal;
    }

    /**
     * @desc:<p>根据calendar对象获取月份(1月为开头的月份)</p>
     * @date:2021/8/24
     * @author:王凯宁
     * @version:0.0.1
     * @param calendar
     * @return 月份
     */
    public static Integer getMonth(Calendar calendar) {
        if(calendar==null){
            logger.error("calendar can not null");
            return null;
        }
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * @desc:<p>根据calendar对象获取月份中的第几天</p>
     * @date:2021/8/25
     * @author:王凯宁
     * @version:0.0.1
     * @param calendar 参数
     * @return 天数
     */
    public static Integer getDayOfMonth(Calendar calendar) {
        if(calendar==null){
            logger.error("calendar can not null");
            return null;
        }
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}