// Главный класс с методом main
public class Theatre {
    public static void main(String[] args) {
        // Создаём актёров
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 1.80);
        Actor actor2 = new Actor("Сергей", "Сидоров", Gender.FEMALE, 1.65);
        Actor actor3 = new Actor("Алексей", "Козлов", Gender.MALE, 1.75);

        // Создаём режиссёров
        Director director1 = new Director("Сергей", "Иванов", Gender.MALE, 5);
        Director director2 = new Director("Елена", "Николаева", Gender.FEMALE, 3);

        // Создаём автора музыки и хореографа (используем как строки)
        Person musicAuthor = new Person("Пётр", "Чайковский",Gender.MALE);
        Person choreographer = new Person("Михаил","Фокин",Gender.MALE);

        // Создаём спектакли
        Show regularShow = new Show("Гамлет", 120, director1);
        Opera operaShow = new Opera("Пиковая дама", 180, director2, musicAuthor, "Текст либретто оперы 'Пиковая дама'", 40);
        Ballet balletShow = new Ballet("Лебединое озеро", 150, director1, musicAuthor, "Текст либретто балета 'Лебединое озеро'", choreographer);

        // Распределяем актёров по спектаклям
        regularShow.addListOfActors(actor1);
        regularShow.addListOfActors(actor2);

        operaShow.addListOfActors(actor2);
        operaShow.addListOfActors(actor3);

        balletShow.addListOfActors(actor1);
        balletShow.addListOfActors(actor3);

        // Выводим списки актёров для каждого спектакля
        System.out.println("\n--- СПИСКИ АКТЕРОВ ---");
        regularShow.printActors();
        operaShow.printActors();
        balletShow.printActors();

        // Заменяем актёра в одном из спектаклей
        System.out.println("\n--- ЗАМЕНА АКТЕРА ---");
        balletShow.replaceActor("Петров", actor2);
        balletShow.printActors();

        // Пытаемся заменить несуществующего актёра
        System.out.println("\n--- ПОПЫТКА ЗАМЕНИТЬ НЕСУЩЕСТВУЮЩЕГО АКТЕРА ---");
        regularShow.replaceActor("Смирнов", actor3);

        // Выводим либретто для музыкальных спектаклей
        System.out.println("\n--- ЛИБРЕТТО ---");
        operaShow.printLibretto();
        balletShow.printLibretto();
    }
}