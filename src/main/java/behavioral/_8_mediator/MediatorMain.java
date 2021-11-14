package behavioral._8_mediator;

import behavioral._8_mediator.colleague.BuildingOwner;
import behavioral._8_mediator.colleague.Furniture;
import behavioral._8_mediator.colleague.RepairMan;
import behavioral._8_mediator.colleague.Tenant;
import behavioral._8_mediator.mediator.Broker;

public class MediatorMain {
	public static void main(String[] args) {
		Broker broker = new Broker("������");
		BuildingOwner buildingOwner = new BuildingOwner("���̺���", broker);
		Tenant tenant = new Tenant("�հ���", broker);
		RepairMan repairMan = new RepairMan("������", broker);
		
		// ���� �ʱ�ȭ
		buildingOwner.addFurniture(new Furniture("����"));
		buildingOwner.addFurniture(new Furniture("ħ��"));
		buildingOwner.addFurniture(new Furniture("å��"));
		buildingOwner.addFurniture(new Furniture("����"));
		
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
		System.out.println("[tenant.requestFix(\"����������\")]");
		tenant.requestFix("����������");
		System.out.println();
		System.out.println("[tenant.requestFix(\"å��\")]");
		tenant.requestFix("å��");
		System.out.println();
	}
}
