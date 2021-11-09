package structural._2_proxy.program.proxy;

import structural._2_proxy.program.Program;
import structural._2_proxy.program.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyUtility implements Program {
	private Utility utility;
	private String utilityName;
	private boolean isMalware;	// �Ǽ� ���α׷�����?

	public ProxyUtility(String utilityName, boolean isMalware) {
		this.utilityName = utilityName;
		this.isMalware = isMalware;
	}

	@Override
	public void loadToMemory() {
		// �Ǽ� ���α׷��� ��� ��ü ���� ��ü�� ���� �ʵ��� �Ѵ�.
		if (isMalware) {
			System.out.println("[���] �Ǽ� ���α׷��� ������ �Ұ����մϴ�.");
			return;
		}

		if (utility == null) {
			utility = new Utility(utilityName, isMalware);
		}

		// �� �� �α���
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " �޸𸮿� �ε� ����");
		utility.loadToMemory();
		System.out.println(new SimpleDateFormat("hh:mm:ss")
				.format(new Date(System.currentTimeMillis())) + " �޸𸮿� �ε� �Ϸ�");
	}
}
