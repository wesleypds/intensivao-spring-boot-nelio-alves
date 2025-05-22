package com.wesleypds.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wesleypds.dslist.dto.GameListDTO;
import com.wesleypds.dslist.entities.GameList;
import com.wesleypds.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return repository.findAll().stream().map(g -> new GameListDTO(g)).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList gameList = repository.findById(id).get();
        return new GameListDTO(gameList);
    }

}
