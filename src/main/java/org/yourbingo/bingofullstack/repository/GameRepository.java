package org.yourbingo.bingofullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yourbingo.bingofullstack.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
