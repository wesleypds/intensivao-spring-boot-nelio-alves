package com.wesleypds.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleypds.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {}
