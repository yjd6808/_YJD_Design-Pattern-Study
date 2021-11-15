package behavioral._9_visitor.v1.shape;

import behavioral._9_visitor.v1.visitor.ShapeVisitor;

public abstract class Shape {
	private int x;
	private int y;
	private long backgroundColor;
	private long foregroundColor;

	public Shape(int x, int y, long backgroundColor, long foregroundColor) {
		this.x = x;
		this.y = y;
		this.backgroundColor = backgroundColor;
		this.foregroundColor = foregroundColor;
	}

	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public long getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(long bgColor) {
		this.backgroundColor = bgColor;
	}
	public long getForegroundColor() {
		return foregroundColor;
	}
	public void setForegroundColor(long fgColor) {
		this.foregroundColor = fgColor;
	}
}
