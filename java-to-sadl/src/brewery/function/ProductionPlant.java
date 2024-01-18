package brewery.function;

import java.util.Collection;

import brewery.product.Barrel;

public class ProductionPlant {

	Inventory inventory = new Inventory();

	public Inventory getInventory() {
		return this.inventory;
	}

	public void receiveBarrel(Warehouse warehouse, Barrel barrel) {
		this.getInventory().addBarrel(barrel);
	}
	
	public void receiveBarrels(Warehouse warehouse, Collection<Barrel> barrels) {
    this.getInventory().addBarrels(barrels);
  }
	

}
