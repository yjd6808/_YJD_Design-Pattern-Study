package behavioral._9_visitor.v1.visitor;

import behavioral._9_visitor.v1.shape.Shape;

public class FGColoringShapeVisitor extends ColoringShapeVisitor {
	public FGColoringShapeVisitor(long color) { super(color); }
	@Override
	public void visit(Shape shape) {
		System.out.printf("\t%s의 전경색을 0x%x로 변경완료!\n",
				shape.getClass().getSimpleName(), color);
		shape.setForegroundColor(color);
	}
}
