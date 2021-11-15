package behavioral._9_visitor.v1.visitor;

import behavioral._9_visitor.v1.shape.Shape;

public abstract class ColoringShapeVisitor implements ShapeVisitor {
	protected long color;
	public ColoringShapeVisitor(long color) { this.color = color; }
}
