package jv_0906;

public class Minus extends Calculation implements IMakerable{

	@Override
	public void makeResult() {
		result = a - b;
	}

	@Override
	public void answer() {
		
		System.out.println(a + " - " + b + " = " + (result));
	}
}