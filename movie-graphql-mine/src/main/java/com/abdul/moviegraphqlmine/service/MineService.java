package com.abdul.moviegraphqlmine.service;

import com.abdul.moviegraphqlmine.entity.MineMovie;
import com.abdul.moviegraphqlmine.input.MineInput;
import com.abdul.moviegraphqlmine.repositoty.MineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MineService {

    private final MineRepository mineRepository;

    //    get All Movies
    public List<MineMovie> getAllMovies() {
        return mineRepository.findAll();
    }

    //    add movies
    public MineMovie addMovie(MineInput mineInput) {
        MineMovie mineMovie = new MineMovie(mineInput.movieName(),
                                            mineInput.studio(),
                                            mineInput.mine_cast());

       return mineRepository.save(mineMovie);
    }

}
