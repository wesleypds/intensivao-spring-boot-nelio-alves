package com.wesleypds.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "id_game")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "id_game_list")
    private GameList gameList;

}
