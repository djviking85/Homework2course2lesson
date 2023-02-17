public class Hogwarts {
    private String name;




    private String surname;
    private int spellpower;
    private int transgression;
    public Hogwarts(String name, String surname, int spellpower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.spellpower = spellpower;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSpellpower() {
        return spellpower;
    }

    public void setSpellpower(int spellpower) {
        this.spellpower = spellpower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
