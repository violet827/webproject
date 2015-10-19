package com.familykitchen.utils;

import java.text.*;
import java.util.*;

/**
 * DateUtil是一个工具类，包含了各种用于日期时间处理的常用静态方法。
 */

public class DateUtil {
  // 用于日期处理的常量
  public static final int YEAR = 1;
  public static final int MONTH = 2;
  public static final int DAY = 3;
  public static final int WEEK = 4;
  public static final int DAY_OF_YEAR = 5;
  public static final int DAY_OF_WEEK = 6;
  public static final int HOUR = 11;
  public static final int MINUTE = 12;
  public static final int SECOND = 13;

  public static Date now() {
    Date datenow = new Date();
    return datenow;
  }

  /**
   * 返回两个日期时间对象之间的时间间隔。如果date1在date2之前，则返回正值；如果date1在
   * date2之后，则返回负值；如果date1和date2在field所表示的同一时间单位内，则返回0。
   * @param Field DateUtil类的静态字段，表示用于计算 date1 和 date2 之间的时间间隔
   * @param InputDate1 用于计算的日期时间对象
   * @param InputDate2 用于计算的日期时间对象
   * @return date1和date2之间的时间间隔（整数）
   * @throws java.lang.Exception
   */
  public static int dateDiff(int Field, Date InputDate1, Date InputDate2)
      throws Exception
  {
      Calendar cal1 = null;
      Calendar cal2 = null;

      cal1=Calendar.getInstance();
      cal2=Calendar.getInstance();


      // different date might have different offset
      cal1.setTime(InputDate1);
      long ldate1 = InputDate1.getTime() + cal1.get(Calendar.ZONE_OFFSET)
                                         + cal1.get(Calendar.DST_OFFSET);

      cal2.setTime(InputDate2);
      long ldate2 = InputDate2.getTime() + cal2.get(Calendar.ZONE_OFFSET)
                                         + cal2.get(Calendar.DST_OFFSET);

      // Use integer calculation, truncate the decimals
      int hr1   = (int)(ldate1/3600000); //60*60*1000
      int hr2   = (int)(ldate2/3600000);

      int days1 = (int)hr1/24;
      int days2 = (int)hr2/24;


      int dateDiff  = days2 - days1;
      int weekOffset = (cal2.get(Calendar.DAY_OF_WEEK)
                         - cal1.get(Calendar.DAY_OF_WEEK))<0 ? 1 : 0;
      int weekDiff  = dateDiff/7 + weekOffset;
      int yearDiff  = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
      int monthDiff = yearDiff * 12 + cal2.get(Calendar.MONTH)
                        - cal1.get(Calendar.MONTH);

      switch(Field)
      {
        case 1:
        {
          return yearDiff;
        }
        case 2:
        {
          return monthDiff;
        }
        case 3:
        {
          return dateDiff;
        }
        case 4:
        {
          return weekDiff;
        }
        default:
        {
          throw new Exception("util.DateDiff: date field not valid");
        }
      } // end of switch
  }

  /**
   * 返回已添加指定时间间隔的日期时间对象。
   * @param Field DateUtil类的静态字段，表示要添加的时间间隔
   * @param InputDate 用于计算的日期时间对象
   * @param Num 要添加的时间间隔的个数
   * @return 添加指定时间间隔后的日期时间对象
   * @throws java.lang.Exception
   */
  public static Date dateAdd(int Field, Date InputDate, int Num)
      throws Exception
  {
    Calendar myCalendar = Calendar.getInstance();
    myCalendar.setTime(InputDate);

    switch(Field)
    {
      case 1:
      {
        myCalendar.add(Calendar.YEAR, Num);
        break;
      }
      case 2:
      {
        myCalendar.add(Calendar.MONTH, Num);
        break;
      }
      case 3:
      {
        myCalendar.add(Calendar.DATE, Num);
        break;
      }
      default:
      {
        throw new Exception("util.DateAdd: date field "
                            + Integer.toString(Field) + " is not valid");
      }
    }

    return myCalendar.getTime();
  }

  /**
   * 返回给定日期时间的指定部分。
   * @param Field DateUtil类的静态字段，表示要取出的时间部分
   * @param InputDate 被处理的日期时间对象
   * @return 给定日期时间对象指定部分的值
   * @throws java.lang.Exception
   */
  public static int datePart(int Field, Date InputDate) throws Exception
  {
    Calendar myCalendar = Calendar.getInstance();
    myCalendar.setTime(InputDate);
    switch(Field)
    {
      case 1:
      {
        return myCalendar.get(Calendar.YEAR);
      }
      case 2:
      {
        return myCalendar.get(Calendar.MONTH) + 1;
      }
      case 3:
      {
        return myCalendar.get(Calendar.DATE);
      }
      case 5:
      {
        return myCalendar.get(Calendar.DAY_OF_YEAR);
      }
      case 6:
      {
        return myCalendar.get(Calendar.DAY_OF_WEEK);
      }
      case 11:
      {
        return myCalendar.get(Calendar.HOUR);
      }
      case 12:
      {
        return myCalendar.get(Calendar.MINUTE);
      }
      case 13:
      {
        return myCalendar.get(Calendar.SECOND);
      }
      default:
      {
        throw new Exception("util.DatePart: date field not valid");
      }
    }
  }

  /**
   * 按照给定的格式转换日期时间对象为字符串。
   * @param InputDate 被转换的日期时间对象
   * @param Pattern 转换后的字符窗格式
   * @return 转换后的字符串
   */
  public static String getDateString(java.util.Date InputDate, String Pattern)
  {
    if(InputDate == null) {
      return null;
    }
    SimpleDateFormat myDateFormat = new SimpleDateFormat(Pattern);
    return myDateFormat.format(InputDate);
  }

  /**
   * 将给定的字符串转换为日期时间对象。
   * @param DateString 被转换的日期时间字符串（格式yyyy-MM-dd）
   * @return 转换后的日期时间对象
   * @throws java.lang.Exception
   */
  public static Date parseDateString(String DateString) throws Exception {
    SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return myDateFormat.parse(DateString);
  }

  /**
   * 将给定的日期对象和时间对象拼合为日期时间对象。
   * @param InputDate 被转换的日期对象
   * @param InputTime 被转换的时间对象
   * @return 转换后的日期时间对象
   * @throws java.lang.Exception
   */
  public static Date parseDateString(Date InputDate, java.sql.Time InputTime)
      throws Exception {
    if(InputDate == null || InputTime == null) {
      return null;
    }
    String DateString = "";
    SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    DateString = getDateString(InputDate, "yyyy-MM-dd");
    DateString += " " + getDateString(InputTime, "HH:mm:ss");
    return myDateFormat.parse(DateString);
  }

  /**
   * 判断一个字符串是不是合法的日期时间存放格式
   * @param DateString 代表日期时间类型的字符串
   * @return 给定字串是否日期时间类型
   * @throws java.lang.Exception
   */
  public static boolean isDate(String DateString) throws Exception
  {
    boolean returnvalue = true;
    DateFormat myDateFormat = DateFormat.getInstance();
    try
    {
      myDateFormat.parse(DateString);
    }
    catch(ParseException e)
    {
      returnvalue = false;
    }
    catch(Exception e)
    {
      throw new Exception("util.IsDate: unknown exception occured");
    }

    return returnvalue;
  }
}