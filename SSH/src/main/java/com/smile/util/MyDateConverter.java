package com.smile.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class MyDateConverter extends DefaultTypeConverter{
	
	/**
	 * context:上下文
	 * value:用户提交的待转换的数据——>是数组类型的数据String[]
	 * toType:要转换成的数据
	 */
	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		if(toType == Date.class) { //要转换成的数据是否是Date类型的数据
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				return format.parse(((String[])value)[0]);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return super.convertValue(context, value, toType);
	}
}
