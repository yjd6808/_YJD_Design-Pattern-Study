package behavioral._9_visitor.v1;

import behavioral._9_visitor.v1.shape.*;
import behavioral._9_visitor.v1.visitor.*;
import java.util.*;

public class VisitorMainV1 {

	private static List<Shape> shapes = new ArrayList<>();

	// 0,0 ��ǥ�� �̵������ִ� �湮��
	private static PositioningShapeVisitor moveToZeroVisitor =
			new PositioningShapeVisitor(0, 0);
	
	// ���� ������ ������ִ� �湮��
	private static PrintingInfoShapeVisitor printingInfoShapeVisitor =
			new PrintingInfoShapeVisitor();

	// ������ �Ͼ������ �ٲ��ִ� �湮��
	private static BGColoringShapeVisitor bgColorToWhiteVisitor =
			new BGColoringShapeVisitor(0xffffffffL);

	// ������� ���������� �ٲ��ִ� �湮��
	private static FGColoringShapeVisitor fgColorToBlackVisitor =
			new FGColoringShapeVisitor(0x00000000);

	public static void main(String[] args) {
		shapes.add(new Hexagon(50, 50, 0xffffffffL, 0x00000000));
		shapes.add(new Circle(50, 50, 0xffffffffL, 0x00000000));
		shapes.add(new Circle(50, 50, 0xffffffffL, 0x00000000));
		shapes.add(new Rectangle(50, 50, 0xffffffffL, 0x00000000));

		System.out.println("[0,0 ��ǥ�� �̵������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(moveToZeroVisitor)); System.out.println();

		System.out.println("[������ �Ͼ������ �ٲ��ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(bgColorToWhiteVisitor)); System.out.println();

		System.out.println("[������� ���������� �ٲ��ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(fgColorToBlackVisitor)); System.out.println();

		System.out.println("[���� ������ ������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(printingInfoShapeVisitor)); System.out.println();
	}
}
