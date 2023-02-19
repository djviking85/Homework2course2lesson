public class Slytherin extends Hogwarts {
    private int determination;
    private int ambition;
    private int cunning;
    private int resdurcefulness;
    private int lustPower;

    private int qualitySlytherin;

    public Slytherin(String name, String surname, int spellpower, int transgression, int determination, int ambition, int cunning, int resdurcefulness, int lustPower) {
        super(name, surname, spellpower, transgression);
        this.determination = determination;
        this.ambition = ambition;
        this.cunning = cunning;
        this.resdurcefulness = resdurcefulness;
        this.lustPower = lustPower;
        this.qualitySlytherin = lustPower + resdurcefulness + cunning + ambition;
    }
    public int getQualitySlytherin() {
        return qualitySlytherin;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResdurcefulness() {
        return resdurcefulness;
    }

    public void setResdurcefulness(int resdurcefulness) {
        this.resdurcefulness = resdurcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }
    public static void slythCompare(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1.getQualitySlytherin() > slytherin2.getQualitySlytherin()) {
            System.out.println( slytherin1.getSurname() + " Лучший студент на факультете Гриффендор");
        } else if (slytherin2.getQualitySlytherin() > slytherin1.getQualitySlytherin()) {
            System.out.println(slytherin1.getSurname() + " ЛУчший студент на факультете Гриффендор");
        } else {
            System.out.println(slytherin2.getSurname() + " и " + slytherin1.getSurname() + " равны!");
        }
    }


}
