public class Ravenclaw extends Hogwarts {
    private int wise;
    private int witty;
    private int creation;
    private int smart;



    private int qualityRavenclaw;
    public Ravenclaw(String name, String surname, int spellpower, int transgression, int smart, int wise, int witty, int creation) {
        super(name, surname, spellpower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
        this.qualityRavenclaw = creation + witty + wise + smart;
    }
    public int getQualityRavenclaw() {
        return qualityRavenclaw;
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
    public static void ravenCompare(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1.getQualityRavenclaw() > ravenclaw2.getQualityRavenclaw()) {
            System.out.println( ravenclaw1.getSurname() + " Лучший студент на факультете Гриффендор");
        } else if (ravenclaw2.getQualityRavenclaw() > ravenclaw1.getQualityRavenclaw()) {
            System.out.println(ravenclaw2.getSurname() + " ЛУчший студент на факультете Гриффендор");
        } else {
            System.out.println(ravenclaw2.getSurname() + " и " + ravenclaw1.getSurname() + " равны!");
        }
    }


}
