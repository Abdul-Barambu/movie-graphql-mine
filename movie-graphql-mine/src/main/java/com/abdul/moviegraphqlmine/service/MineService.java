package com.abdul.moviegraphqlmine.service;

import com.abdul.moviegraphqlmine.entity.MineMovie;
import com.abdul.moviegraphqlmine.exception.NotFoundException;
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


    //    update movie
    public MineMovie updateMovie(Integer id, MineInput mineInput) {
        MineMovie mineMovie = mineRepository.findById(id).orElseThrow(() -> new NotFoundException("Movie with id " + id + " does not exist"));

//        mineMovie.setMovieName(mineInput.movieName());
//        mineMovie.setStudio(mineInput.studio());
//        mineMovie.setMine_cast(mineInput.mine_cast());

        if (mineInput.movieName() != null) {
            mineMovie.setMovieName(mineInput.movieName());
        }

        if (mineInput.studio() != null) {
            mineMovie.setStudio(mineInput.studio());
        }

        if (mineInput.mine_cast() != null) {
            mineMovie.setMine_cast(mineInput.mine_cast());
        }

        return mineRepository.save(mineMovie);
    }

    //    delete movie
    public String deleteMovie(Integer id) {
        MineMovie mineMovie = mineRepository.findById(id).orElseThrow(() -> new NotFoundException("Movie with id " + id + " does not exist"));

        mineRepository.delete(mineMovie);

        return "Deleted Successfully";
    }

}
