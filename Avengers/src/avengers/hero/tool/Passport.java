package avengers.hero.tool;

import java.util.Objects;

public final class Passport {
    private final int passportNumber;

    public Passport() {
        this.passportNumber =  (int) (Math.random()*999999+1);
    }



    public int getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
