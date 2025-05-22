package com.wesleypds.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleypds.dslist.dto.GameDTO;
import com.wesleypds.dslist.dto.GameMinDTO;
import com.wesleypds.dslist.services.GameService;

@RestController
@RequestMapping(value = "games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> list() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

}
