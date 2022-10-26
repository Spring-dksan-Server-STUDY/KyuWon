package com.dksanServer.kyuwon.assignment2;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.Optional;

@RestController
@RequestMapping("board")
public class BoardController {

    private final EntityManager em;
    private final BoardService boardService;

    public BoardController(EntityManager em, BoardService boardService) {
        this.em = em;
        this.boardService = boardService;
    }

    @PostMapping("/new")
    @Transactional
    public Board postBoard(@RequestBody final Board board){
        em.persist(board);
        return em.find(Board.class, board.getId());
    }

    @GetMapping("/{id}")
    public Optional<Board> getBoard(@PathVariable(value = "id") final int id){
        return boardService.findById(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public Board updateBoard(@PathVariable(value = "id") final int id,
                                       @RequestBody final Board body){
        Board board = boardService.updateById(id, body);
        em.persist(board);
        return em.find(Board.class, board.getId());
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable(value = "id") final int id) {
        boardService.deleteById(id);
    }
}
