package Ch2;

class CarFactory{
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		 if(instance == null) {
			 instance = new CarFactory();
		 }
		 return instance;
	}
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
class Car{
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		this.serialNum++;
		this.carNum = serialNum;
	}
	public int getCarNum() {
		return this.carNum;
	}
}
public class Exercise_Ch2_19_carFactory {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
	}

}
