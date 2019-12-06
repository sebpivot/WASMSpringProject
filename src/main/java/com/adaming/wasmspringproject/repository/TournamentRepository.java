package com.adaming.wasmspringproject.repository;

import com.adaming.wasmspringproject.entity.Tournament;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament,Long> {

    @Query("select t from Tournament as t where t.name=:tournamentName")
    Tournament getByTournamentName(String tournamentName);
}
