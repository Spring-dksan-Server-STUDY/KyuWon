package com.dksanServer.kyuwon.assignment2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepositoryInterface extends CrudRepository<Board, Integer> {

}
