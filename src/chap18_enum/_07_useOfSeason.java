package chap18_enum;

import chap18_enum.enums.Season;

public class _07_useOfSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season[] seasonArr = Season.values();
		
		for(Season s : seasonArr) {
			s.printSeasonMonth();
		}
	}

}
