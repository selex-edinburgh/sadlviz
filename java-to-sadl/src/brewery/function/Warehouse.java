package brewery.function;

import java.util.Collection;

import brewery.product.Barrel;

public class Warehouse {

	Inventory inventory = new Inventory();

	public Inventory getInventory() {
		return this.inventory;
	}

	public Barrel issueBarrel(Barrel barrel) {
		return this.getInventory().getBarrel(barrel.getId());
	}
	
	public Collection<Barrel> issueBarrels(Collection<Barrel> barrels) {
	  Collection<String> barrelIds = barrels.stream().map(b -> b.getId()).toList();
    return this.getInventory().getBarrels(barrelIds);
  }

}
