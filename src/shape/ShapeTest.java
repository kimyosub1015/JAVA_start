package shape;

public class ShapeTest extends ColorPoint {
	public ShapeTest(int i, int j, String color) {
		super(i, j, color);
	}

	public static void main(String[] args) {
	/*
	ShapeTest  p1 = (ShapeTest) new ColorPoint(2,3,"color");
	Point p3 = new Point(2,3);
	ColorPoint p2 = new ColorPoint(4,5,"red");
	//ColorPoint p3 = new ColorPoint(4);
	*/
	Shape s1 = new Rect();
	Shape s2 = new Tri();
	Rect r1 = new Rect();
	Tri t1 = new Tri();
	
	//부모클래스를 자식클래스로 직접 타입캐스팅 안된다.
	Shape s3 = new Rect();
	Rect r2 = (Rect)s3;
	System.out.println(s1.x);
	System.out.println(r1.x);
	System.out.println(r1.name);
	System.out.println(r2.x);
	Circle c1 = new Circle();
	ShapeDraw draw = new ShapeDraw();
	
	
	
	/*
	p1.setX(2);
	p1.setY(5);
	p1.show();
	//System.out.println(p1.getY());
	p1.show(true);
	p1.show(false);
	p1.show(true);
	p1.show(false);
	*/
	/*
	p2.setX(10);
	p2.setY(20);
	p1.show();
	p2.show(3,4,"Blue");
	*/
//	p3.show
	
	//도형별 그리기 함수
	draw.drawShapeRect(r1);
	draw.drawShapeTri(t1);
	draw.drawShapeCircle(c1);
	
	draw.drawShape(s1);
	draw.drawShape(s2);
	
	}

}




