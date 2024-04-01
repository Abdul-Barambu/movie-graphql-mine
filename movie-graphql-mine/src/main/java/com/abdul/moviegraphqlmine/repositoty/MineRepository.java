package com.abdul.moviegraphqlmine.repositoty;

import com.abdul.moviegraphqlmine.entity.MineMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MineRepository extends JpaRepository<MineMovie, Integer> {

}
