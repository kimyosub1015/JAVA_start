package jv_0905_package;

public class Goods {
	private String name		= "";
	private int price				= 0;
	private int countStock	= 0;
	private int countSold		= 0;
	static int countOfGoods = 0;
	//Goods goods = new Goods();
	public void setName(String name) {
		this.name =name;
	}
	public int getPirce() {
		return price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//접근지정자를 private로 할 경우 외부에서 get,set 명령이 필요하다면 같은 클래스 내에서 명령어를 넣어준다.
	
	public Goods() {
		//생성자 호출 과정
		System.out.println("생성자 Goods()");
		countOfGoods++; //
	}
	
	
	public void showInfo(){
	System.out.println("Name : "+name);
	System.out.println("price : "+price);
	System.out.println("Stock : "+countStock);
	System.out.println("Sold : "+countSold);
	//System.out.println("Sold : "+countOfGoods);
	}
}

