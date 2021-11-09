package structural._3_facade.hardware;

public class CPU {
	public void compute(byte opCode) {
		System.out.println("CPU : 옵코드 " + opCode + " 수행");
	}
}
