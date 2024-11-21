package org.yourbingo.bingofullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yourbingo.bingofullstack.entities.Cards;




@Repository
public interface CardRepository extends JpaRepository<Cards, Long> {
}
