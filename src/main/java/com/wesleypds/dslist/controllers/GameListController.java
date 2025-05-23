package com.wesleypds.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleypds.dslist.dto.GameListDTO;
import com.wesleypds.dslist.dto.GameMinProjectionDTO;
import com.wesleypds.dslist.services.GameListService;
import com.wesleypds.dslist.services.GameService;

@RestController
@RequestMapping(value = "games-lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> list() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/{id}/games")
    public List<GameMinProjectionDTO> searchGamesByGameList(@PathVariable(name = "id") Long idlist) {
        return gameService.searchGamesByGameList(idlist);
    }

}
