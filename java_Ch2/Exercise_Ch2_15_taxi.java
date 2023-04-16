package Ch2;

class Student2 {
	private String studentName;
	private int money;
	
	public Student2(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi, int taxiFare) {
		this.money -= taxiFare;
		taxi.take(taxiFare);
	}
	public void showStudentInfo() {
		System.out.println(this.studentName+"님의 남은 돈은 "
				+this.money+"원 입니다.");
	}
}
class Taxi{
	private String taxiName;
	private int income;
	
	public Taxi(String taxiName){
		this.taxiName = taxiName;
	}
	public void take(int taxiFare) {
		this.income += taxiFare;
	}
	public void showTaxiInfo() {
		System.out.println(this.taxiName+
				"택시 수입은 "+this.income+"원 입니다.");
	}
}

public class Exercise_Ch2_15_taxi {
	public static void main(String[] args) {
		Student2 studentE = new Student2("Edward", 20000);
		Taxi taxi = new Taxi("잘나간다 운수");
		studentE.takeTaxi(taxi, 10000);
		
		studentE.showStudentInfo();
		taxi.showTaxiInfo();
	}
}
