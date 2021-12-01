package io.example.repository;

import org.springframework.data.repository.CrudRepository;

import io.example.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}
