package shape;

public class ColorPoint extends Point{
	String color;
	public ColorPoint(int i, int j, String color) {
		super(i,j);
		this.color = color;
	}
/*
	public ColorPoint(int i) {
		System.out.println(i);
	}
*/
	public void show(int i,int j,String Color) {
		System.out.println("�� [x="+super.getX()+",y="+super.getY()+"Color = "+color+"]�� �׷Ƚ��ϴ�.");
		}

}

