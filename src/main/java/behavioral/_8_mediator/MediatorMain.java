package behavioral._8_mediator;

import behavioral._8_mediator.colleague.BuildingOwner;
import behavioral._8_mediator.colleague.Furniture;
import behavioral._8_mediator.colleague.RepairMan;
import behavioral._8_mediator.colleague.Tenant;
import behavioral._8_mediator.mediator.Broker;

public class MediatorMain {
	public static void main(String[] args) {
		Broker broker = new Broker("윤정도");
		BuildingOwner buildingOwner = new BuildingOwner("게이볼그", broker);
		Tenant tenant = new Tenant("손고쿠", broker);
		RepairMan repairMan = new RepairMan("몽땅따", broker);
		
		// 가구 초기화
		buildingOwner.addFurniture(new Furniture("쇼파"));
		buildingOwner.addFurniture(new Furniture("침대"));
		buildingOwner.addFurniture(new Furniture("책상"));
		buildingOwner.addFurniture(new Furniture("의자"));
		
		broker.registerOwner(buildingOwner);
		broker.registerTenant(tenant);
		broker.registerRepairMan(repairMan);

		System.out.println("[buildingOwner.requestFix()]");
		buildingOwner.requestFix();
		System.out.println();
		System.out.println("[buildingOwner.requestSell()]");
		buildingOwner.requestSell();
		System.out.println();
		System.out.println("[tenant.requestRoom()]");
		tenant.requestRoom();
		System.out.println();
		System.out.println("[tenant.requestFix(\"ㄹㄴㅇㄹㅇ\")]");
		tenant.requestFix("ㄹㄴㅇㄹㅇ");
		System.out.println();
		System.out.println("[tenant.requestFix(\"책상\")]");
		tenant.requestFix("책상");
		System.out.println();
	}
}
