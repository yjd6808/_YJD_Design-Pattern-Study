package structural._2_proxy.program;

public class Utility implements Program{
	private String utilityName;
	private boolean isMalware;	// �Ǽ� ���α׷�����?

	public Utility(String utilityName, boolean isMalware) {
		this.utilityName = utilityName;
		this.isMalware = isMalware;
	}

	public String getUtilityName() {
		return utilityName;
	}

	public boolean isMalware() {
		return isMalware;
	}

	@Override
	public void loadToMemory() {
		System.out.println(utilityName + " ������ ����Ǳ� ���� �޸𸮿� �ö󰩴ϴ�.");
		System.out.println("\t��ƿ��Ƽ �̸� : " + utilityName);
		System.out.println("\t�Ǽ� ���α׷��ΰ�? : " + isMalware);

		if (isMalware) {
			System.out.println("\t\t���̷����� �ɾ��� ���α׷��� �����Ͽ����ϴ�. " +
					"\n\t\t���� ����� ��ǻ�ʹ� ���������� ��� �Ұ����մϴ�.");
		}
	}
}
