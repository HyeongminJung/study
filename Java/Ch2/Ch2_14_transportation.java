package Ch2;

class st{
	private String studentName;
	private int money ;
	
	public st(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	public void showInfo() {
		System.out.println(this.studentName+
				"님의 남은 돈은 "+this.money+"원입니다.");
	}
}

class Bus{
	private int busNumber;
	private int passengerCount;
	private int income;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int income) {
		this.income += income;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(this.busNumber+"번의 승객 수는 "
				+this.passengerCount+"명 이고, 수입은 "+
				this.income+"원 입니다.");
	}
}

class Subway{
	private int subwayNumber;
	private int passengerCount;
	private int income;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	public void take(int income) {
		this.income += income;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(this.subwayNumber+"번의 승객 수는 "
				+this.passengerCount+"명 이고, 수입은 "+
				this.income+"원 입니다.");
	}
}

public class Ch2_14_transportation {
	public static void main(String[] args) {
		st studentJ = new st("James", 5000);
		st studentT = new st("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		greenSubway.showBusInfo();
	}
}
