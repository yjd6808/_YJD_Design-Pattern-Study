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
			System.out.println("[���] �Ǽ� ���α׷��� ������ �Ұ����մϴ�.");
			return;
		}

		// �� �� �α���
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " �޸𸮿� �ε� ����");
		utility.loadToMemory();
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " �޸𸮿� �ε� �Ϸ�");
	}
}
