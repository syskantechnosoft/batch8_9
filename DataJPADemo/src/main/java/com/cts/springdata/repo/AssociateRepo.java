package com.cts.springdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springdata.model.Associates;

public interface AssociateRepo extends JpaRepository<Associates, Integer>{

}
