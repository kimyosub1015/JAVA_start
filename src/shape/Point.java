package shape;

public class Point {
	int x_point = 0;
	int y_point = 0;
	

	public int getX(){
		return x_point;
	}
	public void setX(int x_point){
		this.x_point = x_point;
	}
	public int getY(){
		return y_point;
	}
	public void setY(int y_point){
		this.y_point = y_point;
	}
	public void show() {
		System.out.println("점 [x="+x_point+",y="+y_point+"]을 그렸습니다.");
	}
	public void show(boolean showit) {
		if (showit == true) {
			System.out.println("점 [x="+x_point+",y="+y_point+"]을 그렸습니다.");
		}
	}
	public Point(int i, int j, String color) {
		super();
		this.x_point = i;
		this.y_point = j;
}
	public Point(int i, int j) {
		this.x_point = i;
		this.y_point = j;
	}
}
