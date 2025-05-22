package com.wesleypds.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleypds.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {}
