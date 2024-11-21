package org.yourbingo.bingofullstack.entities;

import jakarta.persistence.*;
import org.hibernate.mapping.Set;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "game")
    private Set<Cards> cards;

    public Set<Cards> getCards() {
        return cards;
    }

    public void setCards(Set<Cards> cards) {
        this.cards = cards;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
