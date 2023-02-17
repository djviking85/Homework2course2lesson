public class PrintService {
    public void print(Griffendor[] griffendors) {
        System.out.println("Список учащихся: " + griffendors.length);
        for (int i = 0; i < griffendors.length; i++) {
            Griffendor griffendor = griffendors[i];
            System.out.printf("Факультет Гриффендор. Имя: %s, Фамилия: %s, Сила каста: %s, Трансгрессия: %s, Честь:  %s, Благородство: %s, Храбрость: %s ",
                    griffendor.getName(),
                    griffendor.getSurname(),
                    griffendor.getSpellpower(),
                    griffendor.getTransgression(),
                    griffendor.getHonor(),
                    griffendor.getNobility(),
                    griffendor.getBrawery());
            System.out.println(" ");
            int total = griffendor.getSpellpower()+griffendor.getTransgression()+ griffendor.getHonor() + griffendor.getNobility() + griffendor.getBrawery();
            System.out.println("Сумма скиллов на факе у "+ griffendor.getName() +" "+griffendor.getSurname()+" " + total);
        }
    }
    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти
    // int determination, int ambition, int cunning, int resdurcefulness, int lustPower).
    public void print(Slytherin[] slytherins) {
        System.out.println("Список учащихся: " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.printf("Факультет Слизерин. Имя: %s, Фамилия: %s, Сила каста: %s, Трансгрессия: %s, Решительность:  %s, амбициозность: %s, находчивость: %s, жажда власти: %s ",
                    slytherin.getName(),
                    slytherin.getSurname(),
                    slytherin.getSpellpower(),
                    slytherin.getTransgression(),
                    slytherin.getDetermination(),
                    slytherin.getAmbition(),
                    slytherin.getCunning(),
                    slytherin.getResdurcefulness(),
                    slytherin.getLustPower());

            System.out.println(" ");
        }
    }
    // int spellpower, int transgression, int hardworking, int loyal, int honest.
    //трудолюбивы, верны, честны.
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Список учащихся: " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.printf("Факультет Пуффендуй. Имя: %s, Фамилия: %s, Сила каста: %s, Трансгрессия: %s, Трудолюбие:  %s, Верность: %s, Честность: %s ",
                    hufflepuff.getName(),
                    hufflepuff.getSurname(),
                    hufflepuff.getSpellpower(),
                    hufflepuff.getTransgression(),
                    hufflepuff.getHardworking(),
                    hufflepuff.getLoyal(),
                    hufflepuff.getHonest());

            System.out.println(" ");
        }
    }
    // int smart, int wise, int witty, int creation)
    // умны, мудры, остроумны и полны творчества.
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Список учащихся: " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.printf("Факультет КоготьВорона. Имя: %s, Фамилия: %s, Сила каста: %s, Трансгрессия: %s, Ум:  %s, Мудрость: %s, Остроумие: %s, Творчество: %s ",
                    ravenclaw.getName(),
                    ravenclaw.getSurname(),
                    ravenclaw.getSpellpower(),
                    ravenclaw.getTransgression(),
                    ravenclaw.getSmart(),
                    ravenclaw.getWise(),
                    ravenclaw.getWitty(),
                    ravenclaw.getCreation());

            System.out.println(" ");
        }
    }
}
