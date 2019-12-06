package com.adaming.wasmspringproject.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerFirstName;
    private String playerLastName;
    private String nationality;
    private int age;
    private int nbrVictory;
    private int nbrLoss;
    private int ranking;
    @ManyToMany
    private List<Tournament> tournamentsWon;
    private boolean handPreference;


    public Player() {
    }

    public Player(String playerFirstName, String playerLastName, String nationality, int age, int nbrVictory, int nbrLoss, int ranking, boolean handPreference) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.nationality = nationality;
        this.age = age;
        this.nbrVictory = nbrVictory;
        this.nbrLoss = nbrLoss;
        this.ranking = ranking;
        this.handPreference = handPreference;
    }

    public Player(String playerFirstName, String playerLastName, String nationality, int age, int ranking, boolean handPreference) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.nationality = nationality;
        this.age = age;
        this.ranking = ranking;
        this.handPreference = handPreference;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNbrVictory() {
        return nbrVictory;
    }

    public void setNbrVictory(int nbrVictory) {
        this.nbrVictory = nbrVictory;
    }

    public int getNbrLoss() {
        return nbrLoss;
    }

    public void setNbrLoss(int nbrLoss) {
        this.nbrLoss = nbrLoss;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isHandPreference() {
        return handPreference;
    }

    public void setHandPreference(boolean handPreference) {
        this.handPreference = handPreference;
    }

/*    public List<Tournament> getTournamentsWon() {
        return tournamentsWon;
    }

    public void setTournamentsWon(List<Tournament> tournamentsWon) {
        this.tournamentsWon = tournamentsWon;
    }*/
}
