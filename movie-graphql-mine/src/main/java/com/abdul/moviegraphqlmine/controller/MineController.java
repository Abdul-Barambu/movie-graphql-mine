package com.abdul.moviegraphqlmine.controller;

import com.abdul.moviegraphqlmine.entity.MineMovie;
import com.abdul.moviegraphqlmine.input.MineInput;
import com.abdul.moviegraphqlmine.service.MineService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MineController {

    private final MineService mineService;


    @QueryMapping
    List<MineMovie> getAllMoviesHandler(){
        return mineService.getAllMovies();
    }

    @MutationMapping
    MineMovie addMovieHandler(@Argument MineInput mineInput){
        return mineService.addMovie(mineInput);
    }

}
