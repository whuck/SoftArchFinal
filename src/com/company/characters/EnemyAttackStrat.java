package com.company.characters;

import com.company.Dice;
import com.company.ui.Message;

/**
 * Attack Strategy for enemies
 * To make the game interesting, enemies can miss their attack based on a percentage given when
 * @author Will Huck
 */
public class EnemyAttackStrat implements AttackStrategy{

    private int missChance;
    private GameCharacter attacker;

    /**
     * EnemyAttackStrat constructor sets miss chance
     * @param missChance int for miss chance in percentage points
     * @param attacker Character reference that is attacking
     */
    public EnemyAttackStrat(int missChance, GameCharacter attacker) {
        this.missChance = missChance;
        this.attacker = attacker;
    }
    /**
     * attacks player if the enemy did not miss
     * @param target Character object to be attacked
     */
    @Override
    public void attack(GameCharacter target, int damage){
        Dice dice = new Dice();
        if (!dice.roll(missChance)) { // hit i.e. did not miss
            target.setHealth(target.getHealth() - damage);
            Message.AttackMsg(attacker.getName(), target.getName(),damage);
        }
        else { // miss
            Message.AttackMissMsg(attacker.getName(), target.getName());
        }
    }
}
