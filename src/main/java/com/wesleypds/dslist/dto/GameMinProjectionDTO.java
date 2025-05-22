package com.wesleypds.dslist.dto;

import com.wesleypds.dslist.projections.GameMinProjection;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameMinProjectionDTO {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    private Integer position;

    public GameMinProjectionDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getYear();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
        this.position = projection.getPosition();
    }

}
