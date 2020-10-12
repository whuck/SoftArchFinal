package com.company.test;

import com.company.CharacterFactory;
import com.company.characters.*;
import com.company.weapon.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttackStrategyTest {
    private CharacterFactory factory;
    private GameCharacter player;
    private GameCharacter enemy;
    @Before
    public void setUp() throws Exception {
        factory  = CharacterFactory.getInstance();
        player = factory.makeCharacter("player","Player",100);
        enemy = factory.makeCharacter("enemy","TestOrc",100);
        Weapon w = new Sword();
        player.equipWeapon(w);
        enemy.equipWeapon(w);
    }

    @Test
    public void attack() {
        double damageDone = enemy.getHealth();
        player.attack(enemy,player.getAtkPower());
        damageDone = damageDone - enemy.getHealth();
        assertEquals("player attack() failed",5,damageDone,10);

        damageDone = player.getHealth();
        enemy.attack(player, enemy.getAtkPower());
        damageDone = damageDone - player.getHealth();
        assertEquals("enemy attack() failed",5,damageDone,5);
    }
}