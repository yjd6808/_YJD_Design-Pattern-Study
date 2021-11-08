package structural._2_proxy.program.proxy;

import structural._2_proxy.program.Program;
import structural._2_proxy.program.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyUtility implements Program {
	private Utility utility;

	public ProxyUtility(Utility utility) {
		this.utility = utility;
	}

	@Override
	public void loadToMemory() {
		if (utility.isMalware()) {
			System.out.println("[방어] 악성 프로그램은 실행이 불가능합니다.");
			return;
		}

		// 전 후 로깅기능
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " 메모리에 로딩 시작");
		utility.loadToMemory();
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " 메모리에 로딩 완료");
	}
}
