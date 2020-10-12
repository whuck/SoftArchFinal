package com.company.characters;
/**
 * The player's mortal enemies
 * Child class of Character
 * @author Will Huck
 */
public class Enemy extends GameCharacter {

    /**
     * Constructor sets health, name, miss chance, and Attack Strategy
     * @param name string for Enemy's name
     * @param health int for Enemy's health
     * @param missChance int for Enemy's chance to miss in percentage points
     */
    public Enemy(String name, int health, int missChance) {
        setName(name);
        setHealth(health);
        setAttackStrategy(new EnemyAttackStrat(missChance,this));
    }
}
