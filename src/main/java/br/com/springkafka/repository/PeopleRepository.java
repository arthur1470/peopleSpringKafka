package br.com.springkafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springkafka.domain.People;

public interface PeopleRepository extends JpaRepository<People, String> {

}
