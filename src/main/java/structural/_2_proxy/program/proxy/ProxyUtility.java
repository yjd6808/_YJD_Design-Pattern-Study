package structural._2_proxy.program.proxy;

import structural._2_proxy.program.Program;
import structural._2_proxy.program.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyUtility implements Program {
	private Utility utility;
	private String utilityName;
	private boolean isMalware;	// 악성 프로그램인지?

	public ProxyUtility(String utilityName, boolean isMalware) {
		this.utilityName = utilityName;
		this.isMalware = isMalware;
	}

	@Override
	public void loadToMemory() {
		// 악성 프로그램일 경우 객체 생성 자체를 하지 않도록 한다.
		if (isMalware) {
			System.out.println("[방어] 악성 프로그램은 실행이 불가능합니다.");
			return;
		}

		if (utility == null) {
			utility = new Utility(utilityName, isMalware);
		}

		// 전 후 로깅기능
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " 메모리에 로딩 시작");
		utility.loadToMemory();
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " 메모리에 로딩 완료");
	}
}
