package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateProgram {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf1.parse("14/01/2022");
		
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Meu aniversário é " + sdf1.format(d1));
		
		System.out.println("Data de agora: " + date);

	}

}
