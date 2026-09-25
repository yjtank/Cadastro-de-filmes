package com.javinha.CadastroDeFilmes;
import jakarta.persistence.*;

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
