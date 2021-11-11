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
		System.out.printf("[폰트 패밀리] %s 렌더 데이터 %d 바이트 로딩완료!\n", fontFamilyName, renderDataSize);
		renderData = new byte[renderDataSize];
	}

	@Override
	public void render() {
		System.out.println("[폰트 패밀리] " + fontFamilyName + " 폰트 렌더!");
	}
}
