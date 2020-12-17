import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataseCalendar {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date now = new Date();

		System.out.println(sdf.format(now));
		
		Calendar cal = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		System.out.println(sdf.format(c1.getTime()));
		cal.setTime(now);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		now = cal.getTime();
		
		System.out.println(sdf.format(now));
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Mês: "+ mes);
	}

}
