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
		System.out.printf("중개인 %s가 건물주 %s의 방을 입주자 %s에게 소개시켜줬습니다.\n",
				name, buildingOwner.getName(), tenant.getName());
	}

	public void mediateRoomFromTenant() {
		System.out.printf("중개인 %s가 입주자 %s에게 건물주 %s의 방을 소개시켜줬습니다.\n",
				name, tenant.getName(), buildingOwner.getName());
	}

	public void mediateFixingAllFurnitureFromOwner() {
		System.out.printf("건물주 %s가 중개인 %s에게 모든 가구의 수리를 요청하였습니다.\n",
				buildingOwner.getName(), name);
		System.out.printf("그래서 중개인 %s는 수리기사 %s에게 모든 가구의 수리를 요청하였습니다.\n",
				name, repairMan.getName());

		List<Furniture> ownerFurnitures = buildingOwner.getFurnitures();
		for (int i = 0; i < ownerFurnitures.size(); i++) {
			repairMan.fix(ownerFurnitures.get(i));
		}
	}

	public void mediateFixingFurnitureFromTenant(String furnitureName) {
		System.out.printf("입주자 %s가 중개인 %s에게 가구 %s의 수리를 요청하였습니다.\n",
				tenant.getName(), name, furnitureName);

		Furniture furniture = buildingOwner.getFurnitures()
				.stream()
				.filter(x -> x.getName().equals(furnitureName))
				.findFirst()
				.orElse(null);

		if (furniture == null) {
			System.out.printf("건물주 %s는 가구 %s를 소유하고 있지 않습니다.\n",
					buildingOwner.getName(), furnitureName);
			return;
		}

		System.out.printf("그래서 중개인 %s는 수리기사 %s에게 가구 %s의 수리를 요청하였습니다.\n",
				name, repairMan.getName(), furnitureName);

		repairMan.fix(furniture);
	}
}
