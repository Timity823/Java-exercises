package avengers.hero;

import avengers.hero.infinitystone.InfinityStone;

public class Hero {
        private String name;
        private int power;
        InfinityStone stone;
        private boolean isHeroFromEarth;


        public Hero(String name, int power, InfinityStone stone,boolean isHeroFromEarth) {
                this.name = name;
                this.power = power;
                this.stone = stone;
                this.isHeroFromEarth =isHeroFromEarth;
        }

        @Override
        public String toString() {
                return "Hero{" +
                        "name='" + name + '\'' +
                        ", power=" + power +
                        ", stone=" + stone +
                        '}';
        }


}
