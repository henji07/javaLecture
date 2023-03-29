package chap15_usefulClass;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_zonedOffsetDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		//ZonedId 객체 생성
		ZoneId zid = ZoneId.of("Asia/Seoul");

		//LocalDAteTime에 ZonedId 추가해서 
		//ZonedDateTime 객체 생성 
		ZonedDateTime zdt1 = ldt.atZone(zid);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		
		//ZonedDateTime객체에 ZoneId 추가 
		ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zid);
		
		//ZonedDateTime -> OffsetDateTime
		OffsetDateTime odt = zdt1.toOffsetDateTime();
		
		System.out.println(zdt1);
		System.out.println(zdt2);
		System.out.println(zdt3);
		System.out.println(odt);
	}

}
