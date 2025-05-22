package com.wesleypds.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.wesleypds.dslist.entities.GameList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameListDTO {

    private Long id;

    private String name;

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
