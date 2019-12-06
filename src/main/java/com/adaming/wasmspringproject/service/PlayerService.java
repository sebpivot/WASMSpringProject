package com.adaming.wasmspringproject.service;

import com.adaming.wasmspringproject.entity.Player;
import com.adaming.wasmspringproject.exception.NullPlayerException;
import com.adaming.wasmspringproject.exception.PlayerAlreadyExistException;
import com.adaming.wasmspringproject.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void register(Player p) throws NullPlayerException, PlayerAlreadyExistException {
        if(p==null) {
            throw new NullPlayerException();
        } else {
            if(this.playerRepository.getByPlayerFirstName(p.getPlayerFirstName())==null && this.playerRepository.getByPlayerLastName(p.getPlayerLastName())==null) {
                this.playerRepository.save(p);
            } else {
                throw new PlayerAlreadyExistException();
            }
        }
    }

    public Iterable<Player> fetchAll() {
        return this.playerRepository.findAll();
    }

    public Player fetchById(Long id) {
        return this.playerRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        this.playerRepository.deleteById(id);
    }
}
