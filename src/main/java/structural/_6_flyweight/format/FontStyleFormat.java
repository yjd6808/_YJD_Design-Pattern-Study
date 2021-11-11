package structural._6_flyweight.format;

import java.util.Random;

public class FontStyleFormat implements IFormat {
	String fontStyleName;
	byte[] renderData;

	public FontStyleFormat(String fontStyleName) {
		this.fontStyleName = fontStyleName;

		loadRenderData();
	}

	@Override
	public void loadRenderData() {
		int renderDataSize = new Random().nextInt(200);
		System.out.printf("[폰트 스타일] %s 렌더 데이터 %d 바이트 로딩완료!\n", fontStyleName, renderDataSize);
		renderData = new byte[renderDataSize];
	}

	@Override
	public void render() {
		System.out.println("[폰트 스타일] " + fontStyleName + " 렌더!");
	}
}
