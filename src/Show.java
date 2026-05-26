import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addListOfActors(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor + " уже участвует в спектакле " + title);
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " добавлен в спектакль");
        }
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                found = true;
                System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor + " в спектакле '" + title + "'");
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден в спектакле '" + title + "'");
        }
    }

    // Вывод списка актёров
    public void printActors() {
        System.out.println("Список актёров спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    // Вывод информации о режиссёре
    public void printDirectorInfo() {
        System.out.println(director);
    }
}
