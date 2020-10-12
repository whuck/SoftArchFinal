package com.company.ui;

/**
 * Message class to contain all println calls in Game
 *  @author Will Huck
 */
public final class Message {
    /**
     * calls System.out.println()
     * @param msg String to be printed
     */
    public static void showMessage(String msg) {
        System.out.println(msg);
    }

    /**
     * displays Splash Screen / Welcome message
     */
    public static void StartMsg(){
        showMessage("Welcome to the Totally Awesome Game EX Turbo Edition -Early Access Pre-Alpha v0.0012!");
    }

    /**
     * displays Name entering prompt
     */
    public static void EnterNameMsg() {
        showMessage("Enter a name: (No spaces)");
    }

    /**
     * displays weapon select prompt
     */
    public static void WeaponSelectMessage() {
        showMessage("You come across a weapon rack... You pick up the:");
    }

    /**
     * displays weapon inspect prompt
     * @param weaponName String name of weapon you are inspecting
     */
    public static void WeaponInspectMessage(String weaponName) {
        showMessage("You notice the "+weaponName+" is...");
    }
    /**
     * displays weapon equip prompt
     * @param playerName string name of player
     * @param weaponName string name of weapon the player is picking up
     */
    public static void EquipWeaponMsg(String playerName,String weaponName) {
        showMessage(playerName+" picks up the "+weaponName+" and swings it in the air enthusiastically.");
    }
    /**
     * displays initial encounter message
     * @param enemy string for enemy encountered
     */
    public static void EncounterMsg(String enemy,String weaponName) {
        showMessage("Encounter! A wild "+enemy+" approaches brandishing a "+weaponName+"! What will you do?");
    }

    /**
     * displays the results of 1 round of comabt in an encounter
     * @param player string representing player's name
     * @param enemy string representing enemy's name
     * @param playerHP int representing player's health
     * @param enemyHP int representing enemy's health
     */
    public static void CombatRoundMsg(String player, String enemy, int playerHP, int enemyHP) {
        showMessage(player + "'s Health: "+playerHP+", "+enemy+"'s Health:"+enemyHP);
    }

    /**
     * displays player fleeing the encounter message
     * @param player string representing  player's name
     * @param playerHP int representing player's health
     */
    public static void FleeMsg(String player,int playerHP) {
        showMessage(player + " flees with "+playerHP+" left!");
    }

    /**
     * displays death message
     * @param deceased string representing name of Character that died
     */
    public static void DeathMsg(String deceased) {
        showMessage(deceased + " has died!");
    }

    /**
     * displays bad ending
     */
    public static void BadEndingMsg() {
        showMessage("You have been defeated.");
    }

    /**
     * displays good ending
     */
    public static void GoodEndingMsg() {
        showMessage("You have slain the Enemy! The day is saved!");
    }

    /**
     * displays neutral ending
     */
    public static void NeutralEndingMsg() { showMessage("You both have been slain...");}
    /**
     * displays game over message
     */
    public static void GameOverMsg() {
        showMessage("Game over! Retry?");
    }

    /**
     * displays an attack message
     * @param atk string representing attacking Character's name
     * @param def string representing defending Character's name
     * @param dmg int representing damage done in the attack
     */
    public static void AttackMsg(String atk, String def, int dmg) {
        showMessage(atk+" attacks "+def+" for "+dmg+".");
    }

    /**
     * displays an attack message for a missed attack
     * @param atk string representing attacking Character's name
     * @param def string representing defending Character's name
     */
    public static void AttackMissMsg(String atk, String def) {
        showMessage(atk+" attacks "+def+" and misses!");
    }

    /**
     * displays an attack message for a critical attack
     * @param atk string representing attacking Character's name
     * @param def string representing defending Character's name
     * @param dmg int representing damage done in the attack
     */
    public static void AttackCritMsg(String atk, String def, int dmg) {
        showMessage("!!!"+atk+" attacks "+def+" and crits for "+dmg+"!!!");
    }
}
