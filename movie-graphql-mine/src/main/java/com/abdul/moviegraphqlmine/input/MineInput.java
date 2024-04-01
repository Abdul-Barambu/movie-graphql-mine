package com.abdul.moviegraphqlmine.input;

import java.util.List;

public record MineInput(String movieName, String studio, List<String> mine_cast) {
}
