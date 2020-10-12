package com.company.weapon.decorators;

import com.company.weapon.Weapon;
/**
 * Two-Handed weapon decorator
 * adds 10 more damage to weapon and Two-Handed prefix to name
 *  @author Will Huck
 */
public class TwoHanded extends WeaponDecorator {
    /**
     * constructor
     * calls the WeaponDecorator Parent Constructor and passes the Weapon
     * Object to be decorated to it
     * @param weapon Weapon object that this TwoHanded Object is decorating
     */
    public TwoHanded(Weapon weapon) {
        super(weapon);
    }
    /**
     * overriden getDamage adds 10 to decorated Weapons getDamage()
     * @return int representing the decorated Weapons damage + 10
     */
    @Override
    public int getDamage() {
        return weapon.getDamage() + 10;
    }
    /**
     * overriden getName adds Two-Handed prefix
     * @return string representing the decorated Weapons name
     */
    @Override
    public String getName() {
        return "Two-Handed " + weapon.getName();
    }
}
