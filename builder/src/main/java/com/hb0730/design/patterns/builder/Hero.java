package com.hb0730.design.patterns.builder;

/**
 * @author bing_huang
 * @date 2020/06/24 9:37
 * @since V1.0
 */
public final class Hero {

    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession=" + profession +
                ", name='" + name + '\'' +
                ", hairType=" + hairType +
                ", hairColor=" + hairColor +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }

    /**
     * The builder class.
     */
    public static class Builder {

        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        /**
         * Constructor
         */
        public Builder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
