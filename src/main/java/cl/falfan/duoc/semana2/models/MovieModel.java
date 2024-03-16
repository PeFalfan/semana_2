package cl.falfan.duoc.semana2.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieModel {
    //    Las películas deben tener, al menos, los siguientes atributos: id, titulo, año,
    //    director, género y sinopsis

    private int id;
    private String title;
    private int year;
    private String director;
    private String genres;
    private String synopsis;

    public MovieModel(int id, String title, int year, String director, String genres, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genres = genres;
        this.synopsis = synopsis;
    }

    public MovieModel() {

    }
}
