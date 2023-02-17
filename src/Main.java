import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffendor[] griffendors = {
                new Griffendor("Гарри", "Потный", 22, 15, 2, 4, 45),
                new Griffendor("Гермиона ", "Грингер", 23, 23, 11, 2, 55),
                new Griffendor("Рон ", "Уизли", 21, 33, 5, 55, 77)

        };
        System.out.println(" " + griffendors.length);
        for (int i = 0; i < griffendors.length; i++) {
            Griffendor griffendor = griffendors[i];
            System.out.printf( "Факультет Гриффендор. Имя: %s, Фамилия: %s, Сила каста: %s, Трансгрессия: %s, Честь:  %s, Благородство: %s, Храбрость: %s ",
                    griffendor.getName(),
                    griffendor.getSurname(),
                    griffendor.getSpellpower(),
                    griffendor.getTransgression(),
                    griffendor.getHonor(),
                    griffendor.getNobility(),
                    griffendor.getBrawery());
            System.out.println(" ");

        }
    }
}