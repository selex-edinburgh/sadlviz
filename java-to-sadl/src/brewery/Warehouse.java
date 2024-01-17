package brewery;

import java.util.Collection;

public class Warehouse {

	Inventory inventory = new Inventory();

	public Inventory getInventory() {
		return this.inventory;
	}

	public Barrel issueBarrel(Barrel barrel) {
		return this.getInventory().getBarrel(barrel.getId());
	}
	
	public Collection<Barrel> issueBarrels(Collection<Barrel> barrels) {
	  Collection<String> barrelIds = barrels.stream().map(b -> b.id).toList();
    return this.getInventory().getBarrels(barrelIds);
  }

}
