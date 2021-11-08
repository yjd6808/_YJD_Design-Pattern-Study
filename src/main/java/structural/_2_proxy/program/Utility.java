package structural._2_proxy.program;

public class Utility implements Program{
	private String utilityName;
	private boolean isMalware;	// 악성 프로그램인지?

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
		System.out.println(utilityName + " 게임이 실행되기 위해 메모리에 올라갑니다.");
		System.out.println("\t유틸리티 이름 : " + utilityName);
		System.out.println("\t악성 프로그램인가? : " + isMalware);

		if (isMalware) {
			System.out.println("\t\t바이러스가 심어진 프로그램을 실행하였습니다. " +
					"\n\t\t이제 당신의 컴퓨터는 영구적으로 사용 불가능합니다.");
		}
	}
}
