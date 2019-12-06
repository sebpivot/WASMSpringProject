package com.adaming.wasmspringproject;

import com.adaming.wasmspringproject.entity.Player;
import com.adaming.wasmspringproject.entity.Tournament;
import com.adaming.wasmspringproject.service.PlayerService;
import com.adaming.wasmspringproject.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WasmspringprojectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WasmspringprojectApplication.class, args);
    }


    @Autowired
    private PlayerService playerService;
    @Autowired
    private TournamentService tournamentService;

    @Override
    public void run(String... args) throws Exception {
        Player p1 = new Player("Bianca", "Andreescu", "Canadian",19,5,true);
        Player p2 = new Player("Naomi", "Osaka", "Japanese",22,3,true);
        List<Player> playerList=new ArrayList<>(Arrays.asList(p1,p2));
        for (Player player:playerList) {
            this.playerService.register(player);
        }

        Tournament t1 = new Tournament("Australian Open","Hard",1905,"Australia","Melbourne");
        Tournament t2 = new Tournament("French Open","Clay",1891,"France","Paris");
        Tournament t3 = new Tournament("Wimbledon","Grass",1877,"United Kingdom","London");
        Tournament t4 = new Tournament("US Open","Hard",1881,"United States","New York");
        List<Tournament> tournamentList=new ArrayList<>(Arrays.asList(t1,t2,t3,t4));
        for (Tournament tournament:tournamentList) {
            this.tournamentService.register(tournament);
        }
    }
}
