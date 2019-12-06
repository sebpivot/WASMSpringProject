package com.adaming.wasmspringproject.repository;

import com.adaming.wasmspringproject.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends CrudRepository<Match,Long> {
}
