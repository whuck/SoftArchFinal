package com.company.weapon;
/**
 * WoodStick child class of Weapon
 *  @author Will Huck
 */
public class WoodStick extends Weapon {
    /**
     * gets WoodStick damage
     * @return int representing WoodStick Damage, 1
     */
    @Override
    public int getDamage() {
        return 1;
    }
    /**
     * gets WoodStick Name
     * @return string representing Swords name, "Wooden Stick"
     */
    @Override
    public String getName() {
        return "Wooden Stick";
    }
}
