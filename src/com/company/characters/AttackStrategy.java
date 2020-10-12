package com.company.characters;
/**
 * Attack Strategy Interface for Player / Enemy attacking
 * @author Will Huck
 */
public interface AttackStrategy {
    /**
     * Attack method
     * @param target Character object to be attacked
     */
    void attack(GameCharacter target, int damage);
}
