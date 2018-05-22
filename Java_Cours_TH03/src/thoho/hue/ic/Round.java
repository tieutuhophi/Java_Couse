package thoho.hue.ic;

import java.awt.Point;

public class Round {
	private float R;
	private Point O;

	public Round() {
		this.R = Math.round(Math.random());
		this.O = new Point();
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}

	public int VTriTDoi(Point point) {
		float OM = (float) Math.sqrt((Math.pow(O.getX() - point.getX(), 2)) + (Math.pow(O.getY() - point.getY(), 2)));
		if (OM == R) {
			return 0;
		} else if (OM > R) {
			return 1;
		} else
			return -1;

	}
}