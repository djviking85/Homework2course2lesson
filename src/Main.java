import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffendor[] griffendors = {
                new Griffendor("Гарри", "Потный", 22, 15, 2, 4, 45),
                new Griffendor("Гермиона ", "Грингер", 23, 23, 11, 2, 55),
                new Griffendor("Рон ", "Уизли", 21, 33, 5, 55, 77)

        };
        // Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Козлодой", 23, 42, 23, 55, 66, 1, 22),
                new Slytherin("Грехем", "Монтехрю", 33, 4, 55, 77, 9, 2, 44),
                new Slytherin("Грегорэ", "Гойлэ", 56, 9, 6, 34, 88, 7, 9),

        };
        // На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff(" Захария", "Смит", 2, 44, 5, 6, 7),
                new Hufflepuff(" Пердик", "Диггори", 33, 44, 5, 7, 8),
                new Hufflepuff("Джастин-Бибер", "Финч-Флетчли", 3, 55, 6, 7, 5)
        };

        // На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Джоу", "Чанг", 4, 6, 7, 8, 3, 5),
                new Ravenclaw("Падма", "Патил", 4, 77, 8, 3, 5, 77),
                new Ravenclaw("Маркус", "Белби", 5, 7, 25, 6, 7, 1)
        };

        PrintService printService = new PrintService();
        printService.print(griffendors);
        printService.print(slytherins);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);

        Hogwarts.studetsCompare(griffendors[1],slytherins[2]);



    }



        }






