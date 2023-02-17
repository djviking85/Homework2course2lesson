public class Slytherin extends Hogwarts {
    private int determination;
    private int ambition;
    private int cunning;
    private int resdurcefulness;
    private int lustPower;

    public Slytherin(String name, String surname, int spellpower, int transgression, int determination, int ambition, int cunning, int resdurcefulness, int lustPower) {
        super(name, surname, spellpower, transgression);
        this.determination = determination;
        this.ambition = ambition;
        this.cunning = cunning;
        this.resdurcefulness = resdurcefulness;
        this.lustPower = lustPower;
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


}
