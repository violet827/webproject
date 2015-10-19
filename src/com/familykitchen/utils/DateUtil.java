package com.familykitchen.utils;

import java.text.*;
import java.util.*;

/**
 * DateUtil��һ�������࣬�����˸�����������ʱ�䴦��ĳ��þ�̬������
 */

public class DateUtil {
  // �������ڴ���ĳ���
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
   * ������������ʱ�����֮���ʱ���������date1��date2֮ǰ���򷵻���ֵ�����date1��
   * date2֮���򷵻ظ�ֵ�����date1��date2��field����ʾ��ͬһʱ�䵥λ�ڣ��򷵻�0��
   * @param Field DateUtil��ľ�̬�ֶΣ���ʾ���ڼ��� date1 �� date2 ֮���ʱ����
   * @param InputDate1 ���ڼ��������ʱ�����
   * @param InputDate2 ���ڼ��������ʱ�����
   * @return date1��date2֮���ʱ������������
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
   * ���������ָ��ʱ����������ʱ�����
   * @param Field DateUtil��ľ�̬�ֶΣ���ʾҪ��ӵ�ʱ����
   * @param InputDate ���ڼ��������ʱ�����
   * @param Num Ҫ��ӵ�ʱ�����ĸ���
   * @return ���ָ��ʱ�����������ʱ�����
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
   * ���ظ�������ʱ���ָ�����֡�
   * @param Field DateUtil��ľ�̬�ֶΣ���ʾҪȡ����ʱ�䲿��
   * @param InputDate �����������ʱ�����
   * @return ��������ʱ�����ָ�����ֵ�ֵ
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
   * ���ո����ĸ�ʽת������ʱ�����Ϊ�ַ�����
   * @param InputDate ��ת��������ʱ�����
   * @param Pattern ת������ַ�����ʽ
   * @return ת������ַ���
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
   * ���������ַ���ת��Ϊ����ʱ�����
   * @param DateString ��ת��������ʱ���ַ�������ʽyyyy-MM-dd��
   * @return ת���������ʱ�����
   * @throws java.lang.Exception
   */
  public static Date parseDateString(String DateString) throws Exception {
    SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return myDateFormat.parse(DateString);
  }

  /**
   * �����������ڶ����ʱ�����ƴ��Ϊ����ʱ�����
   * @param InputDate ��ת�������ڶ���
   * @param InputTime ��ת����ʱ�����
   * @return ת���������ʱ�����
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
   * �ж�һ���ַ����ǲ��ǺϷ�������ʱ���Ÿ�ʽ
   * @param DateString ��������ʱ�����͵��ַ���
   * @return �����ִ��Ƿ�����ʱ������
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