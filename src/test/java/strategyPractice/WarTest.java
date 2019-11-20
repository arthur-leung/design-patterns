package strategyPractice;

import org.junit.Test;

public class WarTest {
    @Test
    public void testWar() {
        WeaponBehavior weapon = new BowAndArrowBehavior();
        Character hero = new Queen();
        hero.setWeapon(weapon);
        hero.fight();
        hero.weapon.useWeapon();
    }
}
