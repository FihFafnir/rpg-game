package weapons;

public class RangedWeapon extends Weapon {
    private int ammo, reserveAmmo, maxAmmoInMagazine;

    public RangedWeapon(String name, int damage, int maxAmmoInMagazine,int hitRange, double hitChance, double criticalHitChance) {
        super(name, damage, hitRange, hitChance, criticalHitChance);
        setAmmo(0);
        setReserveAmmo(0);
        setMaxAmmoInMagazine(maxAmmoInMagazine);
    }

    public RangedWeapon(String name, int damage, int ammo, int maxAmmoInMagazine, int hitRange, double hitChance, double criticalHitChance) {
        super(name, damage, hitRange, hitChance, criticalHitChance);
        setMaxAmmoInMagazine(maxAmmoInMagazine);
        setReserveAmmo(ammo - getMaxAmmoInMagazine());
        setAmmo(ammo - getReserveAmmo());
    }

    public int getAmmo() {
        return ammo;
    }
    
    public void setAmmo(int ammo) {
        this.ammo = Math.min(Math.max(ammo, 0), maxAmmoInMagazine);
    }

    public void updateAmmo(int value) {
        setAmmo(ammo + value);
    }
    
    public int getReserveAmmo() {
        return reserveAmmo;
    }
    
    public void setReserveAmmo(int reserveAmmo) {
        this.reserveAmmo = Math.max(reserveAmmo, 0);
    }
    
    public void updateReserveAmmo(int value) {
        setReserveAmmo(reserveAmmo + value);
    }

    public int getMaxAmmoInMagazine() {
        return maxAmmoInMagazine;
    }
    
    public void setMaxAmmoInMagazine(int maxAmmoInMagazine) {
        this.maxAmmoInMagazine = Math.max(maxAmmoInMagazine, 0);
    }

    public void reload() {
        updateReserveAmmo(ammo - maxAmmoInMagazine);
        updateAmmo(reserveAmmo);
    }
}
