package com.company.weapon.decorators;

import com.company.weapon.Weapon;

/**
 * Sharp weapon decorator
 * adds 5 more damage to weapon, and sharp prefix to name
 *  @author Will Huck
 */
public class Sharp extends WeaponDecorator {
    /**
     * constructor
     * calls the WeaponDecorator Parent Constructor and passes the Weapon
     * Object to be decorated to it
     * @param weapon Weapon object that this Sharp Object is decorating
     */
    public Sharp(Weapon weapon) {
        super(weapon);
    }

    /**
     * overriden getDamage adds 5 to decorated Weapons getDamage()
     * @return int representing the decorated Weapons damage + 5
     */
    @Override
    public int getDamage() {
        return weapon.getDamage() + 5;
    }

    /**
     * overriden getName adds Sharp prefix
     * @return string representing the decorated Weapons name
     */
    @Override
    public String getName() {
        return "Sharp " + weapon.getName();
    }
}
