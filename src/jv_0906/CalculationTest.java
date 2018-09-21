package jv_0906;

import shape.Circle;
//import shape.Drawable;
import shape.Shape;
//import shape.rectangle; 


public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plus plus = new Plus();
		plus.setData(27, 32);
		// 부모클래스의 setData로 간다.
//		plus.answer();
		// 자식 클래스의 answer로 간다.
		Calculation c = plus;
		IMakerable im = plus;

		Minus miner = new Minus();
		miner.setData(32, 27);
		miner.answer();
		

		Calculation cf = new Plus();
		
		System.out.println(c instanceof Plus);
		System.out.println(c instanceof IMakerable);
		//System.out.println(c instanceof Multi);
		System.out.println(c instanceof Calculation);

	}

}