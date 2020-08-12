package com.example.test.h2.database.test.repository;

import com.example.test.h2.database.test.model.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericEntityRepository
        extends JpaRepository<GenericEntity, Long> {
}
