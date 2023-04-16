package Ch2;

class Order{
	private String orderNumber;
	private String phone;
	private String address;
	private int date;
	private int time;
	private int price;
	private String menuNumber;
	
	public Order() {}
	public void setOrder(String orderNumber, String phone, String address,
			int date, int time, int price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.phone = phone;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMenuNumber(String menuNumber) {
		this.menuNumber = menuNumber;
	}
	public void showOrder() {
		System.out.println("주문 접수 번호 : "+this.orderNumber);
		System.out.println("주문 핸드폰 번호 : "+this.phone);
		System.out.println("주문 집 주소 "+this.address);
		System.out.println("주문 날짜 : "+this.date);
		System.out.println("주문 시간 : "+this.time);
		System.out.println("주문 가격 : "+this.price);
		System.out.println("메뉴 번호: "+this.menuNumber);
	}
}
public class Exercise_Ch2_08_order {
	public static void main(String[] args) {
		Order order1 = new Order();
//		order1.setOrder("202011020003", "01023450001", "서울시 강남구 역삼동 111-333",
//				20201102, 130258, 35000, "0003");
		order1.setOrderNumber("202011020003");
		order1.setPhone("01023450001");
		order1.setAddress("서울시 강남구 역삼동 111-333");
		order1.setDate(20201102);
		order1.setTime(130258);
		order1.setPrice(35000);
		order1.setMenuNumber("0003");
		
		order1.showOrder();
	}

}
