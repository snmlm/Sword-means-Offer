import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class aaa {
	public static void main(String[] args){
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String s[] = sdf2.format(date).split("-");
		System.out.println(s[0]+"��"+s[1]+"��"+s[2]+"��");
	}
}
