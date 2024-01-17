package brewery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {

  List<Barrel> barrels = new ArrayList<>();

  public Barrel getBarrel(String id) {
    return barrels.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
  }

  public void addBarrel(Barrel barrel) {
    this.barrels.add(barrel);
  }

  public void addBarrels(Collection<Barrel> barrel) {
    this.barrels.addAll(barrel);
  }

  public Collection<Barrel> getBarrels(Collection<String> ids) {
    return barrels.stream().filter(b -> ids.contains(b.getId())).toList();
  }
}
