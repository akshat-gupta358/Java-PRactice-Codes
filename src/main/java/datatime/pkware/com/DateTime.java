package datatime.pkware.com;
import java.util.*;

public class DateTime {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		Date d=new Date();
		System.out.println(d);
		
		Calendar c= Calendar.getInstance();
		System.out.println(c.getTimeZone());

	}

}
