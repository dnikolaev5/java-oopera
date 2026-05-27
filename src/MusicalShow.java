public class MusicalShow extends Show {
    // автор музыки
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Метод вывода либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля '" + title + "':\n" + librettoText);
    }
}
