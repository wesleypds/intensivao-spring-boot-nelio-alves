package com.wesleypds.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesleypds.dslist.dto.GameMinDTO;
import com.wesleypds.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> list() {
        return repository.findAll().stream()
                                    .map(g -> new GameMinDTO(g))
                                    .collect(Collectors.toList());
    }

}
