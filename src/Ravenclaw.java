public class Ravenclaw extends Hogwarts {
    private int wise;
    private int witty;
    private int creation;
    private int smart;
    public Ravenclaw(String name, String surname, int spellpower, int transgression, int smart, int wise, int witty, int creation) {
        super(name, surname, spellpower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }



    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }


}
