package scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
	public void test1() {
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("test1 : " + dayTime.format(new Date(System.currentTimeMillis())));
	}
	
	public void test2() {
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("test2 : " + dayTime.format(new Date(System.currentTimeMillis())));
	}
}
