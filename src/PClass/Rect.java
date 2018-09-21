package PClass;

public class Rect {
	int width, height;
	public boolean equals(Object obj) {
		
		Rect rec = (Rect) obj;
		if ((this.width * this.height) == (rec.height * rec.width)) {
			return true;
		} else {
			return false;
		}
	}
	//생성자 생성을 하려면 생성자를 생성하고 써야 하는데 왜 자꾸 까먹냐야아아아아아아앙
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

}
