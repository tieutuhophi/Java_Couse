package thanhdnh.hueic.edu.vn.Lession02;

public class DuongTron {
	private Diem O;
	private float R;

	public Diem getO() {
		return O;
	}

	public void setO(Diem o) {
		O = o;
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}
	
	public DuongTron() {
		Diem Q = new Diem();
		O = Q;
		R = 0;
	}
	
	public DuongTron(Diem P, float S) {
		O = P;
		R = S;
	}
}
