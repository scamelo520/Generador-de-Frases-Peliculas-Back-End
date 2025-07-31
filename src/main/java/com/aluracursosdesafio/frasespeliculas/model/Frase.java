package com.aluracursosdesafio.frasespeliculas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases_series")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String tituloDeSerie;

    private String frase;

    private String autorFrase;

    private String poster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getTituloDeSerie() {
        return tituloDeSerie;
    }

    public void setTituloDeSerie(String tituloDeSerie) {
        this.tituloDeSerie = tituloDeSerie;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getAutorFrase() {
        return autorFrase;
    }

    public void setAutorFrase(String autorFrase) {
        this.autorFrase = autorFrase;
    }
}
