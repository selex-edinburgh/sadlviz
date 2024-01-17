package brewery;

public class Brewery {

	public static void main(String... args) {
		Brewery brewery = new Brewery();
		brewery.transferInventory();
	}

	public void transferInventory() {
		
		Warehouse warehouse = new Warehouse();
		ProductionPlant productionPlant = new ProductionPlant();

		Barrel barrel = warehouse.getInventory().getBarrel("AB0032");
		Barrel issuedBarrel = warehouse.issueBarrel(barrel);

		productionPlant.receiveBarrel(warehouse, issuedBarrel);
	}

}
