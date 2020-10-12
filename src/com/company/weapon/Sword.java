package com.company.weapon;

/**
 * Sword child class of Weapon
 *  @author Will Huck
 */
public class Sword extends Weapon {
    /**
     * gets Swords damage
     * @return int representing Swords Damage, 5
     */
    @Override
    public int getDamage() {
        return 5;
    }

    /**
     * gets Swords Name
     * @return string representing Swords name, "Sword"
     */
    @Override
    public String getName() {
        return "Sword";
    }
}
