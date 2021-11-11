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
		System.out.printf("[��Ʈ ��Ÿ��] %s ���� ������ %d ����Ʈ �ε��Ϸ�!\n", fontStyleName, renderDataSize);
		renderData = new byte[renderDataSize];
	}

	@Override
	public void render() {
		System.out.println("[��Ʈ ��Ÿ��] " + fontStyleName + " ����!");
	}
}
