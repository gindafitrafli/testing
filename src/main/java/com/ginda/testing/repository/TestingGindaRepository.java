package com.ginda.testing.repository;

import com.ginda.testing.model.TestingGinda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestingGindaRepository extends CrudRepository<TestingGinda, Integer> {
}
