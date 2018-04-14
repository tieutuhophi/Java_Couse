package thanhdnh.hueic.edu.vn.Lession02;

public class Diem {
	private float x;
	private float y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public Diem() {
		x = y = 0;
	}
	
	public Diem(float a, float b) {
		x = a;
		y = b;
	}
}
