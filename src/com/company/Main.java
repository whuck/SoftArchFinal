package com.company;

public class Main {
    /**
     * Creates Game Singleton and begins game
     * @author Will Huck
     */
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.run();
    }
}
