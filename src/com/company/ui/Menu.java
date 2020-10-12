package com.company.ui;
import java.util.Scanner;

/**
 * Menu class for grabbing user input and displaying menus
 *  @author Will Huck
 */
public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Gets user input for a specific menu type
     * @param menuType which menu to be displayed
     * @return int of players choice
     */
    public static int getChoice(String menuType) {
        int choice = 0;
        printMenu(menuType);
        choice = scanner.nextInt();
        return choice;
    }
    public static String getName() {
        Message.EnterNameMsg();
        String name = scanner.next();
        return name;
    }
    /**
     * Prints specific menu
     * @param type menu type to be displayed
     */
    private static void printMenu(String type) {
        switch (type) {
            case "mainMenu" :
                Message.showMessage("[1] New Game");
                Message.showMessage("[2] Quit");
                break;
            case "weaponSelect":
                Message.showMessage("[1] Sword");
                Message.showMessage("[2] Wooden Stick");
                break;
            case "weaponType":
                Message.showMessage("[1] Normal");
                Message.showMessage("[2] Sharp");
                Message.showMessage("[3] Two-Handed");
                break;
            case "combat" :
                Message.showMessage("[1] Attack [2] Flee");
                break;
        }

    }
}
