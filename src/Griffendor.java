public class Griffendor extends Hogwarts {
    private int nobility;
    private int brawery;
    private int honor;
    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBrawery() {
        return brawery;
    }

    public void setBrawery(int brawery) {
        this.brawery = brawery;
    }



    public Griffendor(String name, String surname, int spellpower, int transgression, int honor, int nobility, int brawery) {
        super(name, surname, spellpower, transgression);
        this.honor = honor;
        this.nobility = nobility;
        this.brawery = brawery;
    }


}
