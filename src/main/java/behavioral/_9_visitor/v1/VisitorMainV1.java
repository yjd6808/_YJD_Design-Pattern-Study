package behavioral._9_visitor.v1;

import behavioral._9_visitor.v1.shape.*;
import behavioral._9_visitor.v1.visitor.*;
import java.util.*;

public class VisitorMainV1 {

	private static List<Shape> shapes = new ArrayList<>();

	// 0,0 좌표로 이동시켜주는 방문자
	private static PositioningShapeVisitor moveToZeroVisitor =
			new PositioningShapeVisitor(0, 0);
	
	// 도형 정보를 출력해주는 방문자
	private static PrintingInfoShapeVisitor printingInfoShapeVisitor =
			new PrintingInfoShapeVisitor();

	// 배경색을 하얀색으로 바꿔주는 방문자
	private static BGColoringShapeVisitor bgColorToWhiteVisitor =
			new BGColoringShapeVisitor(0xffffffffL);

	// 전경색을 검은색으로 바꿔주는 방문자
	private static FGColoringShapeVisitor fgColorToBlackVisitor =
			new FGColoringShapeVisitor(0x00000000);

	public static void main(String[] args) {
		shapes.add(new Hexagon(50, 50, 0xffffffffL, 0x00000000));
		shapes.add(new Circle(50, 50, 0xffffffffL, 0x00000000));
		shapes.add(new Circle(50, 50, 0xffffffffL, 0x00000000));
		shapes.add(new Rectangle(50, 50, 0xffffffffL, 0x00000000));

		System.out.println("[0,0 좌표로 이동시켜주는 방문자 순회]");
		shapes.forEach(x -> x.accept(moveToZeroVisitor)); System.out.println();

		System.out.println("[배경색을 하얀색으로 바꿔주는 방문자 순회]");
		shapes.forEach(x -> x.accept(bgColorToWhiteVisitor)); System.out.println();

		System.out.println("[전경색을 검은색으로 바꿔주는 방문자 순회]");
		shapes.forEach(x -> x.accept(fgColorToBlackVisitor)); System.out.println();

		System.out.println("[도형 정보를 출력해주는 방문자 순회]");
		shapes.forEach(x -> x.accept(printingInfoShapeVisitor)); System.out.println();
	}
}
