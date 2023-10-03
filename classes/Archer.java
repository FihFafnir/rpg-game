package classes;

import weapons.RangedWeapon;

public class Archer extends Character {
    private RangedWeapon weapon;

    public Archer(String name) {
        super(name);
        setWeapon(new RangedWeapon("Simple Bow", 10, 30, 1, 5, 0.6, 0.1));
    }

    public RangedWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(RangedWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Character another) {
        if (!isAlive() && weapon.getAmmo() <= 0)
            return;
        weapon.updateAmmo(-1);
        another.takeDamage(weapon.getDamage());
    }
}
