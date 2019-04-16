package com.automation.utilities;

import java.util.Date;

public class TestUtils {
	
	public static String getCurrent(){
		
		Date date=new Date();
		System.out.println(date);
		String current=date.toString().replace(":", "_").replace(" ", "_");
		return current;
	}

}
