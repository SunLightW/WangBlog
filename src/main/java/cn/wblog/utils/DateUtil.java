package cn.wblog.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * date 工具类
 */
public class DateUtil {

	private static final  String DATE_DEFAULT_FORMAT = "yyyy-MM-dd";//日期格式
	private static final  String DATETIME_DEFAULT_FORMAT ="yyyy-MM-dd HH:mm:ss";//日期时间格式
	public static final String TIME_DEFAULT_FORMAT = "HH:mm:ss";//时间格式

	/**
	 * 声明私有的构造函数，不可创建实例对象
	 */
	private DateUtil() {}


	/**
	 * 获取当前时间
	 * @return
	 */
	public static Date getNowDate(){
		return new Date();
	}

	/**
	 * 日期格式化yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String formatDate_date(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_DEFAULT_FORMAT);
		return dateFormat.format(date);
	}

	/**
	 * 日期格式化yyyy-MM-dd hh:mm:ss
	 * @param date
	 * @return
	 */
	public static String formatDate_datetime(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATETIME_DEFAULT_FORMAT);
		return dateFormat.format(date);
	}

	/**
	 * 日期格式化hh:mm:ss
	 * @param date
	 * @return
	 */
	public static String formatDate_time(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(TIME_DEFAULT_FORMAT);
		return dateFormat.format(date);
	}
}