package io.example.repository;

import org.springframework.data.repository.CrudRepository;

import io.example.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
