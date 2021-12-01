package io.example.repository;

import org.springframework.data.repository.CrudRepository;

import io.example.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
