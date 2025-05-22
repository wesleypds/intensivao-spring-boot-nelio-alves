package com.wesleypds.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wesleypds.dslist.dto.GameDTO;
import com.wesleypds.dslist.dto.GameMinDTO;
import com.wesleypds.dslist.entities.Game;
import com.wesleypds.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return repository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = repository.findById(id).get();
        return new GameDTO(game);
    }

}
