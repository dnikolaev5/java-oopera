import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка ссылок (самый быстрый путь)
        if (this == obj) return true;

        // 2. Проверка на null и соответствие классов (getClass() безопаснее instanceof)
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Приведение типов
        Actor actor = (Actor) obj;

        // 4. Сравнение всех значимых полей
        return Double.compare(actor.height, height) == 0 &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
