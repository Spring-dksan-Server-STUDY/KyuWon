package com.dksanServer.kyuwon.assignment2;

import java.util.Optional;

public interface BoardServiceInterface {
    Optional<Board> findById(int id);
    Board updateById(int id, Board board);
    void deleteById(int id);
}
