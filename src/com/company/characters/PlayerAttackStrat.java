package com.company.characters;

import com.company.Dice;
import com.company.ui.Message;

/**
 * Attack Strategy for Player
 * Players have a chance to land a critical hit for twice the damage
 *  @author Will Huck
 */
public class PlayerAttackStrat implements AttackStrategy{

    private int critChance;
    private GameCharacter attacker;

    public PlayerAttackStrat(int critChance, GameCharacter attacker) {
        this.critChance = critChance;
        this.attacker = attacker;
    }
    /**
     * Attacks player's target for 10 damage, or 20 damage for a crit
     * @param target Character object to be attacked
     */
    @Override
    public void attack(GameCharacter target, int damage){
        Dice d = new Dice();
        if(d.roll(critChance)) { //crit
            damage = damage * 2;
            Message.AttackCritMsg(attacker.getName(), target.getName(),damage);
        }
        else { //hit
            Message.AttackMsg(attacker.getName(), target.getName(),damage);
        }
        target.setHealth(target.getHealth() - damage);
    }
}
