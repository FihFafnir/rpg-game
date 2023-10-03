package weapons;

public class Weapon {
    private String name;
    private int damage, hitRange;
    private double hitChance, criticalHitChance;

    public Weapon(String name, int damage, int hitRange, double hitChance, double criticalHitChance) {
        setName(name);
        setDamage(damage);
        setHitRange(hitRange);
        setHitChance(hitChance);
        setCriticalHitChance(criticalHitChance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = Math.max(damage, 0);
    }

    public int getHitRange() {
        return hitRange;
    }

    public void setHitRange(int hitRange) {
        this.hitRange = Math.max(hitRange, 0);
    }

    public double getHitChance() {
        return hitChance;
    }

    public void setHitChance(double hitChance) {
        this.hitChance = Math.max(Math.min(hitChance, 1), 0);
    }

    public double getCriticalHitChance() {
        return criticalHitChance;
    }

    public void setCriticalHitChance(double criticalHitChance) {
        this.criticalHitChance = Math.max(Math.min(criticalHitChance, 1), 0);
    }
}