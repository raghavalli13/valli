import java.util.*;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		String date="1997-07-02";
		student s=new Student(1,"abc",new SimpleDateFormate("yyyy-mm-dd").parse(date),85.3);
		System.out.println(s.getId());
		System.out.println(s.getFullName());
        System.out.println(s.getBirthDate());
		System.out.println(s.getAngmark());
		s.setId(501);
		s.setFullName("xyz");
		 sdate="2000-08-23";
		s.setBirthDate(new SimpleDateFormat("yyyy-mm-dd").parse(sdate));
		s.setAvgMark(90.4);

	}

}
