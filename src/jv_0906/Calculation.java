package jv_0906;

public abstract class Calculation {
	int a;
	int b;
	int result;

	public abstract void answer();

	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
}