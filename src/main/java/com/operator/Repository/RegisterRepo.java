package com.operator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operator.entity.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {

}
