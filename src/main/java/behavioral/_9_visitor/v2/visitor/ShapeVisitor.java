package behavioral._9_visitor.v2.visitor;

import behavioral._9_visitor.v2.shape.*;

public interface ShapeVisitor {
	void visit(Circle circle);
	void visit(Hexagon hexagon);
	void visit(Rectangle rectangle);
}
