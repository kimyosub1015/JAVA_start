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
		System.out.println("점 [x="+super.getX()+",y="+super.getY()+"Color = "+color+"]를 그렸습니다.");
		}

}

