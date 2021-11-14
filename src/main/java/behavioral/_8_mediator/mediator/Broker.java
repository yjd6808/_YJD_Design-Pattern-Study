package behavioral._8_mediator.mediator;

import behavioral._8_mediator.colleague.BuildingOwner;
import behavioral._8_mediator.colleague.Furniture;
import behavioral._8_mediator.colleague.RepairMan;
import behavioral._8_mediator.colleague.Tenant;

import java.util.List;

public class Broker {
	private BuildingOwner buildingOwner;
	private RepairMan repairMan;
	private Tenant tenant;
	private String name;

	public Broker(String name) {
		this.name = name;
	}

	public void registerOwner(BuildingOwner owner) {
		this.buildingOwner = owner;
	}

	public void registerRepairMan(RepairMan repairMan) {
		this.repairMan = repairMan;
	}

	public void registerTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	public void mediateRoomFromOwner() {
		System.out.printf("�߰��� %s�� �ǹ��� %s�� ���� ������ %s���� �Ұ���������ϴ�.\n",
				name, buildingOwner.getName(), tenant.getName());
	}

	public void mediateRoomFromTenant() {
		System.out.printf("�߰��� %s�� ������ %s���� �ǹ��� %s�� ���� �Ұ���������ϴ�.\n",
				name, tenant.getName(), buildingOwner.getName());
	}

	public void mediateFixingAllFurnitureFromOwner() {
		System.out.printf("�ǹ��� %s�� �߰��� %s���� ��� ������ ������ ��û�Ͽ����ϴ�.\n",
				buildingOwner.getName(), name);
		System.out.printf("�׷��� �߰��� %s�� ������� %s���� ��� ������ ������ ��û�Ͽ����ϴ�.\n",
				name, repairMan.getName());

		List<Furniture> ownerFurnitures = buildingOwner.getFurnitures();
		for (int i = 0; i < ownerFurnitures.size(); i++) {
			repairMan.fix(ownerFurnitures.get(i));
		}
	}

	public void mediateFixingFurnitureFromTenant(String furnitureName) {
		System.out.printf("������ %s�� �߰��� %s���� ���� %s�� ������ ��û�Ͽ����ϴ�.\n",
				tenant.getName(), name, furnitureName);

		Furniture furniture = buildingOwner.getFurnitures()
				.stream()
				.filter(x -> x.getName().equals(furnitureName))
				.findFirst()
				.orElse(null);

		if (furniture == null) {
			System.out.printf("�ǹ��� %s�� ���� %s�� �����ϰ� ���� �ʽ��ϴ�.\n",
					buildingOwner.getName(), furnitureName);
			return;
		}

		System.out.printf("�׷��� �߰��� %s�� ������� %s���� ���� %s�� ������ ��û�Ͽ����ϴ�.\n",
				name, repairMan.getName(), furnitureName);

		repairMan.fix(furniture);
	}
}
