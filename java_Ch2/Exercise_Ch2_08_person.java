package exercise.Ch2;

class Person{
	private int height;
	private int weight;
	private String name;
	private int age;
	private String gender;
	
	public Person() {}
	public void setPerson(int height, int weight, 
			String name, int age, String gender ) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;	
		this.gender = gender;	
	}
	public void showPerson() {
		System.out.println("키가 "+this.height+"이고 몸무게가"+
				this.weight+" 킬로인 "+this.gender+"이 있습니다. 이름은 "+
				this.name+"이고 나이는 "+this.age+"세입니다.");
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Exercise_Ch2_08_person{
	public static void main(String[] args) {
		Person Tomas = new Person();
		Tomas.setPerson(180, 78, "Tomas", 37, "남성");
		Tomas.showPerson();
	}
}