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
	//������ ������ �Ϸ��� �����ڸ� �����ϰ� ��� �ϴµ� �� �ڲ� ��Գľ߾ƾƾƾƾƾƾ�
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

}
