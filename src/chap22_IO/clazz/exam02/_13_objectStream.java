package chap22_IO.clazz.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class _13_objectStream {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Dev224/oos.txt"));
			
			Car c1 = new Car("현대", "아반떼", 155.6, 2000);
			Car c2 = new Car("현대", "소나타", 185.3, 3000);
			
			//객체를 직렬화하여 멤버변수들을 byte로 변경해서 출력
			oos.writeObject(c1);
			oos.writeObject(c2);
			
			oos.flush();
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Dev224/oos.txt"));
			
			Car car1 = (Car)ois.readObject();
			Car car2 = (Car)ois.readObject();
			
			System.out.println(car1.toString());
			System.out.println(car2.toString());
			
			ois.close();
			
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
