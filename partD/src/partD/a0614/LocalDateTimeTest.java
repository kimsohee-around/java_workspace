package partD.a0614;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {
	
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("LocalDate 현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("LocalTime 현재 시간 : " + currentTime);  // 10억분의 1초, 나노초(nano) ns
		
//		LocalDate 현재 날짜 : 2023-06-14
//		LocalTime 현재 시간 : 11:11:06.747366300  
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("LocalDateTime 현재 날짜시간 : " + current);
		//2023-06-14T11:13:35.930015800
		
		//특정 날짜와 시간을 지정해서 객체를 생성합니다.
		System.out.println("\n특정 날짜와 시간을 지정해서 객체를 생성합니다.");
		LocalDate mybirth = LocalDate.of(2000, 10, 11);
		LocalTime mybirth_time = LocalTime.of(17, 20);
		System.out.println("LocalDate.of(2000, 10, 11) :" + mybirth);
		System.out.println("LocalTime.of(17, 20) :    " + mybirth_time);
		
		//날짜 사이의 간격 계산
		Period between = Period.between(mybirth,currentDate);
		System.out.println("내가 태어나서 오늘까지");
		System.out.println(between.getYears() + "년");
		System.out.println(between.getMonths() + "달(개월)");
		System.out.println(between.getDays() + "일");
		
		//
		System.out.println("\n내가 태어나서 오늘까지 각각 년,월,일 단위로 구합니다.");
		System.out.println(ChronoUnit.DAYS.between(mybirth, currentDate) + " 일");
		System.out.println(ChronoUnit.MONTHS.between(mybirth, currentDate) + " 달");
		System.out.println(ChronoUnit.YEARS.between(mybirth, currentDate) + " 년");
		
		
	}

}
