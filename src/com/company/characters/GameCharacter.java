package com.company.characters;

import com.company.weapon.Weapon;

/**
 * Parent class for Player / Enemies
 * All Characters have names, health, an attack strategy, a target, and a weapon
 *  @author Will Huck
 */
public class GameCharacter {

    private String name;
    private int health;
    private AttackStrategy attackStrategy;
    private GameCharacter target;
    private Weapon weapon;

    /**
     * Sets Character's name
     * @param n string to change name to
     */
    public void setName(String n) {
        name = n;
    }
    /**
     * Gets Character's name
     * @return string representing name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the Character's health
     * @param hp the integer to set Character's health to
     */
    public void setHealth(int hp) {
        health = hp;
    }
    /**
     * Returns Character's health
     * @return int representing health
     */
    public int getHealth() {
        return health;
    }
    /**
     * Sets the Character's AttackStrategy
     * @param strat the AttackStrategy to assign to the Character
     */
    public void setAttackStrategy(AttackStrategy strat) {
        attackStrategy = strat;
    }

    /**
     * Sets the Character's attack target
     * @param t Character Object to be targeted
     */
    public void setTarget(GameCharacter t) {
        target = t;
    }

    /**
     * Sets the Character's weapon
     * @param weapon Weapon object to be assigned to Character
     */
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Gets Character's Attack Power / Damage in combat
     * @return in representing the equipped Weapon's damage
     */
    public int getAtkPower() {
        return weapon.getDamage();
    }
    /**
     * Attack's Character's target
     * @param target Character Object to be attacked
     */

    public void attack(GameCharacter target, int damage) {
        if(attackStrategy != null)
        {
            attackStrategy.attack(target,damage);
        }
    }
}
