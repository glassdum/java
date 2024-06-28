package selfTest;

import java.text.*;
import java.util.*;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		Car3 myCar = new Car3("그랜저");
		Car3 yourCar = new Car3("그랜저");
		
		if(myCar.equals(yourCar)) {
			System.out.printf("자동차 모델이 둘 다 [%s]로 동일하다.\n",myCar.toString());
		}else {
			System.out.printf("내 자동차[%s], 너 자동차 [%s]로 모델이 다르다.\n",myCar.toString(),yourCar.toString());
		}
		
		SimpleDateFormat c1 = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = MessageFormat.format("날짜: {0}, 자동차 모델 = [{1}], 운전자 ({2})", c1.format(d), myCar, "홍길동");
		System.out.println(s1);
		
		StringTokenizer st = new StringTokenizer(s1," ,[]()=");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
class Car3 {
	String model;
	
	public Car3(String model) {
		this.model = model;
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Car3) {
			Car3 c = (Car3) obj;
			if(model.equals(c.model)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return model;
	}
	
	
}