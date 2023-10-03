package classes;

import weapons.PhysicalWeapon;

public class Warrior extends Character {
    private PhysicalWeapon weapon;

    public Warrior(String name) {
        super(name);
        setWeapon(new PhysicalWeapon("Simple War Axe", 5, 1, 0.1));
    }

    public PhysicalWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(PhysicalWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Character another) {
        if (!isAlive())
            return;
        another.takeDamage(weapon.getDamage());
    }
}
