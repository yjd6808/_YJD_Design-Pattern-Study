package behavioral._9_visitor.v2.visitor;

import behavioral._9_visitor.v1.shape.Shape;

public abstract class PositioningShapeVisitor implements ShapeVisitor {
	protected int x;
	protected int y;

	public PositioningShapeVisitor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
