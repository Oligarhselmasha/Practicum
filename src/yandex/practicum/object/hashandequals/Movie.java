package yandex.practicum.object.hashandequals;

import java.util.Objects;

public class Movie {
   public String title; // название фильма
    public int releaseYear; // год выхода на экраны

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    @Override
    public boolean equals (Object movie){
        if (this == movie) return true;
        if ((movie == null) || getClass() != movie.getClass()) return false;
        Movie movie1 = (Movie) movie;
        return Objects.equals(title, movie1.title) && Objects.equals(releaseYear, movie1.releaseYear);
    }
    @Override
    public int hashCode (){
Integer relYear = releaseYear;
        int hash = 1;
if (title != null) {
    hash += title.hashCode();
}
    if (relYear  != null){
hash += Integer.hashCode(releaseYear);
    }
    return hash;
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
}