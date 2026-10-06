package Ex48_ImplementingISaveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public String getWeapon() { return weapon; }
    public void setWeapon(String weapon) { this.weapon = weapon; }

    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(String.valueOf(hitPoints));
        data.add(String.valueOf(strength));
        data.add(weapon);
        return data;
    }

    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            name = list.get(0);
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
            weapon = list.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}