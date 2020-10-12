package com.company.characters;

/**
 * The player's Character
 * Child Class of the Character Parent
 *  @author Will Huck
 */
public class Player extends GameCharacter {

    /**
     * Constructor sets health, name, crit chance, and Attack Strategy
     * @param name string for player name
     * @param health int for player health
     * @param critChance int for player's crit chance in percentage points
     */
    public Player(String name, int health, int critChance) {
        setName(name);
        setHealth(100);
        setAttackStrategy(new PlayerAttackStrat(critChance,this));
    }

}
