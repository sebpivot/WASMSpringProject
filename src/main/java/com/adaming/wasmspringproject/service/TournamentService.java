package com.adaming.wasmspringproject.service;

import com.adaming.wasmspringproject.entity.Tournament;
import com.adaming.wasmspringproject.exception.NullTournamentException;
import com.adaming.wasmspringproject.exception.TournamentAlreadyExistException;
import com.adaming.wasmspringproject.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public void register(Tournament t) throws NullTournamentException,TournamentAlreadyExistException{
        if(t==null) {
            throw new NullTournamentException();
        } else {
            if(this.tournamentRepository.getByTournamentName(t.getName())==null) {
                this.tournamentRepository.save(t);
            } else {
                throw new TournamentAlreadyExistException();
            }
        }
    }
    public Iterable<Tournament> fetchAll() {
        return this.tournamentRepository.findAll();
    }

    public Tournament fetchById(Long id) {
        return this.tournamentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        this.tournamentRepository.deleteById(id);
    }



}
