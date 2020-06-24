package com.hb0730.design.patterns.builder;

import org.junit.Test;

public class HeroTest {

    @Test
    public void test() {
        Hero hero = new Hero.Builder(Profession.WARRIOR, "Amberjill")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .build();
        System.out.println(hero);
    }

}
