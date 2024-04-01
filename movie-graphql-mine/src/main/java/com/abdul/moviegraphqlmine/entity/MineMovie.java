package com.abdul.moviegraphqlmine.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MineMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String movieName;
    private String studio;

    @ElementCollection
    @CollectionTable(name = "mine_cast")
    private List<String> mine_cast;

    public MineMovie(String movieName, String studio, List<String> cast) {
        this.movieName = movieName;
        this.studio = studio;
        this.mine_cast = cast;
    }
}
