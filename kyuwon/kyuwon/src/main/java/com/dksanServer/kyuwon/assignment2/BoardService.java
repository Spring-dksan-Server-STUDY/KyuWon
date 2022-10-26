package com.dksanServer.kyuwon.assignment2;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BoardService implements BoardServiceInterface{
    private final BoardRepositoryInterface boardRepository;

    public BoardService(BoardRepositoryInterface boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Optional<Board> findById(int id) {
        return boardRepository.findById(id);
    }

    @Override
    public Board updateById(int id, Board body) {
        Optional<Board> board = boardRepository.findById(id);
        board.get().setContent(body.getContent());
        board.get().setTitle(body.getTitle());
        board.get().setCreated_by(body.getCreated_by());
        return board.get();
    }

    @Override
    public void deleteById(int id) {
        boardRepository.deleteById(id);
    }
}
