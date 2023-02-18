public class Griffendor extends Hogwarts {
    private int nobility;
    private int brawery;
    private int honor;

    public int getQualityGriffendor() {
        return qualityGriffendor;
    }

    private int qualityGriffendor;

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
        this.qualityGriffendor = honor + nobility + brawery;
    }
    public static void grifCompare(Griffendor griffendor1, Griffendor griffendor2) {
        if (griffendor1.getQualityGriffendor() > griffendor2.getQualityGriffendor()) {
            System.out.println( griffendor1.getSurname() + " Лучший студент на факультете Гриффендор");
        } else if (griffendor2.getQualityGriffendor() > griffendor1.getQualityGriffendor()) {
            System.out.println(griffendor2.getSurname() + " ЛУчший студент на факультете Гриффендор");
        } else {
            System.out.println(griffendor1.getSurname() + " и " + griffendor2.getSurname() + " равны!");
        }
    }


}
