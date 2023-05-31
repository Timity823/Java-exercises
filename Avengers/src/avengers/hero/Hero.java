package avengers.hero;

import avengers.hero.infinitystone.InfinityStone;

import java.util.Objects;

public abstract class Hero {
        private String name;
        private int power;
        private InfinityStone stone;

        public Hero(String name, int power, InfinityStone stone) {
                this.name = name;
                this.power = power;
                this.stone = stone;

        }

        public String getName() {
                return name;
        }

        public int getPower() {
                return power;
        }

        public InfinityStone getStone() {
                return stone;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setPower(int power) {
                this.power = power;
        }

        public void setStone(InfinityStone stone) {
                this.stone = stone;
        }



        @Override
        public String toString() {
                return "Hero{" +
                        "name='" + name + '\'' +
                        ", power=" + power +
                        ", stone=" + stone +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Hero hero = (Hero) o;
                return power == hero.power && Objects.equals(name, hero.name) && Objects.equals(stone, hero.stone);
        }

        @Override
        public int hashCode() {
                return Objects.hash(name, power, stone);
        }
}
