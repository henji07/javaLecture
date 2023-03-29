package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {

   public static void main(String[] args) {
	  //Integer타입의 List객체 담을 intList
      List<Integer> intList = new ArrayList<Integer>();
      
      
      for(int i = 0; i < 10; i++) {
         intList.add(i + 1);
      }
      
      System.out.println(_04_genericEx01.<Integer>getEven(intList));
      System.out.println(_04_genericEx01.getEven(intList));
      
   }
   
   //Number 상속 받는 T, 리턴타입 List<T> getEven(List<T> list)
   public static <T extends Number> List<T> getEven(List<T> list) {
      List<T> returnList = new ArrayList<T>();
      
      //T타입의 t라는 객체에 
      //list에 담긴 애들을 하나씩 넣어준다는 말
      for(T t : list) {
         if(t.intValue() % 2 == 0)
            returnList.add(t);
      }
      
      return returnList;
   }
   
}