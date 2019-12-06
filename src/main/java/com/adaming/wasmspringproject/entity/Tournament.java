package com.adaming.wasmspringproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tournament")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surface;
    private int yearCreation;
    private String country;
    private String city;
    @ManyToMany
    private List<Player> playerListTournament;
    private String linkWebsite;

    public Tournament() {
    }


    public Tournament(String name, String surface, int yearCreation, String country, String city) {
        this.name = name;
        this.surface = surface;
        this.yearCreation = yearCreation;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Player> getPlayerListTournament() {
        return playerListTournament;
    }

    public void setPlayerListTournament(List<Player> playerListTournament) {
        this.playerListTournament = playerListTournament;
    }

    public String getLinkWebsite() {
        return linkWebsite;
    }

    public void setLinkWebsite(String linkWebsite) {
        this.linkWebsite = linkWebsite;
    }
}
