package org.yourbingo.bingofullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yourbingo.bingofullstack.entities.Ballot;

@Repository
public interface BallotRepository extends JpaRepository<Ballot, Long> {
}
