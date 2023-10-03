package classes;

import weapons.MagicWeapon;

public class Mage extends Character {
    private final int MAX_MANA = 100;
    private MagicWeapon weapon;
    private int mana;

    public Mage(String name) {
        super(name);
        setMana(MAX_MANA);
        setWeapon(new MagicWeapon("Simple Staff", 9, 1, 3, 0.9, 0.1));
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.max(Math.min(mana, MAX_MANA), 0);
    }

    public void updateMana(int value) {
        setMana(mana + value);
    }

    public MagicWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(MagicWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Character another) {
        if (!isAlive() && mana < weapon.getManaConsumption())
            return;
        updateMana(-weapon.getManaConsumption());
        another.takeDamage(weapon.getDamage());
    }
}
