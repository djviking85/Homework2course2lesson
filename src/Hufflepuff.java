public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private int qualityHufflepuff;




    public Hufflepuff(String name, String surname, int spellpower, int transgression, int hardworking, int loyal, int honest) {
        super(name, surname, spellpower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
        this.qualityHufflepuff = honest + loyal + hardworking;
    }
    public int getQualityHufflepuff() {
        return qualityHufflepuff;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public static void huffCompare(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (hufflepuff1.getQualityHufflepuff() > hufflepuff2.getQualityHufflepuff()) {
            System.out.println( hufflepuff1.getSurname() + " Лучший студент на факультете Гриффендор");
        } else if (hufflepuff2.getQualityHufflepuff() > hufflepuff1.getQualityHufflepuff()) {
            System.out.println(hufflepuff2.getSurname() + " ЛУчший студент на факультете Гриффендор");
        } else {
            System.out.println(hufflepuff2.getSurname() + " и " + hufflepuff1.getSurname() + " равны!");
        }
    }




}
