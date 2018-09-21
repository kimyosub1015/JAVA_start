package PClass;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "point(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		} else {
			return false;
		}

	}
	public int hashCode() {
		return toString().hashCode();
	}

}
