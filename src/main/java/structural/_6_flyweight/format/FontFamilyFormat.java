package structural._6_flyweight.format;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Random;

public class FontFamilyFormat implements IFormat {
	String fontFamilyName;
	String fontFamilyPath;
	byte[] renderData;

	public FontFamilyFormat(String fontFamilyName, String fontFamilyPath) {
		this.fontFamilyName = fontFamilyName;
		this.fontFamilyPath = fontFamilyPath;

		loadRenderData();
	}

	@Override
	public void loadRenderData() {
		int renderDataSize = new Random().nextInt(200);
		System.out.printf("[��Ʈ �йи�] %s ���� ������ %d ����Ʈ �ε��Ϸ�!\n", fontFamilyName, renderDataSize);
		renderData = new byte[renderDataSize];
	}

	@Override
	public void render() {
		System.out.println("[��Ʈ �йи�] " + fontFamilyName + " ��Ʈ ����!");
	}
}
