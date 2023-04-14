package exercise.Ch2;

import java.util.Calendar;

class Company{
	// 정의하지 않으면 자동으로 public 생성자로 지정되어
	// 외부에서 여러개의 Company를 만들 수 있으므로 생성자를 private으로 생성
	private Company() {}
	
	// 유일한 인스턴스
	private static Company instance = new Company();
	
	public static Company getInstance() {
		if( instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
public class Ch2_18_Company {
	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		//Calendar calendar = Calendar.getInstance();
	}
}
