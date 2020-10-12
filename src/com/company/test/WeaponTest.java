package com.company.test;

import com.company.weapon.Sword;
import com.company.weapon.Weapon;
import com.company.weapon.WoodStick;
import com.company.weapon.decorators.Sharp;
import com.company.weapon.decorators.TwoHanded;

import static org.junit.Assert.*;

public class WeaponTest {

    @org.junit.Test
    public void getDamage() {
        //sword base 5
        //wood stick base 1
        //sharp + 5
        //twohanded +10
        Weapon sword = new Sword();
        int dmg = sword.getDamage();
        assertEquals("Normal Sword.getDamage() failed",5,dmg);

        Weapon stick = new WoodStick();
        dmg = stick.getDamage();
        assertEquals("Normal WoodStick.getDamage() failed",1,dmg);
    }

    @org.junit.Test
    public void getSharpDamage() {
        Weapon sword = new Sword();
        sword = new Sharp(sword);
        int dmg = sword.getDamage();
        assertEquals("Sharp Sword.getDamage() failed",10,dmg);

        Weapon stick = new WoodStick();
        stick = new Sharp(stick);
        dmg = stick.getDamage();
        assertEquals("Sharp WoodStick.getDamage() failed",6,dmg);

    }

    @org.junit.Test
    public void getTwoHandedDamage() {
        Weapon sword = new Sword();
        sword = new TwoHanded(sword);
        int dmg = sword.getDamage();
        assertEquals("TwoHanded Sword.getDamage() failed",15,dmg);

        Weapon stick = new WoodStick();
        stick = new TwoHanded(stick);
        dmg = stick.getDamage();
        assertEquals("TwoHanded WoodStick.getDamage() failed",11,dmg);

    }

    @org.junit.Test
    public void getName() {
        //sword base 5
        //wood stick base 1
        //sharp + 5
        //twohanded +10
        Weapon sword = new Sword();
        String dmg = sword.getName();
        assertEquals("Normal Sword.getName() failed","Sword",dmg);

        Weapon stick = new WoodStick();
        dmg = stick.getName();
        assertEquals("Normal WoodStick.getName() failed","Wooden Stick",dmg);
    }

    @org.junit.Test
    public void getSharpName() {
        Weapon sword = new Sword();
        sword = new Sharp(sword);
        String dmg = sword.getName();
        assertEquals("Sharp Sword.getName() failed","Sharp Sword",dmg);

        Weapon stick = new WoodStick();
        stick = new Sharp(stick);
        dmg = stick.getName();
        assertEquals("Sharp WoodStick.getName() failed","Sharp Wooden Stick",dmg);

    }

    @org.junit.Test
    public void getTwoHandedName() {
        Weapon sword = new Sword();
        sword = new TwoHanded(sword);
        String dmg = sword.getName();
        assertEquals("TwoHanded Sword.getName() failed","Two-Handed Sword",dmg);

        Weapon stick = new WoodStick();
        stick = new TwoHanded(stick);
        dmg = stick.getName();
        assertEquals("TwoHanded WoodStick.getName() failed","Two-Handed Wooden Stick",dmg);

    }
}