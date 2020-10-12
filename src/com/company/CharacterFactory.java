package com.company;

import com.company.characters.GameCharacter;
import com.company.characters.Enemy;
import com.company.characters.Player;

/**
 * Character Factory Singleton
 * Handles creating Enemy and Player Character objects
 *  @author Will Huck
 */
public final class CharacterFactory {

    private static CharacterFactory instance = null;
    private  CharacterFactory() {}
    /**
     * Returns Singleton instance, if it exists
     * Creates one if it does not
     * @return CharacterFactory Singleton instance
     */
    public static CharacterFactory getInstance()
    {
        if (instance == null)
        {
            instance = new CharacterFactory();
        }
        return instance;
    }
    /**
     * Creates Enemies / Player Character objects
     * @param type String determines which type of Character to return "player" or "enemy"
     * @param health int for Character's health
     * @return either Player or Enemy Character
     */
    public GameCharacter makeCharacter(String type, String name, int health)
    {
        GameCharacter gameCharacter = null;
        switch (type) {
            case "player" :
                gameCharacter = new Player(name,health,15);
                break;
            case "enemy" :
                gameCharacter = new Enemy(name,health,20);
                break;
        }
        return gameCharacter;
    }

}
