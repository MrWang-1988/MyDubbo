package com.bris.bj.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static final String DATE_FULL_SS = "yyyy-MM-dd HH:mm:ss.SS";

	public static String dateToStrCurrent(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FULL_SS);
		String format = sdf.format(date);
		return format;
	}
}
