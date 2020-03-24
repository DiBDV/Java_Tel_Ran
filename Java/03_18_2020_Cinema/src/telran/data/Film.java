package telran.data;

import java.util.Arrays;
import java.util.Objects;

public class Film {
    private String title;
    private String data;
    private Genre genre;
    private Cinema[] cinemas;

    public Film(String title, String data, Genre genre, Cinema[] cinemas) {
        this.title = title;
        this.data = data;
        this.genre = genre;
        this.cinemas = cinemas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title) &&
                Objects.equals(data, film.data) &&
                genre == film.genre &&
                Arrays.equals(cinemas, film.cinemas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, data, genre);
        result = 31 * result + Arrays.hashCode(cinemas);
        return result;
    }

    @Override
    public String toString() {
        return "Film:" + title +
                ", data='" + data +
                ", genre=" + genre +
                ", cinemas=" + Arrays.toString(cinemas);
    }

    public void displayCinema(){
        for (int i = 0; i < cinemas.length; i++) {
            System.out.println(cinemas[i]);
        }
    }
}
