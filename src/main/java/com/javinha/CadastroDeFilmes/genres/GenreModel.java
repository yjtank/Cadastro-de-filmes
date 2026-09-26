package com.javinha.CadastroDeFilmes.genres;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_genres")
public class GenreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GenreModel(){}

    public GenreModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
