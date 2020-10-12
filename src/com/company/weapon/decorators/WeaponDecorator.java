package com.company.weapon.decorators;

import com.company.weapon.Weapon;

/**
 * Weapon Decorator abstract class
 * contains Weapon property referencing the Weapon Object being decorated
 *  @author Will Huck
 */
public abstract class WeaponDecorator extends Weapon {
    protected Weapon weapon;

    /**
     * constructor assigns weapon property to passed in Object to be decorated
     * @param weapon Weapon object to be decorated
     */
    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }
}
