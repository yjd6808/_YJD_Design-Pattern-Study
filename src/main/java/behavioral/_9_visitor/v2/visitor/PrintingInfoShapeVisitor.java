package behavioral._9_visitor.v2.visitor;

import behavioral._9_visitor.v2.shape.*;
import behavioral._9_visitor.v2.visitor.*;

public class PrintingInfoShapeVisitor implements ShapeVisitor {

	public void visitShape(Shape shape) {
		System.out.printf("\t[%s¿« ¡§∫∏]!\n", shape.getClass().getSimpleName());
		System.out.printf("\t\tx : %d\n", shape.getX());
		System.out.printf("\t\ty : %d\n", shape.getY());
	}

	@Override
	public void visit(Circle circle) { visitShape(circle); }
	@Override
	public void visit(Hexagon hexagon) {
		visitShape(hexagon);
	}
	@Override
	public void visit(Rectangle rectangle) {
		visitShape(rectangle);
	}
}
