package com.adaming.wasmspringproject.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<Player> playerListMatch;
    private float duration;
    private String score;

    public Match() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
/*

    public Player getPlayer() {
        return player;
    }

    public void setPlayer1(Player player) {
        this.player = player;
    }
*/

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
