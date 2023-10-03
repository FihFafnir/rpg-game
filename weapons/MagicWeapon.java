package weapons;

public class MagicWeapon extends Weapon {
    private int manaConsumption;

    public MagicWeapon(String name, int damage, int manaConsumption, int hitRange, double hitChance, double criticalHitChance) {
        super(name, damage, hitRange, hitChance, criticalHitChance);
        setManaConsumption(manaConsumption);
    }

    public int getManaConsumption() {
        return manaConsumption;
    }

    public void setManaConsumption(int manaConsumption) {
        this.manaConsumption = Math.max(manaConsumption, 0);
    }
}
