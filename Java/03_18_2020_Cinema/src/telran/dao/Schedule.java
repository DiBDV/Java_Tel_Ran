package telran.dao;

import telran.data.Cinema;
import telran.data.Film;

public class Schedule {
    private Film[] films;
    private int size;

    public Schedule(int capacity){
        films = new Film[capacity];
        size = 0;
    }

    public boolean addFilm(Film film){
        if(size<films.length){
            films[size] = film;
            size++;
            return true;
        }return false;
    }

    public boolean deleteFilm (Film film){
        for (int i = 0; i < size ; i++) {
            if (films[i].equals(film)){
                films[i] = films[size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayFilms(){
        for (int i = 0; i < size; i++) {
            System.out.println(films[i]);
        }
    }

    public void displayFilmsByDate(String date){
        System.out.println(date + " you can see the following films: ");
        for (int i = 0; i < size; i++) {
            if (films[i].getData().equalsIgnoreCase(date)){
                System.out.println(films[i].getTitle() + " /" + films[i].getGenre());
                films[i].displayCinema();
                System.out.println("=================================================");
            }
        }
    }

    public void displayFilmsByCinema(String name){
        System.out.println("In the cinema " + name + " you can watch");{
            for (int i = 0; i < size; i++){
                if(Cinema.isCinemaInArray(films[i].getCinemas(), name)){
                    System.out.println(films[i].getTitle() + " / " +
                            films[i].getGenre() + " " +
                            films[i].getData());
                    System.out.println("===============================================");

                }
            }
        }

    }

    public int getIndexOfFilmInSchedule(String title){
        int indexOfFilm = -1;
        for (int i = 0; i < size ; i++) {
            if(films[i].getTitle().equalsIgnoreCase(title)){
                indexOfFilm = i;
            }
        }return indexOfFilm;
    }

    public void displayCinemaByTitle(String title){
        int index = getIndexOfFilmInSchedule(title);
        if (index < 0){
            System.out.println("Sorry, the movie is not in the schedule");
        }else{
            System.out.println("You can watch the" + title +
                    " " + films[index].getData() + " in  the following cinemas: ");
            films[index].displayCinema();
        }
    }
}
