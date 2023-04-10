package chap22_IO.clazz.exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _11_datatInputOutputStream {

	public static void main(String[] args) {
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Dev224/JAVA.car.txt"));
			
			dos.writeUTF("현대");
			dos.writeUTF("아반떼");
			dos.writeDouble(150.5);
			dos.writeInt(2000);
			
			dos.writeUTF("현대");
			dos.writeUTF("소나타");
			dos.writeDouble(189.3);
			dos.writeInt(3000);
			
			dos.writeUTF("현대");
			dos.writeUTF("제네시스");
			dos.writeDouble(220.7);
			dos.writeInt(5000);
			
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream("C:/Dev224/JAVA.car.txt"));
			
			List<Car> carList = new ArrayList<Car>();
			
			for(int i = 0; i < 3; i++) {
				String company = dis.readUTF(); //첫번째 스트링 가져와서 company에 넣어주기
				String model = dis.readUTF();
				double maxSpeed = dis.readDouble();
				int price = dis.readInt();
				
				Car c = new Car(company, model, maxSpeed, price);
				
				carList.add(c); //3번 담아주기 
			}
			//System.out.println(carList.toString()); -> 이렇게 해도 됨!
			for(int i = 0; i < carList.size(); i++) {
				System.out.println(carList.get(i).toString());
			}
			
			dis.close();
			
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
