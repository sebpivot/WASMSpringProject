package com.adaming.wasmspringproject.repository;

        import com.adaming.wasmspringproject.entity.Player;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Long> {

    @Query("SELECT p FROM Player AS p WHERE p.playerFirstName=:playerFirstName")
    Player getByPlayerFirstName(String playerFirstName);

    @Query("SELECT p FROM Player AS p WHERE p.playerLastName=:playerLastName")
    Player getByPlayerLastName(String playerLastName);
}
