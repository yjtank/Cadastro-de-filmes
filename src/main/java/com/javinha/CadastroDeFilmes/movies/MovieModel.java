package com.javinha.CadastroDeFilmes.movies;
import com.javinha.CadastroDeFilmes.genres.GenreModel;
import jakarta.persistence.*;

import java.util.List;

//Entity: Transforma uma classe em uma entidade do Banco;
//JPA = Java Persistance API;
@Entity
@Table(name = "tb_movies")
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    private String synopsis;

    //ManyToMany: Relação muitos para muitos = N:N
    @ManyToMany
    //JoinTable: cria uma tabela intermediaria automaticamente, nesse caso chamada movie_genres
    //joinColumns aponta para a entidade atual (Movie)
    //@JoinColumn representa o nome da coluna da entidade atual na tebale intermediaria
    //inverseJoinColumns mesmo que joinColumns, mas na entidade dos generos
    @JoinTable(name = "movie_genres", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<GenreModel> genres;

    public MovieModel() {
    }

    public MovieModel(String title, int year, String synopsis) {
        this.title = title;
        this.year = year;
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
