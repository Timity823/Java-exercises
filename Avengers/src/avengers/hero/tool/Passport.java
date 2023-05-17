package avengers.hero.tool;

public class Passport {
    private int passportNumber;

    public int generatePassportNumber() {
       passportNumber = (int) (Math.random()*999999+1);
       return passportNumber;
    }

    public int getPassportNumber() {
        return generatePassportNumber();
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                '}';
    }
}
