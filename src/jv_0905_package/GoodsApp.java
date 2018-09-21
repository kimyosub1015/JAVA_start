package jv_0905_package;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		/*
		goods.name = "Nikon";
		goods.price = 40000;
		goods.countStock = 30;
		goods.countSold = 50;
*/
		/*
		System.out.print("Name : "+goods.name);
		System.out.print("price : "+goods.price);
		System.out.print("Stock : "+goods.countStock);
		System.out.print("Sold : "+goods.countSold);
*/
		/*
		goods.setName("Nikon");
		goods.showInfo();
		
		System.out.println("goodsOfCount : "+Goods.countOfGoods);
		//Goods goods2 = new Goods();
		System.out.println("goodsOfCount : "+Goods.countOfGoods);
		//Goods goods3 = new Goods();
		System.out.println("goodsOfCount : "+Goods.countOfGoods);
		*/
		
		goods.setName("Nikon");
		goods.setPrice(50000);
		goods.setCountSold(20);
		goods.setCountStock(10);
		goods.showInfo();
	}

}
