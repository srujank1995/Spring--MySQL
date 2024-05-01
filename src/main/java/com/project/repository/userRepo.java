package com.project.repository;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.entity.userEntity;

public interface userRepo extends JpaRepository<userEntity, BigDecimal> {

}
