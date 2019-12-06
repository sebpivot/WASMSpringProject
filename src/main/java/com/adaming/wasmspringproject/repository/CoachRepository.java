package com.adaming.wasmspringproject.repository;

import com.adaming.wasmspringproject.entity.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends CrudRepository<Coach,Long> {
}
