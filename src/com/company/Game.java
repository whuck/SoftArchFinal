package com.company;

import com.company.characters.GameCharacter;
import com.company.ui.Message;
import com.company.ui.Menu;
import com.company.weapon.Sword;
import com.company.weapon.Weapon;
import com.company.weapon.WoodStick;
import com.company.weapon.decorators.Sharp;
import com.company.weapon.decorators.TwoHanded;


/**
 * Game Singleton class
 * Runs the game, has a Character Factory for creating the enemy and player Characters
 * and a state property that determines which part of the game is in  ie  new game, game over etc
 * and a weapon object that signifies game difficulty ( determines player's attack damage )
 *  @author Will Huck
 */
public final class Game {

    private static Game instance = null;
    private static CharacterFactory charFactory= null;
    private String state = "";
    private GameCharacter player = null;
    private Weapon playerWeapon = null;
    private final int playerHealth = 100;
    private final int enemyHealth = 100;
    private final String enemyName = "Orc™";
    /**
     * Private Singleton constructor, only called when Game.getInstance() is used in Main.java
     * Initializes the CharacterFactory singleton
     * creates the Player Character and sets the game state
     */
    private Game() {
        charFactory = CharacterFactory.getInstance();
        state = "new";
    }
    /**
     * Returns Singleton instance, if it exists
     * Creates one if it does not
     * @return Game Singleton instance
     */
    public static Game getInstance() {
        if (instance == null)
        {
            instance = new Game();
        }
        return instance;
    }
    /**
     * Begins game loop and runs until game state is changed to "quit"
     */
    public void run() {
        Message.StartMsg();
        while (state != "quit") {
            switch (state) {
                case "new" :
                    mainMenu();
                    break;
                case "play" :
                    String playerName = Menu.getName();
                    weaponSelect();
                    player = charFactory.makeCharacter("player",playerName,playerHealth);
                    player.equipWeapon(playerWeapon);
                    Message.EquipWeaponMsg(player.getName(),playerWeapon.getName());
                    encounter();
                    break;
                case "gameOver" :
                    gameOver(-1);
                case "quit" :
                    break;
            }
        }
    }

    /**
     * Changes the game state
     * @param newState String that determines new game state i.e. "new" "quit"
     */
    public void changeState(String newState) {
        if (newState != null)
        {
            state = newState;
        }
    }
    /**
     * Shows main menu, either play or quit
     */
    private void mainMenu() {
        int choice = Menu.getChoice("mainMenu");
        switch (choice) {
            case 1:
                changeState("play");
                break;
            case 2:
                changeState("quit");
                break;
        }
    }

    /**
     * displays 2 sets of dialog choices to create the player's weapon
     * and weapon decorator
     */
    private void weaponSelect() {
        Message.WeaponSelectMessage();
        int choice = Menu.getChoice("weaponSelect");
        switch (choice) {
            case 1:
                playerWeapon = new Sword();
                break;
            case 2:
                playerWeapon = new WoodStick();
                break;
        }
        Message.WeaponInspectMessage(playerWeapon.getName());
        choice = Menu.getChoice("weaponType");
        switch (choice) {
            case 1:
                break;
            case 2:
                playerWeapon = new Sharp(playerWeapon);
                break;
            case 3:
                playerWeapon = new TwoHanded(playerWeapon);
                break;
        }
    }

    /**
     * Method for game combat, creates an enemy and gives them a weapon
     * loops until the player/ enemy is dead or the player flees
     */
    private void encounter() {
        boolean encounterOver = false;
        GameCharacter e = charFactory.makeCharacter("enemy",enemyName,enemyHealth);
        Weapon enemyWeapon = new Sword();
        enemyWeapon = new TwoHanded(enemyWeapon);
        e.equipWeapon(enemyWeapon);
        Message.EncounterMsg(e.getName(),enemyWeapon.getName());

        while (!encounterOver) {
            int choice = Menu.getChoice("combat");
            switch (choice) {
                case 1: // a round of combat, player attacks, enemy attacks, show msg of dmg done
                    player.attack(e, player.getAtkPower());
                    e.attack(player,e.getAtkPower());
                    Message.CombatRoundMsg(player.getName(),e.getName(),player.getHealth(),e.getHealth());
                    break;
                case 2: // player flees like a coward, game is over
                    Message.FleeMsg(player.getName(), player.getHealth());
                    encounterOver = true;
                    changeState("gameOver");
                    break;
            }
            // if player / enemy dies switch while loop condition to false (not true)
            // display death message and start game over with appropriate ending
            if (player.getHealth() <= 0 ) {
                encounterOver = true;
                Message.DeathMsg(player.getName());
                if (e.getHealth() <= 0 ) {
                    Message.DeathMsg(e.getName());
                    gameOver(2);
                }
                else { gameOver(0); }
            }
            else if (e.getHealth() <=0 ) {
                encounterOver = true;
                Message.DeathMsg(e.getName());
                gameOver(1);
            }
        }

    }
    /**
     * Sets gameOver state , displays ending and calls main menu
     * @param ending int representing game's ending 0=bad 1=good anything else = no ending
     */
    private void gameOver(int ending) {
        switch (ending) {
            case 0: //player died
                Message.BadEndingMsg();
                break;
            case 1: //enemy died
                Message.GoodEndingMsg();
                break;
            case 2: //both died
                Message.NeutralEndingMsg();
                break;
        }
        changeState("gameOver");
        Message.GameOverMsg();
        mainMenu();
    }
}
