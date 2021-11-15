package behavioral._9_visitor.v2.shape;

import behavioral._9_visitor.v2.visitor.ShapeVisitor;

public abstract class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract public void accept(ShapeVisitor visitor);

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
}
