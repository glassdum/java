package selfTest;

import java.text.*;
import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		Car2 myCar = new Car2("그랜저");
		Car2 yourCar = new Car2("그랜저");
		
		if(myCar.equals(yourCar)) {
			System.out.printf("자동차 모델이 둘 다 [%s]로 동일하다.\n",myCar.toString());
		}else {
			System.out.printf("내 자동차[%s], 너 자동차 [%s]로 모델이 다르다.\n",myCar.toString(),yourCar.toString());
		}
		
		SimpleDateFormat c1 = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = MessageFormat.format("날짜: {0}, 자동차 모델 = [{1}], 운전자 ({2})", c1.format(d), myCar, "홍길동");
		
		System.out.println(s1);
	}

}
class Car2 {
	private String model;
	
	public Car2(String model) {
		this.model = model;
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Car2) {
			Car2 c = (Car2) obj;
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