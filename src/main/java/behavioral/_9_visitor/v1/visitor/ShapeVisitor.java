package behavioral._9_visitor.v1.visitor;

import behavioral._9_visitor.v1.shape.Shape;

public interface ShapeVisitor {
	void visit(Shape shape);
}
