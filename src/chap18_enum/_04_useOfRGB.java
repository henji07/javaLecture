package chap18_enum;

import chap18_enum.enums.RGB;

public class _04_useOfRGB {

	public static void main(String[] args) {
		
		//객체 생성
		RGB r = RGB.RED;
		RGB g = RGB.valueOf("GREEN");
		RGB b = Enum.valueOf(RGB.class, "BLUE");
		
		System.out.println("빨간색은 " + r.getRed() + ", " +
							r.getGreen() + ", " + r.getBlue());
		
		System.out.println("초록색은 " + g.getRed() + ", " +
				g.getGreen() + ", " + g.getBlue());
		
		System.out.println("파란색은 " + b.getRed() + ", " +
				b.getGreen() + ", " + b.getBlue());

	}

}
