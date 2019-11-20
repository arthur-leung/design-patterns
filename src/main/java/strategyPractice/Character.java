package strategyPractice;

public abstract class Character {
    WeaponBehavior weapon;

    void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract void fight();
}
