package com.company;

/**
 * Dice class to determine outcomes of miss / crit chances
 *  @author Will Huck
 */
public class Dice {
    /**
     * determines outcomes of miss / crit chances
     * @param percentSuccess int representing success chance in percentage points
     * @return boolean representing success/fail of the roll
     */
    public boolean roll(int percentSuccess) {
        //Min + (int)(Math.random() * ((Max - Min) + 1))
        // random int from 0 to 100 to compare to the success percent
        // ie for a 10% chance to succeed, the random number of 0-100 must be smaller than 10
        int roll = (int)(Math.random() * (101));
        return roll < percentSuccess;
    }
}
