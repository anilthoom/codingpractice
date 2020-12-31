package com.anilt.jpa.demo.dao;

import com.anilt.jpa.demo.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Test, Integer> {
}
