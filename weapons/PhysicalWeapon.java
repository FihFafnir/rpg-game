package weapons;

public class PhysicalWeapon extends Weapon {
    public PhysicalWeapon(String name, int damage, int hitRange, double criticalHitChance) {
        super(name, damage, hitRange, 1, criticalHitChance);
    }
}