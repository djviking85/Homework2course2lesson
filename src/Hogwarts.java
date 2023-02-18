public class Hogwarts {
    private String name;
    private String surname;
    private int spellpower;
    private int transgression;
    private int qualityHogwarts;



    public Hogwarts(String name, String surname, int spellpower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.spellpower = spellpower;
        this.transgression = transgression;
        this.qualityHogwarts = spellpower+transgression;
    }
    public int getQualityHogwarts() {
        return qualityHogwarts;
    }

    public void setQualityHogwarts(int qualityHogwarts) {
        this.qualityHogwarts = qualityHogwarts;
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

    public static void studetsCompare(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.getQualityHogwarts() > hogwarts2.getQualityHogwarts()) {
            System.out.println( hogwarts1.getSurname() + " Лучший студент на факультетах");
        } else if (hogwarts2.getQualityHogwarts() > hogwarts1.getQualityHogwarts()) {
            System.out.println(hogwarts2.getSurname() + " ЛУчший студент на факультетах");
        } else {
            System.out.println(hogwarts1.getSurname() + " и " + hogwarts2.getSurname() + " равны!");
        }
    }
}
