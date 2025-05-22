package com.wesleypds.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wesleypds.dslist.entities.Game;
import com.wesleypds.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
                        SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
                        tb_game.short_description AS shortDescription, tb_belonging.position
                        FROM tb_game
                        INNER JOIN tb_belonging ON tb_game.id = tb_belonging.id_game
                        WHERE tb_belonging.id_game_list = :listId
                        ORDER BY tb_belonging.position
                            """)
    List<GameMinProjection> searchGamesByGameList(Long listId);

}
